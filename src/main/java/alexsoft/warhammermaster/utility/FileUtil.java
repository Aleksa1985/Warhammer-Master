/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster.utility;

import alexsoft.warhammermaster.model.Armor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.FileUtils;


public class FileUtil {
    
    public static String saveStringToSpecificFile(String inputParam, File file){
   
        try {
            FileUtils.writeStringToFile(file, inputParam);
        } catch (IOException ex) {
            ex.printStackTrace();
            return "file does not exist";
        }
        return "text successfully saved to file";
    
    }
    
    public static String saveArmorObjectToFile(Armor armor, File file) {
        try {

            FileUtils.writeStringToFile(file, toPrettyFormat(new Gson().toJson(armor)));

        } catch (IOException ex) {
            ex.printStackTrace();
            return "file does not exist";
        }
        return "text successfully saved to file";

    }
    
    public static String saveListOfArmorObjectsToFile(List<Armor> armor, File file) {
        try {

            FileUtils.writeStringToFile(file, new Gson().toJson(armor));

        } catch (IOException ex) {
            ex.printStackTrace();
            return "file does not exist";
        }
        return "text successfully saved to file";

    }
    
    
    public static Armor getArmorFromFile(File file) {

        Armor armor = null;
        try {
            String fileString = FileUtils.readFileToString(file);
            armor = new Gson().fromJson(fileString, Armor.class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return armor;
    }

    public static List<Armor> getAllArmorsFromFile(File file) {

       Armor[] armorList = null;
        try {
            String fileString = FileUtils.readFileToString(file);
            armorList = new Gson().fromJson(fileString, Armor[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Arrays.asList(armorList);
    }
    
    
    
    private static String toPrettyFormat(String jsonString) {
        JsonParser parser = new JsonParser();
        JsonObject json = parser.parse(jsonString).getAsJsonObject();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(json);

        return prettyJson;
    }
    
    
    public static void main(String[] args) throws IOException {
       
        List<Armor> armorList = new ArrayList<>();
        Armor armor = new Armor();
        armor.setId(1);
        armor.setName("Kizin brat");
        armor.setDefenceBonus(5);
        armor.setMasterwork(Boolean.TRUE);
        armorList.add(armor);
        
        Armor armor2 = new Armor();
        armor2.setId(2);
        armor2.setName("Kizin car");
        armor2.setDefenceBonus(4);
        armor2.setMasterwork(Boolean.TRUE);
        armorList.add(armor2);
       
        Armor armor3 = new Armor();
        armor3.setId(3);
        armor3.setName("LexinBrat okahdaukwd");
        armor3.setDefenceBonus(2);
        armor3.setMasterwork(Boolean.TRUE);
        armorList.add(armor3);
        
        saveListOfArmorObjectsToFile(armorList, new File("armors.txt"));
        
        
        
        
        
        
    }
    
    
}

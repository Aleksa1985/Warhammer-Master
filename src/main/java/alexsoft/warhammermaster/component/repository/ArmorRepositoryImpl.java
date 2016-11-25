/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster.component.repository;

import alexsoft.warhammermaster.model.Armor;
import alexsoft.warhammermaster.utility.ConfigFiles;
import alexsoft.warhammermaster.utility.FileUtil;
import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aleksa Jonic
 */
@Repository
public class ArmorRepositoryImpl implements ArmorRepository{

    @Autowired
    ConfigFiles configFile;
    
    @Override
    public List<Armor> getAllArmorsFromFile() {
     
        
   
        List<Armor> armorList = FileUtil.getAllArmorsFromFile(new File(configFile.getArmorFilePath()));
        return armorList;
        
    }
    
}

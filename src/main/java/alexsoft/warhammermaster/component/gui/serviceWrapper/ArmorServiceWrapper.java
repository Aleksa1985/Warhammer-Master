/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster.component.gui.serviceWrapper;

import alexsoft.warhammermaster.component.service.ArmorService;
import alexsoft.warhammermaster.model.Armor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Aleksa Jonic
 */
@Component
public class ArmorServiceWrapper {
    
    @Autowired 
    ArmorService armorServiceImpl;
    
    public List<Armor> returnListOfAllArmors(){

        return armorServiceImpl.getAllArmorsFromRepository();
    
    }

    public ArmorService getArmorServiceImpl() {
        return armorServiceImpl;
    }

    public void setArmorServiceImpl(ArmorService armorServiceImpl) {
        this.armorServiceImpl = armorServiceImpl;
    }
    
    
    
}

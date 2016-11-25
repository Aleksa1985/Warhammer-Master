/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster.component.service.impl;

import alexsoft.warhammermaster.component.repository.ArmorRepository;
import alexsoft.warhammermaster.component.service.ArmorService;
import alexsoft.warhammermaster.model.Armor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArmorServiceImpl implements ArmorService{

    @Autowired
    ArmorRepository armorRepository;
    
    @Override
    public Armor getArmorFromRepository(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Armor setArmorToRepository(String armorName, Integer bonus, Boolean isMasterwork) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Armor> getAllArmorsFromRepository() {
        return armorRepository.getAllArmorsFromFile();
    }
    
}

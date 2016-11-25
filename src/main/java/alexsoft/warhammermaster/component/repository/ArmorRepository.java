/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster.component.repository;

import alexsoft.warhammermaster.model.Armor;
import java.util.List;

/**
 *
 * @author Aleksa Jonic
 */
public interface ArmorRepository {
    
    public List<Armor> getAllArmorsFromFile();
}

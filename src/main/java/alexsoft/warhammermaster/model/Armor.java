/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster.model;

public class Armor {
    
    private Integer id;
    private String name;
    private Integer defenceBonus;
    private Boolean masterwork;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDefenceBonus() {
        return defenceBonus;
    }

    public void setDefenceBonus(Integer defenceBonus) {
        this.defenceBonus = defenceBonus;
    }

    public Boolean getMasterwork() {
        return masterwork;
    }

    public void setMasterwork(Boolean masterwork) {
        this.masterwork = masterwork;
    }
    
 
    
    
    
}

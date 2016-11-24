/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexsoft.warhammermaster.model;

import java.util.List;

public class Career {
    
    private Integer weaponSkill;
    private Integer ballisticSkill;
    private Integer strength;
    private Integer toughness;
    private Integer inteligence;
    private Integer willpower;
    private Integer agility;
    private Integer fellowship;
    
    private Integer attackNumber;
    private Integer woundsNumber;
    private Integer magicalCaracteristics;
    private Integer insenityPoints;
    private Integer faithPoints;
    
    private List<Skill> skills;
    private List<Talent> talents; 
  
     public Integer getWeaponSkill() {
        return weaponSkill;
    }

    public void setWeaponSkill(Integer weaponSkill) {
        this.weaponSkill = weaponSkill;
    }

    public Integer getBallisticSkill() {
        return ballisticSkill;
    }

    public void setBallisticSkill(Integer ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getToughness() {
        return toughness;
    }

    public void setToughness(Integer toughness) {
        this.toughness = toughness;
    }

    public Integer getInteligence() {
        return inteligence;
    }

    public void setInteligence(Integer inteligence) {
        this.inteligence = inteligence;
    }

    public Integer getWillpower() {
        return willpower;
    }

    public void setWillpower(Integer willpower) {
        this.willpower = willpower;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getFellowship() {
        return fellowship;
    }

    public void setFellowship(Integer fellowship) {
        this.fellowship = fellowship;
    }

    public Integer getAttackNumber() {
        return attackNumber;
    }

    public void setAttackNumber(Integer attackNumber) {
        this.attackNumber = attackNumber;
    }

    public Integer getWoundsNumber() {
        return woundsNumber;
    }

    public void setWoundsNumber(Integer woundsNumber) {
        this.woundsNumber = woundsNumber;
    }

    public Integer getMagicalCaracteristics() {
        return magicalCaracteristics;
    }

    public void setMagicalCaracteristics(Integer magicalCaracteristics) {
        this.magicalCaracteristics = magicalCaracteristics;
    }

    public Integer getInsenityPoints() {
        return insenityPoints;
    }

    public void setInsenityPoints(Integer insenityPoints) {
        this.insenityPoints = insenityPoints;
    }

    public Integer getFaithPoints() {
        return faithPoints;
    }

    public void setFaithPoints(Integer faithPoints) {
        this.faithPoints = faithPoints;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Talent> getTalents() {
        return talents;
    }

    public void setTalents(List<Talent> talents) {
        this.talents = talents;
    }
    
    
    
    
    
    
}

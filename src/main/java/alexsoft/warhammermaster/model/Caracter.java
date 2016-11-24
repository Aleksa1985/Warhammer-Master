
package alexsoft.warhammermaster.model;

import java.util.List;

public class Caracter {
    
    private String name;
    private String description;
    private String story;
    private String age;
    private String weight;
    private String height;
    
    private Race race;
    private List<Career> careeries;
    
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
    private Integer strenghtModifier;
    private Integer toughnessModifier;
    
    private Integer bodyArmor;
    private Integer headArmor;
    private Integer leftArmArmor;
    private Integer rightArmArmor;
    private Integer rightLegArmor;
    private Integer leftlegsArmor;
    
    private List<Skill> listOfSkills;
    private List<Talent> listOfTalents;
    
    private List<Armor> listOfCaracterArmors;
    private Integer activeArmorId;
    private List<Weapon> listOfCaracterWeapons;
    private Integer activeWeaponId;
    private List<Shield> listOfCaracterShields;
    private Integer activeShieldId;
   
    private Money money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public List<Career> getCareeries() {
        return careeries;
    }

    public void setCareeries(List<Career> careeries) {
        this.careeries = careeries;
    }

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

    public Integer getStrenghtModifier() {
        return strenghtModifier;
    }

    public void setStrenghtModifier(Integer strenghtModifier) {
        this.strenghtModifier = strenghtModifier;
    }

    public Integer getToughnessModifier() {
        return toughnessModifier;
    }

    public void setToughnessModifier(Integer toughnessModifier) {
        this.toughnessModifier = toughnessModifier;
    }

    public Integer getBodyArmor() {
        return bodyArmor;
    }

    public void setBodyArmor(Integer bodyArmor) {
        this.bodyArmor = bodyArmor;
    }

    public Integer getHeadArmor() {
        return headArmor;
    }

    public void setHeadArmor(Integer headArmor) {
        this.headArmor = headArmor;
    }

    public Integer getLeftArmArmor() {
        return leftArmArmor;
    }

    public void setLeftArmArmor(Integer leftArmArmor) {
        this.leftArmArmor = leftArmArmor;
    }

    public Integer getRightArmArmor() {
        return rightArmArmor;
    }

    public void setRightArmArmor(Integer rightArmArmor) {
        this.rightArmArmor = rightArmArmor;
    }

    public Integer getRightLegArmor() {
        return rightLegArmor;
    }

    public void setRightLegArmor(Integer rightLegArmor) {
        this.rightLegArmor = rightLegArmor;
    }

    public Integer getLeftlegsArmor() {
        return leftlegsArmor;
    }

    public void setLeftlegsArmor(Integer leftlegsArmor) {
        this.leftlegsArmor = leftlegsArmor;
    }

    public List<Skill> getListOfSkills() {
        return listOfSkills;
    }

    public void setListOfSkills(List<Skill> listOfSkills) {
        this.listOfSkills = listOfSkills;
    }

    public List<Talent> getListOfTalents() {
        return listOfTalents;
    }

    public void setListOfTalents(List<Talent> listOfTalents) {
        this.listOfTalents = listOfTalents;
    }

    public List<Armor> getListOfCaracterArmors() {
        return listOfCaracterArmors;
    }

    public void setListOfCaracterArmors(List<Armor> listOfCaracterArmors) {
        this.listOfCaracterArmors = listOfCaracterArmors;
    }

    public Integer getActiveArmorId() {
        return activeArmorId;
    }

    public void setActiveArmorId(Integer activeArmorId) {
        this.activeArmorId = activeArmorId;
    }

    public List<Weapon> getListOfCaracterWeapons() {
        return listOfCaracterWeapons;
    }

    public void setListOfCaracterWeapons(List<Weapon> listOfCaracterWeapons) {
        this.listOfCaracterWeapons = listOfCaracterWeapons;
    }

    public Integer getActiveWeaponId() {
        return activeWeaponId;
    }

    public void setActiveWeaponId(Integer activeWeaponId) {
        this.activeWeaponId = activeWeaponId;
    }

    public List<Shield> getListOfCaracterShields() {
        return listOfCaracterShields;
    }

    public void setListOfCaracterShields(List<Shield> listOfCaracterShields) {
        this.listOfCaracterShields = listOfCaracterShields;
    }

    public Integer getActiveShieldId() {
        return activeShieldId;
    }

    public void setActiveShieldId(Integer activeShieldId) {
        this.activeShieldId = activeShieldId;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
   
    
    
    
    
    
    
    
    
    
    
}

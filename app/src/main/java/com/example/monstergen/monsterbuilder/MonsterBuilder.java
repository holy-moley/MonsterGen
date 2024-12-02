package com.example.monstergen.monsterbuilder;

import com.example.monstergen.Monster;

public class MonsterBuilder {
    private final Monster monster;

    public MonsterBuilder() {
        this.monster = new Monster();
    }

    public void buildBody(String bodyType, String skinType, String color, String size) {
        monster.setBodyType(bodyType);
        monster.setSkinType(skinType);
        monster.setColor(color);
        monster.setSize(size);
    }

    public void buildLimbs(String limbType, String numberOfArms, String numberOfLegs) {
        monster.setLimbType(limbType);
        monster.setNumberOfArms(numberOfArms);
        monster.setNumberOfLegs(numberOfLegs);
    }

    public void buildEyes(String type, String color) {
        monster.setEyeType(type);
        monster.setEyeColor(color);
    }

    public void buildHead(String hornType, String mood, String earType) {
        monster.setHornType(hornType);
        monster.setMood(mood);
        monster.setEarType(earType);
    }

    public Monster finish() {
        return monster;
    }
}
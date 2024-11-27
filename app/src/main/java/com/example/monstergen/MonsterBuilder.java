package com.example.monstergen;

public class MonsterBuilder {
    private final Monster monster;

    public MonsterBuilder() {
        this.monster = new Monster();
    }
    public void buildBody(Shape monsterShape, Color monsterColor) {
        monster.setMonsterShape(monsterShape);
        monster.setMonsterColor(monsterColor);
    }

    public void buildHead(EarStyle earStyle, HornStyle hornStyle) {
        monster.setEarStyle(earStyle);
        monster.setHornStyle(hornStyle);
    }
    public void buildLimbs(Limbs numberOfArms, Limbs numberOfLegs) {
        monster.setNumberOfArms(numberOfArms);
        monster.setNumberOfLegs(numberOfLegs);
    }

    public void buildFace(Eyes numberOfEyes, Mood mood) {
        monster.setNumberOfEyes(numberOfEyes);
        monster.setMood(mood);
    }

    public void buildHair(HairStyle hairStyle, Length hairLength, Color hairColor) {
        monster.setHairStyle(hairStyle);
        monster.setHairLength(hairLength);
        monster.setHairColor(hairColor);
    }

    public Monster getMonster() {
        if (monster.getMonsterShape() == null) {
            monster.setMonsterShape(Shape.BEAN);
        }

        if (monster.getMonsterColor() == null) {
            monster.setMonsterColor(Color.WHITE);
        }

        if (monster.getNumberOfEyes() == null) {
            monster.setNumberOfEyes(Eyes.TWO);
        }

        if (monster.getHairStyle() == null) {
            monster.setHairStyle(HairStyle.STRAIGHT);
        }

        if (monster.getHairLength() == null) {
            monster.setHairLength(Length.SHORT);
        }

        if (monster.getHairColor() == null) {
            monster.setHairColor(Color.WHITE);
        }

        if (monster.getNumberOfArms() == null) {
            monster.setNumberOfArms(Limbs.TWO);
        }

        if (monster.getNumberOfLegs() == null) {
            monster.setNumberOfLegs(Limbs.TWO);
        }

        if (monster.getMood() == null) {
            monster.setMood(Mood.NEUTRAL);
        }

        if (monster.getEarStyle() == null) {
            monster.setEarStyle(EarStyle.NORMAL);
        }

        if (monster.getHornStyle() == null) {
            monster.setHornStyle(HornStyle.NONE);
        }

        return monster;
    }
}

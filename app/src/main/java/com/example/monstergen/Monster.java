package com.example.monstergen;
import java.util.Random;

public class Monster {


    private String description;

//Constructor
    Monster (wordBank bank){

         String bodyType;
         String limbType;
         String eyeType;
         String eyeColor;
         String skinType;
         String color;
         String size;
         String legNum;
         String armNum;
         String mood;
         String earType;
         String hornType;

        StringBuilder builder = new StringBuilder();
        Random gen = new Random();
        //Randomly selects a value for every field.
        int i = gen.nextInt(bank.bodyType.length);
        bodyType = bank.bodyType[i];
        builder.append("Body Type: " + bodyType +"\n");

        i = gen.nextInt(bank.limbType.length);
        limbType = bank.limbType[i];
        builder.append("Limbs: " + limbType + "\n");

        i = gen.nextInt(bank.eyeType.length);
        eyeType = bank.eyeType[i];
        builder.append("Eye Type: "+eyeType+"\n");

        if(eyeType!="None"){
            i=gen.nextInt(bank.eyeColor.length);
            eyeColor = bank.eyeColor[i];
            builder.append("Eye color: "+eyeColor+"\n");
        }

        i=gen.nextInt(bank.skinType.length);
        skinType=bank.skinType[i];
        builder.append("Skin Type: "+ skinType + "\n");

        i=gen.nextInt(bank.color.length);
        color = bank.color[i];
        builder.append("Color: "+color+"\n");

        i=gen.nextInt(bank.size.length);
        size = bank.size[i];
        builder.append("Size: "+size+"\n");

        if(limbType!="None"){
            i=gen.nextInt(bank.armNum.length);
            armNum=bank.armNum[i];
            builder.append("Arms: "+armNum+"\n");

            i=gen.nextInt(bank.legNum.length);
            legNum=bank.legNum[i];
            builder.append("Legs: "+legNum+"\n");
        }

        i=gen.nextInt(bank.mood.length);
        mood = bank.mood[i];
        builder.append("Mood: "+mood+"\n");

        i=gen.nextInt(bank.earType.length);
        earType=bank.earType[i];
        builder.append("Ear type: "+earType+"\n");


        i=gen.nextInt(bank.hornType.length);
        hornType=bank.hornType[i];
        if(hornType!="None"){
            builder.append("Horns: "+hornType);
        }
        description = builder.toString();
    }
    public String getDescription(){return description;}

}
//Old code, kept for posterity
//    Shape monsterShape;
//    Color monsterColor;
//    Eyes numberOfEyes;
//    HairStyle hairStyle;
//    Length hairLength;
//    Color hairColor;
//    Limbs numberOfArms;
//    Limbs numberOfLegs;
//    Mood mood;
//    EarStyle earStyle;
//    HornStyle hornStyle;
//
//    public Shape getMonsterShape() {
//        return this.monsterShape;
//    }
//
//    public void setMonsterShape(Shape monsterShape) {
//        this.monsterShape = monsterShape;
//    }
//
//    public Color getMonsterColor() {
//        return this.monsterColor;
//    }
//
//    public void setMonsterColor(Color monsterColor) {
//        this.monsterColor = monsterColor;
//    }
//
//    public Eyes getNumberOfEyes() {
//        return this.numberOfEyes;
//    }
//
//    public void setNumberOfEyes(Eyes numberOfEyes) {
//        this.numberOfEyes = numberOfEyes;
//    }
//
//    public HairStyle getHairStyle() {
//        return this.hairStyle;
//    }
//
//    public void setHairStyle(HairStyle hairStyle) {
//        this.hairStyle = hairStyle;
//    }
//
//    public Length getHairLength() {
//        return this.hairLength;
//    }
//
//    public void setHairLength(Length hairLength) {
//        this.hairLength = hairLength;
//    }
//
//    public Color getHairColor() {
//        return this.hairColor;
//    }
//
//    public void setHairColor(Color hairColor) {
//        this.hairColor = hairColor;
//    }
//
//    public Limbs getNumberOfArms() {
//        return this.numberOfArms;
//    }
//
//    public void setNumberOfArms(Limbs numberOfArms) {
//        this.numberOfArms = numberOfArms;
//    }
//
//    public Limbs getNumberOfLegs() {
//        return this.numberOfLegs;
//    }
//
//    public void setNumberOfLegs(Limbs numberOfLegs) {
//        this.numberOfLegs = numberOfLegs;
//    }
//
//    public Mood getMood() {
//        return this.mood;
//    }
//
//    public void setMood(Mood mood) {
//        this.mood = mood;
//    }
//
//    public EarStyle getEarStyle() {
//        return this.earStyle;
//    }
//
//    public void setEarStyle(EarStyle earStyle) {
//        this.earStyle = earStyle;
//    }
//
//    public HornStyle getHornStyle() {
//        return this.hornStyle;
//    }
//
//    public void setHornStyle(HornStyle hornStyle) {
//        this.hornStyle = hornStyle;
//    }
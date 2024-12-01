package com.example.monstergen;

public class wordBank {
String[] bodyType;
String[] limbType;
String[] eyeType;
String[] eyeColor;
String[] skinType;
String[] color;
String[] size;
String[] legNum;
String[] armNum;
String[] mood;
String[] earType;
String[] hornType;
//Very basic constructor.
    public wordBank(String[] bodyType, String[] limbType, String[] eyeType,String[] eyeColor, String[] skinType, String[] color, String[] size, String[] legNum, String[] armNum, String[] mood, String[] earType, String[] hornType) {
        this.bodyType = bodyType;
        this.limbType = limbType;
        this.eyeType = eyeType;
        this.eyeColor = eyeColor;
        this.skinType = skinType;
        this.color = color;
        this.size = size;
        this.legNum = legNum;
        this.armNum = armNum;
        this.mood = mood;
        this.earType = earType;
        this.hornType = hornType;
    }
}

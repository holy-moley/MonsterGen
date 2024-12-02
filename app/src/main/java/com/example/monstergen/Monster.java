package com.example.monstergen;

import java.util.Objects;

public class Monster {
    String bodyType;
    String limbType;
    String eyeType;
    String eyeColor;
    String skinType;
    String color;
    String size;
    String numberOfLegs;
    String numberOfArms;
    String mood;
    String earType;
    String hornType;

    public String getDescription() {
        StringBuilder builder = new StringBuilder();
        builder.append("Body Type: ").append(bodyType).append("\n");
        builder.append("Limbs: ").append(limbType).append("\n");
        builder.append("Eye Type: ").append(eyeType).append("\n");

        if (!Objects.equals(eyeType, "None")) {
            builder.append("Eye color: ").append(eyeColor).append("\n");
        }

        builder.append("Skin Type: ").append(skinType).append("\n");
        builder.append("Color: ").append(color).append("\n");
        builder.append("Size: ").append(size).append("\n");

        if (!Objects.equals(limbType, "None")) {
            builder.append("Arms: ").append(numberOfArms).append("\n");
            builder.append("Legs: ").append(numberOfLegs).append("\n");
        }

        builder.append("Mood: ").append(mood).append("\n");
        builder.append("Ear type: ").append(earType).append("\n");

        if (!Objects.equals(hornType, "None")) {
            builder.append("Horns: ").append(hornType);
        }

        return builder.toString();
    }

    public String getHornType() {
        return hornType;
    }

    public void setHornType(String hornType) {
        this.hornType = hornType;
    }

    public String getEarType() {
        return earType;
    }

    public void setEarType(String earType) {
        this.earType = earType;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getNumberOfArms() {
        return numberOfArms;
    }

    public void setNumberOfArms(String numberOfArms) {
        this.numberOfArms = numberOfArms;
    }

    public String getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(String numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeType() {
        return eyeType;
    }

    public void setEyeType(String eyeType) {
        this.eyeType = eyeType;
    }

    public String getLimbType() {
        return limbType;
    }

    public void setLimbType(String limbType) {
        this.limbType = limbType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}

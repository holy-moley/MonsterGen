package com.example.monstergen.monsterdirector;

import com.example.monstergen.Monster;
import com.example.monstergen.monsterbuilder.MonsterBuilder;

import java.util.Random;

public class MonsterDirector {
    public static Monster generateMonster(String monsterType) {
        MonsterBuilder monsterBuilder = new MonsterBuilder();

        String[] bodyType;
        String[] limbType;
        String[] eyeType;
        String[] eyeColor;
        String[] skinType;
        String[] color;
        String[] size;
        String[] numberOfLegs;
        String[] numberOfArms;
        String[] mood;
        String[] earType;
        String[] hornType;

        switch (monsterType) {
            case "Aquatic":
                bodyType = new String[]{"Octopus", "Fish", "Crustacean", "Seal"};
                limbType = new String[]{"Tentacle", "Fin", "Legs", "None"};
                eyeType = new String[]{"Stalks", "Beady", "Big", "None"};
                eyeColor = new String[]{"Black", "Blue", "Green"};
                skinType = new String[]{"Chitin", "Scales", "Blubber"};
                color = new String[]{"Grey", "Blue", "White", "Red"};
                size = new String[]{"Dog sized", "Human sized", "Bus sized", "Building sized"};
                numberOfLegs = new String[]{"None", "Two", "Four", "Six", "Eight"};
                numberOfArms = new String[]{"None", "Two", "Four", "Six", "Eight"};
                mood = new String[]{"Inscrutable", "Neutral", "Happy", "Angry", "Scared"};
                earType = new String[]{"Human", "Holes", "Not visible"};
                hornType = new String[]{"None", "Single", "Two", "Four"};
                break;
            case "Creepy":
                bodyType = new String[]{"Tree", "Humanoid", "Insectoid"};
                limbType = new String[]{"Wooden", "Insectoid", "Thin", "None"};
                eyeType = new String[]{"Glossy", "Sunken", "Bulging", "Human", "Snake", "None"};
                eyeColor = new String[]{"Red", "Pale", "Bloodshot", "Grey", "Purple", "Yellow"};
                skinType = new String[]{"Bark", "Smooth", "Fur", "Stone", "Chitin"};
                color = new String[]{"Pale", "Dark", "Brown", "Grey"};
                size = new String[]{"10 ft", "30ft", "5 ft", "20 ft"};
                numberOfLegs = new String[]{"None", "One", "Two", "Six", "Eight", "Countless"};
                numberOfArms = new String[]{"None", "One", "Two", "Six", "Eight", "Countless"};
                mood = new String[]{"Hungry", "Scared", "Furious", "Hurt"};
                earType = new String[]{"None", "Human", "Wolf", "Cat"};
                hornType = new String[]{"Antlers", "Bull", "Countless", "Broken"};
                break;
            case "Gross":
                bodyType = new String[]{"Blob", "Cow", "Dog"};
                limbType = new String[]{"None", "Digitigrade"};
                eyeType = new String[]{"None", "Bleak", "Glossy", "Wretched"};
                eyeColor = new String[]{"Pale", "Green", "Pus"};
                skinType = new String[]{"Diseased", "Seeping", "Wounded", "Sores", "Matted fur"};
                color = new String[]{"Brown", "Grey", "Green", "Red"};
                size = new String[]{"Large", "Medium", "Small"};
                numberOfLegs = new String[]{"None", "Two", "Three", "Seven"};
                numberOfArms = new String[]{"None", "Two", "Three", "Seven"};
                mood = new String[]{"Pained", "Sick", "Confused", "Frightened"};
                earType = new String[]{"Missing pieces", "Normal", "None"};
                hornType = new String[]{"Bovine", "Everywhere", "None"};
                break;
            case "Cute":
                bodyType = new String[]{"Cat", "Dog", "Hamster"};
                limbType = new String[]{"Normal"};
                eyeType = new String[]{"Big", "Glossy", "Little"};
                eyeColor = new String[]{"Pink", "Brown", "Blue", "Green"};
                skinType = new String[]{"Clean fur"};
                color = new String[]{"Mottled", "Brown", "Black", "Orange", "Calico", "Dappled"};
                size = new String[]{"Tiny", "Little", "Medium"};
                numberOfLegs = new String[]{"Four"};
                numberOfArms = new String[]{"None"};
                mood = new String[]{"Happy", "Curious", "Attentive"};
                earType = new String[]{"Floppy", "Fluffy", "Perky"};
                hornType = new String[]{"None"};
                break;
            case "Lovecraftian":
                bodyType = new String[]{"Blob", "Humanoid", "Shifting"};
                limbType = new String[]{"Flesh", "Tentacles", "Mouths", "None"};
                eyeType = new String[]{"Countless", "Unblinking", "None", "Many"};
                eyeColor = new String[]{"White", "Black", "Iridescent"};
                skinType = new String[]{"Flesh", "Chitin", "Gas"};
                color = new String[]{"Mottled purple", "Yellow", "Shifting"};
                size = new String[]{"Shifting", "Large", "Massive"};
                numberOfLegs = new String[]{"None", "Countless"};
                numberOfArms = new String[]{"None", "Shifting", "Countless", "Twelve", "Thirteen", "Thirty eight"};
                mood = new String[]{"Indescribable", "Asleep", "Run"};
                earType = new String[]{"None"};
                hornType = new String[]{"Sprouting", "Covered", "None"};
                break;
            default:
                bodyType = new String[]{""};
                limbType = new String[]{""};
                eyeType = new String[]{""};
                eyeColor = new String[]{""};
                skinType = new String[]{""};
                color = new String[]{""};
                size = new String[]{""};
                numberOfLegs = new String[]{""};
                numberOfArms = new String[]{""};
                mood = new String[]{""};
                earType = new String[]{""};
                hornType = new String[]{""};
                break;
        }

        monsterBuilder.buildBody(select(bodyType), select(skinType), select(color), select(size));
        monsterBuilder.buildLimbs(select(limbType), select(numberOfArms), select(numberOfLegs));
        monsterBuilder.buildEyes(select(eyeType), select(eyeColor));
        monsterBuilder.buildHead(select(hornType), select(mood), select(earType));

        return monsterBuilder.finish();
    }

    private static String select(String[] array) {
        Random rng = new Random();
        return array[rng.nextInt(array.length)];
    }
}
package com.example.monstergen;

public class MonsterBuilder {
private String optionChosen;
private Monster newMon;
    public MonsterBuilder(String op) {
        optionChosen = op;
    }
    public Monster generate(){

        //Word banks are created, then a monster is constructed.
        //Combination of Builder, Factory, and Composite patterns.
        if (optionChosen.equalsIgnoreCase("Aquatic")){
            String[] bodType = {"Octopus","Fish","Crustacean","Seal"};
            String[] limbType= {"Tentacle","Fin","Legs","None"};
            String[] eyeType= {"Stalks","Beady","Big","None"};
            String[] eyeColor= {"Black","Blue","Green"};
            String[] skinType= {"Chitin","Scales","Blubber"};
            String[] color= {"Grey","Blue","White","Red"};
            String[] size= {"Dog sized","Human sized","Bus sized","Building sized"};
            String[] legNum= {"None","Two","Four","Six","Eight"};
            String[] armNum= {"None","Two","Four","Six","Eight"};
            String[] mood= {"Inscrutable","Neutral","Happy","Angry","Scared"};
            String[] earType= {"Human","Holes","Not visible"};
            String[] hornType= {"None","Single","Two","Four"};
            wordBank bank = new wordBank(bodType,limbType,eyeType,eyeColor,skinType,color,size,legNum,armNum,mood,earType,hornType);
            newMon=new Monster(bank);

        }
        else if (optionChosen.equalsIgnoreCase("Creepy")){
            String[] bodType = {"Tree","Humanoid","Insectoid"};
            String[] limbType= {"Wooden","Insectoid","Thin","None"};
            String[] eyeType= {"Glossy","Sunken","Bulging","Human","Snake","None"};
            String[] eyeColor= {"Red","Pale","Bloodshot","Grey","Purple","Yellow"};
            String[] skinType= {"Bark","Smooth","Fur","Stone","Chitin"};
            String[] color= {"Pale","Dark","Brown","Grey"};
            String[] size= {"10 ft","30ft","5 ft","20 ft"};
            String[] legNum= {"None","One","Two","Six","Eight","Countless"};
            String[] armNum= {"None","One","Two","Six","Eight","Countless"};
            String[] mood= {"Hungry","Scared","Furious","Hurt"};
            String[] earType= {"None","Human","Wolf","Cat"};
            String[] hornType= {"Antlers","Bull","Countless","Broken"};
            wordBank bank = new wordBank(bodType,limbType,eyeType,eyeColor,skinType,color,size,legNum,armNum,mood,earType,hornType);
            newMon=new Monster(bank);



        }
        else if (optionChosen.equalsIgnoreCase("Gross")){
            String[] bodType = {"Blob","Cow","Dog"};
            String[] limbType= {"None","Digitigrade"};
            String[] eyeType= {"None","Bleak","Glossy","Wretched"};
            String[] eyeColor= {"Pale","Green","Pus"};
            String[] skinType= {"Diseased","Seeping","Wounded","Sores","Matted fur"};
            String[] color= {"Brown","Grey","Green","Red"};
            String[] size= {"Large","Medium","Small"};
            String[] legNum= {"None","Two","Three","Seven"};
            String[] armNum= {"None","Two","Three","Seven"};
            String[] mood= {"Pained","Sick","Confused","Frightened"};
            String[] earType= {"Missing pieces","Normal","None"};
            String[] hornType= {"Bovine","Everywhere","None"};
            wordBank bank = new wordBank(bodType,limbType,eyeType,eyeColor,skinType,color,size,legNum,armNum,mood,earType,hornType);
            newMon=new Monster(bank);


        }
        else if (optionChosen.equalsIgnoreCase("Cute")){
            String[] bodType = {"Cat","Dog","Hamster"};
            String[] limbType= {"Normal"};
            String[] eyeType= {"Big","Glossy","Little"};
            String[] eyeColor= {"Pink","Brown","Blue","Green"};
            String[] skinType= {"Clean fur"};
            String[] color= {"Mottled","Brown","Black","Orange","Calico","Dappled"};
            String[] size= {"Tiny","Little","Medium"};
            String[] legNum= {"Four"};
            String[] armNum= {"None"};
            String[] mood= {"Happy","Curious","Attentive"};
            String[] earType= {"Floppy","Fluffy","Perky"};
            String[] hornType= {"None"};
            wordBank bank = new wordBank(bodType,limbType,eyeType,eyeColor,skinType,color,size,legNum,armNum,mood,earType,hornType);
            newMon=new Monster(bank);


        }
        else if (optionChosen.equalsIgnoreCase("Lovecraftian")){
            String[] bodType = {"Blob","Humanoid","Shifting"};
            String[] limbType= {"Flesh","Tentacles","Mouths","None"};
            String[] eyeType= {"Countless","Unblinking","None","Many"};
            String[] eyeColor= {"White","Black","Iridescent"};
            String[] skinType= {"Flesh","Chitin","Gas"};
            String[] color= {"Mottled purple","Yellow","Shifting"};
            String[] size= {"Shifting","Large","Massive"};
            String[] legNum= {"None","Countless"};
            String[] armNum= {"None","Shifting","Countless","Twelve","Thirteen","Thirty eight"};
            String[] mood= {"Indescribable","Asleep","Run"};
            String[] earType= {"None"};
            String[] hornType= {"Sprouting","Covered","None"};
            wordBank bank = new wordBank(bodType,limbType,eyeType,eyeColor,skinType,color,size,legNum,armNum,mood,earType,hornType);
            newMon=new Monster(bank);
        }
        return newMon;

    }


}
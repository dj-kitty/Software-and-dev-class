/* This file created by David Johnson for Software and Development 1
 * This file uses a comparator to sort cats based on their year of adoption/birth
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Cat {
    public String name;
    public String color;
    public String gainedBy;
    public int yearGained;
    public String yearOfDeath;
    public String gender;

    public Cat(String name, String color, String gainedBy, int yearAdopted, String yearOfDeath, String gender) {
        this.name = name;
        this.color = color;
        this.gainedBy = gainedBy;
        this.yearGained = yearAdopted;
        this.yearOfDeath = yearOfDeath;
        this.gender = gender;
    }

    public String getname (){
    return name;
    }
    public String getcolor (){
        return color;
    }
    public String getgainedBy (){
        return gainedBy;
    }
    public int getyearAdopted (){
        return yearGained;
    }
    public String getyearOfDeath (){
        return yearOfDeath;
    }
    public String getgender (){
        return gender;
    }
    public void setname (String newName){
        this.name = newName;
    }
    public void setcolor (String newColor){
        this.color = newColor;
    }
    public void setgainedBy (String newGainedBy){
        this.gainedBy = newGainedBy;
    }
    public void setyearAdopted (int newYearAdopted){
        this.yearGained = newYearAdopted;
    }
    public void setyearOfDeath (String newYearOfDeath){
        this.yearOfDeath = newYearOfDeath;
    }
    public void setgender (String newgender){
        this.gender = newgender;
    }
}
@SuppressWarnings("rawtypes")
class SortByYear implements Comparator{//this will sort the cats by year adopted
    public int compare(Object obj1, Object obj2) {
        Cat a = (Cat) obj1;
        Cat b = (Cat) obj2;
        if (a.yearGained < b.yearGained) return -1;
        if (a.yearGained > b.yearGained) return 1; 
        return 0;
    }
}

class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();//the list of cats
            cats.add(new Cat("Nala", "black, white, orange, and gray","adopted", 2021, "2025", "female"));
            cats.add(new Cat("Cuddles", "striped black and gray", "adopted",2023, "2025", "male"));
            cats.add(new Cat("Tess", "black", "adopted",2009, "none", "female"));
            cats.add(new Cat("Sweetie", "orange", "adopted",2012, "none", "female"));
            cats.add(new Cat("Gladiator", "orange and white", "adopted",2022, "2024", "male"));
            cats.add(new Cat("Fulk", "striped black and gray", "adopted",2022, "2024", "male"));
            cats.add(new Cat("Stella", "white and gray", "adopted",2017, "none", "female"));
            cats.add(new Cat("Storm", "gray","born", 2014, "2025", "female"));
            cats.add(new Cat("Luna", "gray", "adopted",2019, "2020", "female"));
            cats.add(new Cat("Fudge", "gray, black, and brown", "born",2014, "2017", "female"));


    System.out.println("This is the original order of the cats."); //printing the original order of the cats
    System.out.println("");
    for(Cat cat: cats ){ 
    String name = cat.name + " is ";
    String color = cat.color + ". "; 
    String pronoun = cat.gender.equalsIgnoreCase("female") ? "She" : "He";//assigning pronouns to the gender
    String gained = " was " + cat.gainedBy + " in " + cat.yearGained;
    String death = cat.yearOfDeath.equalsIgnoreCase("none") //assigning states of death
        ? " and has not died yet."
        : " and died in " + cat.yearOfDeath + ".";
    
    System.out.println("   " + name + color + pronoun + gained + death);
}
     @SuppressWarnings("rawtypes")
    Comparator age = new SortByYear(); //making the cat list go through the comparator
    Collections.sort(cats, age);

    System.out.println("");
    System.out.println("This is the order after the cats are sorted.");
    System.out.println("");
for (Cat cat : cats) { 
    String name = cat.name + " is ";
    String color = cat.color + ". "; 
    String pronoun = cat.gender.equalsIgnoreCase("female") ? "She" : "He";//assigning pronouns to the gender
    String gained = " was " + cat.gainedBy + " in " + cat.yearGained;
    String death = cat.yearOfDeath.equalsIgnoreCase("none") //assigning states of death
        ? " and has not died yet."
        : " and died in " + cat.yearOfDeath + ".";
    
    System.out.println("    " + name + color + pronoun + gained + death);
}
    System.out.println("");
    System.out.println("**Note: Year of adoption/birth is approximate.**");
}
}

//Created by David Johnson for Software and Program development
//This creates three cats and changes some of their attributes
public class Cat {
    String name;
    String color;
    int age;
    public Cat (String name, String color, int age){//constructor
        this.name = name;
        this.color = color;
        this.age=age;
    }
    public void setName(String newName) {//enables me to change name
        this.name = newName;
    }
    public void setColor(String newColor){//enables me to change color
        this.color = newColor;
    }
    public void setAge(int newAge) {//enables me to change age
        this.age = newAge;
    }
    public static void main(String[] args) {
        Cat firstCat = new Cat("Tess", "black", 16); //the cats
        Cat secondCat = new Cat("Sweetie", "orange", 11);
        Cat thirdCat = new Cat("Nala", "black, orange, gray, and white", 4);
        
        Cat[] cats = {firstCat, secondCat, thirdCat};//putting the cats into an array for easy printing
        
        
        for ( Cat cat : cats){ //printing original cats
            System.out.println(cat.name + " is " + cat.color + " and " + cat.age + " years old. ");
        }
    firstCat.setAge(17); //changing age of two of the cats
    secondCat.setAge(12);
        System.out.println("If each cat had a birthday, they would be: "); //printing out new cats
        for ( Cat cat : cats){
            if (cat != thirdCat){ //this excludes the third cat from being printed since its age was not changed
                System.out.println("    " + cat.name + ": " + cat.age);
            }
            else {
                System.out.println("Unfortunately, " + thirdCat.name + " would still be " + thirdCat.age + " because she is no longer alive.");
            }
        }
    
        
    }
}

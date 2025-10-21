/*Created by David Johnson for Software and Program development
This creates three cats and changes some of their attributes
*/
 public class petWrapper{
    static class Pet {//parent class
}
static class Cat extends Pet{// cat class as subclass of pet
    String name;
    String color;
    int age;
    Cat (String name, String color, int age){//constructor
        this.name = name;
        this.color = color;
        this.age=age;
    }
    void setName(String newName) {//enables me to change name
        this.name = newName;
    }
    void setColor(String newColor){//enables me to change color
        this.color = newColor;
    }
    void setAge(int newAge) {//enables me to change age
        this.age = newAge;
    }
}
static class Dog extends Pet{//adding a dog class as part of the pet class
    String name;
    String color;
    String breed;
    Dog (String name, String color, String breed){//constructor
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void setName(String newName) {//enables me to change name
        this.name = newName;
    }
    void setColor(String newColor){//enables me to change color
        this.color = newColor;
    }
    void setAge(String newBreed) {//enables me to change breed
        this.breed = newBreed;
    }
}
static class Chicken extends Pet{ //adding chicken class as subclass of Pet
    public void color(String color){
        System.out.print("Our chickens are " + color + "."); //method for color
    }
    public void age(int age){
        System.out.print(" They are about " + age + " years old.");//method for age
    }
    public void food(String food){
        System.out.println(" Their favorite food is " + food + ".");
    }
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

    System.out.print("If each cat had a birthday, "); //printing out new cats
    for ( Cat cat : cats){
        if (cat != thirdCat){ //this excludes the third cat from being printed since its age was not changed
            System.out.println(cat.name + " would be " + cat.age);
        }
        else {
            System.out.println("Unfortunately, " + thirdCat.name + " would still be " + thirdCat.age + " because she is no longer alive.");
        }
    } 
    Dog firstDog = new Dog ("Zipper", "white and black", "Jack Russel"); //the dogs
    Dog secondDog = new Dog ("Autumn", "brown", "Golden Retriever");
    Dog thirdDog = new Dog ("Cassia", "white and brown", "Jack Russel");
    Dog fourthDog = new Dog ("Suki", "white and brown", "Jack Russel");
    Dog fifthtDog = new Dog ("Moca", "brown", "Shepherd Curr");

    Dog [] dogs = {firstDog, secondDog, thirdDog, fourthDog, fifthtDog};//dog array

    for (Dog dog: dogs) {
        System.out.println(dog.name + " is " + dog.color + " and a " + dog.breed + ". ");//printing dogs
    }


    Chicken hens = new Chicken();
    hens.color("speckled black and white");
    hens.age(7);
    hens.food("mice");
}
}

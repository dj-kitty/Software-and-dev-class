//Simple horse class created by Kim Gross
//for CTE Software Development class 2022
//Edited by David Johnson
//for Software and Program Development 2025

public class Horse {
    String name;// current name of the horse
    int birthYear;//year the horse was born
    String[] names; //array of old names of the horse
    int numberofNames=0; //how many old names are there.
    public Horse(String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor.
    };
    private int Age; //creates private storage for Age 
    public int getAge() { //extracts age
        return Age;
    }
    public void setAge(int newAge) { //this saves the new age 
        this.Age = newAge;
    }
    public void changeName (String newName){//change the name but save the old name
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    };
    public String toString (){
        return name;
    };    
public static void main(String[] args) {
    Horse n1 = new Horse("Johnny", 2009);
    Horse n2 = new Horse("Bob", 2015);
    Horse n3 = new Horse("Gailiff", 2019);
    int currentYear = 2025;
        int agen1 = currentYear - n1.birthYear;//these will tell how old each horse is
        int agen2 = currentYear - n2.birthYear;
        int agen3 = currentYear - n3.birthYear;
    System.out.println(n1.name + " was born in " + n1.birthYear + ". He is " + agen1 + " years old.");
    System.out.println(n2.name + " was born in " + n2.birthYear + ". He is " + agen2 + " years old.");
    System.out.println(n3.name + " was born in " + n3.birthYear + ". He is " + agen3 + " years old.");
    
}
} 

public class Multi {
    public static void main(String args[]){
    Dog dobby = new Dog(); // object referring to a particular name should have the same constructor name 
    dobby.eat();
    dobby.breathes();
    dobby.color = "Golden Brown";
    System.out.println(dobby.color);
    }
}

class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}

class Mammals extends Animals{
   int legs ;

}

class Dog extends Mammals{
String breed ;
}
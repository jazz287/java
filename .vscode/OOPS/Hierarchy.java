public class Hierarchy {
public static void main(String args[]){
Human rocky = new Human();
rocky.eat();
rocky.color = "Black/White" ;
System.out.println(rocky.color);

Dog dobbie = new Dog();
dobbie.breathes();
dobbie.color = "Golden Brown";
System.out.println(dobbie.color);

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

class Dog extends Animals {
    String breed ;
    void tricks(){
    System.out.println("tricks");
}
}

class Fish extends Animals {
    int fins ;
    void swims(){
        System.out.println("swims");
    }
}

class Human extends Animals {
    void talk(){
        System.out.println("talks");
    }
}

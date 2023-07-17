public class Inheritance {
// single level inheritnace
public static void main(String args[]){
    Fish shark = new Fish(); // fish() is a constructor here 
    shark.eat();
}
}
// base class
class Animal{
    String color ;
    void eat() {
        System.out.println("eats");
    }
//uhuhhih
    void breathe(){
        System.out.println("breathes");
    }
}
// derived class
class Fish extends Animal {
 int fins ;

 void swim(){
    System.out.println("swims");
 }
}


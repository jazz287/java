public class superClass {
    public static void main(String args[]){
   Dog s1 = new Dog();
   System.out.print(s1.color);
   
   Fish f1 = new Fish();
   System.out.print(f1.color);


    }
}

class Animals {
    String name ;
    String color;
     Animals(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animals{

 Dog(){
    super(); // if we do not use super and we have used constructors, the parent clonstructor gets executed first.
    
    System.out.println("Dog eats");
}
}

class Fish extends Animals{
    
    Fish(){
    super.color = "Golden Brown" ;
    }
}



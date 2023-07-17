public class Multi {
    public static void main(Strimg args[]){

    }
}

class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes")
    }
}

class Mammals extends Animals{
   int legs ;

}

class Dogs extends Mammals{
String breed ;
}
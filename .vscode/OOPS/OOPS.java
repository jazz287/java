public class OOPS {
    public static void main (String args[]){
    Pen p1 = new Pen() ; // created an object called P1 
    p1.setColor("Blue");
    System.out.println(p1.getcolor()); // implementing getters and setters
    p1.setTip(5);
    System.out.println(p1.getTip());

    }
}


class Pen{
   private String color;
   private int tip ;

    String getcolor(){
        return this.color ;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newcolor){
        this.color = newcolor;
    }

    void setTip(int tip){
        this.tip = tip ;
    }
    }










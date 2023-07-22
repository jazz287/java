public class classStatic {

public static void main(String args[]){
Student s1 = new Student();

System.out.println(s1.returnPercentage(50,60,70));

}

}

class Student {
static int returnPercentage(int phy,int chem , int math){
    return (phy+chem+math)/3 ;
}


}



package TW4aPkg;


public class Emp_Demo {
    public static void main(String [] args){
        FuTime Emp1=new FuTime("Sam","patt","F",19,10000);
        PartTime Emp2=new PartTime("Sachita","Desai","F",19,0,5,4,"BE");
        
        Emp1.compute_Salary();
        Emp1.display();
        System.out.println();
        Emp2.compute_Salary();
        Emp2.display();
        
    }
}
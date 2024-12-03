package TW4aPkg;

public class FuTime extends Employee {
    double DA,HRA,IT,GS;
    FuTime(){
        super();
        DA=HRA=IT=GS=0.0;
    }
    FuTime(String N, String A, String G,int age, double BS){
        super(N,A,G,age,BS);
        DA = HRA = IT = GS = 0.0;
    }
    
    void compute_Salary(){
        DA=0.75*salary;
        HRA=0.075*salary;
        IT=0.1*salary;
        GS = (salary+DA+HRA)-IT;
    }
    @Override
    void display(){
        System.out.println("Full time Employee");
        super.display();
        System.out.println("Gross Salary: "+GS);
       
    }
    
}


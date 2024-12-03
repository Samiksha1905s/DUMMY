package TW4aPkg;


public class PartTime extends Employee {
    String qua;
    double hrs, rph, PT_Salary,exp;
      PartTime(){
        super();
        qua="BE,MTech,PH.D";
        exp=0;
        hrs=0;
        rph=0;
       
    }
    PartTime(String N, String A, String G,int age, double BS,double hrs,double exp,String qua){
        super(N,A,G,age,BS);
        this.qua=qua;
        this.exp=exp;
        this.hrs=hrs;
        
    }
    
    void compute_Salary()
    {
        if(qua=="BE"){
            if(exp<=5 && exp>=1){
                PT_Salary=300*hrs;
            }
            else if(exp<=10 && exp>=6){
                PT_Salary=400*hrs;
            }
            else{
                  PT_Salary=500*hrs;
            }
        }
        if(qua=="MTech"){
            if(exp<=5 && exp>=1){
                PT_Salary=500*hrs;
            }
            else if(exp<=10 && exp>=6){
                PT_Salary=700*hrs;
            }
            else{
                  PT_Salary=1000*hrs;
            }
        }
        if(qua=="PH.D"){
            if(exp<=5 && exp>=1){
                PT_Salary=800*hrs;
            }
            else if(exp<=10 && exp>=6){
                PT_Salary=1200*hrs;
            }
            else{
                  PT_Salary=1500*hrs;
            }
        }
        
    }   
    @Override
    void display(){
        super.display();
        System.out.println("Part time Salary:"+PT_Salary);
    }
}

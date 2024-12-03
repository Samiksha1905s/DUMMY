package TW4aPkg;

public class Employee {
   protected String Name;
     protected String address;
     protected String gender;
      protected int age;
       protected double salary;
       
        Employee(){
           Name=address=gender=" ";
           age=0;
           salary=0.0;
       }
        Employee(String N, String A, String G,int age, double BS){
            this.Name=N;
            this.address=A;
            this.age=age;
            this.gender=G;
            this.salary=BS;
        }
        
        void display(){
            System.out.println("Name: "+Name+"\nAddress:"+address+"\nAge:"+age+"\ngender:"+gender+"\nBasic Salary:"+salary);
        }
}

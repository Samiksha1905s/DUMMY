package TW4b;
        
import java.util.Scanner;

class AgeException extends Exception{
     AgeException(String msg)
  {
      super(msg);
   
  }
}

class LearnersLicenseException extends Exception{
     LearnersLicenseException(String msg)
  {
      super(msg);
   
  }
}
class AccidentException extends Exception{
     AccidentException(String msg)
  {
      super(msg);
   
  }
}
public class TW4b 
{
    static void ProcessApplication(int age, boolean VLL,boolean NOA) throws AgeException, LearnersLicenseException,AccidentException
        {
            if(age<18)
                throw new AgeException("Invalid Age: Age must be greater than 18");
            if(!VLL)
                throw new LearnersLicenseException("Invalid Learners license");
            if(NOA)
                throw new AccidentException("Should not have any accident history from last 1 year");
        }


public static void main(String args[]){
    String name;
    boolean no_of_Accd,valid_LL;
    int age;
    Scanner s=new Scanner(System.in);
    
    try{
        System.out.println("Enter user's name;");
        name=s.nextLine();
        
        System.out.println("Enter User's age:");
        age=s.nextInt();
        
        System.out.println("Does the user have the valid learner license:");
        valid_LL=s.nextBoolean();
        
        System.out.println("Does  the user have accident history:");
        no_of_Accd=s.nextBoolean();
        
        ProcessApplication(age,valid_LL,no_of_Accd);
        
        System.out.println("You are  Valid user---> License issued.");
    }
    catch(AgeException| LearnersLicenseException| AccidentException ae){
        System.out.println("License cannot be issued");
        System.out.println(ae.getMessage());
    }
    
    catch(Exception e){
        System.out.println("Other Exception caugth!!");
    }
}
}

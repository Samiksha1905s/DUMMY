import java.util.Scanner;
class init{
    double s1,s2,s3;
    void init(){
        System.out.println("\nEnter the sides of the triangle:");
        Scanner s=new Scanner(System.in);
        s1=s.nextDouble();
        s2=s.nextDouble();
        s3=s.nextDouble();
    }
    void type(){
        if((s1==s2)&&(s2==s3)&&(s3==s1))
            System.out.println("Equilatreal");
        else if((s1==s2)||(s2==s3)||(s3==s1))
             System.out.println("Isoceles");
        else
            System.out.println("Scalene");
        
    }
    void Area(){
        double area;
        System.out.println("s1="+s1);
         System.out.println("s2="+s2);
          System.out.println("s3="+s3);
        if((s1+s2>s3)||((s2+s3>s1)||(s3+s1>s2)))
        {
           double S= (s1+s2+s3)/2;
           area=Math.sqrt(S*(S-s1)*(S-s2)*(S-s3));
       
        if(area>0){
             System.out.println("Area of triangle: "+area);
        }
        else
            System.out.println("Area cannot be calculated");
    }
    }
    }
public class TriangleDemo {
    public static void main(String [] args){
        init t1=new init();
        t1.init();
        t1.type();
        t1.Area();
         init t2=new init();
        t2.init();
        t2.type();
        t2.Area();
         init t3=new init();
        t3.init();
        t3.type();
        t3.Area();
    } 
}
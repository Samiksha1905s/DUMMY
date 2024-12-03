import java.util.Scanner;
class MyCarSales{
    int sales[][]= new int[6][12];
    void read_sales(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the sales for cars: ");
        for(int i=0;i<6;i++){
            for(int j=0;j<12;j++){
                sales[i][j]=s.nextInt();
                
            }
        }
    }
    void display_sales(){
        System.out.println("The car sales for all mfgrs are as below..");
         for(int i=0;i<6;i++){
            for(int j=0;j<12;j++){
                System.out.print(sales[i][j]+" ");
          }
            System.out.println();
        }
    }
    void avg_Sales(){
        int total;
         for(int i=0;i<6;i++){
             total=0;
            for(int j=0;j<12;j++){
                total=total+sales[i][j];
            }
            System.out.println("Average sales for manufacturer "+(i+1)+ " is: "+(total/12));
        }
    }
     void total_Sales(){
        int total;
         for(int i=0;i<6;i++){
             total=0;
            for(int j=0;j<12;j++){
                total=total+sales[i][j];
            }
             System.out.println("Total sales for manufacturer "+(i+1)+ " is: "+total);
          }
    }
     void month_Sales(){
         int msales;
          for(int j=0;j<12;j++){
             msales=0;
            for(int i=0;i<6;i++){
                msales=msales+sales[i][j];
            }
            System.out.println("Sales in month " +(j+1)+ " are:"+msales);
          }
       }
     void max_sales(){
         int max=0,i,j,month=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the car for which u want to find the max sales:");
         int mg= sc.nextInt();
         for( i=mg,j=0; j<12;j++){
         if(max<sales[i][j]){
             max=sales[i][j];
             month=j;
         }
     }
       System.out.println("Max. Sales:" +max+ " in the month "+(month+1));
     }
   }
public class Car_Sales_Demo {
    public static void main(String args[]){
    MyCarSales MS = new MyCarSales();
    MS. read_sales();
    System.out.println();
    MS.display_sales();
    System.out.println();
    MS. avg_Sales();
    System.out.println();
    MS.total_Sales();
     System.out.println();
    MS.month_Sales();
    System.out.println();
    MS.max_sales();
    
    }
}

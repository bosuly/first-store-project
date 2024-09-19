/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3;

/**
 *
 * @author MELENDRES_COMP111
 */import java.util.Scanner;
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
          System.out.println(" WELOME TO ULS GRAB BAR");
        String again;
        double total=0;
        double h;
        String m;
        double v;
        double gay;
        double ga;
        double bv=0;
       
       
        do{
            int r=100;
            int s=150;
            int t=200;
            int b=220;
            int g=250;
            double k;
            double currenttotal=0;
            int key;
           
           
           
             System.out.println("TYPE r FOR RED HORSE\n"
                + "TYPE s FOR SAN MIGUEL\n"
                + "TYPE t FOR TANDUAY\n"
                + "TYPE b FOR GSM BLUE\n"
                + "TYPE g FOR GINEBRA ");
             System.out.println("SELECT DRINKS");
             String select=input.next();
             
             
               if (select.equalsIgnoreCase("r")){
                    System.out.println("YOU SELECT RED HORSE: ");
                    System.out.println(" ENTER QUANTITY");
                    k=input.nextDouble();
                    currenttotal=r*k;
                } else if (select.equalsIgnoreCase("s")) {
                    System.out.println("YOU SELECT SAN MIGUEL: ");
                     System.out.println(" ENTER QUANTITY");
                    k=input.nextDouble();
                   currenttotal=s*k;
                } else if (select.equalsIgnoreCase("t")) {
                    System.out.println("YOU SELECT TANDUAY: ");
                     System.out.println(" ENTER QUANTITY");
                    k=input.nextDouble();
                    currenttotal=t*k;
                } else if (select.equalsIgnoreCase("b")) {
                    System.out.println("YOU SELECT GSM BLUE: ");
                     System.out.println(" ENTER QUANTITY");
                    k=input.nextDouble();
                   currenttotal=b*k;
                } else if (select.equalsIgnoreCase("g")) {
                    System.out.println("YOU SELECT GINEBRA:" );
                     System.out.println(" ENTER QUANTITY");
                    k=input.nextDouble();
                    currenttotal=g*k;
                }else {
                    System.out.println("NOT VALID");
                }
         
               total +=currenttotal;
               { 
               double count;
              if(total>=500){
                  System.out.println("avail promo");
                 count=total*0.05;
                 total-=count;
              }else{
                  System.out.println("NOT AVAIL PROMO");
              }
               }
               System.out.println("YOUR TOTAL BILLS "+ total);
                   System.out.print("ENTER yes IF BUY AGAIN AND no IF STOP ");
            again = input.next();
            if(again.equals("yes")){
            System.out.println("ADD ANOTHER DRINKS");
        }else if (again.equals("no")){
            System.out.println("done");
        }
        } while (again.equalsIgnoreCase("yes")); 
        do{
  
        System.out.println("ENTER CASH");
        h =input.nextDouble();
        System.out.println("YOUR CASH IS "+h);
        
         bv+=h;
       
        if(bv>=total){
             bv=bv-total;
             System.out.println("YOUR CHANGE IS "+ bv);
            break;
        }else{
        
            System.out.println("NOT ENOUGH PAYMENT");
            System.out.println("YOUR BALANCE IS "+(total-bv));
        }
     
        }while(total>0);
        

        do {
            System.out.println("ENTER 'yes' IF YOU WANT TO DO ANOTHER TRANSACTION AND 'no' IF YOU WANT TO STOP");
            String l = input.next();
            double totals=0;
            double vb=0;
            
            
           

            if (l.equals("yes")) {
               
                do {
                 
                    int r = 100;
                    int s = 150;
                    int t = 200;
                    int b = 220;
                    int g = 250;
                    

                    double k; 
                    double currentTotal = 0; 
                   totals=0;
                   double dis=700;
                   

                    System.out.println("TYPE 'r' FOR RED HORSE\n"
                            + "TYPE 's' FOR SAN MIGUEL\n"
                            + "TYPE 't' FOR TANDUAY\n"
                            + "TYPE 'b' FOR GSM BLUE\n"
                            + "TYPE 'g' FOR GINEBRA ");
                    System.out.println("SELECT DRINKS");
                    String select = input.next();

                    if (select.equalsIgnoreCase("r")) {
                        System.out.println("YOU SELECTED RED HORSE");
                        System.out.println("ENTER QUANTITY");
                        k = input.nextDouble();
                        currentTotal = r * k;
                    } else if (select.equalsIgnoreCase("s")) {
                        System.out.println("YOU SELECTED SAN MIGUEL");
                        System.out.println("ENTER QUANTITY");
                        k = input.nextDouble();
                        currentTotal = s * k;
                    } else if (select.equalsIgnoreCase("t")) {
                        System.out.println("YOU SELECTED TANDUAY");
                        System.out.println("ENTER QUANTITY");
                        k = input.nextDouble();
                        currentTotal = t * k;
                    } else if (select.equalsIgnoreCase("b")) {
                        System.out.println("YOU SELECTED GSM BLUE");
                        System.out.println("ENTER QUANTITY");
                        k = input.nextDouble();
                        currentTotal = b * k;
                    } else if (select.equalsIgnoreCase("g")) {
                        System.out.println("YOU SELECTED GINEBRA");
                        System.out.println("ENTER QUANTITY");
                        k = input.nextDouble();
                        currentTotal = g * k;
                    } else {
                        System.out.println("NOT VALID");
                         
                    }

                    totals += currentTotal;  
                    { 
               double u;
              if(totals>=500){
                  System.out.println("avail promo");
                 u=totals*0.05;
                 totals-=u;
              }else{
                  System.out.println("NOT AVAIL PROMO");
              }
               }
                    System.out.println("YOUR CURRENT TOTAL BILLS: " + totals);
                    
                   
                    System.out.print("ENTER yes IF YOU WANT TO BUY AGAIN AND no IF YOU WANT TO STOP ");
                    again=input.next();
                   
                } while (again.equalsIgnoreCase("yes"));
do{
  
        System.out.println("ENTER CASH");
        v =input.nextDouble();
        System.out.println("YOUR CASH IS "+v);
        
         vb+=v;
       
        if(vb>=totals){
             vb=vb-totals;
             System.out.println("YOUR CHANGE IS "+ vb);
            break;
        }else{
        
            System.out.println("NOT ENOUGH PAYMENT");
            System.out.println("YOUR BALANCE IS "+(totals-vb));
        }
     
        }while(totals>0);
               

            } else if (l.equals("no")) {
                System.out.println("STOP TRANSACTION");
                break; 
            } else {
                System.out.println("INVALID INPUT");
            }
        } while(true);

        
    }
}
    

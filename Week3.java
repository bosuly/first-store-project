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
       float total=0,h,v,gay,ga,bv=0,totals=0,add=0;
        String again,m;  
         int r=100,s=150,t=200,b=220,g=250;
        do{
            float k,currenttotal=0;
             do{
                  System.out.println("TYPE r FOR RED HORSE:100 pesos\n"
                + "TYPE s FOR SAN MIGUEL:150 pesos\n"
                + "TYPE t FOR TANDUAY: 200 pesos\n"
                + "TYPE b FOR GSM BLUE: 220pesos\n"
                + "TYPE g FOR GINEBRA:250 pesos ");
             System.out.println(" MINIMUM OF 500 PESOS WORTH OF DRINKS WE HAVE 10PERCENT DISCOUNT");
             System.out.println("SELECT DRINKS");
             String select=input.next();
               if (select.equalsIgnoreCase("r")){
                    System.out.println("YOU SELECT RED HORSE: ");
                    System.out.println(" ENTER QUANTITY");
                    k=input.nextFloat();
                    currenttotal=r*k;
                } else if (select.equalsIgnoreCase("s")) {
                    System.out.println("YOU SELECT SAN MIGUEL: ");
                     System.out.println(" ENTER QUANTITY");
                    k=input.nextFloat();
                   currenttotal=s*k;
                } else if (select.equalsIgnoreCase("t")) {
                    System.out.println("YOU SELECT TANDUAY: ");
                     System.out.println(" ENTER QUANTITY");
                     k=input.nextFloat();
                    currenttotal=t*k;
                } else if (select.equalsIgnoreCase("b")) {
                    System.out.println("YOU SELECT GSM BLUE: ");
                     System.out.println(" ENTER QUANTITY");
                    k=input.nextFloat();
                   currenttotal=b*k;
                } else if (select.equalsIgnoreCase("g")) {
                    System.out.println("YOU SELECT GINEBRA:" );
                     System.out.println(" ENTER QUANTITY");
                     k=input.nextFloat();
                    currenttotal=g*k;         
                }else {
                    System.out.println("NOT VALID");
                }
                 System.out.println("ENTER R IF REPEAT C IF CONTINUE");
                      m=input.next();
                      if(m.equalsIgnoreCase("r")){
                          System.out.println("REPEAT");
                      add=currenttotal;}
               }while(m.equalsIgnoreCase("R"));
               total +=currenttotal;{
               double count;
              if(total>=500){
                  System.out.println("avail promo");
                 count=currenttotal*0.1;
                 total-=count;
              }else{
                  System.out.println("NOT AVAIL PROMO");}}
               System.out.println("YOUR TOTAL BILLS "+ total);
                   System.out.print("ENTER yes IF BUY AGAIN AND no IF STOP ");
            again = input.next();
            if(again.equals("yes")){
            System.out.println("ADD ANOTHER DRINKS");
        }else if (again.equals("no")){
            System.out.println("done");}
        } while (again.equalsIgnoreCase("yes")); 
        do{
        System.out.println("ENTER CASH");
        h =input.nextFloat();
        System.out.println("YOUR CASH IS "+h);
         bv+=h;
        if(bv>=total){
             bv=bv-total;
             System.out.println("YOUR CHANGE IS "+ bv);
            break;
        }else{
            System.out.println("NOT ENOUGH PAYMENT");
            System.out.println("YOUR BALANCE IS "+(total-bv));}
        }while(total>0);
        do {
            System.out.println("ENTER 'yes' IF YOU WANT TO DO ANOTHER TRANSACTION AND 'no' IF YOU WANT TO STOP");
            String l = input.next();
            float vb=0;
            if (l.equals("yes")) {
                do {
                    float ke,currentTotals=0; 
                    do{
                     System.out.println("TYPE r FOR RED HORSE:100 pesos\n"
                + "TYPE s FOR SAN MIGUEL:150 pesos\n"
                + "TYPE t FOR TANDUAY: 200 pesos\n"
                + "TYPE b FOR GSM BLUE: 220pesos\n"
                + "TYPE g FOR GINEBRA:250 pesos ");
                      System.out.println(" MINIMUM OF 500 PESOS WORTH OF DRINKS WE HAVE 10PERCENT DISCOUNT");
                    System.out.println("SELECT DRINKS");
                    String selecte = input.next();
                    if (selecte.equalsIgnoreCase("r")) {
                        System.out.println("YOU SELECTED RED HORSE");
                        System.out.println("ENTER QUANTITY");
                         ke=input.nextFloat();
                        currentTotals = r * ke;
                    } else if (selecte.equalsIgnoreCase("s")) {
                        System.out.println("YOU SELECTED SAN MIGUEL");
                        System.out.println("ENTER QUANTITY");
                        ke=input.nextFloat();
                        currentTotals = s * ke;
                    } else if (selecte.equalsIgnoreCase("t")) {
                        System.out.println("YOU SELECTED TANDUAY");
                        System.out.println("ENTER QUANTITY");
                         ke=input.nextFloat();
                        currentTotals = t * ke;
                    } else if (selecte.equalsIgnoreCase("b")) {
                        System.out.println("YOU SELECTED GSM BLUE");
                        System.out.println("ENTER QUANTITY");
                         ke=input.nextFloat();
                        currentTotals = b * ke;
                    } else if (selecte.equalsIgnoreCase("g")) {
                        System.out.println("YOU SELECTED GINEBRA");
                        System.out.println("ENTER QUANTITY");
                         ke=input.nextFloat();
                        currentTotals = g * ke;
                    } else {
                        System.out.println("NOT VALID");}
                    System.out.println("ENTER R IF REPEAT C IF CONTINUE");
                    if(m.equalsIgnoreCase("r")){
                          System.out.println("REPEAT");
                      m=input.next();
                      add=currentTotals;}
               }while(m.equalsIgnoreCase("R"));
                    totals += currentTotals;  {
               double u;
              if(totals>=500){
                  System.out.println("avail promo");
                 u=currentTotals*0.1;
                 totals-=u;
              }else{
                  System.out.println("NOT AVAIL PROMO");}}
              System.out.println("YOUR CURRENT TOTAL BILLS: " + totals);
                    System.out.print("ENTER yes IF YOU WANT TO BUY AGAIN AND no IF YOU WANT TO STOP ");
                    again=input.next();
                } while (again.equalsIgnoreCase("yes"));
do{
        System.out.println("ENTER CASH");
        v =input.nextFloat();
        System.out.println("YOUR CASH IS "+v);
         vb+=v;
        if(vb>=totals){
             vb=vb-totals;
             System.out.println("YOUR CHANGE IS "+ vb);
            break;
        }else{
            System.out.println("NOT ENOUGH PAYMENT");
            System.out.println("YOUR BALANCE IS "+(totals-vb));}
        }while(totals>0);
            } else if (l.equals("no")) {
                System.out.println("STOP TRANSACTION");
                break; 
            } else {
                System.out.println("INVALID INPUT");}
        } while(true);  
    }
}
    
    

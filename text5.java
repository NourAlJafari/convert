
package edu.zuj.oop.week2;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        double ev=1;
        System.out.print("Enter the number:");
        int num=in.nextInt();
        System.out.println("======================");
        System.out.println("1. Inche to CM:");
         System.out.println("2. CM to Inche :");
         System.out.println("3. Feet to M :");
         System.out.println("4. M to Feet :");
         System.out.println("5. Cels to Fenh :");
         System.out.println("6. Fenh to Cels : ");
         System.out.println("7. Hektar to Dunm :");
         System.out.println("8.  Dunm to Hekter :");
         System.out.println("-------------------------------------------");
         System.out.println("Enter your choice:");
         int ch=in.nextInt();    
         switch(ch){
             case 1:
                                 ev=num/0.39;break;
             case 2:           
                                  ev =num*0.393701;break;
             case 3:
                                 ev= num/3.29;break;
             case 4:
                                   ev=3.28*num;break;
             case 5:
                                    ev=(num*1.8)+32 ;break;
             case 6:
                                  ev=(num-32)/1.8;break;
             case 7:
                                ev=num*10;break;
             case 8:
                                  ev=num/10;break;
             default :
                 System.out.println("The result is undefound ");
         }
         if (ch<9 && ch>0)
              System.out.println("Result= "+ev );
}
}

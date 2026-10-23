package edu.zuj.oop.week2;
import java.util.Scanner;
public class text2 {
    
    public static void main(String[] args) {
        Scanner in=new Scanner (System .in);
        System.out.println("To convert inche to cm:");
        System.out.print("Enter the number:");
        int num=in.nextInt();
        System.out.println("inche");
        double ev=num/0.39;
        System.out.println("Result= "+ev +" cm");
    }
}

package edu.zuj.oop.week2;
import java .util.Scanner;
public class convert {

    public static void main(String[] args) {
Scanner in=new Scanner (System .in);
        System.out.println("To convert cm to inch: ");
        System.out.println("Enter the number in cm :");
        int num=in.nextInt();
        double evlue=num*0.393701;
        System.out.println("Result= "+evlue +" inche");
        
    }
    
}

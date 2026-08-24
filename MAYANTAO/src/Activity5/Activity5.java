/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity5;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Activity5 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System. in);
        DecimalFormat decFormat = new DecimalFormat("#,###.00");
        String name = "";
        int age = 0;
        float grade = 0.0f;
        double cash =0.00;
         boolean isSingle = true;
         
        
        System.out.print("Enter name");
        name = scan.nextLine();
        
        
        System.out.print("Enter age");
        age = scan.nextInt();
        
        System.out.print("Enter grade");
        grade = scan.nextFloat();
        
        System.out.print("Enter cash");
        cash = scan.nextDouble();
        
        System.out.print("Enter age (true or false):");
        isSingle = scan.nextBoolean();
        
        
        System.out.println("hi " +name + "!" + age + "years old.");
        System.out.println("you grade is " +grade + ". your cash is" + decFormat.format(cash));
        System.out.println(" Are you single? :" + isSingle);
    }
    
}

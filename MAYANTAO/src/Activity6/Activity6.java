
package Activity6;

import java.util.Scanner;
public class Activity6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System. in);
        int age = 0;
        System.out.print("Enter age");
        age = scan.nextInt();
        if(age >=0 && age <=17){
            System.out.print("Go Home and Sleep");
        } else if(age >= 18 && age <= 59){
            System.out.print("Let's Party");
        } else if(age >= 60 && age <= 130){
            System.out.print("Go Drink coffee somewhere!");
        }else{
            System.out.print("Invalid age!");
             
            
        }
          
    }
    }
    


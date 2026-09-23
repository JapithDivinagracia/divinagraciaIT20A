
package Activity7;

import java.util.Scanner;
public class Activity7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System. in);
        char letter = '';
        System.out.print("Enter a letter");
        letter = scan.next().charAt(0);
        Swich(letter){
         case'a','A','e','E','o','O','u','u':
         System.out.println("Letter" + letter+ " is vowel.");
         break;
    }
        
        
    }
    
}

package initialletter;

import java.util.Scanner;

/**
 *
 * @author Amanda Lima
 */
public class InitialLetter {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        
        String name;
        char firstLetter;
        
        Scanner scan = new Scanner (System.in);
        
            System.out.println("Please enter your name");
            name = scan.nextLine();
            name = name.trim();
            firstLetter = name.charAt(0);
            
            
            
            System.out.println("Hi " + name + ", I see your name starts with the letter " + firstLetter );
            
                                  
            
        
    }
    
}

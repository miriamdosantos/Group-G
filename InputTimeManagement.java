/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputtimemanagement;

import java.util.Scanner;

/**
 *
 * @author miriam
 */
public class InputTimeManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
      Scanner myObj = new Scanner (System.in);
      System.out.println (" Enter your name ");
      String username = myObj.nextLine();
      System.out.println (" Its a beautiful name " + username + " Welcome");
      System.out.println (" Enter your age ");
      int age = myObj.nextInt();
      System.out.println ("Age: " + age + " good to know your age");
    }
    
}

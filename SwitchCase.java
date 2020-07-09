/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.*;

/**
 *
 * @author sakthi
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        System.out.println("Pick any one: 1.DOSA\t 2.FRIED RICE\t 3.EGG FRY\t");
        Scanner s=new Scanner(System.in);
        choice= s.nextInt();
        switch(choice){
            case 1 : System.out.println("You ordered DOSA");
            break;
            case 2 : System.out.println("You ordered FRIED RICE");
            break;
            case 3 : System.out.println("You ordered EGG FRY");
            break;
            default : System.out.println("Sorry we don't have this item");
            
            
            
        }

        
        
    }
    
}

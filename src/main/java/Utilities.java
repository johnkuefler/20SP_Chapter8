/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Utilities {
    
    public static boolean IsValidEmail(String email) {
        if (!email.contains("@")) {
            return false;
        }
        
        if (!email.contains(".")) {
            return false;
        }
        
        return true;
    }
    
    public static boolean IsValidPhoneNumber(String phone) {
        if (!phone.contains("-")) {
            return false;
        }
        
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Nishad
 */
public final class Validator {
    public static final  boolean StringEmpty(String text){
        Boolean isEmpty=false;
        if(text.trim().length() == 0)
        {
          isEmpty= true;
        }
        return isEmpty;
    }
    
    public static final String isNumeric(String text){
        String msg="";
        try {
     Integer.parseInt(text.trim());
     //System.out.println("An integer"):
}
catch (NumberFormatException e) {
     //Not an integer
     msg = "Please enter correct income";
}
        return msg; 
    }
}

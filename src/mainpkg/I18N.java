/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainpkg;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author suthipong.th
 */
public class I18N {
    
    Locale currentLocale;
    ResourceBundle messages;
    
    public I18N(String[] args){
        
        String language;
        String country;
        
        if (args.length != 2) {
            language = "en";
            country = "US";
        } else {
            language = args[0];
            country = args[1];
        }
        
        currentLocale = new Locale(language, country);        
        messages = ResourceBundle.getBundle("mainpkg.MessagesBundle", currentLocale);
    }
    
    public Locale returnLocale(){
        return currentLocale;
    }
    
    public ResourceBundle returnBundle(){
        return messages;
    }
}

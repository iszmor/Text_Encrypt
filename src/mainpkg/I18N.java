/*
 * Internalization class
 * deals with internationalizing the software
 * switchLocale() is used to change locale on the fly
*/
package mainpkg;

import java.util.Locale;
import java.util.ResourceBundle;

public final class I18N {
    
    Locale currentLocale;
    ResourceBundle messages;
    String language = "en";
    String country = "US";

    //Constructor with input for locale
    public I18N(String[] args){        
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
    
    //Normal constructor with default locale of en_US
    public I18N(){
        switchLocale(language, country);
    }
    
    //Call this method when changing locale
    public void switchLocale(String la, String co){
        language = la;
        country = co;
        currentLocale = new Locale(language, country);        
        messages = ResourceBundle.getBundle("mainpkg.MessagesBundle", currentLocale);
        
        //System.out.println(currentLocale); 
    }
    
//    public Locale returnLocale(){
//        return currentLocale;
//    }
    
//    public ResourceBundle returnBundle(){
//        return messages;
//    }
}

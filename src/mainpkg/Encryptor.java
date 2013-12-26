package mainpkg;

//Piyapong Pongteekayu 212210026

import javax.swing.JOptionPane;

public class Encryptor {
    
    //Variable Initialization
    private String encryptedText = ""; //To keep the encrypted text for the getEncrypted method
    
    
    //Constructor
    public Encryptor(String p, String t)
    {
        String password = p; //Accept password
        String text = t; //Accept text

        String passwordString = ""; //To store converted password
        
        //Convert letters in the password to numbers
        for (int i = 0; i < password.length(); i++)
        {
            passwordString += password.codePointAt(i);
        }
        
        //Check if the passwordString is long enough to use with the text
        while (passwordString.length() < text.length())
        {//If not long enough, repeat the passwordString until it is long enough
            passwordString += passwordString;
        }
        
        System.out.println(passwordString);
        
        int currentCharCode = 0;
        int encryptedCharCode = 0;
        char encryptedChar = 0;
        for (int i = 0; i < text.length(); i++)
        {
            currentCharCode = text.codePointAt(i);
            //System.out.println("code of char"+i+":"+currentCharCode);
            encryptedCharCode = currentCharCode + Integer.parseInt(Character.toString(passwordString.charAt(i)));
            if (encryptedCharCode > 126)
            {
                encryptedCharCode = (encryptedCharCode - 126) + 32;
                //System.out.println("encrypted char code more than 126");
                encryptedChar = (char)encryptedCharCode;
            }
            else
            {
                encryptedCharCode = currentCharCode + Integer.parseInt(Character.toString(passwordString.charAt(i)));
                encryptedChar = (char)encryptedCharCode;
            }
            encryptedText += encryptedChar;
        }
        System.out.print(encryptedText);
    }
    
    //Get Encrypted text
    public String getEncrypted()
    {
        return encryptedText;
    }
    
    //For test run
    public static void main(String[] args)
    {
        new Encryptor("!@#$","this is a text");
    }
}

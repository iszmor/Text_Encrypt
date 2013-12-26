package mainpkg;

//Piyapong Pongteekayu 212210026

import javax.swing.JOptionPane;

public class Decryptor {
    
    //Variable Initialization
    private String decryptedText = ""; //To keep the encrypted text for the getEncrypted method
    
    
    //Constructor
    public Decryptor(String p, String t)
    {
        String password = p; //Accept password
        String text = t; //Accept text

        String passwordString = ""; //To store converted password
        
        //Convert letters in the password to numbers
        for (int i = 0; i < password.length(); i++)
        {
            if (Character.isLetter(password.charAt(i)))
            {
                passwordString += password.codePointAt(i);
            }
            else
            {
                passwordString += password.charAt(i);
            }
        }
        
        //Check if the passwordString is long enough to use with the text
        while (passwordString.length() < text.length())
        {//If not long enough, repeat the passwordString until it is long enough
            passwordString += passwordString;
        }
        
        //System.out.println(passwordString);
        
        int currentCharCode = 0;
        int decryptedCharCode = 0;
        char decryptedChar = 0;
        for (int i = 0; i < text.length(); i++)
        {
            currentCharCode = text.codePointAt(i);
            //System.out.println("code of char"+i+":"+currentCharCode);
            try
            {
                decryptedCharCode = currentCharCode - Integer.parseInt(Character.toString(passwordString.charAt(i)));
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid Password Combination!\n"
                        + "Available characters: a-Z A-Z 0-9");
                System.exit(0);
            }
            if (decryptedCharCode < 32)
            {
                decryptedCharCode = (decryptedCharCode + 126) - 32;
                //System.out.println("encrypted char code more than 126");
                decryptedChar = (char)decryptedCharCode;
            }
            else
            {
                decryptedCharCode = currentCharCode - Integer.parseInt(Character.toString(passwordString.charAt(i)));
                decryptedChar = (char)decryptedCharCode;
            }
            decryptedText += decryptedChar;
        }
        System.out.print(decryptedText);
    }
    
    //Get Decrypted text
    public String getDecrypted()
    {
        return decryptedText;
    }
    
    //For test run
    /*public static void main(String[] args)
    {
        new Decryptor("test","uiot jt!f!ukyu");
    }*/
}

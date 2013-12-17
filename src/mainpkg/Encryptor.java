package mainpkg;

//Piyapong Pongteekayu 212210026
public class Encryptor {
    
    //Variable Initialization
    private String encryptedText; //To keep the encrypted text for the getEncrypted method
    
    
    //Constructor
    public Encryptor(String p, String t)
    {
        String password = p; //To keep password
        String text = t; //To keep text
        
        //Get length of the password
        int passwordLength = password.length();
        
        //Get length of the text
        int textLength = text.length();
        
        String passwordString = "";
        
        for (int i = 0; i < passwordLength; i++)
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
        
        System.out.print(passwordString);
    }
    
    //Get Encrypted text
    public String getEncrypted()
    {
        return encryptedText;
    }
    
    //For test run
    public static void main(String[] args)
    {
        new Encryptor("1234aasdfasdfasdfasf","asdfghjhlzxcvnzsdnbfaskjd");
    }
}

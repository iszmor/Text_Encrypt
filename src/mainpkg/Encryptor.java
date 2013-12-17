package mainpkg;

//Piyapong Pongteekayu 212210026
public class Encryptor {
    
    //Variable Initialization
    private String password; //To keep password
    private String text; //To keep text
    private String encryptedText; //To keep the encrypted text
    
    
    //Constructor
    public Encryptor(String p, String t)
    {
        password = p;
        text = t;
        
        //Get length of the password
        int passwordLength = password.length();
        
        //Get length of the text
        int textLength = text.length();
        
        int sumOfCharValue = 0; //This will be used to create a long series of numbers
        
        for (int i = 0; i < passwordLength; i++)
        {
            sumOfCharValue = sumOfCharValue + password.codePointAt(i);
        }
        
        //Create a long series of numbers from sumOfCharValue
        int longNumbers = sumOfCharValue * sumOfCharValue;
        
        String longNumbersString = String.valueOf(longNumbers);
        System.out.println(longNumbersString+longNumbersString);
        int longNumbersStringLength = longNumbersString.length();
        while (longNumbersStringLength < textLength)
        {
            
        }
    }
    
    //Get Encrypted text
    public String getEncrypted()
    {
        return encryptedText;
    }
    
    public static void main(String[] args)
    {
        new Encryptor("1234aasdfasdfasdfasf","asdfghjhlzxcvnzsdnbfaskjd");
    }
}

package text_encrypt01;

public class Encrypt {
    
    private String word;
    private String password;
    
    public Encrypt(String w, String pw){
        //encryption algorithm
        for (int i = 0; i < pw.length(); i++){
            System.out.println("char = " + pw.codePointAt(i));
        }
        
    }
    
    public String returnWord(){
        return word;
    }    
}

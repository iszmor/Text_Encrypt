package mainpkg;

import java.util.Scanner;

public class EncryptDemo {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("word");
        String word = kb.nextLine();
        System.out.println("password");
        String password = kb.nextLine();
        
        //Parse word and password to encrypt
        Encrypt a = new Encrypt();      
        a.EncryptText(word, password);
        //get encrypted word
        //String enc = a.returnText();
        //System.out.println("Encrypted word is");
        //System.out.println(enc);
    }
}

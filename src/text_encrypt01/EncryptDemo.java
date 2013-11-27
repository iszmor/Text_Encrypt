package text_encrypt01;

import java.util.Scanner;

public class EncryptDemo {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("word");
        String word = kb.nextLine();
        System.out.println("password");
        String password = kb.nextLine();
        Encrypt a = new Encrypt(word, password);

        //System.out.println("encrypted word is = " + a.returnWord());
    }
}

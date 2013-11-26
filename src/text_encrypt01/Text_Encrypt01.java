//Author: Piyapong pongteekayu, Suthipong Thongjaroen

//This is the main class
package text_encrypt01;
import java.util.Scanner;

public class Text_Encrypt01 {
    
    //private static MainFrame frame;
    
    public static void main(String[] args) {
        //frame = new MainFrame();
        Scanner kb = new Scanner(System.in);
        System.out.println("word");
        String word = kb.nextLine();
        System.out.println("password");
        String password = kb.nextLine();
        Encrypt a = new Encrypt(word, password);
        
        //System.out.println("encrypted word is = " + a.returnWord());
    }
}

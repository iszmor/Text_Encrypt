package mainpkg;

public class Unused_Decrypt {

    private String word = "";
    private int algo = 0;

    public Unused_Decrypt() {
    }

    public void DecryptText(String w, String pw) {
        //Get algo from password
        for (int i = 0; i < pw.length(); i++) {
            //Sum char code for all of the characters in password
            algo += pw.codePointAt(i);
        }

        //Decrypt the word
        for (int i = 0; i < w.length(); i++) {
            word += String.valueOf((char) (w.charAt(i) - algo));
        }
        //System.out.println("word is unscrambled and is now = " + word);
    }

    public String returnText() {
        return word;
    }
}
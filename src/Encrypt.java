/*
 Usage : call EncryptText(word, password) to encrypt @word with @password
 then call returnText to get the encrypted text
 */
public class Encrypt {

    private String word;
    private String password;
    //private int algo = 0;

    public Encrypt() {
//        //Test decrypt
//        String test = "";
//        for (int i = 0; i < word.length(); i++) {
//            test += String.valueOf((char) (word.charAt(i) - algo));
//            //System.out.println("char at i=" + i + " is " + (char) (word.charAt(i)));
//        }
//
//        System.out.println("test is now scrambled and is now = " + test);
    }
    

    private String word = "";
    //private int algo = 0;

    public void EncryptText(String w, String pw) {
        /*
         * Encryption Algorithm
         * Get charcode for each char in password, sum them up together to @algotmp
         */
        int algotmp = 0;
        for (int i = 0; i < pw.length(); i++) {
            //Sum char code for all of the characters in password
            algotmp += pw.codePointAt(i);
        }
        System.out.println("word length = " + w.length());
        System.out.println("algotmp = " + algotmp);
        System.out.println("algotmp length = " + String.valueOf(algotmp).length());

        /*
         * TODO: do loop to make algo be within the number of available character code
         * while also storing how many times it looped
         * 
         * Valid codes : 33-126
         * http://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
         */

        /*
         * char Usage examples
         * System.out.println((char) 65); //will print A
         * System.out.println((char) ('A' + 1)); //will print B
         */

        /*
         * TODO: use the numbers got from algo to add/minus to charcode of each char in word and looping
         * if exceeds number of charcode while storing how many times it looped
         */

        /*
         * Encrypting word
         * Move char in word up by charcode of int:algo
         */
        //String strtmp = "";
        //Process algotmp at position 

        //Process word at position wpos
//        for (int wpos = 0; wpos < w.length(); wpos++) {
//            System.out.println("wpos is now = " + wpos);
//            for (int apos = 0; apos < String.valueOf(algotmp).length(); apos++) {
//                System.out.println("apos is now = " + apos);
//                strtmp += (char) (w.codePointAt(wpos) + String.valueOf(algotmp).codePointAt(apos));
//
//                //strtmp += String.valueOf((char) (w.charAt(i) + String.valueOf(algotmp).codePointAt(x)));
//                //System.out.println("w.charat " + i + " = " + (char) w.charAt(i));
//            }
//            
//            System.out.println("strtmp = " + strtmp);
//        }
            //word += String.valueOf((char) (w.charAt(i) + algotmp));

        //System.out.println("char at i=" + i + " is " + (char) (w.charAt(i) +1));
        //System.out.println("word is now scrambled and is now = " + word);
        
        String str = "";
        //if word at position 0 = A then shows B
        //str += (char) (w.charAt(0) + String.valueOf(algotmp).charAt(0));
        //System.out.println("algotmp 0 = " + String.valueOf(algotmp).charAt(0));
        //System.out.println("str = " + str);
        
        //asdf = 414
        //turn str to 41441441...
        //asdfghjkl = 912
        //turn str to 912912912...
        //for (int wpos = 0; wpos < w.length(); wpos++){
           
        for (int a = 0; a < String.valueOf(algotmp).length(); a++) {
            str += String.valueOf(algotmp).charAt(a);
           
        }
        //}
        System.out.println("str = " + str);
        
        
    }

    public String returnText() {
        return word;
    }
}

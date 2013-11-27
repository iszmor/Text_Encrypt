package text_encrypt01;

public class Encrypt {

    private String word = "";
    private int algo = 0;

    public Encrypt(String w, String pw) {
        /*
         * Encryption Algorithm
         * Get charcode for each char in password, sum them up together
         */
        for (int i = 0; i < pw.length(); i++) {
            //Sum char code for all of the characters in password
            algo += pw.codePointAt(i);
        }
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
        for (int i = 0; i < w.length(); i++) {
            word += String.valueOf((char) (w.charAt(i) + algo));
            //System.out.println("char at i=" + i + " is " + (char) (w.charAt(i) +1));
        }
        //System.out.println("word is now scrambled and is now = " + word);

//        //Test decrypt
//        String test = "";
//        for (int i = 0; i < word.length(); i++) {
//            test += String.valueOf((char) (word.charAt(i) - algo));
//            //System.out.println("char at i=" + i + " is " + (char) (word.charAt(i)));
//        }
//
//        System.out.println("test is now scrambled and is now = " + test);

    }

    public String returnWord() {
        return word;
    }
}

package text_encrypt01;

public class Encrypt {

    private String word = "";
    private int algo = 0;

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
        /*
         * TODO: do loop to make algo be within the number of available character code
         * while also storing how many times it looped
         * 
         * Valid codes : 33-126
         * http://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
         */

//        System.out.println("algotmp = " + algotmp);
//        int loop = 0;
//        if (algotmp < 33 || algotmp > 126){
//            for (int i = 0; i < 93; i++){
//                algo += 1;
//                loop++;
//            }
//        }
//        System.out.println("algo = " + algo);
//        System.out.println("loop = " + loop);

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
            word += String.valueOf((char) (w.charAt(i) + algotmp));
            //System.out.println("char at i=" + i + " is " + (char) (w.charAt(i) +1));
        }
        //System.out.println("word is now scrambled and is now = " + word);
    }

    public String returnText() {
        return word;
    }
}

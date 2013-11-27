package text_encrypt01;

public class Encrypt {

    private String word = "";
    private String password;

    public Encrypt(String w, String pw) {
        //encryption algorithm
        int algo = 0;
        for (int i = 0; i < pw.length(); i++) {
            //Sum char code for all of the characters in password
            algo += pw.codePointAt(i);
        }
        System.out.println("The sum of all codepoints of password (algo) is = " + algo);
        /*
         * TODO: do loop to make algo be within the number of available character code
         * while also storing how many times it looped
         */
        
        //System.out.println((char) 65); //A
        //System.out.println((char) ('A' + 1)); //B

        /*
         * TODO: use the numbers got from algo to add/minus to charcode of each char in word and looping
         * if exceeds number of charcode while storing how many times it looped
         */
        for (int i = 0; i < w.length(); i++) {
            //This moves charcode up for 'algo' number
            word += String.valueOf((char) (w.charAt(i) +algo));
            //System.out.println("char at i=" + i + " is " + (char) (w.charAt(i) +1));
        }
        
        System.out.println("word is now scrambled and is now = " + word);
        
        //Test decrypt
        String test = "";
        for (int i = 0; i < word.length(); i++){
            test += String.valueOf((char) (word.charAt(i) -algo));
           //System.out.println("char at i=" + i + " is " + (char) (word.charAt(i)));
        }
        
        System.out.println("test is now scrambled and is now = " + test);

    }

    public String returnWord() {
        return word;
    }
}

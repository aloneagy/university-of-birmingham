package predictive;

import java.math.BigInteger;
public class WordSig implements Comparable<WordSig> {
    private String words;
    private String signature;

    /**
     * @param
     * @description: non parameter constructor for WordSig
     */
    public WordSig() {
    }

    /**
     * @param signature
     * @param words
     * @description: full parameter constructor for WordSig
     */
    public WordSig(String signature, String words) {
        this.signature = signature;
        this.words = words;
    }

    /**
     * @param
     * @return java.lang.String
     * @description: get the value  for words
     */
    public String getWords() {
        return words;
    }

    /**
     * @param words
     * @return void
     * @description: set the value of words
     */
    public void setWords(String words) {
        this.words = words;
    }

    /**
     * @param
     * @return java.lang.String
     * @description: getter for signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @param signature
     * @return void
     * @description: setter for signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }


    /**
     * @param o1
     * @return int 0or 1 or -1
     * @description: override compareTo method,comparing the value with o1, if the object's value is bigger
     * than o1,it will return -1. if they are equal, it will return0, else return -1.
     */
    @Override
    public int compareTo(WordSig o1) {
        return (new BigInteger(this.signature).compareTo(new BigInteger(o1.signature)));
    }

    /**
     * @param
     * @return java.lang.String
     * @description: override toString method
     */
    @Override
    public String toString() {
        return "WordSig{" +
                "words='" + words + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }


}


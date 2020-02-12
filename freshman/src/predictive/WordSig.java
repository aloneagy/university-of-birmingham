package predictive;

import java.math.BigInteger;

/**
 * @author <HANCHUN WU> This class contains the solution for Worksheet3
 */

public class WordSig implements Comparable<WordSig> {
    private String words;
    private String signature;

    /**
     * @param
     * @description: no parameter constructor for class WordSig
     */
    public WordSig(){
    }

    /**
     *  Standard constructor.
     *  @param words The words of the WordSig to be generated.
     *  @param signature The signature of the Wordsig to be generated.
     */
    public WordSig(String words, String signature) {
        this.words = words;
        this.signature = signature;
    }

    /**
     * Getter method to return the words of WordSig.
     * @return The words of the WordSig.
     */
    public String getWords() {
        return words;
    }

    /**
     *  The setter setWords changes the words of WordSig.
     *  @param words The new words of the WordSig.
     */
    public void setWords(String words) {
        this.words = words;
    }

    /**
     * Getter method to return the signature of WordSig.
     * @return The salutation of the account.
     */
    public String getSignature() {
        return signature;
    }

    /**
     *  The setter setSignature changes the signature of WordSig.
     *  @param signature The new signature of the WordSig.
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * @param o1
     * @return int
     * @description: override compareTo method
     */
    @Override
    public int compareTo(WordSig o1) {
        return (new BigInteger(this.signature).compareTo(new BigInteger(o1.signature)));
    }

    /**
     *  toString defines how to print a WordSig.
     *
     *  @return A human readable string to present a WordSig.
     */
    @Override
    public String toString() {
        return "WordSig{" +
                "words='" + words + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}

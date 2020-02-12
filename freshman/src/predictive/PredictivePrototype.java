package predictive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author <HANCHUN WU> This class contains the solution for Worksheet3
 */


public class PredictivePrototype {
    private static final String abc = "abc";
    private static final String def = "def";
    private static final String ghi = "ghi";
    private static final String jkl = "jki";
    private static final String mon = "mon";
    private static final String pqrs = "pqrs";
    private static final String tuv = "tuv";
    private static final String wxyz = "wxyz";

    /**
     * @param word
     * @return java.lang.String
     * @description: The method takes a word and returns a numeric signature.
     * @Answer:
     */

    public static String wordToSignature(String word){
    StringBuffer bf = new StringBuffer();
    String[] transfer = word.toLowerCase().split("");
    for (String t:transfer){
        if (abc.contains(t)){
           bf.append(2);
        }else if (def.contains(t)){
            bf.append(3);
        }else if (ghi.contains(t)){
            bf.append(4);
        }else if (jkl.contains(t)){
            bf.append(5);
        }else if (mon.contains(t)){
            bf.append(6);
        }else if (pqrs.contains(t)){
            bf.append(7);
        }else if (tuv.contains(t)){
            bf.append(8);
        }else if (wxyz.contains(t)){
            bf.append(9);
        }else {
            bf.append("");
        }
    }
    return bf.toString();
    }
    /**
     * @param signature
     * @return java.util.Set<java.lang.String>
     * @description: the method takes the given numeric signature and returns a set of possible matching words from
     * the dictionary.This implementation will be inefficient because every time you invoke this method, it will read
     * the dictionary from the disk.
     */

    public static Set<String> signatureToWords(String signature){
    Set result = new HashSet<>();
    BufferedReader reader = null;
    try{
        reader = new BufferedReader(new FileReader("/Users/zhangyongnan/IdeaProjects/studyclassroom/src/predictive/words"));
        String line;
        while ((line = reader.readLine())!= null){
            if (isValidWord(line)){
                if (wordToSignature(line).equals(signature)){
                    if (!result.contains(line)){
                        result.add(line.toLowerCase());
                    }
                }
            }
        }
    } catch (IOException e){
        e.printStackTrace();
    }
    try {
        reader.close();
    } catch (IOException e){
        e.printStackTrace();
    }
    return result;
    }
    static boolean isValidWord(String word){
        return word.matches("[a-zA-Z]+ ");
    }
}

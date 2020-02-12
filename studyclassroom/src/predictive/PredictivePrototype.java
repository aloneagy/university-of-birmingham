package predictive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;


public class PredictivePrototype {
    //the information with the keyboard.
    static ArrayList<String> keyboard=new ArrayList<>(Arrays.asList("1","2abc","3dfe","4ghi","5jkl","6mno","7pqrs","8tuv","9xywz","*"," ","#"));

    /**
     * @param word
     * @return java.lang.String, the numbers are transferred by this methods.
     * @description: The method takes a word and returns a numeric signature.
     * @Answer: if there are frequent operations on the contents of a string, especially if the contents are to be modified,
     * it will be more efficient to use StringBuffer because StringBuffer will only create 1 space in the heap
     * but when you use "+" operator to the string, it will create several space in the heap according to the operand.
     */
    public static String wordToSignature(String word) {
        StringBuffer stringBuffer = new StringBuffer(word.toLowerCase());
        StringBuffer result = new StringBuffer();
        for(int i=0;i<stringBuffer.length();i++){
            for(String s:keyboard){
                if(s.contains(""+stringBuffer.charAt(i))){
                    result.append(s.charAt(0));
                    break;
                }
            }
        }
        return result.toString();
    }
    /**
     * @param word
     * @return boolean if the words satisfy the condition, it will return true, otherwise,it will return false.
     * @description: helper method to check whether a word is valid or not by reading the dictionary
     * and ignoring lines with non-alphabetic characters.
     */
    static boolean isValidWord(String word){
        String words="^[a-zA-Z]+$";
        return word.matches(words);
    }


    /**
     * @param signature
     * @return java.util.Set<java.lang.String> all of words meet the conditions
     * @description: the method takes the given numeric signature and returns a set of possible matching words from
     * the dictionary.This implementation will be inefficient because every time you invoke this method, it will read
     * the dictionary from the disk.
     */

    public static Set<String> signatureToWords(String signature) throws FileNotFoundException {
       Set<String> set=new HashSet<String>();
       Scanner words=null;
       try{
           words=new Scanner(new FileInputStream("/usr/share/dict/words"));
       } catch (FileNotFoundException e) {
           System.out.println("file not found");
           System.exit(0);
       }
       while (words.hasNextLine()){
           StringBuffer result=new StringBuffer(words.nextLine());
           if(isValidWord(result.toString())){
               StringBuffer tem=new StringBuffer(wordToSignature(result.toString()));
               if(tem.toString().equals(signature)){
                   set.add(result.toString().toLowerCase());
               }
           }
       }

       words.close();

        return set;
    }

}

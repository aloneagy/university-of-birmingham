package predictive;

import java.util.Date;

/**
 * @author <HANCHUN WU> This class contains the solution for Worksheet3
 */

public class Sigs2WordsList {

    /**
     * @param args
     * @return void
     * @description: Compare the time taken to complete the execution of Sigs2WordsList and Sigs2WordsProto
     * with the same large inputs. The input is [4663 42779 5453 65 33835676368 46753636828466].
     * timing result of Sigs2WordsProto is 3131 millisecond.
     * timing result of Sigs2WordsList is 92 millisecond.
     */
    public static void main(String[] args) {
        Date date0 = new Date();
        for (String arg:args){
            StringBuffer bf = new StringBuffer(arg + " : ");
            PredictivePrototype.signatureToWords(arg).forEach(x -> bf.append(x +""));
            System.out.println(bf.toString());
        }
        Date date1 = new Date();
        long spentTime = date1.getTime() - date0.getTime();
        System.out.println("the conversion time of wordToSignature is" + spentTime + "millisecond");

        ListDictionary dictionary = new ListDictionary("/Users/zhangyongnan/IdeaProjects/studyclassroom/src/predictive/words");
        Date date2 = new Date();
        for (String arg:args){
            StringBuffer bf = new StringBuffer(arg + ":");
            dictionary.signatureToWords(arg).forEach(x ->bf.append(x + ""));
            System.out.println(bf.toString());
        }
        Date date3 = new Date();
        long spentTime1 = date3.getTime() - date2.getTime();
        System.out.println("the conversion time of wordToSignature is" + spentTime1 + "millisecond");
    }
}
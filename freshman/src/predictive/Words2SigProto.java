package predictive;

import java.util.Date;

/**
 * @author <HANCHUN WU> This class contains the solution for Worksheet3
 */

public class Words2SigProto {

    /**
     * @param args
     * @return void
     * @description: main method for calling the wordToSignature method
     */
    public static void main(String[] args) {
        Date date0 = new Date();
        for (String arg:args){
            if (PredictivePrototype.isValidWord(arg)){
                System.out.println(arg + ":" + PredictivePrototype.wordToSignature(arg));
            }
        }
        Date date1 = new Date();
        long spentTime = date1.getTime() - date0.getTime();
        System.out.println("the conversion time of wordToSignature is" + spentTime + "millisecond");
    }
}

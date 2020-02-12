package predictive;

import java.util.Date;

/**
 * @author <HANCHUN WU> This class contains the solution for Worksheet3
 */

public class Sigs2WordsProto {

    /**
     * @param args
     * @return void
     * @description: main method for calling the signatureToWords method
     */
    public static void main(String[] args) {

        Date date0 = new Date();
        for (String arg : args){
            StringBuffer bf = new StringBuffer(arg + " : ");
            PredictivePrototype.signatureToWords(arg).forEach(x -> bf.append(x + ""));
            System.out.println(bf.toString());
        }
        Date date1 = new Date();
        long spentTime = date1.getTime() - date0.getTime();
        System.out.println("conversion time of signatureToWords is " + spentTime + "millisecond");
    }
}

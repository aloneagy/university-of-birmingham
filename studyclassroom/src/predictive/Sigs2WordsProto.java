package predictive;

import java.io.FileNotFoundException;
import java.util.Date;

public class Sigs2WordsProto {
    /**
     * @param args
     * @return void
     * @description: main method for calling the signatureToWords method and this method will run the
     * program with all of params.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Date date1 = new Date();
        for (String arg : args) {
            StringBuffer bf = new StringBuffer(arg + " : ");
            PredictivePrototype.signatureToWords(arg).forEach(x -> bf.append(x + " "));
            System.out.println(bf.toString());
        }
        Date date2 = new Date();
        System.out.println(date2.getTime()-date1.getTime());
    }
}

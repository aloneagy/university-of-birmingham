package predictive;

import java.util.Date;

public class Words2SigProto {
    /**
     * @param args
     * @return void
     * @description: main method for calling the wordToSignature method,and it will transfer the word into the signature
     * then,it will tell how much time this methods costs.
     */
    public static void main(String[] args) {
        Date startTime = new Date();
        for (String arg : args) {
            if (PredictivePrototype.isValidWord(arg)) {
                System.out.println(arg + " : " + PredictivePrototype.wordToSignature(arg));
            }
        }
        Date finishTime = new Date();
        System.out.println(finishTime.getTime() - startTime.getTime());
    }
}

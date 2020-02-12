package predictive;

import java.io.FileNotFoundException;
import java.util.Date;

public class Sigs2WordsList {

    /**
     * @param args
     * @return void
     * @description: compare the time of both methods cost(PredictivePrototype and ListDictionary) and compare the
     * result performed by these two methods.
     *
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


        ListDictionary dictionary = new ListDictionary("/usr/share/dict/words");
        Date date3 = new Date();
        for (String arg : args) {
            StringBuffer bf = new StringBuffer(arg + " : ");
            dictionary.signatureToWords(arg).forEach(x -> bf.append(x + " "));
            System.out.println(bf.toString());
        }
        Date date4 = new Date();
        System.out.println(date4.getTime()-date3.getTime());
    }
}
//note:
/**in this class,if the param is the 4663, the former time cost 1625 millisecond, the last time cost the 23 millisecond,
 * compared the both of them , and we are able to get a conclusion from this comparsion like this:
 * the binary search is more efficient approach. by the way, the results gotten by these two method are same.
 */
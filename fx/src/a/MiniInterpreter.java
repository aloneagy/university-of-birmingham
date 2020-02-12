package a;

import java.util.ArrayList;

public class MiniInterpreter {
    /**
     *  Class ToyProgramInterpreter is a mini-interpreter for a toy programming language.
     *  @version 2019-12-10
     *  @author yongnan zhang
     */

    /**
     * This method handle with the data
     * @param string the string you would like to work with
     */
    public static int miniInterpreter(String string) {
        /*
        this part is to clear the space and split ever element and number
         */
        String[] subString = string.split("\n");
        for (int i = 0; i <subString.length ; i++) {
            subString[i]=subString[i].replaceAll(" ","");
        }

        ArrayList<Integer> value = new ArrayList<>();// add a new arraylist
        ArrayList<String> sign = new ArrayList<>();// add a new arraylist

        String arr = "";

        for (int i = 0; i < subString.length; i++) {
            String[] word = subString[i].split("=|\\+");
            String[] word1 = new String[word.length + 1];
                /*
                this part is to judge what operate the array contains
                 */
            if (subString[i].contains("+")) {
                arr = new String("1");
                for (int j = 0; j < word.length; j++) {
                    word1[j + 1] = word[j];
                }
                word1[0] = arr;
            } else if (subString[i].contains("=")) {
                arr = new String("0");
                for (int j = 0; j < word.length; j++) {
                    word1[j + 1] = word[j];
                }
                word1[0] = arr;
            } else {
                arr = new String("2");
                for (int j = 0; j < word.length; j++) {
                    word1[j + 1] = word[j];
                }
                word1[0] = arr;
            }
            /*
            this part is to handle the data what the operater you would like to use.
             */
            if (Integer.parseInt(word1[0]) == 0) {
                sign.add(word1[1]);
                value.add(Integer.parseInt(word1[2]));
            }
            else if (Integer.parseInt(word1[0]) == 1) {
                int a = 0;
                int b = 0;
                if(word1[2].matches("[a-zA-Z]")) {
                    for (int p = 0; p < sign.size(); p++) {
                        if (sign.get(p).equals(word1[2])) {
                            a = value.get(p);
                        }
                    }
                }
                else {
                    a = Integer.parseInt(word[2]);
                }
                if(word1[3].matches("[a-zA-Z]")) {
                    for(int j = 0; j<sign.size(); j++) {
                        if(sign.get(j).equals(word1[3])) {
                            b= value.get(j);
                        }
                    }
                }else{
                    b = Integer.parseInt(word1[3]);
                }
                value.add(a+b);
                sign.add(word1[1]);
            }
            else {
                for (int i1 = sign.size()-1; i1 >=0; i1--) {
                    if(sign.get(i1).equals(word1[1])){
                        return value.get(i1);
                    }
                }
            }

        }
        return 1;
    }

    //For test
    public static void main(String[] args) {
        String string1 = "A = 2" + "\n" +
                "B = 8 \n" +
                "C = A + B \n" +
                "C";
        int sum1 = miniInterpreter(string1);
        System.out.println(string1 + "=" + sum1);

        String string2 = "A = 2\n" +
                "B = 22\n" +
                "Z = 91\n" +
                "K = A + B\n" +
                "Z = K + A\n" +
                "Z";
        int sum2 = miniInterpreter(string2);
        System.out.println(string2 + "=" + sum2);

        String string3 = "A = 2 + 1\n" +
                "B = A + 9\n" +
                "C = A + B\n" +
                "A";
        int sum3 = miniInterpreter(string3);
        System.out.println(string3 + "=" + sum3);
    }
}
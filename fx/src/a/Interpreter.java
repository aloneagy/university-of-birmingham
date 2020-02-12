package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


/**
 * @author zyn
 * @description The class includes a mini interpreter of handling the data to get the expection we would like to get
 * @date 2019-12-10
 */
public class Interpreter {

    /**
     * @param string
     * @return int : return the result of toy Language
     * @description: this method is to work with the data and compute the result
     */
    public static int miniInterpreter(String string) {
        //this part of code is to judge whether the parameter is empty or not;
        if (string == null || string.equals("")) {
            throw new IllegalArgumentException("error");
        }
        //this part of code is to clear th space and split this sentence into element.
        String[] words = string.split("\n");
        for (int i = 0; i < words.length; i++) {
            String token = "";

            String[] strings = words[i].split(" ");
            for (String str : strings) {
                token += str;
            }
            words[i] = token;
        }
        //create memory to store variable and value
        HashMap<String, Integer> memory = new HashMap<>();
        //get keySet for search variable
        Set<String> keys = memory.keySet();
        //first number for assignment statement
        int a = 0;
        //second number for assignment statement
        int b = 0;
        //interpreter every statement and execute
        for (String token : words) {
            //find index of "=" in the statement
            int equal = token.indexOf("=");
            //find index of "+" in the statement
            int plus = token.indexOf("+");
            //execute assignment statement
            if (token.contains("+")) {
                ArrayList<String> listAdd = new ArrayList<>();
                listAdd.add("1");
                listAdd.add(token.substring(0, 1));
                listAdd.add(token.substring(equal + 1, plus));
                listAdd.add(token.substring(plus + 1));
                //if this element is a integer number
                if (listAdd.get(2).matches("\\-*[0-9]+")) {
                    a = Integer.parseInt(listAdd.get(2));
                }
                else {
                    for (String key : keys) {
                        if (key.equals(listAdd.get(2))) {
                            a = memory.get(key);
                        }
                    }
                }
                //if this element is a integer number
                if (listAdd.get(3).matches("\\-*[0-9]+")) {
                    b = Integer.parseInt(listAdd.get(3));
                }
                else {
                    //get every thing in keys
                    for (String key : keys) {
                        if (key.equals(listAdd.get(3))) {
                            b = memory.get(key);
                        }
                    }
                }
                //store variable and it's value in the memory
                memory.put(listAdd.get(1), a + b);
                //execute result statement
            } else if (token.length() == 1) {
                for (String key : keys) {
                    if (key.equals(token)) {
                        return memory.get(key);
                    }
                }
                //execute assignment statement which does not contain "+" such as A=1
            } else {
                ArrayList<String> work = new ArrayList<>();
                work.add("0");
                work.add(token.substring(0, 1));
                work.add(token.substring(equal + 1));
                memory.put(work.get(1), Integer.parseInt(work.get(2)));
            }
        }
        //if the situation is not what we would like to get, it will get the number 0
        return 0;
    }

    //For test
    public static void main(String[] args) {
        String str1 = "A = 2" + "\n" +
                "B = 8 \n" +
                "C = A + B \n" +
                "C";
        int sum = miniInterpreter(str1);
        System.out.println(str1 + "=" + sum);

        String str2 = "A = 2\n" +
                "B = 22\n" +
                "Z = 91\n" +
                "K = A + B\n" +
                "Z = K + A\n" +
                "Z";
        int sum1 = miniInterpreter(str2);
        System.out.println(str2 + "=" + sum1);

        String str3 = "A = 2 + 1\n" +
                "B = A + 9\n" +
                "C = A + B\n" +
                "A";
        int sum2 = miniInterpreter(str3);
        System.out.println(str3 + "=" + sum2);
    }
}

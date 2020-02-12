package WS1three;

import java.util.*;
import java.util.regex.Pattern;
/*
there are a few problems in this class. Firstly, if the fist number user scanneing is not between 1and 5 or it is not a number,it will catch the exception and
 give a hint to tell user input the number between 1to 5.
At the same time, swith everycase, it need break at the end of case.if there has no break, it will operate next case continuously.
in the add method, it need add a condition to judge the number whether it is bigger than zero, if the number is less than zero. The system will give
the hint to remind the user input a positive number.
in the substract, it needs two conditions.Firstly, the number the user input have to be bigger than counter. otherwise the counter will become a negative number after the methd Seconddly,
the number has to be bigger than zero, otherwise it become the add method
At last,in set method, the number the user would like to method have to be bigger than zero,because it is impossible that the counter is a negative number.
 */

public class Counter {

    public static final Pattern p12345 = Pattern.compile("[12345]");

    private int counter;

    public Counter() {
        this.counter = 0;
        Scanner s = new Scanner(System.in);

        byte topChoice = 1;
        while (topChoice != 5) {
            System.out.println("Please enter:\n" +
                    "1 to add to the total\n" +
                    "2 to subtract from the total\n" +
                    "3 to show the total\n" +
                    "4 to set the total\n" +
                    "5 to exit the program");
            try {
                topChoice = (byte) Integer.parseInt(s.next(p12345));//try the setence thether the content is able to transfer into the number between 1and5
            } catch (InputMismatchException e) {
                System.out.println("please add the number which has to be between 1 and 5");
            }
            //so it need
            switch (topChoice) {
                case 1:
                    add(s);
                    break;//this places need a"break", if it has no break,it will operate next case when the computer have completed this case;
                case 2:
                    subtract(s);
                    break;//this places need a"break", if it has no break,it will operate next case when the computer have completed this case
                case 3:
                    show();
                    break;//this places need a"break", if it has no break,it will operate next case when the computer have completed this case
                case 4:
                    set(s);
                    break;//this places need a"break", if it has no break,it will operate next case when the computer have completed this case
                case 5:
                    System.out.println("Finally there are "
                            + counter + " items available.");
                    break;//this places need a"break", if it has no break,it will operate antoher case when the computer have completed this case
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public void add(Scanner s) {
        System.out.println("How much to add?");
        try {

            int i = Integer.parseInt(s.next());// it need a varible to accept the number which has transferred;
            if (i > 0) {// in this case, if you would like to add a number,then the number has to bigger than zero;
                counter += i;//this method means that the counter add the number you input if the number is bigger than zero;
            } else {//if the number is negative, the system will give the user a some warnings to reminder the user ought to add a postive number
                System.out.println("please add a postive number");
            }

        } catch (NumberFormatException e) {
            System.out.println("You need to enter an integer.");
            s = new Scanner(System.in);
        }
    }

    public void subtract(Scanner s) {
        System.out.println("How much to subtract?");
        try {
            int j= Integer.parseInt(s.next());
            if(j<counter&&j>0){//the number you want to subtract have to bigger than zero and less than counter
                counter-=j;
            }else if(j<0){//if the number less than zero,giving a hit to remind the user to add a positive number
                System.out.println("please add a postive number");
            }else{//other wise the system will give a hint the number you input is bigger than the counter,please input a number which is smaller than counter
                System.out.println("the number you input is bigger than the counter,please input a number which is smaller than counter");//

            }
        } catch (NumberFormatException e) {
            System.out.println("You need to enter an integer.");
            s = new Scanner(System.in);
        }
    }

    public void show() {

            System.out.println("Currently there are " + counter +
                    " items available.");
    }

    public void set(Scanner s) {
        System.out.println("To which value do you want to set the counter?");
        try {

            int u = Integer.parseInt(s.next());
            if(u>=0){//the number user would like to set have to be a positive number
                counter=u;
            }else//other wise is meaningless.
            System.out.println("please input a positve number");

        } catch (NumberFormatException e) {
            System.out.println("You need to enter an integer.");
            s = new Scanner(System.in);

        }
    }


    public static void main(String[] args) {
        Counter parcels = new Counter();
    }
}

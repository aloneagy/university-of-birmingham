package WS1three;

import java.util.ArrayList;
/*
in this class, Firstly, you have to make a constructor which doesn't need parameter. At the same time, you make a new Arraylist calling allSalaries
and make a method, in which you add the data in array emplpyeeSalaries into the Arraylist of allSalaries.
after that,you creat a method with a parameter of a array. In this method, you ought to compute all value in emoloyee. so you need a loop to calculate
the sum by adding the index of employeeSalaries from zero to length. then compute the num which the salary is not equal with zero. finall, calculate the
value of avg by sum devides into num. If all salaryies is zero,so the data is meanless. you need throw a exception.
Next step is creating a method in which you add all the non-zero salary into a new arraylist calling averagesalaries. So you need add a condition, if the salary is
zero.the system will give a sign of all salaries are zero.
In the last method,in which should give the result whether of someone's averagesalary is bigger than three times of overall salaries.Firstly, you should compute
the overall value of averagesalaries. then making a judgement whether the average is bigger than three times of overall salaries, if it's bigger than three times,
set the value of return false. else is true;
 */
public class Salaries {
    public Salaries() {}//make a constructor wihich doesn't need parameter

    ArrayList<double[]> allSalaries = new ArrayList<>();//add a new arrarylist whose name called all salaries

    public void add(double[] employeeSalaries) {//making a method, which need array as the parameter to use it
        allSalaries.add(employeeSalaries);//this method's usage is adding the value of employee into the arraylist of allSalaries

    }

    public static double average(double[] employeeSalaries) {//making a method, which need array as the parameter to use it
        int num = 0;//define the variable of num,whose value is zero;
        double sum = 0;//define the varianle of sum,whose value is zero;
        for (int i = 0; i  < employeeSalaries.length; i++) {//set a loop, the number of loop is the length of employeeSalaries
            if (0 != employeeSalaries[i]) {//if the value of array is not zero;
                sum += employeeSalaries[i];//it will add with sum;
                num++;//at the same time, the value of num will add one by a time;
            }
        }
        if (num == 0) {//if the value of num is zero,which means the employee's salary is zero in every month, so it is meanless;
            throw new IllegalArgumentException();//it need throw a exception;
        }
        return sum / num;//set the value of return is the value of sum devide into that of num;
    }

    public ArrayList<Double> averageSalaries() {
        ArrayList<Double> result = new ArrayList<>();//add a new arraylist calling result
        for (double[] allSalary : allSalaries) {//set the variable calling allSalary going all insert in array of allSalaries
            double average = 0;//define the variable calling average and set the value is the zero
            try {//try the sentence, comparing the value of average with the average method and the allsalary is the parameter.
                average = average(allSalary);
            } catch (Exception e) {//if the average method of the allsalary as parameter compute the zero. the system will give the sign of "all salaries are zero."
                System.out.println("all salaries are zero");
            }
            if (average != 0) {//if all of salaries is not zero
                result.add(average);//the value of average will be added into the array of result
            }
        }


        return result;//setting the content of return is the result
    }

    public boolean not3TimesHigher() {
        double sum = 0;//define the variable calling sum and set the value is the zero
        ArrayList<Double> averageSalaries = averageSalaries();//making the result of averageSalaries as same as the arraylist of averageSalaries
        for (Double averageSalary : averageSalaries) {//set the variable calling allSalary going all insert in array of allSalaries
            sum += averageSalary;// compute the value of sum by using averageSalary as parameter in array of averagesalaries one by one
        }
        double overAllSalary = sum / averageSalaries.size();//defining the value of overAllSalary is the sum deviding into the size of arrary averagesize.
        for (Double averageSalary : averageSalaries) {//set the variable calling allSalary going all insert in array of allSalaries

            if (averageSalary > overAllSalary * 3) {//if the value of averageSalary is bigger than three times of overAllSalary
                return false;//setting the value of return is false
            }
        }


        return true;//setting the value of return is true;
    }
}
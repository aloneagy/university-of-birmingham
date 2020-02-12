package WS1three;

public class Temperature {

    /*
    the temperature is a array which store the data in 365 days in one year. If you would like to get the minimum, you have to set a variable whose value is zero
    then comparing the value of zero and with that of other in the same array is the method to promise the variable is the minimum. If you anyone's value is bigger
    than the variable you set. You have to change the value of the variable. Finally set the value of return and add one,because the insert in the array begins zero
    and the day in a year begins one.
     */
    double[] temperatures = new double[365];// add a new array whose name os temperatures

    public static int coldest(double[] temperatures) {//define the method
        int min = 0;// setting the value of min is zero

        for (int i = 0; i < 365; i++) {//compare the value of min with every value of the array calling temperature
            if (temperatures[min] > temperatures[i]) {//if the value of min is bigger than the value of anyone in this array
                temperatures[min] = temperatures[i];//this method will reset the value of method,making the value of min as same as the value which the value is less than that of min
                min = i;//reset the value of min,making the value of min is as same as the anyone which is less than min
            }

        } return min+1;//resulting from the array begins zero, and the day of the year begins one, so the value of min ought to add one


    }

}
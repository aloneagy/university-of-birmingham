package WS1three;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Date;
/*
in this class, firstly you should define three variable numbers. and make a constructor with three parameter.
in makeFields method, you can use a loop. the number of loop is the length of array varibletype. the loop will print the "private" + every value in variableType +blank
and add";", the rest should print in nextline. and set value of return is the out put and the out put should nextline.
in method make constructor,firstly the string begin with "public "+ classname +"(" and make a loop,the number of loop is equal the array of variableTypes.if the number of loop
is not the last time of the loop the result is the value of every varibletype +blank+every variableName+"," otherwise the the result is the value of every varibletype +blank+
every variableName+"," finally set value of return is the out put and the out put should nextline. Then make another method like before, and revise the string until the string
is as same as the example.
in the setting method,it also need a loop,in this loop will print the conent of value of output is the "public void set" +every varibletype +"get"+variblename,and the first alphabet
of varibleName ought to be upped. then add the "()" and {. the restshould be printed in nextline. Next step is add "this " + the every class name +"=" +variable name+";" finally next
content ought to printed in the next line.+"}" and the symbol of """ should print in next line
iin the getting method, it also need a loop the number of loop is equal the array of variableTypes.and making the conent of value of output is the "public" +every varibletype +"get"+
variblename,and the first alphabet of varibleName ought to be upped. then add the "()" and {. the rest of then the rest should be written in the next line ,finally, it should+"return"
 and every variable name +";" .the next content should be in next line add "}" at the end.the "public""get""{}} so on ought to add in front of every varible and set the values of return.
 */

public class GenerateClass {
    private String classname;//define the varible of class name;
    private String[] variableName;
    private String[] varibleTypes;

    public GenerateClass(String classname, String[] variableName, String[] varibleTypes) {//make a constructor,if you want to use it,you have to have three paramters.
        this.classname = classname;
        this.variableName = variableName;
        this.varibleTypes = varibleTypes;
    }


    public String makeFields() {
        String output = "";//making the type  of output is string and the value is blank
        for (int i = 0; i < varibleTypes.length; i++) {//make a loop,the number of loop is equal the array of variableTypes.
            {
                output += "  private " + varibleTypes[i] + " " + variableName[i] + ";\n";//the content of output is the "private" add the every variable type and every variable name
            }//the private should add in front of every variable type. Once the output is used, the next output should be printed nextline.
        }
        return output + "\n";//set value of return is the out put and the out put should nextline.
    }

    public String makeConstructor() {
        String result = "  public " + classname + "(";//set the content of result is "public "+ classname +"("

        for (int i = 0; i < varibleTypes.length; i++) {//make a loop,the number of loop is equal the array of variableTypes.
            if (i != varibleTypes.length - 1) {//if the number of loop is not the last time of the loop
                result += varibleTypes[i] + " " + variableName[i] + ", ";//the result is the value of every varibletype +blank+every variableName+","
            } else {
                result += varibleTypes[i] + " " + variableName[i] + "){\n";//if the time is the last tiem, the result is the varibletype +blank+variableName+"({" and add the symbol next line
            }
        }
        for (int i = 0; i < varibleTypes.length; i++) {////make a loop,the number of loop is equal the array of variableTypes.
            if (i != varibleTypes.length - 1) {//if the number of loop is not the last time of the loop

                result += "    this." + variableName[i] + " = " + variableName[i] + ";\n";//the result is the value of every variablename+"= +blank+every variableName+","and add the symbol next line
            } else {

                result += "    this." + variableName[i] + " = " + variableName[i] + ";\n  }";//the result is the value of every variablename+"= +blank+every variableName+","and add the symbol next line
            }                                                                                   //and should add "}" at the end
        }
        if (varibleTypes.length == 0) {//if the varibletype is empty
            result += "){}";//the content is the "){}"
        }
        return result + "\n";//set the content of result and should add the symbol of next line;
    }

    public String makeGetters() {
        String output = "";//making the type  of output is string and the value is blank
        for (int i = 0; i < variableName.length; i++) {//make a loop,the number of loop is equal the array of variableTypes.
            // the conent of value of output is the "public" +every varibletype +"get"+variblename,and the first alphabet of varibleName ought to be upped. then add the "()" and {. the rest of
            output += "  public " + varibleTypes[i] + " get" + variableName[i].substring(0, 1).toUpperCase() + variableName[i].substring(1) + "()" + "{\n    return " + variableName[i] + ";\n  }" + "\n";
        } //then the rest should be written in the next line ,finally, it should+"return" and every variable name +";" .the next content should be in next line add "}" at the end.
                //the "public""get""{}} so on ought to add in front of every varible
        return output;//setting the content of return is the output

    }

    public String makeSetters() {
        String output = "";//making the type  of output is string and the value is blank
        for (int i = 0; i < variableName.length; i++) {//make a loop,the number of loop is equal the array of variableTypes.

            /*
             the conent of value of output is the "public void set" +every varibletype +"get"+variblename,and the first alphabet of varibleName ought to be upped. then add the "()" and {. the rest
             should be printed in nextline. Next step is add "this " + the every class name +"=" +variable name+";" finally next content ought to printed in the next line.+"}" and the symbol
             of """ should print in next line.*/
            output += "  public void set" + variableName[i].substring(0, 1).toUpperCase() + variableName[i].substring(1) + "(" + varibleTypes[i] + " " + variableName[i] + "){\n"
                    + "    this." + variableName[i] + " = " + variableName[i] + ";\n  }\n";

        }
        return output;//setting the content of return is the output
    }

}

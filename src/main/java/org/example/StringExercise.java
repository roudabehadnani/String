package org.example;

import java.util.Arrays;

public class StringExercise {
    public static void main(String[] args){

        lengthOfString();
        findCharByIndex();
        indexOfChar();
        subString();
        lowerUpperCase();
        replaceWord();
        print();
        conCate();
        oilWaterSplit();
        splitString();
        stringSplitToChar();
        charArrayToString();

    }

    public static int lengthOfString(){
        String string = "Java";
            System.out.println("The length of string is: " + string.length());
            return string.length();
        }

    public static void findCharByIndex(){
        String string = "Long example sentence";
        System.out.println("Char at index position 6 is: " + string.substring(6,7));
    }

    public static int indexOfChar(){
        String string = "Even longer example sentence";
        System.out.println("The index of char 'o' is: " + string.indexOf('o'));
        return string.indexOf('o');
    }

    public static String subString(){
        String string = "Ok this is not as long!";
        System.out.println("The remain sentence is:" + string.substring(11,22));
        return string;
    }

    public static String lowerUpperCase(){
        String string = "CAPS EQUALS SCREAMING";
        String lowerCaseString = string.toLowerCase();
        System.out.println("In the lowerCase: " + lowerCaseString);
        System.out.println("In the upperCase: " + lowerCaseString.toUpperCase());
        return string;
    }

    public static String replaceWord(){
        String string = "Java is the worst programming language!";
        System.out.println("The new sentence is: " + string.replace("worst", "best"));
        return string;
    }

    public static String print(){
        String string = "\tJ\ta\tv\ta\t";
        System.out.println("The output is: " + string.trim());
        return string;
    }

    public static String conCate(){
        int num = 20;
        String string1 = String.valueOf(num);
        String string2 = string1.concat("20");
        System.out.println("The string is: " + string2);
        return string2;
    }

    public static void oilWaterSplit(){
        String string = "Oil and Water";
        String[] newString = string.split("and");
        System.out.println("The result is: " + Arrays.toString(newString));
    }

    public static void splitString(){
        String string = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = string.split(",");
        //System.out.println("The array is: " + Arrays.toString(names));
        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }

    public static void stringSplitToChar(){
        String string = "ThisShouldBeConverted";
        char[] chars = string.toCharArray();
        System.out.println("The elements of the array are: ");
        for (int i=0; i<chars.length; i++){
            System.out.print(chars[i] + ",");
        }
        System.out.println("\n");
    }

    public static String charArrayToString(){
        char[] chars = {'J','a','v','a'};
        String string = String.valueOf(chars);
        System.out.println(string);
        return string;
    }

}

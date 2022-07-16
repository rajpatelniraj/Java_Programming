import  java.util.*;

public class Strings {

    public static void main(String args[]) {
        //compare
        String sentence = "Niraj Patel";
        String name = sentence.substring(5,  sentence.length());
        System.out.println(name);



        // //concatetion
        // String firstName = "Tony";
        // String lastName = "Stark"; 
        // String fullName = firstName + "@" + lastName;
        // //tony@stark
        // System.out.println(fullName.length());

        // //ChartAt
        // for(int i=0; i<fullName.length(); i++) {
        //     System.out.println(fullName.chartAt(i));
        // }


        //compare
        // String name1 = "Tony";
        // String name2 = "Tony";

        //1 s1 > s2: +ve value
        //2 s1 == s2: 0
        //3 s1 < s2: -ve value

        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // }
        // else {
        //     System.out.println("Strings are not equal");
        // }

        // if (new Strings("Tony") == new String("Tony")) {
        //     System.out.println("Strings are equal");
        // }
        // else {
        //     System.out.println("Strings are NoT equal");
        // }
    }
}
package ch9_java_lang_package_useful_class;

import java.util.Arrays;
import java.util.Date;

public class StringClassEx {
    public static void main(String[] args) {
        String s1 = new String("Hello");         // 리터럴 문자열
        char[] c1 = {'H','e','l','l','o'};
        String charToString =  new String(c1);          // char[]
        StringBuffer sb1 = new StringBuffer("Hello");
        String bufferToString = new String(sb1);        // buffer

        System.out.println("String : " + s1 );
        System.out.println("char to String : " + charToString);
        System.out.println("buffer to String : " + bufferToString);

        // charAt - char
        System.out.println(" ============ charAt - char ==========");
        String s2 = "Hello";
        String n2 = "0123456";
        char c2_1 = s2.charAt(1);
        char c2_2 =  n2.charAt(1);
        System.out.println("c2_1 : " + c2_1);
        System.out.println("c2_2 : " + c2_2);
        System.out.println();

        //compareTo - Integer
        System.out.println(" ============ compareTo - Integer ==========");
        System.out.println("aaa".compareTo("aaa"));
        System.out.println("aaa".compareTo("bbb"));
        System.out.println("bbb".compareTo("aaa"));
        System.out.println();

        //concat - String
        System.out.println(" ============ concat - String ==========");
        String s3="Hello";
        String concatStr = s3.concat(" World");
        System.out.println("concatStr : " + concatStr);
        System.out.println();

        //contains - boolean
        System.out.println(" ============ contains - boolean ==========");
        String s4 = "abcdefg";
        System.out.println("s4.contains(\"bc\") : " + s4.contains("bc"));
        System.out.println();

        //endsWith - boolean
        System.out.println(" ============ endsWith - boolean ==========");
        String s5 = "Hello.txt";
        System.out.println("s5.endsWith(\"txt\") : " + s5.endsWith("txt"));
        System.out.println();

        //equalsIgnoreCase - boolean
        System.out.println(" ============ equalsIgnoreCase - boolean ==========");
        String s6 = "Hello";
        System.out.println("hello.equalsIgnoreCase(s6) : " + "hello".equalsIgnoreCase(s6));
        System.out.println("HELLO.equalsIgnoreCase(s6) : " + "HELLO".equalsIgnoreCase(s6));
        System.out.println();

        //indexOf - Integer,  0 부터
        System.out.println(" ============ indexOf - Integer ==========");
        String s7 = "Hello";
        System.out.println("indexOf_method : " + s7);
        System.out.println("s7.indexOf('e') : " + s7.indexOf('e'));
        System.out.println("s7.indexOf('k') : " + s7.indexOf('k'));
        System.out.println("s7.indexOf('e',0) : " + s7.indexOf('e',0));
        System.out.println("s7.indexOf('e',2) : " + s7.indexOf('e',2));
        System.out.println("s7.indexOf(\"el\") : " + s7.indexOf("el"));
        System.out.println();

        //lastIndexOf - Integer , 0 부터
        System.out.println(" ============ lastIndexOf - int ==========");
        String s8 = "java.lang.Object";
        System.out.println("s8 : " + s8);
        System.out.println("s8.lastIndexOf(\".\") : " + s8.lastIndexOf("."));
        System.out.println("s8.indexOf(\".\") : " + s8.indexOf("."));
        System.out.println();

        //replace - String
        System.out.println(" ============ replace - String ==========");
        String s9 = "Hello";
        System.out.println("s9 : " + s9);
        System.out.println("s9.replace('H','C') : " + s9.replace('H','C'));
        System.out.println("s9.replace(\"He\",\"ne\") : " + s9.replace("He","ne"));
        System.out.println();

        //replaceAll - String
        System.out.println(" ============ replaceAll - String ==========");
        String s10 = "AABBAABB";
        System.out.println("s10 : " + s10);
        System.out.println("s10.replaceAll(\"BB\",\"bb\") : " + s10.replaceAll("BB","bb"));
        System.out.println();

        //replaceFirst - String
        System.out.println(" ============ replaceFirst - String ==========");
        String s11 = "AABBAABB";
        System.out.println("s11.replaceFirst(\"BB\",\"bb\") : " + s11.replaceFirst("BB","bb"));
        System.out.println();

        //split - String[]
        System.out.println(" ============ split - String[] ==========");
        String animals = "dog,cat,bear";
        System.out.println("animals.split(\",\") : " + Arrays.toString(animals.split(",")) );
        System.out.println();

        //startsWith - boolean
        System.out.println(" ============ startsWith - boolean ==========");
        String s13 = "java.lang.Object";
        System.out.println("s13 : " + s13);
        System.out.println("s13.startsWith(\"java\") : " + s13.startsWith("java"));
        System.out.println();

        // substring - String
        System.out.println(" ============ substring - String ==========");
        String s14 = "java.lang.Object";
        System.out.println("s14 : " + s14);
        System.out.println("s14.substring(10) : " + s14.substring(10));
        System.out.println("s14.substring(5,9) : " + s14.substring(5,9));
        System.out.println();

        // toLowerCase - String
        System.out.println(" ============ toLowerCase - String ==========");
        String s15 = "Hello";
        System.out.println("s15.toLowerCase() : " + s15.toLowerCase());
        System.out.println();

        // toUpperCase - String
        System.out.println(" ============ toUpperCase - String ==========");
        String s16 = "Hello";
        System.out.println("s15.toUpperCase() : " + s15.toUpperCase());
        System.out.println();

        //trim - String
        System.out.println(" ============ trim - String ==========");
        String s17 = "        Hello         ";
        System.out.println("s17.trim() : " + s17.trim());
        System.out.println();

        //valueOf - String
        System.out.println(" ============ valueOf - String ==========");
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf('a'));
        System.out.println(String.valueOf(100));
        System.out.println(String.valueOf(100L));
        System.out.println(String.valueOf(10.0f));
        System.out.println(String.valueOf(10.0));
        System.out.println(String.valueOf(new Date()));
        System.out.println();



    }
}

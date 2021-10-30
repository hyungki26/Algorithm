package example;

import java.util.*;

public class arrayList {

    


    public static void main(String[] args){
        System.out.println("Hello world");

        ArrayList<String> lst1 = new ArrayList<>();

        String sss = "hwllo world!!!";

        char[] tmpChar = sss.toCharArray();
        for(int i=0;i<tmpChar.length;i++){
            System.out.println((char)(int)tmpChar[i]);
        }

        lst1.add("one");
        lst1.add("two");

        lst1.size();

        int[] tmp1 = new int[lst1.size()];

        for(int i=0;i<tmp1.length;i++){
            System.out.println(tmp1[i]);
        }





    }
    
}

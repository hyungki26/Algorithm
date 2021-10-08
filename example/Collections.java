package example;

import java.util.*;

/* Collections 프레임웍
배열은 개수를 지정해서 만든다. 개수를 변경할 수 없다. -> 개구림
ArrayList는 컬렉션즈의 컨테이너 중 하나이다.
Collection - SET : HashSet, ListedHashSet, TreeSet 중복제거되면서 저장됨
            LIST : ArrayList, Vector, LinkedList
MAP : SortedMap-TreeMap, HashTable, LinkedHashMap, HashMap

*/ 

public class collections {

    public static void main(String[] args){

        ArrayList<String> al = new ArrayList<String>();

        String[] st = {"1", "2", "3"};
        //al = (ArrayList<String>)Arrays.asList(st);

        al.add("one");
        al.add("two");
        al.add("three");
        al.add(0, "zero");

        for(int i=0;i<al.size();i++){
            String value = al.get(i);
            System.out.println(value);
        }


    }
    
}

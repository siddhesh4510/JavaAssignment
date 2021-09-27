import java.util.*;

public class ListTrim {
    static void trimList(List<String> stringList) {
    	ListIterator<String> iterator;
        for ( iterator= stringList.listIterator(); iterator.hasNext(); ) {
           iterator.set(iterator.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" my ", "     name ", " is " , "    Siddhesh");
        System.out.println("Before Trimming");
        for (String s : l) {
            System.out.println(s);
        }
        trimList(l);
        System.out.println("\n\nAfter Trimming");
        for (String s : l) {
            System.out.println(s);
        }
    }
}
package teste;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TesteColecoes {
    public static void main(String args[]) {
        List list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        
        Collections.reverse(list);
        Iterator iter = list.iterator();
        
       /* for (Object o : iter) {
            System.out.print(o + " ");
        }*/
    }
}
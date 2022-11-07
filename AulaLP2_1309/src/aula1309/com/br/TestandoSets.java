
package aula1309.com.br;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestandoSets {
    public static void main(String[] args){
        /*Testando HashSet*/
        //Set<String> set = new HashSet<>();
        
        /*Testando TreeSet - ordena pelo metodo compareTo*/
        //Set<String> set = new TreeSet<>();
        
        /*LinkedHashSet - ordem de insercao */
        Set<String> set = new LinkedHashSet<>();
        
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.add("Andre");
        set.add("Marcos");
        set.add("Patricia");
        set.add("Juliana");
        set.add("Geovana");
        set.add("Geraldo");
        
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set);
        System.out.println(set.add("Andres"));
        System.out.println(set);
        System.out.println(set.contains("Geraldo"));
        set.remove("Andre");
        System.out.println(set);
    }
}

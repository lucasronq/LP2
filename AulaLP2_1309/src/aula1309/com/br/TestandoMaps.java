
package aula1309.com.br;

import java.util.HashMap;
import java.util.Map;

public class TestandoMaps {
    public static void main(String[] args) {
        String texto = "Dado uma string longa utilize um " +
                       "map para contar quantas vezes aparece " +
                       "palavra aparece na string Considere que as " +
                       "palavras palavras palavra etc etc etc";
        
        //int -> Integer
        // double -> Double
        
        Map<String, Integer> contaPalavras = new HashMap<>();
        
        String tx[] = texto.split(" ");
        for(String palavra : tx) {
            if(contaPalavras.get(palavra) == null){
                contaPalavras.put(palavra, new Integer(1));
            } else{
                Integer vezes = contaPalavras.get(palavra);
                vezes = new Integer(vezes + 1);
                contaPalavras.put(palavra, vezes);
            }
        }
        System.out.println(contaPalavras);
    }
}

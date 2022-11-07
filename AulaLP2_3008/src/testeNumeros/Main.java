
package testeNumeros;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);       
        try{
            System.out.println("Digite um número");
            int num = entrada.nextInt();
            if(num <= 0){
                System.out.println("Entrada inválida!");
            }
            else 
                if(isPrimo(num)){
                    System.out.println("O Número " + num + " É primo");
                }
                else{
                    System.out.println("O Número " + num + " NÃO é primo");
                }
        }
        catch(Exception e){
            System.out.println("Erro no Sistema! Tipo de Entrada Não Válida! " + e.getMessage());
        }
        
    }
    
    private static boolean isPrimo(int numero) {
            for(int i=2; i< numero; i++){
                if(numero % i == 0){
                    return false;
                }
            }
            return true;
    }
}


package aula_Interface;


public interface Sellable {
    //retorna a descrição do objeto
    public String description();
    
    //retorna o preço em centavos
    public int listPrice();
    
    //retorna o menor preço em centavos
    public int lowestPrice();
}

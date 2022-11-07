
package aula_Interface;


public class Ebook implements Sellable{
    
    @Override
    public String description(){
        return "Livro Eletrônico - Eleanor e Park";
    }
    
    @Override
    public int listPrice() {
        return 500;
    }
    
    @Override
    public int lowestPrice() {
        return 320;
    }
    
}

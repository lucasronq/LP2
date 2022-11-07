
package aula_Interface;


public class TraditionalBook implements Sellable, Transportable{
    
    @Override
    public String description() {
        //TODO Auto-generated method stub
        return "Cidades de Papel";
    }
    
    @Override
    public int listPrice(){
        //TODO Auto-generated method stub
        return 78;
    }
    
    @Override
    public int lowestPrice() {
        //TODO Auto-generated method stub
        return 33;
    }
    
    @Override
    public int weight(){
        //TODO Auto-generated method stub
        return 240;
    }
    
    @Override
    public boolean isHazardous(){
        //TODO Auto-generated method stub
        return false;
    }
}

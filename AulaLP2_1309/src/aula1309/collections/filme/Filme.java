
package aula1309.collections.filme;

import java.util.List;
import java.util.ArrayList;

public class Filme {
    String nomeFilme;
    Genero genero;
    List<Ator> atores;
    
    public Filme() {
        atores = new ArrayList<Ator>();
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    @Override
    public String toString() {
        String ret = nomeFilme + "," + genero.getGenero();
        for(Ator a : atores){
            ret += ", " + a.getAtor();
        }
        return ret;
    }
    
    
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNomeFilme("Enola Holmes");
        Genero genero = new Genero();
        genero.setGenero("Mistério");
        filme.setGenero(genero);
        
        Ator at1 = new Ator("Millie Bobby");
        Ator at2 = new Ator("Henry Cavill");
        Ator at3 = new Ator("Sam Claflin");
        
        filme.getAtores().add(at1);
        filme.getAtores().add(at2);
        filme.getAtores().add(at3);
        System.out.println(filme);
        
    }
}

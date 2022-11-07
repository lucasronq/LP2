
package br.edu.ifsp.vtp.teste;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Pessoa {
    private int id;
    private String nome;
    private Status status;//Pessoa tem status
    private ArrayList<Telefone> telefones;//ArrayList deixa adicionar quantas informações quiser dentro do vetor, apenas aloca espaço na memória.

    public Pessoa() {
        this.id = 0;
        this.nome = new String();
        this.status = new Status();
        this.telefones = new ArrayList<>();
    }

    //public Pessoa(int id) {
    //    this.id = id;
    //}

    public Pessoa(int id, String nome, Status status, ArrayList<Telefone> telefones) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.telefones = telefones;
    }
    
    public void adicionarTelefone(Telefone telefone){
        telefones.add(telefone);
    }
    
    public void removerTelefone(Telefone telefone){
        telefones.remove(telefone);
    }
    
    public void removerTelefone(int posicao){
        telefones.remove(posicao);
    }
    
    @Override
    public String toString() {
        return "id = "+id;
    }
    
    public void metodo1(){
        int id = 1;
    }
    
    public void metodo2(){
        id = 2;
    }
    
    public void metodo3(int id){
        id = 3;
        
        if(id<=0){
            boolean teste = false;
        }
        
        //if(teste = true){
            //System.out.println("Deu erro");
        //}
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    Status objStatus = new Status();
    
    public void mostrar(Status objStatus){
        JOptionPane.showMessageDialog(null, "ID: " + this.getId() + " Nome: " + this.getNome() + "\nID do Status: " + 
                    objStatus.getId() + " Descrição do Status: " + objStatus.getDescricao() + "\nNúmero do telefone: " +
                    this.getTelefones());
    }
    
}

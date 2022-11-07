/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.vtp.teste.view;
import br.edu.ifsp.vtp.teste.Pessoa;
import br.edu.ifsp.vtp.teste.Status;
import br.edu.ifsp.vtp.teste.Telefone;
import javax.swing.JOptionPane;

public class CadastroPessoasV2 {
    public static void main(String[] args){
        int cont = 0;
        Pessoa obj1 = new Pessoa();
        obj1.setId(Integer.parseInt
             (JOptionPane.showInputDialog("Digite o id: ")));
        obj1.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        Status status = new Status();
        status.setId(Integer.parseInt
             (JOptionPane.showInputDialog("Digite o id do status")));
        status.setDescricao(JOptionPane.showInputDialog("Digite a descrição do status"));
        obj1.setStatus(status);
        Telefone tel = new Telefone();
        do{
           cont += 1;
           tel.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do telefone")));
           tel.setDdd(Integer.parseInt(JOptionPane.showInputDialog("Digite o DDD")));
           tel.setNumero(JOptionPane.showInputDialog("Digite o número"));
           tel.setTipo(JOptionPane.showInputDialog("Digite o tipo do telefone"));
           obj1.adicionarTelefone(tel);
        }while(JOptionPane.showConfirmDialog(null, 
                "Deseja cadastrar outro telefone?", "Pessoa", 
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
        
        for (int i=0; i<cont; i++){
            obj1.mostrar(status);
        }
        
    }
}

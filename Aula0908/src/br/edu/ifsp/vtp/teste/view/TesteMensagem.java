
package br.edu.ifsp.vtp.teste.view;
import javax.swing.JOptionPane;


public class TesteMensagem extends JOptionPane{
    public static void msg(String texto){
        showMessageDialog(null, texto,
                "Sistema de Cadastro", ERROR_MESSAGE);
    }
}

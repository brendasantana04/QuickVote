import java.io.*;
import javax.swing.*;

public class ClasseMetodos {
    static void Main (String [] args ) {
        
    }

    static void cadastraEleito () {

        Eleitor e = new Eleitor();
        

        // repetir 3 vezes para 3 candidatos
        for (int cta = 0; cta < 3; cta ++) {
            e.NmrEleitor = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do eleitor: "));
            e.NmEleitor = JOptionPane.showInputDialog("Insira o nome do eleitor: ");
            e.Sesao = Integer.parseInt(JOptionPane.showInputDialog("Insira a sessão do eleitor: "));
            JOptionPane.showMessageDialog(null, "Eleitor Cadastrado!!!");
        } 
        
        JOptionPane.showMessageDialog(null, "Eleitores Cadastrados com sucesso!!!");
            
        
    }
    



    
}

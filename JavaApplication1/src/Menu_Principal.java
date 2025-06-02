import java.io.*;
import javax.swing.*;

class Menu_Principal { //Classe Principal 
        public static void main  ( String[] arg){
            Eleitor [] eleitor = new Eleitor [3];
            Eleicao [] eleicao = new Eleicao [7];

            Eleitor e = new Eleitor();
            ClasseMetodos m  = new ClasseMetodos();
            
         
                for (int i=0; i< 3;i++){
             eleitor [i] = new Eleitor ();    
        }
                for (int j=0; j < 7; j++){
             eleicao [j] = new Eleicao ();
        }
                
     int opc = 0;
     while(opc !=9){
          opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra Eleitor\n"
             + "2 - Cadastra Votação 1 e 2\n"
             + "3 - Agrupa Apuração\n"
             + "4 - Menu Estatística\n"
             + "9 - FIM   "));
      
        switch (opc){
             case 1: m.cadastraEleito();
                 break;
            // case 2: cadastraVotacao();
            //     break;
            //  case 3: eleicao = m.apuracao(eleicao);
            //     break;
            // case 4: menuEstatistica();
            //     break;
     }  
        }
         
    }

    private static void cadastraVotacao() {
      
    }

    private static void menuEstatistica() {
       
    }
}
        
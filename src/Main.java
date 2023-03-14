import javax.swing.*;

public class Main {
    public static void main(String[] args) {

       String notaUm = JOptionPane.showInputDialog("Digite sua primeira nota");
       String notaDois = JOptionPane.showInputDialog("Digite sua segunda nota:");
       String notaTres = JOptionPane.showInputDialog("Digite sua terceira nota:");

        int v1 = Integer.parseInt(notaUm);
        int v2 = Integer.parseInt(notaDois);
        int v3 = Integer.parseInt(notaTres);

      int media = v1+v2+v3;
      int result = media/3;
      JOptionPane.showMessageDialog(null,result );



      if (result >= 6) {
         JOptionPane.showMessageDialog(null,"Você passou meus parabens!!");

        }
      else {
       JOptionPane.showMessageDialog(null,"Infelizmente você não passou.");
      }

    
          System.exit(0);
    }
}
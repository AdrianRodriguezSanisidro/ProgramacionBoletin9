package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Metodo {
   int num;
   int cP=0;
   int cN=0;
   int c0=0;
  public void contadores(){
         for(int i=0;i<10;i++){
          num=Integer.parseInt(JOptionPane.showInputDialog("Numero"));
          if (num>0)
              cP++;
          else if(num<0)
              cN++;
          else c0++;
         }
      System.out.println("Numero de positivos-->"+cP);
      System.out.println("Numero de negativos-->"+cN);
      System.out.println("Numero de 0-->"+c0);
}
}

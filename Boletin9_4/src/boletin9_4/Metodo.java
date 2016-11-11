package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Metodo {
    int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero")) ;   
    public void taboa(){
        while(numero!=0){
            for(int i=1;i<=10;i++)
                System.out.println(numero+"*"+i+"="+(numero*i));
                numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero")) ; 
        }
    }
}

package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Metodo {
    public void rectangulo(){
        int base,altura;
        do{
            base=Integer.parseInt(JOptionPane.showInputDialog("Base"));
        }while(base<0);
        do{
            altura=Integer.parseInt(JOptionPane.showInputDialog("Altura"));
        }while(altura<0);
        int area=base*altura;
        System.out.println("Area = "+ area);
    }
}

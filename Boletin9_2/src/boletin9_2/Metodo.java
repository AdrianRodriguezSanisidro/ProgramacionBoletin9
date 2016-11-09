package boletin9_2;

/**
 *
 * @author Adry
 */
public class Metodo {
    float suma=0;double multiplicacion=1;
    public void suma(){
        for(int i=10;i<=90;i++){
            suma=suma+i;}
        System.out.println("A suma dos numeros entre 10 e 90-> "+ suma);
    }
    public void multiplicacion(){
        for (int i=10;i<=90;i++)
            multiplicacion=multiplicacion*i;
        System.out.println("A multiplicacion dos numeros entre 10 e 90-> "+multiplicacion);
            }
}

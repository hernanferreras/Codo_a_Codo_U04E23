
package u04e23;

import java.util.Scanner;
public class U04E23 {

       public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int max=0, min=0, num, contador=1;
        do {            
            System.out.println("Ingrese un numero: ");
            num=entrada.nextInt();
            if (contador<=1){
                max=num;
                min=num;
                contador++;
            }else
                {
                    if((num>max)&&(num!=0)){
                        max=num;
                    } else 
                        if ((num<min)&&(num!=0)){
                        min=num;
                        }
                } 
        }while (num!=0);
        System.out.println("El mayor numero ingresado es "+max+" y el menor es "+min);
    }
}
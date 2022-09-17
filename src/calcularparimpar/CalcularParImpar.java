/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularparimpar;

import java.util.Scanner; 

/**
 *
 * @author JESUS
 */
public class CalcularParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);
      int numero;
      String mensajeResultado;
 	  
      System.out.print("Introduce un número entero: ");
      numero = scanner.nextInt();
      mensajeResultado = (numero % 2 == 0) ? "par" : "impar" ;
      System.out.println ("El número es " + mensajeResultado);
    }
    
}

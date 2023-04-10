// Algoritmo que permita el ingreso de dos nùmeros 
//primer nùmeo 10
//segundo nùmero 20
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingreso_de_dos_nùmeros;
import java.util.Scanner; //Importar la clase scanner(Siempre va despues del paquete.
/**
 *
 * @author Alumno
 */
public class Ingreso_de_dos_nùmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

  String nombre;
        Scanner teclado = new Scanner(System.in); //Permite el ingreso d datos
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!"); //Se uso + a la variable  nombre para concatenar
        System.out.print("Ingrese primer valor: ");
         System.out.print("Ingrese el segundoh valor : ");
        //***********************************************
       float num = teclado.nextFloat();
       float num02 = teclado.nextFloat();
        //Algoritmo if
        if ( num != num02 ) //condicion si n es diferente que y
        {
           System.out.println("Hola "+nombre+" "+"el nùmero ingresado es "+num+ "!=" +num02+"");
        }   
        if (num < num02){ 
            System.out.println("Hola "+nombre+" "+"el nùmero ingresado es "+num+ "< " +num02+"");
        }
        else if (num <= num02){
            System.out.println("Hola "+nombre+" "+"el numero ingresado es "+num+" =<" +num02+"");  
        }
        
        else {
            System.out.println("Hola "+nombre+" "+"tu numero es mayor que   " +num+ ">"+num02+"");
        }
        
        }
  
}
    

//Desarollar un algoitmo, donde muestre la suma de los 10 primeros números natuales o cualquier numero y que sume todo ello.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_for;
import java.util.Scanner; //Importar la clase scanner(Siempre va despues del paquete.)
/**
 *
 * @author Alumno
 */
public class Bucle_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre;
        Scanner teclado = new Scanner(System.in); //Permite el ingreso d datos
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!"); //Se uso + a la variable  nombre para concatenar
        //********************************************************
        Scanner lector =new Scanner(System.in);
        int n; 
        float suma = 0;
         System.out.print("Ingrese números naturales  positivos: ");
         n = lector.nextInt();
         if(n > 0){
             for(int i=1;i<=n;i++){
                 suma = suma+(i);
            }
             System.out.print("La suma de los números naturales positivo es: "+suma);   
         }
         else{
             System.out.print("El valor ingresado es incorrecto "+"vuelva a intentarlo"); 
             
         }
    }
}
    
/*Desarollar un algoritmo que permite el ingreso de número si es mayor o menor que "10"
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sarai; //Nombre o el paquete del proyecto
import java.util.Scanner; //Importar la clase scanner(Siempre va despues del paquete.)
/**
 *
 * @author Alumno    //Comentaios simples
 */
public class Sarai {     // Es la clase pública (Clase principal)

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  //Una calse siempre tiene un metodo principal
        //Llamar la función
        String nombre;
        Scanner teclado = new Scanner(System.in); //Permite el ingreso d datos
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!"); //Se uso + a la variable  nombre para concatenar
        System.out.print("Ingrese un númeo: ");
        //***********************************************
       float num = teclado.nextFloat();
        //Algoritmo if
        if (num < 10){ 
            System.out.println("Hola "+nombre+" "+"tu numero es menor que 10");
        }
        else if (num == 10){
            System.out.println("Hola "+nombre+" "+"tu numero es igual que 10");
        }
        else {
            System.out.println("Hola "+nombre+" "+"tu numero es mayor que 10");
        }
        
        }
  
}

}
                
        
        
        
 
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;
import java.util.Scanner; 
/**
 *
 * @author Alumno
 */
public class While {

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
//**************************************************************************************************

        Scanner sc = new Scanner(System.in);
 
		int sumaPares = 0; //Acumular la suma de pares
		int numero = 0;
 
		do {
			//Pedimos número
			System.out.print("Introduce un número (0 para SALIR): ");
			numero = sc.nextInt();
 
			//Evaluamos si es par o impar
			if (numero % 2 == 0) 
				sumaPares = sumaPares + numero; //Acumulamos suma
			
		}while (numero != 0);
 
		//Bucle terminado, mostramos resultados
		System.out.println("\nLa suma de pares es: " + sumaPares);
		
		sc.close();
 
	}
 
}
   
    

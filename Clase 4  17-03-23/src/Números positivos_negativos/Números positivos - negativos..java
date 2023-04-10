//Dearrolle un algoritmo donde me mustre que el número ingresado es positivo o negativo usando "IF"
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package números_positivos_negativos;  //Nombre o el paquete del proyecto
import java.util.Scanner; //Importar la clase scanner(Siempre va despues del paquete.)
/**
 *
 * @author Alumno
 */
public class Números_positivos_negativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  //Una cse siempre tiene un metodo principal
    //Llamar la función
    String nombre;
    Scanner name = new Scanner(System.in); //Permite el ingreso d datos
    System.out.println("Ingrese su nombre");
    nombre = name.nextLine();
    System.out.println("¡Hola " + nombre + "!"); //Se uso + a la variable  nombre para concatenar
    System.out.print("Ingrese un númeo: ");
    //*******************************************************************************************
    Scanner escaner = new Scanner(System.in);
    double numero = escaner.nextDouble();   //Se usa para guardar númeos
    if (numero == 0) {  //if:Es una condisión simple
    } else if (numero < 0) {
    System.out.println("El número ingresado es negativo"); 
    } else {      //else:Sirve paara tomar decisiones sobre un valor preexistente
    System.out.println("El número ingresado es positivo");
		}
	}
}
for(int i=1;i<=n;i++){
    
    

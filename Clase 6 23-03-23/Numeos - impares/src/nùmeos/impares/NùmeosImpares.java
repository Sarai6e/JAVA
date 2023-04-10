// Desarrollar un algoritmo n java donde me mustre loa nùmeros impares
//permita el ingreso de dos numeros 
//eso sera el rango
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nùmeos.impares;
import java.util.Scanner; //Importar la clase scanner(Siempre va despues del paquete.
/**
 *
 * @author Alumno
 */
public class NùmeosImpares {

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
        //***************************************************************
        Scanner objeto_entrada = new Scanner (System.in);
        System.out.println(" Hola " + nombre + " Ingrese un primer valor : ");
        int i = objeto_entrada.nextInt();
       System.out.println(" Hola " + nombre +  " Ingrese un segundo valor : ");
        int num = objeto_entrada.nextInt();
        while(i <= num){
            if (i % 2 == 0){ 
                 i =i + 1;
            }else if(i % 2 != 0){     
            System.out.println("Es impar: " + i);
            i= i+2;
            
          
            }
        }
        
          
        
        
        
    }
    
 }

  
        
        
    
    


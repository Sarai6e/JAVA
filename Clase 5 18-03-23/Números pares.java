//Desarrolle un algoritmo que muestre la suma de númros pares.
//Permita el ingeso de un número
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros.pares;
import java.util.Scanner; //Importar la clase scanner(Siempre va despues del paquete.)
/**
 *
 * @author Alumno
 */
public class NumerosPares {

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

    //******************************************************************************
            //********************************************************
         Scanner sc =new Scanner(System.in);
        int x[],suma=0;
        System.out.print("ingrese la cantidad de números a ingresar: ");
        int n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Ingrese números pares: ");
            x[i]=sc.nextInt();
            if(x[i]%2==0){
                suma=x[i]+suma;
            }
        }
        System.out.print("La suma de  números pares es : "+suma);
              
        
      
                       
         }
         
    }

    

    

    

  
   
   

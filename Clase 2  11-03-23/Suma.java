//**Desarrollar un algoritmo donde se ingrese  dos números y después de ingresar esos números.
//**Debe ejecutar la suma de los a valores ingresados
import javax.swing.JOptionPane;  //Import se utliza para la clase a realizar 
public class suma { //Siempre se pone el nombre del archivo que creaste
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Suma");
        String aa;  //Se crea variables
        int a,b,c;
        aa= JOptionPane.showInputDialog("Ingrese el primer número.");
        a=Integer.parseInt(aa);
        aa=JOptionPane.showInputDialog("Ingrese segundo número: ");
        b=Integer.parseInt(aa);
        c=a+b; //Se incluye estas variablespara que se ejecute la suma
        JOptionPane.showMessageDialog(null,"La suma total es: "+c);
    }
}
//El programa pedira  ingresar dos valores para que muestre la suma total.

package javaapplication11;
        import java.util.Scanner;


public class JavaApplication11 {

    public static void main(String[] args) {
        

    
        Scanner teclado=new Scanner(System.in);
        int n1;
	int n2;
	System.out.print("Introduce un número A: ");
	n1=teclado.nextInt();
	System.out.print("Introduce otro número B: ");
	n2=teclado.nextInt();
	if(n1==n2)
            System.out.println("Ambos numeros son iguales");
        if(n1<n2)
            System.out.println("a es menor que b");
        if(n1>n2)
            System.out.println("a es mayor que b");

    
          
}
        
        
        
    }
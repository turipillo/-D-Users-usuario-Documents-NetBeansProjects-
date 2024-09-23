/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mi.primera.aplicacion;



import java.time
/**
 *
 * @author usuario
 */
import static java.time.Clock.system;
import java.util.Locale;
import java.util.Scanner;
public class MiPrimeraAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    

       /* double Valor1;
        double Valor2;
        double suma;
        double resta; 
        double multiplicacion;
        double division;
        
        
        Scanner datoTeclado = new Scanner (System.in);
       System.out.println("Introduzca un valor entero");
       Valor1 = datoTeclado.nextDouble();
        System.out.println("Introduzca otro valor entero");
        Valor2 =datoTeclado.nextDouble();
        //realizamos las operaciones
        suma = Valor1 + Valor2;
        resta = Valor1 - Valor2;
        multiplicacion = Valor1 * Valor2;
        division = Valor1 / Valor2;
        
        System.out.println("La suma resultante es" + suma);
        System.out.println("la resta resultante es" + resta);
        System.out.println("La multiplicacion resultante es" + multiplicacion);
        System.out.println("La division resultante es" + division);
       
       
       int a = 5;
       int b;
       int c;
       
       b = a--;
        System.out.println(a);
        System.out.println(b);
       c = ++a;
        System.out.println(a);
        System.out.println(c);
            */
       
       /* int añoNacimiento;
       int añoActual;
       int edadUsuario;
       // Instancia del objeto que lee del teclado
       Scanner sc = new Scanner(System.in) ;
       //recuperacion del dato y volcado en variable creada
       System.out.println("Introduzca el año de nacimiento: ");
       // recuperación del dato y volcado en variable creada 
       añoNacimiento = sc.nextInt() ;
              System.out.println("Introduzca el año actual: ");
       añoActual = sc.nextInt() ;
       //Incremento de la edad en 1.
       edadUsuario = añoActual - añoNacimiento;
       
        System.out.println("Tu edad es " + edadUsuario);
               */
       
       
      /* //Como hacer la nota media 
       double nota;
       double nota2;
       double notaMedia;
       
        System.out.println("Introduce una nota (entera)");
        nota = new Scanner (System.in) .nextDouble ();
        System.out.println("Introduzca una nota (entera)");
        nota2 = new Scanner (System.in) .nextDouble();
        
        notaMedia = (nota + nota2) /2.0;
        
        System.out.println("La nota media es: " + notaMedia);
        
             */
      
     /* double radio, longitud, area;
        System.out.println("introduzca el valor del radio: ");
        // radio = new Scanner (System.in) .nextDouble();
        Scanner sc = new Scanner (System.in);
        sc.useLocale (Locale.US);
        radio = sc.nextDouble();
        longitud = 2* Math.PI * radio;
        area = Math.PI * Math.pow(radio,2);
        System.out.println("La longitud es: "+ longitud);
        System.out.println("y el area es: "+ area);
        
               */
     
    /* double numero;
        System.out.println("Introduzca un numero entero: ");
        numero = new Scanner (System.in).nextDouble();
        boolean numeroPar;
        numeroPar = numero%2==0;
        // Se puede poner tambien  mayorEdad = (edad>=18);
        System.out.println("¿Es numero par?" + numeroPar);
        */
    boolean llueve, tareasAcabadas, necesitaLibro, puedeSalir;
    Scanner sc = new Scanner(System.in);
    
        System.out.println("¿Llueve? (true/false)");
        
        llueve = sc.nextBoolean ();
        System.out.println("¿Has acabdo las tareas? (True/false)");
        
        tareasAcabadas = sc.nextBoolean();
        System.out.println("¿Necesitas algún libro? (True/false)");
        
        necesitaLibro = sc.nextBoolean();
        puedeSalir = (!llueve&&tareasAcabadas)||(necesitaLibro);
        
        System.out.println("¿Pude salir a la calle?" + puedeSalir);
        
                        
                        
        
       
    }
    
}

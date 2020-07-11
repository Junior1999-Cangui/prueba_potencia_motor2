
package prueba_potencia_motor1;

/**
 *
 * @author Junior Steven Cangui Toapanta
 */
import java.util.Scanner;
public class Prueba_Potencia_Motor1 {
    
    public static void Encabezado(){
        System.out.println("       Universidad de las Fuerzas Armadas-ESPE \n");
        System.out.println("Prueba de falta de potencia en un motor electrico");
    }
    
    public static void Identificar_motor (){
        int codigo,serie;
        float cilindraje;
        String tipo_motor;
        Scanner motor=new Scanner(System.in);
        Scanner tipo=new Scanner(System.in);
        System.out.println("Ingrese codigo del motor:");
        codigo=motor.nextInt();
        System.out.println("Ingrese serie del motor:");
        serie=motor.nextInt();
        System.out.println("Determine tipo de motor:");
        tipo_motor=tipo.nextLine();
        System.out.println("Ingrese cilindraje del motor:");
        cilindraje=motor.nextFloat();
    }
    
    public static int Determinar_indice_potencia(){
        int tipo_indice;
        Scanner indice=new Scanner(System.in);
        System.out.println("Escoja un tipo de indice:\n (1)Tipo 1. 50HP \n "
                              + "(2)Tipo 2. 70HP \n (3)Tipo 3. 90HP");
        tipo_indice=indice.nextInt();
        
        System.out.println("Se trabajara con el indice de potencia:"+ tipo_indice);
        
        return tipo_indice;
    }
    
    public static int Medir_potencia_motor(){
        int valor_potencia,torque,rpm;
        
        Scanner t=new Scanner(System.in);
        Scanner r=new Scanner(System.in);
         System.out.println("Ingrese el torque:");
         torque=t.nextInt();
         System.out.println("Ingrese las rpm:");
         rpm=r.nextInt(); 
         valor_potencia=torque*rpm;
         
         System.out.println("La potencia del motor es: " + valor_potencia);
         
        return valor_potencia;
        
    }
    
    public static int Comparar_indice_medicion(){
        int tipo_indice,valor_potencia,torque,rpm;
        
        Scanner comparar=new Scanner(System.in);
        Scanner t=new Scanner(System.in);
        Scanner r=new Scanner(System.in);
         System.out.println("Ingrese el torque:");
         torque=t.nextInt();
         System.out.println("Ingrese las rpm:");
         rpm=r.nextInt(); 
         valor_potencia=torque*rpm;
         
          Scanner indice=new Scanner(System.in);
        System.out.println("Ingrese Valor del indice de potencia:");
        tipo_indice=indice.nextInt();
        
        if(valor_potencia<=tipo_indice){
            System.out.println("La potencia pertenece al tipo de indice" + tipo_indice);
        }else{
            System.out.println("La potencia NO pertenece al tipo de indice" + tipo_indice);
        }
        return tipo_indice;
    }
    
    public static int Determinar_resultado(){
        int tipo_indice,potencia,resultado;
        
         Scanner indice=new Scanner(System.in);
         Scanner valor=new Scanner(System.in);
        System.out.println("INGRESE LOS VALORES CALCULADOS");
        
        System.out.println("Ingrese valor del tipo_indice:");
        tipo_indice=indice.nextInt();
        
        System.out.println("Ingrese el valor de potencia:");
        potencia=valor.nextInt();
        
        resultado=tipo_indice-potencia;
        
         System.out.println("La falta de potencia es:" +resultado);
         return resultado;
    }

     public static int Almacenar_valor_obtenido(){
        int valor_obtenido;
        Scanner obtenido=new Scanner(System.in);
        System.out.println("Digite su valor obtenido:");
        valor_obtenido=obtenido.nextInt();
        System.out.println("VALOR ALMACENADO");
        return 0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Encabezado();
        System.out.println("          IDENTIFICACION DEL MOTOR");
        Identificar_motor();
        
        System.out.println("          DETERMINACIÓN DEL INDICE DE POTENCIA");
        Determinar_indice_potencia();
        
        System.out.println("          MEDICION DE LA POTENCIA DEL MOTOR");
        Medir_potencia_motor();
        
        System.out.println("          COMPARACION DE VALORES DE POTENCIA");
        Comparar_indice_medicion();
       
        
        System.out.println("          DETERMINAR RESULTADO");
        Determinar_resultado();
        
        System.out.println("          ALMACENAR O GUARDAR RESULTADO");
        Almacenar_valor_obtenido();
    }
    
}

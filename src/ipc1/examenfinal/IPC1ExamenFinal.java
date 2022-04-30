/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.examenfinal;

import java.util.Scanner;

/**
 *
 * @author RANDY
 */
public class IPC1ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pac = new Scanner(System.in);
        int opcion = 0; 
        int maximo;
	int num;
	int mayor=0;
	int cont;
        
        
         while(opcion!=4){
            
            System.out.println("Introduce el Numero de la opcion que quieras Elegir");
            System.out.println("**************");
            System.out.println("*1. Problema 1    *");
            System.out.println("*2. Problema 2    *");
            System.out.println("*3. Problema 3    *");
            System.out.println("*4. Salir    *");
            System.out.println("**************");
            
                
                
               
            opcion = pac.nextInt();
            pac.nextLine();
            
            switch(opcion){
                case 1: 
                
            System.out.println("Inserte el máximo de números: ");
    maximo = pac.nextInt();
 
    for(cont = 0;cont < maximo;cont++ ){
        System.out.println("Inserte un número: ");
        num = pac.nextInt();
        if(num>mayor)
        {
            mayor=num;
        }
    }
    System.out.println("El valro mayor es "+mayor); 
    
    break;
    
             case 2:
                 
                System.out.print("Introduce un numero (Impar): ");
        int numFilas = pac.nextInt();
        pac.nextLine();
 
        System.out.println();
        for(int altura = 1; altura<=Math.ceil((float)numFilas/2); altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }  
           
        break; 
        
             case 3:
                 
                 System.out.println("EL BICHO!! \n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀\n" +                         
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣦⠀\n" +
"⠀⠀⠀⠀⠀⠀⣴⣿⢿⣷❤️⠒⠲⣾⣾⣿⣿\n" +
"⠀⠀⠀⠀⣴⣿⠟⠁⠀⢿⣿⠁⣿⣿⣿⠻⣿⣄⠀⠀⠀⠀\n" +
"⠀⠀⣠⡾⠟⠁⠀⠀⠀⢸⣿⣸⣿⣿⣿⣆⠙⢿⣷⡀⠀⠀\n" +
"⣰⡿⠋⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠀⠀⠉⠻⣿⡀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣆⠂⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⡿⣿⣿⣿⣿⡄⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⠿⠟⠀⠀⠻⣿⣿⡇⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⢀⣾⡿⠃⠀⠀⠀⠀⠀⠘⢿⣿⡀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⣰⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣷⡀⠀⠀\n" +
"⠀⠀⠀⠀⢠⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣧⠀⠀\n" +
"⠀⠀⠀⢀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣆⠀\n" +
"⠀⠀⠠⢾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣷⡤⠄\n" +
"\n" +
"¡SIIUUUUUUUUUUUUU!");
                 
                 
            }
            
         }
    }
    
}

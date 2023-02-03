/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_dannacasco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danna Casco
 */
public class Lab3P2_DannaCasco {
       static ArrayList<concesionaria> c = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int opcion = 0; 
        do{
        System.out.println("--MENU--");
        System.out.println("1.CRUD concesionaria");
        System.out.println("2.CRUD clientes");
        System.out.println("3.CRUD vehiculos");
        System.out.println("4.compra/venta");
        System.out.println("5.SALIR");
        System.out.print("Ingrese una opcion: "); 
        opcion = entrada.nextInt();
        
        if(opcion==1){
            System.out.println("--CRUD concesionaria--");
            System.out.println("1.Crear");
            System.out.println("2.Modificar");
            System.out.println("3.Eliminar");
            System.out.print("Ingrese una opcion: ");
            int op = entrada.nextInt();
            
            if(op==1){
                c.add(newConcesionaria());
            }else if (op==2){
               
              for (concesionaria t : c) {     
              System.out.println(c.indexOf(t)+"-"+t+"\n");
               }
                
                System.out.println("Ingrese concesionaria a modificar:  ");
                int pos = entrada.nextInt();
                
                System.out.println("Ingrese nueva direccion: ");
                String d = entrada.nextLine();
                
                c.get(pos).setDireccion(d);
                
            }
        }
        }while(opcion<5||opcion>5);
        
    }
  
    static concesionaria newConcesionaria(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre:  ");
        String n = entrada.nextLine();
        System.out.print("Ingrese direccion: ");
        String d = entrada.nextLine();
        entrada = new Scanner(System.in);
        System.out.print("Ingrese Id: ");
        int id = entrada.nextInt();
        System.out.print("Ingrese saldo: ");
        double s = entrada.nextDouble();
        
        concesionaria r = new concesionaria (n,id,n,s);
        
        return r;
    }
}

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
      static ArrayList<clientes> clients = new ArrayList();
      static ArrayList<vehiculos> v = new ArrayList();
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int opcion = 0; 
        int cliente = 0;
        do{
        System.out.println("--MENU--");
        System.out.println("1.CRUD concesionaria");
        System.out.println("2.CRUD clientes");
        System.out.println("3.CRUD vehiculos");
        System.out.println("4.compra/venta");
        System.out.println("5.SALIR");
        System.out.print("Ingrese una opcion: "); 
        opcion = entrada.nextInt();
            System.out.println("");
        
        if(opcion==1){
            System.out.println("--CRUD concesionaria--");
            System.out.println("1.Crear");
            System.out.println("2.Modificar");
            System.out.println("3.Eliminar");
            System.out.print("Ingrese una opcion: ");
            int op = entrada.nextInt();
            System.out.println("");
            if(op==1){
                System.out.println("--Agregar concesionaria--");
                c.add(newConcesionaria());
            }else if (op==2){
              for (concesionaria t : c) { 
                  if(c.size()==0){
                  System.out.println("No hay concesionarias en existencia");
                  }else{
                  System.out.println("--Modificar direccion--");
              System.out.println(c.indexOf(t)+". "+t+"\n");
               }
                
                System.out.print("Ingrese concesionaria a modificar:  ");
                int pos = entrada.nextInt();
                entrada = new Scanner ( System.in);
                System.out.print("Ingrese nueva direccion: ");
                String d = entrada.nextLine();
                
                c.get(pos).setDireccion(d);
              }
            }else if(op==3){
                if (c.size()==0){
                    System.out.println("No hay concesionarias en existencia");
                }else{
                System.out.println("--Eliminar concesionaria-- ");
                for (concesionaria t : c) {     
              System.out.println(c.indexOf(t)+"-"+t+"\n");
               }
                System.out.println("");
                System.out.print("Ingrese concesionaria a eliminar: ");
                int con = entrada.nextInt();
                
                c.remove(con);
                }
            }else{
                System.out.println("OPCION INVALIDA !!");
            }
        }else if(opcion==2){
         System.out.println("--CRUD clientes--");
            System.out.println("1.Crear");
            System.out.println("2.Eliminar");
            System.out.print("Ingrese una opcion: ");
            int op = entrada.nextInt();
            System.out.println("");   
            
            if(op==1){
                clients.add(newCliente());
            }else if(op==2){
             for (clientes t : clients) {     
              System.out.println(c.indexOf(t)+". "+t+"\n");
               }
             
            System.out.println("Ingrese cliente a eliminar: ");
            cliente = entrada.nextInt();
            
            clients.remove(cliente);
        }else{
            System.out.println("OPCION INVALIDA !!");
        }
        }else if (opcion==3){
            System.out.println("--CRUD vehiculos--");
            System.out.println("1.Crear");
            System.out.println("2.Modificar");
            System.out.println("3.Eliminar");
            System.out.print("Ingrese una opcion: ");
            int op = entrada.nextInt();
            System.out.println("");   
            
            if(op==1){
                v.add(newVehiculo());
            }else if(op==2){
                
            }else if(op==3){
                for (vehiculos t : v) {     
              System.out.println(c.indexOf(t)+". "+t+"\n");
               }
                
                System.out.println("Ingrese posicion a eliminar: ");
                int pos1 = entrada.nextInt();
                v.remove(pos1);
                
            }else{
                System.out.println("OPCION INVALIDA");
            }
            
        }
        
        
        }while(opcion<5||opcion>5);
        
    }//main
  
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
    
    static clientes newCliente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre:  ");
        String n = entrada.nextLine();
        entrada = new Scanner(System.in);
        System.out.print("Ingrese Id: ");
        int id = entrada.nextInt();
        System.out.print("Ingrese saldo: ");
        double s = entrada.nextDouble();
        
        clientes r = new clientes (id,n,s);
        return r;
    }
    
    static vehiculos newVehiculo() throws Exception{
        boolean el = true;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese color: ");
        String c = entrada.nextLine();
        System.out.print("Ingrese marca: ");
        String m = entrada.nextLine();
        System.out.print("Ingrese modelo: ");
        String mod = entrada.nextLine();
        entrada = new Scanner(System.in);
        System.out.print("Ingrese año de fabricacion: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese precio: ");
        double p = entrada.nextInt();
        System.out.print("Ingrese cantidad de llantas: ");
        int ll = entrada.nextInt();
        
        if(ll==2){
            System.out.println("");
            System.out.println("1.Motocicleta");
            System.out.println("2.Bicicleta");
            System.out.println("Ingrese que desea agregar: ");
            int t = entrada.nextInt();
    
            if(t==1){
                System.out.print("Ingrese desplazamiento del motor: ");
                String d = entrada.nextLine();
                System.out.print("Es electrica ? ");
                String e = entrada.nextLine();
                if(e.equals("si")){
                    el=true;
                }else if(e.equals("no")){
                    el=false;
                }else{
                    System.out.println("OPCION INVALIDA!!");
                }
                moticicleta n = new moticicleta(d,el,c,m,mod,a,p,ll);
                return n;
            }else if(t==2){
                System.out.print("Ingrese descripcion: ");
                String d = entrada.nextLine();
                System.out.print("Ingrese tipo (BMX o de calle): ");
                String tip = entrada.nextLine();
                System.out.print("Ingrese radio de rueda: ");
                double r = entrada.nextDouble();
               bicicleta b = new bicicleta (d,r,tip,c,m,mod,a,p,ll);
               return b;
            }else{
                System.out.println("OPCION INVALIDA!!");
            }
        }else if(ll==4){
            System.out.println("");
            System.out.println("1.Carro");
            System.out.println("2.camion");
            System.out.println("3.Bus");
            System.out.println("Ingrese que desea agregar: ");
            int ti = entrada.nextInt();
            
            if(ti==1){
                System.out.print("Ingrese cantidad de puertas: ");
                int puertas  = entrada.nextInt();
                System.out.print("Ingrese descripcion del motor: ");
                String motor = entrada.nextLine();
                System.out.print("Ingrese velocidad: ");
                double vel = entrada.nextDouble();
                
                carro car = new carro(puertas, motor,vel,c,m,mod,a,p,ll);
                return car;
            }else if(ti==2){
                System.out.print("Ingrese volumen: ");
                double vol = entrada.nextDouble();
                System.out.print("Ingrese altura: ");
                double alt = entrada.nextDouble();
                System.out.print("Tiene retroexacavadora? ");
                String del = entrada.nextLine();
                if(del.equals("si")){
                    el=true;
                }else if(del.equals("no")){
                    el=false;
                }else{
                    System.out.println("OPCION INVALIDA!!");
                }
                
                camion cam = new camion(vol,alt,el,c,m,mod,a,p,ll);
                return cam;
            }else if(ti==3){
                System.out.println("Ingrese cantidad de pasajeros: ");
                int pa = entrada.nextInt();
                
                bus b = new bus(pa,c,m,mod,a,p,ll);
                return b;
            }else{
                System.out.println("OPCION INVALIDA !!");
            }
        }else{
            System.out.println("OPCION INVALIDA!!");
        }
          throw new Exception("INVALIDO");
    }
    
    
}

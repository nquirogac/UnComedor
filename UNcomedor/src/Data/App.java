package Data;

import java.util.Scanner;
public class App {
    static Scanner scanner= new Scanner(System.in);
    static Menu menuLunes = new Menu("Muu","cuchuco","mora","pollo","ensalada", "yuca");
    static Comedor central = new Comedor(100, "Comedor central", menuLunes);
    
    public static void main(String[] args) throws Exception {
       
        int opcion=0;
        do{
            System.out.println("Escoja una opcion: \n 1. Entrar como administrador\n 2. Ingresar usuarios\n 3. Buscar usuario\n 4. Salir");

            opcion = scanner.nextInt();
            switch(opcion){
            
            
                case 1:
                    System.out.println("Escoja un comedor:\n 1. Comedor central \n2. Economia\n3. Yu takeuchi");//para ver la cola que hay en x comedor
                    int numComedor = scanner.nextInt();
                    central.colaComedor.imprimirCola();
                    break;
                case 2:
                    System.out.println("Ingrese los usuarios:");
                    CrearUsuarios();
                    break;
                case 3:  
                    break;  
                case 4:
                    break;
            }        
        }while(opcion != 4);
              
    }
    public static void CrearUsuarios(){
        boolean finish = false;
        scanner.nextLine();
        while(!finish){
            
            String cadena= scanner.nextLine();
            if(cadena.charAt(0)!='-'){// entrar un - para terminar el ingreso de usuarios
                
                String[] dataUser= cadena.split(",");
                String nombre =dataUser[0];
                String id = dataUser[1];
                String apoyo = dataUser[2];
                String usuario = dataUser[3];
                Usuario user = new Usuario(nombre, id, apoyo, usuario);
                Comedor comedor = central;
                crearTurno(user, comedor);
                
            }else{
                System.out.println("END");
                finish = true;
            }
        }
        central.colaComedor.imprimirCola();

    }
    public static void crearTurno(Usuario user, Comedor comedor) {
        int numTurno=comedor.getTurno();
        numTurno++;
        Turno turno = new Turno(numTurno,comedor,user,menuLunes);
        comedor.setTurno(numTurno);
        //System.out.println(turno.toString());
        comedor.colaComedor.enque(turno);
        System.out.println(user.getNombre()+" se encolo y tiene el turno "+numTurno);
      
    }
   
}

package Data;

import java.util.Scanner;
public class App {
    
    static Scanner scanner= new Scanner(System.in);
    static Cola colacomedor1 = new Cola();
    static Cola colacomedor2 = new Cola();
    static Cola colacomedor3 = new Cola();
    static Cola colacomedor4 = new Cola();
    static Menu menuLunes = new Menu("Muu","cuchuco","mora","pollo","ensalada", "yuca");
    static Comedor central = new Comedor(100, "Comedor central", menuLunes, colacomedor1);
    static Comedor economia = new Comedor(100, "Comedor economia", menuLunes, colacomedor2);
    static Comedor yu_takeuchi = new Comedor(100, "Comedor Yu Takeuchi", menuLunes, colacomedor3);
    static Comedor agrarias = new Comedor(100, "Comedor Ciencias Agrarias", menuLunes, colacomedor4);
    
    public static void main(String[] args) throws Exception {
        int opcion=0;
        do{
            System.out.println("Escoja una opcion: \n 1. Entrar como administrador\n 2. Crear usuarios\n 3. Buscar usuario\n 4. Pedir turno\n 5. Pruebas\n 6. Salir");

            opcion = scanner.nextInt();
            switch(opcion){
            
            
                case 1:
                    System.out.println("Escoja un comedor:\n1. Comedor central \n2. Economia\n3. Yu takeuchi \n4. Ciencias Agrarias");//para ver la cola que hay en x comedor
                    int numComedor = scanner.nextInt();
                    central.colaComedor.imprimirCola();
                    break;
                case 2:
                    System.out.println("Para ingresar los datos del nuevo usuario, utilice el siguiente formato:");
                    System.out.println("Nombre,id, apoyo, usuario");
                    System.out.println("Ingrese los datos del usuario utlizando las comas:");
                    CrearUsuarios();
                    break;
                case 3:
                    System.out.println(central);

                    break;  
                case 4:
                    break;
                case 5:
                    CrearUsuarios();


            }        
        }while(opcion != 6);
        long fin = System.currentTimeMillis();
        double tiempo =(double) (fin-inicio);
        System.out.println(tiempo);     
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
                String comedor = dataUser[4];
                int opcion = Integer.valueOf(comedor);
                switch(opcion){
                    case 1:
                        Comedor comedor_us1 = central;
                        Usuario user1 = new Usuario(nombre, id, apoyo, usuario, comedor_us1);
                        crearTurno(user1);
                        break;
                    case 2:
                        Comedor comedor_us2 = economia;
                        Usuario user2 = new Usuario(nombre, id, apoyo, usuario, comedor_us2);
                        crearTurno(user2);
                        break;
                    case 3:
                        Comedor comedor_us3 = yu_takeuchi;
                        Usuario user3 = new Usuario(nombre, id, apoyo, usuario, comedor_us3);
                        crearTurno(user3);
                        break;
                    case 4:
                        Comedor comedor_us4 = agrarias;
                        Usuario user4 = new Usuario(nombre, id, apoyo, usuario, comedor_us4);
                        crearTurno(user4);
                        break;

                }
                //Usuario user = new Usuario(nombre, id, apoyo, usuario, comedor2);
                //crearTurno(user);
                
            }else{
                System.out.println("END");
                finish = true;
            }
        }
        central.colaComedor.imprimirCola();
        yu_takeuchi.colaComedor.imprimirCola();
        economia.colaComedor.imprimirCola();
        agrarias.colaComedor.imprimirCola();

    }
    public static void crearTurno(Usuario user) {
        Comedor comedor = user.getComedor();
        int numTurno=comedor.getTurno();
        numTurno++;
        Turno turno = new Turno(numTurno,comedor,user,menuLunes);
        comedor.setTurno(numTurno);
        //System.out.println(turno.toString());
        comedor.getcolaComedor().enque(turno);
        //System.out.println(user.getNombre()+" se encolo y tiene el turno "+numTurno);

      
    }
    
}

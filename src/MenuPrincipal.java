/**
 * Created by user on 09/14/2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class MenuPrincipal {

        public static void main(String... args) throws IOException{

            Map<String,Cuenta> hash = new TreeMap<String,Cuenta>();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String A,B,D,E,G,H;
            float C;
            int opc;

            do {
                System.out.println("\n\t\tBienvenido/a al Banco NoCompila");
                System.out.print("\nIntroduzca el numero de opcion deseada: \n");
                System.out.println("1) Crear cuenta");
                System.out.println("2) Deposit");
                System.out.println("3) Transferir");
                System.out.println("4) Ver cuenta");
                System.out.println("5) Salir\n");
                opc = Integer.parseInt(br.readLine());

                switch(opc){
                    case 1:
                        System.out.print("\nIngrese nombre: ");
                        A=br.readLine();
                        System.out.print("Ingrese numero de cuenta: ");
                        B=br.readLine();
                        System.out.print("Ingrese monto a depositar: ");
                        C=Float.parseFloat(br.readLine());
                        System.out.print("Ingrese una contraseña: ");
                        D=br.readLine();
                        System.out.println("\nBienvenido Sr/a: "+A+" su cuenta se ha creado satisfactoriamente!");
                        hash.put(D,new Cuenta(A,B,C));
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            // Handle here
                        }
                        break;

                    case 2:

                        break;
                    case 3:
                        //System.exit(0);
                        break;
                    case 4:
                        if (!hash.isEmpty()){
                        System.out.print("\nIntroduzca su Usuario o Nombre: ");
                        G = br.readLine();
                        System.out.print("Introduza su contraseña: ");
                        H = br.readLine();
                        //System.out.println("\nEsta vacio? "+hash.isEmpty());
                            for (Map.Entry<String,Cuenta> buscar : hash.entrySet()){
                                String F = buscar.getKey();
                                Cuenta datos = buscar.getValue();
                                if (!datos.getNom().contentEquals(G) && F.contentEquals(H)) {
                                    System.out.println("\nUsuario no existe");
                                    break;
                                }else if (datos.getNom().contentEquals(G) && (!F.contentEquals(H))) {
                                    System.out.println("\nContraseña inválida!");
                                    break;
                                }else if (datos.getNom().contentEquals(G) && F.contentEquals(H)) {
                                    System.out.println("\nBienvenido/a: " + datos.toString());
                                    break;
                                }
                            }
                        }else{
                            System.out.println("\nNo hay cuentas creadas");}
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            // Handle here
                        }
                        break;
                }
            }while(opc!=5);
            System.out.println();
        }
}

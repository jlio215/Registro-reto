

import java.util.Scanner;

/**
 *
 * @author jlio
 */
public class Registro {
    public static Pregrado preg = new Pregrado();
    public static Posgrado posg = new Posgrado();
    public static Estudiante estudiante = new Estudiante();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int opcion;
           do {
                String cadena = sc.nextLine();
                String [] stringSeparado = cadena.split("&");
                opcion = Integer.parseInt(stringSeparado[0]);
                switch (opcion){
                    case 1: 
                        if ("Pregrado".equals(stringSeparado[1])){
                            preg.crearEstudiantePre("pregrado",stringSeparado[2],Integer.parseInt(stringSeparado[3]),stringSeparado[4],stringSeparado[5],Integer.parseInt(stringSeparado[6]));
                        }
                        else if ("Posgrado".equals(stringSeparado[1])){
                            posg.crearEstudiantePos("posgrado",stringSeparado[2],Integer.parseInt(stringSeparado[3]),stringSeparado[4],stringSeparado[5],stringSeparado[6]);
                        }      
                        break;
                    case 2:
                         estudiante.listarEstudiantes();
                        break;
                } }while(opcion!=3);
            }
    
    }

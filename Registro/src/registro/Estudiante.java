

import java.util.ArrayList;

/**
 *
 * @author jlio
 */
public class Estudiante {
    String pop;
    String nombre;
    int edad;
    String programa;
    String etnia;
    
    public static Pregrado preg = new Pregrado();
    public static Posgrado posg = new Posgrado();

    public Estudiante(String pop, String nombre, int edad, String programa, String etnia) {
        this.pop = pop;
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.etnia = etnia;  
    } 
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
      public Estudiante() {
    }
      
   
    public ArrayList getEstudiantes(){
       return estudiantes;
       }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPop() {
        return pop;
    }
    
    public String getPrograma() {
        return programa;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPop(String pop) {
        this.pop = pop;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }
    
    
    public void listarEstudiantes(){
            System.out.println("***Listado de estudiantes***\n");
            for (int j=0; j<estudiantes.size(); j++){
                        if (estudiantes.get(j) instanceof Pregrado){
                            preg.listarPregrado((Pregrado) estudiantes.get(j));
                        }else{
                            posg.listarPosgrado((Posgrado) estudiantes.get(j));
                            }
            }
        
        }   
        
}

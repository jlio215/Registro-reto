

/**
 *
 * @author jlio
 */
public class Posgrado extends Estudiante{
        String modalidad;

    public Posgrado(String pop,String nombre, int edad, String programa, String etnia, String modalidad) {
        super(pop,nombre, edad, programa, etnia);
        this.modalidad = modalidad;
    } 

    public Posgrado() {
    }
        
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    public String getModalidad() {
        return modalidad;
    }
  
    public void crearEstudiantePos (String pop, String nombre, int edad, String programa, String etnia, String modalidad) {
        Posgrado a = new Posgrado();
        a.setNombre(nombre);
        a.setEdad(edad);
        a.setPrograma(programa);
        a.setModalidad(modalidad);
        a.setPop(pop);
        a.setEtnia(etnia);
        estudiantes.add((Posgrado) a);
    }
    
    public void listarPosgrado (Posgrado b){
        System.out.println("\tEstudiante "+b.getPop()+"\n");
        System.out.println("\tNombre: "+b.getNombre()+"\n");
        System.out.println("\tEdad: "+b.getEdad()+" anios\n");
        System.out.println("\tPrograma: "+b.getPrograma()+"\n");
        System.out.println("\tEtnia: "+b.getEtnia()+"\n");
        System.out.println("\tModalidad: "+b.getModalidad()+"\n");
       }  
}

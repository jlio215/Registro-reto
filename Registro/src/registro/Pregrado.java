
public class Pregrado extends Estudiante{
        int creditosAprobados;
  
    public Pregrado(String pop, String nombre, int edad, String programa, String etnia, int creditosAprobados) {
        super(pop,nombre, edad, programa, etnia);
        this.creditosAprobados = creditosAprobados;
    }

    public Pregrado() {
    }  
       
    public void setCreditosAprobados(int creditosAprobados) {
        this.creditosAprobados = creditosAprobados;
    }
    
    public int getCreditosAprobados() {
        return creditosAprobados;
    }
    
    public void crearEstudiantePre (String pop,String nombre, int edad, String programa, String etnia, int creditosAprobados) {
          Pregrado a = new Pregrado();
          a.setNombre(nombre);
          a.setEdad(edad);
          a.setPrograma(programa);
          a.setCreditosAprobados(creditosAprobados);
          a.setEtnia(etnia);
          a.setPop(pop);
          estudiantes.add((Pregrado) a);
    }          
    
    public void listarPregrado (Pregrado b){
        System.out.println("\tEstudiante "+b.getPop()+"\n");
        System.out.println("\tNombre: "+b.getNombre()+"\n");
        System.out.println("\tEdad: "+b.getEdad()+" anios\n");
        System.out.println("\tPrograma: "+b.getPrograma()+"\n");
        System.out.println("\tEtnia: "+b.getEtnia()+"\n");
        System.out.println("\tCreditos aprobados: "+b.getCreditosAprobados()+"\n");
    }
}

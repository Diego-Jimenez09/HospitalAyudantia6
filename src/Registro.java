import java.util.ArrayList;

public class Registro {
    ArrayList<Persona> pacientes = new ArrayList<>();
    public Persona agregarPaciente(String nombre, int edad){
        Persona alumnoNuevo= new Persona(nombre,edad);
        this.pacientes.add(alumnoNuevo);
        return alumnoNuevo;
    }

}

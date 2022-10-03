import java.util.ArrayList;

public class Registro {
    ArrayList<Persona> pacientes = new ArrayList<>();

    public Persona agregarPaciente(String nombre, int edad){
        Persona pacienteNuevo= new Persona(nombre,edad);
        this.pacientes.add(pacienteNuevo);
        return pacienteNuevo;
    }
    public void imprimirPacientes(ArrayList<Persona> pacientes){
        for(Persona paciente:pacientes){
            System.out.println(paciente.toString());
        }
    }
    public void buscarPaciente(ArrayList<Persona> pacientes){
        String nombre="Cr7";

        for (Persona paciente:pacientes){
            if(paciente.getNombre().equals(nombre)){
                System.out.println("El paciente que busca es: ");
                System.out.println(paciente.toString());
            }
        }
    }
    public void mostrarMayor(){
        ArrayList<Persona> mayores = new ArrayList<>();
        for(Persona persona:this.pacientes){
            if(persona.getEdad()>=60){
                mayores.add(persona);
            }
        }
        System.out.println("Pacientes mayores a 60 años");
        System.out.println(mayores.toString());
    }

    public ArrayList<Persona> getPacientes() {
        return pacientes;
    }
}

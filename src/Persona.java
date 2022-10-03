public class Persona {
    private String nombre;
    private int edad;

    /**Constructor**/
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    /**Get and Set*/
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public  String toString(){
        return  nombre+ " " +edad;
    }
}

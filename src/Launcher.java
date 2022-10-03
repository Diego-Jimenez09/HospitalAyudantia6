
public class Launcher {
    public static void main(String[] args) {

        Registro registro = new Registro();
        registro.agregarPaciente("ElPepe",67);
        registro.agregarPaciente("Cr7",97);
        registro.agregarPaciente("Messi",18);
        registro.agregarPaciente("Etesech",685);
        //registro.imprimirPacientes(registro.getPacientes());
        registro.buscarPaciente(registro.getPacientes());
        registro.mostrarMayor();
    }
}

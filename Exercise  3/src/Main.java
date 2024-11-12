import ucab.edu.lab.*;

public class Main {
    public static void main(String[] args) {
        FormularioRegistro formulario = new FormularioRegistro("Juan Perez", "juanperez@gmail.com", 10);
        formulario.registrarUsuario();

        System.out.println("nombre: " + formulario.getNombre());
        System.out.println("email: " + formulario.getEmail());
        System.out.println("edad: " + formulario.getEdad());

    }
}
package ucab.edu.lab;

public class FormularioRegistro {
    private String nombre;
    private String email;
    private int edad;

    public FormularioRegistro(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void registrarUsuario() {
        try{
            Validar validar = new Validar();
            validar.validarEmail(email);
            validar.validarEdad(edad);
            System.out.println("USUARIO REGISTRADO EXITOSAMENTE");
        }
        catch(FormatoInvalidoException ex){
           ex.excErrorEmail();
        }
        catch(EdadInvalidaException ec){
            ec.excErrorEdad();
        }

    }


}

package ucab.edu.lab;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {
    public Validar() {
    }

    public void validarEmail(String email) throws FormatoInvalidoException {
        if(validarExpresionRegular(email).equals(false)){
           throw new FormatoInvalidoException();
        }
    }

    public void validarEdad(int edad) throws EdadInvalidaException {
        if(edad < 18){
            throw new EdadInvalidaException();
        }
    }


    private static Boolean validarExpresionRegular (String email) {

        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }
}

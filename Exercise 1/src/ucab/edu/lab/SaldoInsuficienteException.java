package ucab.edu.lab;

public class SaldoInsuficienteException extends Exception {
    //CONSTRUCTOR
    public SaldoInsuficienteException() {}

    //ERROR
    public void excErrorPersonalizado(){
        System.out.println("SALDO INSUFICIENTE");
    }
}

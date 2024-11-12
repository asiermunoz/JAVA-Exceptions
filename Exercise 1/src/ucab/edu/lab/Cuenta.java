package ucab.edu.lab;

public class Cuenta {
    private String nombrePropietario;
    private double saldo;
    private int numeroDeCuenta;

    //CONSTRUCTOR
    public Cuenta(String nombrePropietario, double saldo, int numeroDeCuenta) {
        this.nombrePropietario = nombrePropietario;
        this.saldo = saldo;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    //GETTER Y SETTER
    public String getNombrePropietario() {
        return nombrePropietario;
    }
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    //METODOS

    public void validarSaldo(double monto)throws SaldoInsuficienteException{
        if(this.saldo < monto){
            throw new SaldoInsuficienteException();
        }

    }
}

package ucab.edu.lab;

public interface Transferir {
    public default void transferir(Cuenta origen, double monto, Cuenta destino){}
}

package ucab.edu.lab;

public class Banco implements Transferir{
    public Banco() {}

    //METODOS


    @Override
    public void transferir(Cuenta origen, double monto, Cuenta destino) {


        try{
            origen.validarSaldo(monto);
            double montoDestino = destino.getSaldo() + monto;
            double montoOrigen = origen.getSaldo() - monto;
            destino.setSaldo(montoDestino);
            origen.setSaldo(montoOrigen);
            System.out.println("DINERO TRANSFERIDO EXITOSAMENTE");

        }
        catch(SaldoInsuficienteException ex){
            ex.excErrorPersonalizado();
        }
    }
}

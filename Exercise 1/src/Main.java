import ucab.edu.lab.*;

public class Main {
    public static void main(String[] args){
        Cuenta origen = new Cuenta("Asier", 1000, 1234);
        Cuenta destino = new Cuenta("Fernando", 2000, 1235);
        Banco bofa = new Banco();

        bofa.transferir(origen, 500, destino);
        System.out.println(origen.getSaldo());
        System.out.println(destino.getSaldo());




    }
}
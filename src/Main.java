public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1=new Cuenta("123", "ahorro",50000);
        System.out.println("Saldo minimo: "+cuenta1.getSaldoMinimo());
        cuenta1.consignar(180000);
        System.out.println("Saldo actual: "+cuenta1.getSaldoActual());
        cuenta1.retirar(250000);
        System.out.println("Saldo actual: "+cuenta1.getSaldoActual());
        System.out.println(cuenta1.toString());
        cuenta1.setNumero("987");
        System.out.println(cuenta1.toString());

        System.out.println("--------------------------------------------------------------------");

        Cuenta pedroCuenta=new Cuenta("585858", "prestamo", 5000);
        System.out.println(pedroCuenta.toString());

    }
}

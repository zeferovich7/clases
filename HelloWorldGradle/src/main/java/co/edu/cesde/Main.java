package co.edu.cesde;

public class Main {
    public static void main(String[] args) {
        Monitor monitor=new Monitor();
        System.out.println(Math.pow(2,2));
        System.out.println(Calculadora.operacion);
        Calculadora.operacion="resta";
        monitor.getOperation();
        Calculadora.sumar(2,5,3);
    }
}

package Clase05;

public class Interes {

    public double numero1;
    public double numero2;
    public double numero3;
    public double M;

    // constructor
    Interes(double capital, double inte, double tiempo) {
        establecerNumero1(capital);
        establecerNumero2(inte);
        establecerNumero3(tiempo);
    }

    // encapsulamiento
    void establecerNumero1(double capital) {
        numero1 = capital;
    }

    double obtenerNumero1() {
        return numero1;
    }

    void establecerNumero2(double inte) {
        numero2 = inte;

    }

    double obtenerNumero2() {
        return numero2;
    }

    void establecerNumero3(double tiempo) {
        numero3 = tiempo;
    }

    double obtenerNumero3() {
        return numero3;
    }

    // metodo
    void calcularMontoAcumulado() {
        M = Math.pow((obtenerNumero2() + 1), obtenerNumero3()) * obtenerNumero1();
        System.out.println("el monto acumulado seria: " + M);
    }

}

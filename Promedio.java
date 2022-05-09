package Clase06;

public class Promedio {
    public double ta1;
    public double ta2;
    public double ta3;
    public double ta4;
    public double sumatoria;
    public double promSumatoria;
    public double medioCurso;
    public double suma;
    public double exaFinal;
    public double prom;

    Promedio(double num1, double num2, double num3, double num4, Double emc, double efc) {
        establecerTa1(num1);
        establecerTa2(num2);
        establecerTa3(num3);
        establecerTa4(num4);
        establecerMedioCurso(emc);
        establecerExaFinal(efc);
    }

    void establecerTa1(double num1) {
        ta1 = num1;
    }

    double obtenerTa1() {
        return ta1;
    }

    void establecerTa2(double num2) {
        ta2 = num2;
    }

    double obtenerTa2() {
        return ta2;
    }

    void establecerTa3(double num3) {
        ta3 = num3;
    }

    double obtenerTa3() {
        return ta3;
    }

    void establecerTa4(double num4) {
        ta4 = num4;
    }

    double obtenerTa4() {
        return ta4;
    }

    double obtenerSumatoriaDeNotas() {
        return sumatoria = (obtenerTa1() + obtenerTa2() + obtenerTa3() + obtenerTa4());
    }

    double obtenerPromSumatoria() {
        return promSumatoria = obtenerSumatoriaDeNotas() / 4;
    }

    void establecerMedioCurso(double emc) {
        medioCurso = emc;
    }

    double obtenerMedioCurso() {
        return medioCurso;
    }

    void establecerExaFinal(double efc) {
        exaFinal = efc;
    }

    double obtenerExaFinal() {
        return exaFinal;
    }

    double obtenerSuma() {
        return suma = obtenerPromSumatoria() + obtenerExaFinal() + obtenerMedioCurso();

    }

    void calcularPromedio() {
        prom = obtenerSuma() / 3;
        System.out.println("su promedio es: " + prom);
    }

}

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

    Promedio(double n1, double n2, double n3, double n4, Double emc, double efc) {
        setTa1(n1);
        setTa2(n2);
        setTa3(n3);
        setTa4(n4);
        setMedioCurso(emc);
        setExaFinal(efc);
    }

    void setTa1(double n1) {
        ta1 = n1;
    }

    double getTa1() {
        return ta1;
    }

    void setTa2(double n2) {
        ta2 = n2;
    }

    double getTa2() {
        return ta2;
    }

    void setTa3(double n3) {
        ta3 = n3;
    }

    double getTa3() {
        return ta3;
    }

    void setTa4(double n4) {
        ta4 = n4;
    }

    double getTa4() {
        return ta4;
    }

    double getSumatoriaDeNotas() {
        return sumatoria = (getTa1() + getTa2() + getTa3() + getTa4());
    }

    double getPromSumatoria() {
        return promSumatoria = getSumatoriaDeNotas() / 4;
    }

    void setMedioCurso(double emc) {
        medioCurso = emc;
    }

    double getMedioCurso() {
        return medioCurso;
    }

    void setExaFinal(double efc) {
        exaFinal = efc;
    }

    double getExaFinal() {
        return exaFinal;
    }

    double getSuma() {
        return suma = getPromSumatoria() + getExaFinal() + getMedioCurso();

    }

    void calcularPromedio() {
        prom = getSuma() / 3;
        System.out.println("su promedio es: " + prom);
    }

}

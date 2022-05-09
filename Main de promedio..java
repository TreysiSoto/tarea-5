package Clase06;

public class Main {
    public static void main(String[] args) {

        Promedio promedio1 = new Promedio(11.00, 14.00, 17.00, 10.00, 13.00, 16.00);

        System.out.println("Nota de la tarea 1: " + promedio1.getTa1());
        System.out.println("Nota de la tarea 2: " + promedio1.getTa2());
        System.out.println("nota de la tarea 3: " + promedio1.getTa3());
        System.out.println("nota de la tarea 4: " + promedio1.getTa4());
        System.out.println("nota del examen de medio: " + promedio1.getMedioCurso());
        System.out.println("nota del examnen final: " + promedio1.getExaFinal());
        promedio1.calcularPromedio();

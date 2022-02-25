package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;
        b = 0.0;
        System.out.println("Digite o primeiro valor: ");
        a = Double.parseDouble(scan.next());
        while(b == 0.0) {
            System.out.println("Digite o segundo valor: ");
            b = Double.parseDouble(scan.next());
        }

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Subt " + subtrair);
        System.out.println("Multip: " + multiplicar);
        System.out.println("Div: " + dividir);

    }

    public static double somar(double a, double b) {
        return a + b;
    }
    public static double subtrair(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
}

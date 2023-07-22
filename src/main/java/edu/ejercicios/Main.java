package edu.ejercicios;

import edu.ejercicios.ejemplos.clsEjemplo1;
import edu.ejercicios.ejercicios.clsEjercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        clsEjercicios ej = new clsEjercicios();
        ej.areaCirculo(5);
        ej.circunferencia(5);
        ej.volumen(5);
        ej.areaPiramide(5, 5);
        ej.volumenPiramide(5, 5);
        ej.areaTriangulo(5, 5);
        ej.volumenPrisma(5, 5);
        ej.areaParalelogramo(5, 5);
        ej.volumenCilindro(5, 5);
        ej.areaEsfera(5);


        /*String varA = "", varB = "";
        int a = 0, b = 0;

        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese A: ");
            varA = lector.readLine();
            a = Integer.parseInt(varA);
            System.out.print("Ingrese B: ");
            varB = lector.readLine();
            b = Integer.parseInt(varB);
            System.out.println("Valor A = " + varA + ", Valor B = " + varB);
        } catch (Exception ex) {
            System.out.println("Ingresó mal el dato");
        }

        clsEjemplo1 ej = new clsEjemplo1();
        ej.calculo(a, b);*/
    }
}
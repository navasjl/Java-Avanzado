package funcionesLimpias;

import java.util.Arrays;
import java.util.function.Function;

public class Main {

    private static Function<Double, Double> calcularPorcentajeNota = x -> x * 10;

    public static void main(String[] args) {

        String[] sAlumnos = {"Juan", "José", "Ana", "Marta"};
        Double[] dNotas = {4.5, 6.2, 7.3, 9.1};
        Arrays.stream(sAlumnos)
                .forEach(x -> System.out.println("Los alumnos que se presentan el examen son: " + x));
        Arrays.stream(dNotas).
                forEach(x-> System.out.println(" y sus notas son, respectivamente: "+calcularPorcentajeNota.apply(x)+ "%"));
    }
}
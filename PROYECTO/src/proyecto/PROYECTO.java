/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class PROYECTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Elije que formula quieres realizar: \n"
                + "1: Longitud de onda \n"
                + "2: Frecuencia \n"
                + "3: Energía \n"
                + "4: Frecuencia utilizando la energía \n"
                + "5: Energía por Módelo de Bohr"
        );

        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingresa la frecuencia: ");
                double fre = entrada.nextDouble();
                double conv = Formulas.longDeOnda(fre);
                System.out.println("La longitud de onda es: " + conv);
                break;
                //Funciona

            case 2:
                System.out.println("Ingresa la longitud: ");
                double lo = entrada.nextDouble();
                double frec = Formulas.frecuencia(lo);
                System.out.println("La frecuencia es: " + frec);
                break;
                //Funciona

            case 3:
                System.out.println("Ingresa la frecuencia : ");
                double fre2 = entrada.nextDouble();
                double energ = Formulas.energia(fre2);
                System.out.println("La energia es: " + energ);
                break;
                //Funciona

            case 4:
                System.out.println("Ingresa la energia: ");
                double ene = entrada.nextDouble();
                double frec2 = Formulas.frecuenciaEnergia(ene);
                System.out.println("La frecuencia es: " + frec2);
                break;
                //Funciona

            case 5:
                System.out.println("Ingresa la ni y nf: ");
                double ni = entrada.nextDouble();
                double nf = entrada.nextDouble();
                double eneB = Formulas.energiaBohr(ni, nf);
                System.out.println("La energia es: " + eneB);
                break;
                //Funciona

        }

    }

}

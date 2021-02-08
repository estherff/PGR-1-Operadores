/*
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package gal.teis.pg.programacion;

import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Pricipal_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        uso_String_Concatenar();
        //compara_String2();
        //uso_String1();
        //uso_String2();
        //uso_String_Metodos1();

    }

    static void compara_String1() {
        String cadena1 = "Hola Mundo!!!";
        String cadena2 = "Hola Mundo!!!";
        String cadena3 = new String("Hola Mundo!!!");

// Funciona bien
        if (cadena1 == cadena2) {
            System.out.println("Cadena1 y cadena2 son iguales");
        } else {
            System.out.println("Cadena1 y cadena2 son distintas");
        }

// No funciona porque cadena1 y cadena3 son objetos distintos
        if (cadena1 == cadena3) {
            System.out.println("Cadena1 y cadena3 son iguales");
        } else {
            System.out.println("Cadena1 y cadena3 son distintas");
        }

    }

    static void compara_String2() {
        String cadena1 = "Hola Mundo!!!";
        String cadena2 = "Hola Mundo!!!";
        String cadena3 = new String("Hola Mundo!!!");

// Funciona bien
        if (cadena1.equals(cadena2)) {
            System.out.println("Cadena1 y cadena2 son iguales");
        } else {
            System.out.println("Cadena1 y cadena2 son distintas");
        }

// Tambien funciona bien
        if (cadena1.equals(cadena3)) {
            System.out.println("Cadena1 y cadena3 son iguales");
        } else {
            System.out.println("Cadena1 y cadena3 son distintas");
        }

// Tambien funciona bien
        if (cadena1.equals("Hola Mundo!!!")) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son distintas");
        }

// Tambien funciona bien
        if ("Hola Mundo!!!".equals(cadena2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son distintas");
        }
    }

    static void uso_String1() {
        String cadena1 = "Hola "; // Forma simple de crear un String
        String cadena2 = new String("Mundo"); //Crear un objeto String

        System.out.println(cadena1 + cadena2);

    }

    static void uso_String2() {
        String nombre, apellidos;
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        nombre = miScanner.nextLine();
        System.out.println("Introduce tus apellidos");
        apellidos = miScanner.nextLine();
        System.out.println("Tu nombre completo es "
                + nombre
                + " "
                + apellidos);
    }

    static void uso_String_Metodos1() {
        String cadena = "No por mucho madrugar amanece más temprano";

        System.out.println(cadena.charAt(0)); //devuelve N

        System.out.println(cadena.charAt(9)); //devuelve h
        System.out.println(cadena.endsWith("o")); //devuelve true

        System.out.println(cadena.startsWith("n")); //devuelve false, Java distingue entre mayusculas y minusculas

        System.out.println(cadena.equals("No por mucho madrugar amanece más temprano")); //devuelve true

        System.out.println(cadena.indexOf("mucho")); //localiza la posicion donde se encuentra "mucho"

        System.out.println(cadena.length()); // Nos devuelve la longitud: 42

        System.out.println(cadena.replace('o', 'i')); // Cambia todas las o por i

        System.out.println(cadena.toLowerCase()); //Convierte los caracteres del String a minusculas

        System.out.println(cadena.toUpperCase()); //Convierte los caracteres a mayusculas

    }

    static void uso_String_Concatenar() {
        String elString = "más ";

        elString = elString + "vale ";

        elString = elString + "pájaro ";

        elString = elString + "en mano...";
        
        System.out.println(elString);

    }
    


}

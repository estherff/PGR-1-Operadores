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

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_StringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //StringBuilder_Constructores();
        StringBuilder_Modificar1();
    }

    /**
     * Uso de distintos constructores de stringBuilder
     */
    static void StringBuilder_Constructores() {
        StringBuilder bufer1 = new StringBuilder();
        StringBuilder bufer2 = new StringBuilder(10);
        StringBuilder bufer3 = new StringBuilder("hola");
        System.out.println("bufer1 = " + bufer1.toString());
        System.out.println("bufer2 = " + bufer2.toString());
        System.out.println("bufer3 = " + bufer3.toString());
    }

    /**
     * Método que ejecuta distintos métodos que permiten mofificar
     * un objeto StringBuilder
     */
    static void StringBuilder_Modificar1() {
        StringBuilder texto3 = new StringBuilder("Otra prueba");

        texto3.append(" mas");
        System.out.println("Texto 3 es: " + texto3);
        texto3.insert(2, "W");
        System.out.println("Y ahora es: " + texto3);
        texto3.reverse();
        System.out.println("Y ahora: " + texto3);

        System.out.println("En mayúsculas: "
                + texto3.toString().toUpperCase());
        int a=500;           
    }
    /**
     * Método que convierte un objeto StringBuilder en String y viceversa
     */
    static void StringBuilder_String_Convertir(){
        StringBuilder miStringBuilder1=new StringBuilder();
        StringBuilder miStringBuilder2=new StringBuilder("vamos");
        String miString1="ahora", miString2;

        //Convierto un String en StringBuilder
        miStringBuilder1.append(miString1);
        //Convierto un StringBuilder en String
        miString2=miStringBuilder2.toString(); 
    }

}

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
public class Principal_Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        operadores_Parentesis();
    }

    static void operadores_Parentesis() {
        int a1 = 5 * 3 + 2;
        int a2 = (5 * 3) + 2;
        int a3 = 5 * (3 + 2);
        System.out.println("a1: " + a1 + " a2: " + a2 + " a3: " + a3);
        int b1 = 36 / 2 * 5;
        int b2 = 36 / (2 * 5);
        System.out.println("b1: " + b1 + " b2: " + b2);
        int c1 = 12 / 2 + 4;
        int c2 = 12 / (2 + 4);
        System.out.println("c1: " + c1 + " c2: " + c2);
        int d1 = 2 + (2 * (5 + 5));
        int d2 = (2 + 2) * (5 + 5);
        int d3 = 2 + (2 * 5) + 5;
        System.out.println("d1: " + d1 + " d2: " + d2 + " d3: " + d3);
    }

}

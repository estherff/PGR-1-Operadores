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
public class Principal_OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operadorTernario1();
        operadorTernario2();
    }

    static void operadorTernario1() {
        int a = 18, b = 14, c = 22, maximo;
        maximo = a > b ? a : b;
        System.out.println(maximo);
        maximo = maximo > c ? maximo : c;
        System.out.println(maximo);
    }

    static void operadorTernario2() {
        int a = 18, b = 14, c = 22;
        String s = "";
        s = (a > b && a > c) ? "máximo = " + a : s + "";
        s = (b > a && b > c) ? "máximo = " + b : s + "";
        s = (c > a && c > b) ? "máximo = " + c : s + "";
        System.out.println(s);
    }

}

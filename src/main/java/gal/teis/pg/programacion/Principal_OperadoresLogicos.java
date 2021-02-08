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
 * @version 01/11/2020
 */
public class Principal_OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //expresion1();
        operadoresLogicos();
    }
    
    static void expresion1(){
        String x = "Pepe";
        String y = "_23";
 
        Scanner s = new Scanner(System.in);
        System.out.println ("Usuario:");
        String uuid = s.nextLine();
        System.out.println ("Contraseña:");
        String upwd = s.nextLine();
 
        // Comprobar si el nombre de usuario y la contraseña coinciden o no
        if ((uuid.equals(x) && upwd.equals(y)) || 
                (uuid.equals(y) && upwd.equals(x))) {
            System.out.println("Bienvenido al sistema.");
        } else {
            System.out.println("Identificación errónea");
        }
    }
    
    static void operadoresLogicos(){
        int a=4, b=5, c=6, d=3, e=6, f=0;
        if (a == b && c != d && e >= f){
            System.out.println("La expresión es cierta ");
        }else{
            System.out.println("La expresión es falsa");
        }
    }
    
}

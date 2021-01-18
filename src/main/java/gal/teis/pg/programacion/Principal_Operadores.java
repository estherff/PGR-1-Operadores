/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

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

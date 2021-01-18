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
public class Principal_Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long d=1234;
        int edad_i=30;
        Integer edad_I=40;
        double altura_d=1.70;
        Double altura_D=1.78;
        //Se puede asignar directamente un wrapper 
        //con su correspondiente tipo primitivo
        edad_i=edad_I;
        edad_I=edad_i;
        edad_i=altura_D.intValue();
        altura_D=altura_d;
        //Los objetos wrapper no permiten conversiones implícitas
        altura_d=edad_i; //correcto, no son wrappers
        //altura2=edad1; //error, altura2 es un wrapper
        //altura_D.b
        
        //Métodos wrapper
        //Muestra el valor máximo del tipo int
        System.out.println("El valor máximo de Integer es "+Integer.MAX_VALUE);
        //Muestra el valor mínimo del tipo int
        System.out.println("El valor mínimo de Integer es "+Integer.MIN_VALUE);
        
        Double valor_double=1.67;
        
        //Conversión de Double a String
        String edad_string=valor_double.toString();
        
        //Conversión de String a tipo wrapper  
        valor_double=Double.parseDouble("34.5");
        Float valor_float=Float.parseFloat("5.6");
        String valor_string="3";
        Integer edad=Integer.parseInt(valor_string);
        
    }
    
}

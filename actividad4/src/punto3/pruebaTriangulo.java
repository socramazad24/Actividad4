/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

public class pruebaTriangulo {
    public static void main(String [] args){
        
        Triangulo t1 = new Triangulo();
        
        t1.setAltura(5);
        t1.setBase(8);
        
        System.out.println("el area del triangulo es "+t1.getArea()+" cm²");
        System.out.println("la langitud de sus lados iguales del triangulo es igual a "+t1.getLongitud_de_sus_lados_iguales());
        System.out.println("el perimtro del triangulo es igual a "+t1.getPerimetro()+"cm");        
        System.out.println("el valor del angulo del vertice del triangulo es "+t1.getAngulo_vertice());        
    }
}

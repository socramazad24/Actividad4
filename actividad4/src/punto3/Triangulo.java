/*Diseñe e implemente una clase para trabajar con triángulos isósceles. Defina atributos para la base y la altura,
proporcione un método constructor, métodos getter y setter e implemente métodos para calcular: el área, la longitud de
sus lados iguales, el perímetro, el valor del ángulo vértice.

*/
package punto3;

public class Triangulo {
    private int base;
    private int altura;
    

    //metodo contructor
    public Triangulo() {
        
    }
    //metodos getter y setter
    public void setBase(int base) {this.base = base;}
    public void setAltura(int altura) {this.altura = altura;}
    public int getBase() {return base;}
    public int getAltura() {return altura;}
    
    //metodos para calcular el área, la longitud de sus lados iguales, el perímetro, el valor del ángulo vértice.
    public double getArea(){ return (base*altura)/2;}
    
    public double getLongitud_de_sus_lados_iguales(){return Math.sqrt((Math.pow(this.altura,2)+((Math.pow(this.base,2))/4)));}
    
    public double getPerimetro(){return getLongitud_de_sus_lados_iguales()+base;}
    
    public double getAngulo_vertice(){return Math.toDegrees(2*(Math.asin((this.base/2)/this.altura)));}
    
}

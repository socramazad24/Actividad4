/*
Implementa la clase Bicicleta, que tiene tres atributos, velocidadActual, platoActual y piñonActual, de tipo entero,
método constructor, getters y setters, y los siguientes métodos miembros: acelerar (), frenar (), cambiarPlato (int plato),
y cambiarPiñon (int piñon), donde el primero dobla la velocidad actual, el segundo reduce a la mitad la velocidad actual,
y el tercero y cuarto ajustan el plato y el piñón actual respectivamente según los parámetros recibidos. Crear una clase
principal, e instancia un objeto bicicleta y mostrar sus comportamientos
*/
 
package punto4;


public class Bicicleta {
    private int velocidadActual;
    private int platoActua;
    private int piñonActual;

    //constructor
    public Bicicleta (){
        
    }

    public int getVelocidadActual() {return velocidadActual;}

    public void setVelocidadActual(int velocidadActual) {this.velocidadActual = velocidadActual;}

    public int getPlatoActua() {return platoActua;}

    public void setPlatoActua(int platoActua) {this.platoActua = platoActua;}

    public int getPiñonActual() {return piñonActual;}

    public void setPiñonActual(int piñonActual) {this.piñonActual = piñonActual;}
    
    public double acelerar (){
        return velocidadActual*2;
    }
    public double frenar (){
        return velocidadActual/2;
    }
    
    public int cambiarPlato(int plato){
        return plato;
    }
    
    public int cambiarPiñon(int piñon){
        return piñon;
    }
    
    
}

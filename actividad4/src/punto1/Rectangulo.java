
package punto1;

public class Rectangulo {
    private int longitud;
    private int ancho;

    public Rectangulo(int longitud, int ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public int area(){
        return longitud*ancho;        
    }
    
    public int perimetro(){
        return (longitud*2)+(ancho*2);
    }
    
        
}

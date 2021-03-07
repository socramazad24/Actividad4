
package punto4;


public class pruebaBicicleta {
    public static void main(String [] args){
        Bicicleta b1 = new Bicicleta();
        b1.setVelocidadActual(15);
        b1.setPlatoActua(5);
        b1.setPiñonActual(2);
        
        System.out.println("la velocidad es "+b1.getVelocidadActual()+" m/s");
        System.out.println("el plato es el "+b1.getPlatoActua());
        System.out.println("el piñon es el "+b1.getPiñonActual());
        
        
                
        System.out.println("el plato es cambiando: " +b1.cambiarPlato(3));
        
        System.out.println("el piñon cambiado es:" +b1.cambiarPiñon(4));
        
        System.out.println("el doble de la velocidad es "+b1.acelerar()+" m/s");
        System.out.println("la mitad de la velocidad es "+b1.frenar()+" m/s");
        
        
    }
}

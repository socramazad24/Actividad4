
package punto2;

public class pruebaCoche {
    public static void main(String [] args){
        Coche coche1 = new Coche();
        
        coche1.setColor("rojo");
        coche1.setMarca("ferrari");
        coche1.setMatricula("idg 654");
        coche1.setModelo(2021);
        coche1.setNcaballos(200);
        coche1.setNpuertas(2);
        
        
        System.out.println("el color del coche 1 es "+coche1.getColor());
        System.out.println("la marca del carro es "+coche1.getMarca());
        System.out.println("el modelo del carro es "+coche1.getModelo());
        System.out.println("los caballos de fuerza del coche 1 son de "+coche1.getNcaballos()+" de fuerza");
        System.out.println("el numero de puertas del carros es de "+coche1.getNpuertas());
        System.out.println("la matricula del carro es "+coche1.getMatricula());
        
    }
}

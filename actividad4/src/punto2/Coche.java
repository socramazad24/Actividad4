/*Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de
caballos, el número de puertas y la matricula. Crear el constructor del coche, así como los métodos que considere
necesarios. Crear una clase PruebaCoche que instancie varios coches, cambiándole el color a lo largo de la vida a
algunos de ellos y mostrándolo por pantalla.

*/
package punto2;

public class Coche {
    private String color;
    private String marca;
    private int modelo;
    private int Ncaballos ; 
    private int Npuertas;
    private String matricula;

    //metodo setter: establecer
    public void setColor(String color) {
        this.color = color;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public void setNcaballos(int Ncaballos) {
        this.Ncaballos = Ncaballos;
    }
    public void setNpuertas(int Npuertas) {
        this.Npuertas = Npuertas;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //metodo getter: mostrar
    public String getColor() {
        return color;
    }
    public String getMarca() {
        return marca;
    }
    public int getModelo() {
        return modelo;
    }
    public int getNcaballos() {
        return Ncaballos;
    }
    public int getNpuertas() {
        return Npuertas;
    }
    public String getMatricula() {
        return matricula;
    }
    
    
    
    
}

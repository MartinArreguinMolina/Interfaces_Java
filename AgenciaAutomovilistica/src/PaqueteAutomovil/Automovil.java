
package PaqueteAutomovil;

public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    
    public Automovil(String marca , String modelo , String color , double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(String color){
        this.color = color;
    }
}

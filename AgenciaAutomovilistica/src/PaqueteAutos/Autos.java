
package PaqueteAutos;
import PaqueteAutomovil.Automovil;
import PaqueteDescripcion.Descripcion;

public class Autos extends Automovil implements Descripcion{
    private String tipo;
    
    public Autos(String marca ,String modelo , String color , double precio , String tipo){
        super(marca , modelo , color , precio);
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String caracteristicasAdicionales(){
        return "Nuestro " + getModelo() + " esta diseñado para que tu viaje a cualquier parte del mundo sea unico y placentero";
    }
    
    public String toString(){
        return "Marca: " + getMarca() + "\n" + "Modelo: " + getMarca() + "\n" + "Color: " + getColor() + "\n" + "Precio: " + getPrecio() + "Tipo: " + getTipo(); 
    }
    
}

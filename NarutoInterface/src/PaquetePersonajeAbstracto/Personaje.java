
package PaquetePersonajeAbstracto;

public abstract class Personaje {
    private String nombre;
    private String klan;
    private int poderDeAtaque;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getKlan(){
        return this.klan;
    }
    
    public void setKlan(String klan){
        this.klan = klan;
    }
    
    public int getPoderDeAtaque(){
        return this.poderDeAtaque;
    }
    
    public void setPoderDeAtaque(int poderDeAtaque){
        this.poderDeAtaque = poderDeAtaque;
    }
}

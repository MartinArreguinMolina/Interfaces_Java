
package PaqueteAutos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AgregarAutomovil{
    ArrayList<Autos> listaAutos = new ArrayList<>();
    
    public void agregarVehiculo() throws IOException{
        System.out.println(listaAutos);
        String marca;
        String modelo;
        String color;
        double precio;
        String tipo;
        
        marca = marca();
        modelo = modelo();
        color = color();
        precio = precio();
        tipo = tipo();
        
        listaAutos.add(new Autos(marca , modelo , color , precio , tipo));
    }
    
    public double precio() throws IOException{
        System.out.print("Dame el precio: ");
        double precio;
        precio = Double.parseDouble(bufer());
        return precio;
    }
    
    public String tipo(){
        return "Auto";
    }
    
    public String color() throws IOException{
        System.out.print("Dame el color: ");
        String color;
        color = bufer();
        return color;
    }
    
    public String modelo() throws IOException{
        System.out.print("Dame el modelo: ");
        String modelo;
        modelo = bufer();
        return modelo;
    }
    
    public String marca(){
        return "Toyota";
    }
    
    public String bufer() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada = bufer.readLine();
        
        return entrada;
    }
    
    public ArrayList<Autos> getListaAutos(){
        return this.listaAutos;
    }
    
    public void setListaAutos(ArrayList<Autos> lista){
        this.listaAutos = listaAutos;
    }
}

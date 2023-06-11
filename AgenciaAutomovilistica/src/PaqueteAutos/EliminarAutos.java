
package PaqueteAutos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class EliminarAutos {
    AgregarAutomovil ob1 = new AgregarAutomovil();
    
    public void mostrarAutos(ArrayList<Autos> lista) throws IOException{
        int n;
        System.out.println("");
        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("Nuestros Autos son los siguientes");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(i + " " +lista.get(i).getModelo());
        }
        System.out.println("::::::::::::::::::::::::::::::");
        System.out.print("Ingresa el indice del carro correspondiente: ");
        n = Integer.parseInt(bufer());
        
        lista.remove(n);
        ob1.setListaAutos(lista);
        System.out.println("");
    }
    
    public String bufer() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada = bufer.readLine();
        return entrada;
    }
}

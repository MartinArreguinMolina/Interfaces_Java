
package PaqueteAutos;
import java.util.ArrayList;

public class VerListaAutos {
    
    public void verListaAutos(ArrayList<Autos> lista){
        System.out.println("");
        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("Nuestros Autos son los siguientes");
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).toString();
            System.out.println("");
            lista.get(i).caracteristicasAdicionales();
        }
        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("");
    }
}

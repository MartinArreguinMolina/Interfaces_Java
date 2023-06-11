
package test;
import PaqueteAutos.*;
import java.io.IOException;

public class Test1 {
    public static void main(String ... args) throws IOException{
        AgregarAutomovil ob1 = new AgregarAutomovil();
        EliminarAutos ob2 = new EliminarAutos();
        
    
        ob2.mostrarAutos(ob1.getListaAutos());
    }
}

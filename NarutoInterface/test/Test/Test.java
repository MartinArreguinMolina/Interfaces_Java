package Test;

import Hatakes.Kakashi;
import Hyugas.*;
import Kaguyas.Kimimaro;
import Otsutsukis.*;
import Uchihas.*;
import PaquetePersonajeAbstracto.Personaje;
import java.util.ArrayList;

public class Test {

    public static void main(String... args) {
        Test ob1 = new Test();
        ob1.selecionDePersonajes();
    }

    private void selecionDePersonajes() {
        ArrayList<Personaje> listaHuchihas = new ArrayList<>();
        ArrayList<Personaje> listaHyugas = new ArrayList<>();
        listaHuchihas = listaDePersonajesHuchihas();
        listaHyugas = listaDePersonajesHyugas();
        
        System.out.println(listaHuchihas.get(0).getNombre());
        System.out.println(listaHyugas);
    }

    private ArrayList<Personaje> listaDePersonajesHuchihas() {
        ArrayList<Personaje> Uchihas = new ArrayList<>();
        Sasuke sasuke = new Sasuke();
        Itachi itachi = new Itachi();
        Madara madara = new Madara();
        Uchihas.add(sasuke);
        Uchihas.add(itachi);
        Uchihas.add(madara);

        return Uchihas;
    }

    private ArrayList<Personaje> listaDePersonajesHyugas() {
        ArrayList<Personaje> Hyugas = new ArrayList<>();
        Hinata hitana = new Hinata();
        Neji neji = new Neji();
        Hizashi hizashi = new Hizashi();
        Hyugas.add(hitana);
        Hyugas.add(neji);
        Hyugas.add(hizashi);

        return Hyugas;
    }
}

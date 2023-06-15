package Test;

import Hatakes.Kakashi;
import Hyugas.*;
import Kaguyas.Kimimaro;
import Otsutsukis.*;
import Uchihas.*;
import PaquetePersonajeAbstracto.Personaje;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test {

    private boolean salirDeSwitch = false;
    private int seleccionarUnClan = 0;

    public static void main(String... args) throws IOException {
        Test ob1 = new Test();
        ob1.selecionDePersonajes();
    }

    private void selecionDePersonajes() throws IOException {
        System.out.println("");
        ArrayList<Personaje> listaUchihas = new ArrayList<>();
        ArrayList<Personaje> listaHyugas = new ArrayList<>();
        ArrayList<Personaje> listaHatakes = new ArrayList<>();
        ArrayList<Personaje> listaKaguyas = new ArrayList<>();
        ArrayList<Personaje> listaOtsutsuki = new ArrayList<>();

        listaUchihas = listaDePersonajesUchihas();
        listaHyugas = listaDePersonajesHyugas();
        listaHatakes = listaDePersonajesHatakes();
        listaKaguyas = listaDePersonajesKaguyas();
        listaOtsutsuki = listaDePersonajesOtsutsukis();

        do {
            do {
                System.out.println(":::::::::: ELIGE UN CLAN PARA ELEGIR UN PERSONAJE ::::::::::"
                        + "\n1.Clan Uchiha"
                        + "\n2.Clan Hyuga"
                        + "\n3.Clan Hatake"
                        + "\n4.Clan Kaguya"
                        + "\n5.Clan Otsutsuki");
                System.err.print("Elige una opcion: ");
                seleccionarUnClan = Integer.parseInt(bufer());
            } while (seleccionarUnClan < 1 || seleccionarUnClan > 5);

            switch (seleccionarUnClan) {
                case 1:
                    seleccionDePersonajesUchihas(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);
                    break;
                case 2:
                    seleccionDePersonajesHyugas(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);
                    break;
                case 3:
                    seleccionDePersonajesHatake(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);
                    break;
                case 4:
                    seleccionDePersonajesKaguya(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);
                    break;
                case 5:
                   seleccionDePersonajesOtsutsuki(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);
                    break;
                case 6:
                    salirDeSwitch = true;
                    break;
            }
        } while (salirDeSwitch == false);
        System.out.println("");
    }

    private ArrayList<Personaje> listaDePersonajesUchihas() {
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

    private ArrayList<Personaje> listaDePersonajesKaguyas() {
        ArrayList<Personaje> kaguyas = new ArrayList<>();
        Kimimaro kimimaro = new Kimimaro();
        kaguyas.add(kimimaro);

        return kaguyas;
    }

    private ArrayList<Personaje> listaDePersonajesOtsutsukis() {
        ArrayList<Personaje> otsutsukis = new ArrayList<>();
        Hagoromo hagoromo = new Hagoromo();
        Indra indra = new Indra();
        Kaguya kaguya = new Kaguya();
        otsutsukis.add(hagoromo);
        otsutsukis.add(kaguya);
        otsutsukis.add(indra);

        return otsutsukis;
    }

    private ArrayList<Personaje> listaDePersonajesHatakes() {
        ArrayList<Personaje> hatakes = new ArrayList<>();
        Kakashi kakashi = new Kakashi();
        hatakes.add(kakashi);

        return hatakes;
    }

    private String bufer() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        return bufer.readLine();
    }

    private void seleccionDePersonajesUchihas(ArrayList<Personaje> listaUchihas, ArrayList<Personaje> listaHyugas, ArrayList<Personaje> listaHatakes, ArrayList<Personaje> listaKaguyas, ArrayList<Personaje> listaOtsutsuki) throws IOException {
        int n;
        Personaje personajeUno;
        Personaje personajeDos;

        for (Personaje x : listaUchihas) {
            System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
        }
        System.err.print("Selecciona un personaje: ");
        n = Integer.parseInt(bufer());

        personajeUno = listaUchihas.get(n);
        personajeDos = menuSeleccionDePersonajeDos(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);

        if (personajeUno.getPoderDeAtaque() > personajeDos.getPoderDeAtaque()) {
            System.out.println("El ganador es: " + personajeUno.getNombre());
        } else if(personajeUno.getPoderDeAtaque() < personajeDos.getPoderDeAtaque()){
            System.out.println("El ganador es: " + personajeDos.getNombre());
        }else{
            System.out.println("Es un empate");
        }
    }
    
      private void seleccionDePersonajesHyugas(ArrayList<Personaje> listaUchihas, ArrayList<Personaje> listaHyugas, ArrayList<Personaje> listaHatakes, ArrayList<Personaje> listaKaguyas, ArrayList<Personaje> listaOtsutsuki) throws IOException {
        int n;
        Personaje personajeUno;
        Personaje personajeDos;

        for (Personaje x : listaHyugas) {
            System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
        }
        System.err.print("Selecciona un personaje: ");
        n = Integer.parseInt(bufer());

        personajeUno = listaHyugas.get(n);
        personajeDos = menuSeleccionDePersonajeDos(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);

        if (personajeUno.getPoderDeAtaque() > personajeDos.getPoderDeAtaque()) {
            System.out.println("El ganador es: " + personajeUno.getNombre());
        } else if(personajeUno.getPoderDeAtaque() < personajeDos.getPoderDeAtaque()){
            System.out.println("El ganador es: " + personajeDos.getNombre());
        }else{
            System.out.println("Es un empate");
        }
    }
      
    private void seleccionDePersonajesHatake(ArrayList<Personaje> listaUchihas, ArrayList<Personaje> listaHyugas, ArrayList<Personaje> listaHatakes, ArrayList<Personaje> listaKaguyas, ArrayList<Personaje> listaOtsutsuki) throws IOException {
        int n;
        Personaje personajeUno;
        Personaje personajeDos;

        for (Personaje x : listaHatakes) {
            System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
        }
        System.err.print("Selecciona un personaje: ");
        n = Integer.parseInt(bufer());

        personajeUno = listaHatakes.get(n);
        personajeDos = menuSeleccionDePersonajeDos(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);

        if (personajeUno.getPoderDeAtaque() > personajeDos.getPoderDeAtaque()) {
            System.out.println("El ganador es: " + personajeUno.getNombre());
        } else if(personajeUno.getPoderDeAtaque() < personajeDos.getPoderDeAtaque()){
            System.out.println("El ganador es: " + personajeDos.getNombre());
        }else{
            System.out.println("Es un empate");
        }
    }
    private void seleccionDePersonajesKaguya(ArrayList<Personaje> listaUchihas, ArrayList<Personaje> listaHyugas, ArrayList<Personaje> listaHatakes, ArrayList<Personaje> listaKaguyas, ArrayList<Personaje> listaOtsutsuki) throws IOException {
        int n;
        Personaje personajeUno;
        Personaje personajeDos;

        for (Personaje x : listaKaguyas) {
            System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
        }
        System.err.print("Selecciona un personaje: ");
        n = Integer.parseInt(bufer());

        personajeUno = listaKaguyas.get(n);
        personajeDos = menuSeleccionDePersonajeDos(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);

        if (personajeUno.getPoderDeAtaque() > personajeDos.getPoderDeAtaque()) {
            System.out.println("El ganador es: " + personajeUno.getNombre());
        } else if(personajeUno.getPoderDeAtaque() < personajeDos.getPoderDeAtaque()){
            System.out.println("El ganador es: " + personajeDos.getNombre());
        }else{
            System.out.println("Es un empate");
        }
    }
    private void seleccionDePersonajesOtsutsuki(ArrayList<Personaje> listaUchihas, ArrayList<Personaje> listaHyugas, ArrayList<Personaje> listaHatakes, ArrayList<Personaje> listaKaguyas, ArrayList<Personaje> listaOtsutsuki) throws IOException {
        int n;
        Personaje personajeUno;
        Personaje personajeDos;

        for (Personaje x : listaOtsutsuki) {
            System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
        }
        System.err.print("Selecciona un personaje: ");
        n = Integer.parseInt(bufer());

        personajeUno = listaOtsutsuki.get(n);
        personajeDos = menuSeleccionDePersonajeDos(listaUchihas, listaHyugas, listaHatakes, listaKaguyas, listaOtsutsuki);

        if (personajeUno.getPoderDeAtaque() > personajeDos.getPoderDeAtaque()) {
            System.out.println("El ganador es: " + personajeUno.getNombre());
        } else if(personajeUno.getPoderDeAtaque() < personajeDos.getPoderDeAtaque()){
            System.out.println("El ganador es: " + personajeDos.getNombre());
        }else{
            System.out.println("Es un empate");
        }
    }

    private Personaje menuSeleccionDePersonajeDos(ArrayList<Personaje> listaUchihas, ArrayList<Personaje> listaHyugas, ArrayList<Personaje> listaHatakes, ArrayList<Personaje> listaKaguyas, ArrayList<Personaje> listaOtsutsuki) throws IOException {
        int n;
        do {
            System.out.println(":::::::::: ELIGE UN CLAN PARA ELEGIR UN PERSONAJE ::::::::::"
                    + "\n1.Clan Uchiha"
                    + "\n2.Clan Hyugas"
                    + "\n3.Clan Hatake"
                    + "\n4.Clan Kaguya"
                    + "\n5.Clan Otsutsuki");
            System.err.print("Elige una opcion: ");
            seleccionarUnClan = Integer.parseInt(bufer());
        } while (seleccionarUnClan < 1 || seleccionarUnClan > 5);

        switch (seleccionarUnClan) {
            case 1:
                for (Personaje x : listaUchihas) {
                    System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
                }
                System.err.print("Selecciona un personaje: ");
                n = Integer.parseInt(bufer());
                return listaUchihas.get(n);
            case 2:
                for (Personaje x : listaHyugas) {
                    System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
                }
                System.err.print("Selecciona un personaje: ");
                n = Integer.parseInt(bufer());
                return listaHyugas.get(n);
            case 3:
                for (Personaje x : listaHatakes) {
                    System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
                }
                System.err.print("Selecciona un personaje: ");
                n = Integer.parseInt(bufer());
                return listaHatakes.get(n);

            case 4:
                for (Personaje x : listaKaguyas) {
                    System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
                }
                System.err.print("Selecciona un personaje: ");
                n = Integer.parseInt(bufer());
                return listaKaguyas.get(n);

            case 5:
                for (Personaje x : listaOtsutsuki) {
                    System.out.println(x.getNombre() + " Poder de ataque " + x.getPoderDeAtaque());
                }
                System.err.print("Selecciona un personaje: ");
                n = Integer.parseInt(bufer());
                return listaOtsutsuki.get(n);
        }

        return null;
    }
}

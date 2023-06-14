package Otsutsukis;

import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;
import PaquetePersonajeAbstracto.Personaje;

public class Kaguya extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Kaguya() {
        setNombre("Kaguya");
        setKlan("Otsutsuki");
        setPoderDeAtaque(1000000000);
    }

    public String habilidadEspecialDelKlan() {
        System.out.println("");
        return "El Clan Ōtsutsuki en la serie \"Naruto\" posee habilidades especiales y poderes divinos debido a su linaje ancestral. A continuación se describen algunas de las habilidades más destacadas asociadas al Clan Ōtsutsuki:\n"
                + "\n"
                + "Byakugan: Algunos miembros del Clan Ōtsutsuki, como Kaguya y Hamura, tienen la capacidad de despertar el Byakugan. El Byakugan es un dojutsu que otorga una visión excepcional, permitiendo al usuario ver a largas distancias, a través de objetos sólidos y detectar el flujo de chakra.\n"
                + "\n"
                + "Rinnegan: El Rinnegan es otro poderoso dojutsu que se ha manifestado en varios miembros del Clan Ōtsutsuki, como Hagoromo y Madara Uchiha. Este ojo divino confiere al usuario una amplia gama de habilidades, como la capacidad de manipular los seis caminos del chakra, controlar los cuerpos de los demás y utilizar técnicas de invocación.\n"
                + "\n"
                + "Chakra inmenso: Los miembros del Clan Ōtsutsuki poseen una reserva de chakra excepcionalmente grande y poderosa. Su chakra es puro y lleno de energía divina, lo que les confiere una ventaja significativa en términos de fuerza y resistencia.\n"
                + "\n"
                + "Manipulación de dimensiones: Algunos miembros del Clan Ōtsutsuki tienen la capacidad de controlar y viajar a través de dimensiones. Kaguya, por ejemplo, podía abrir portales a diferentes dimensiones y teletransportarse instantáneamente a diferentes lugares.\n"
                + "\n"
                + "Obtención de poder divino: Los miembros del Clan Ōtsutsuki tienen la capacidad de absorber el chakra de otros individuos y obtener un poder divino. Kaguya, por ejemplo, consumió el fruto del Árbol Divino, lo que le otorgó poderes increíbles y habilidades sobrehumanas." + "\n\n\n";
    }

    public String poderEspecialPersonaje() {
        return "Kaguya Ōtsutsuki, también conocida como la Princesa Kaguya, es un personaje extremadamente poderoso en la serie \"Naruto\" y posee habilidades divinas únicas. A continuación se describen algunas de sus habilidades más destacadas:\n"
                + "\n"
                + "Chakra inmenso: Kaguya posee una reserva de chakra inmensamente poderosa y abundante. Su chakra es tan vasto que supera con creces a cualquier otro ser en la serie. Esta gran cantidad de chakra le permite realizar poderosas técnicas y mantener un nivel de energía impresionante en combate.\n"
                + "\n"
                + "Byakugan: Kaguya es conocida por despertar el Byakugan, un dojutsu que otorga una visión excepcional. Con el Byakugan, puede ver a largas distancias, a través de objetos sólidos y percibir el flujo de chakra. Esta habilidad le brinda una ventaja táctica significativa en el combate.\n"
                + "\n"
                + "Manipulación de dimensiones: Kaguya tiene la capacidad de manipular y controlar dimensiones. Puede abrir portales a diferentes dimensiones y teletransportarse instantáneamente a través de ellos. Esta habilidad le permite moverse rápidamente por el campo de batalla y escapar de los ataques enemigos.\n"
                + "\n"
                + "Control de la Tierra y la Naturaleza: Kaguya tiene el poder de controlar y manipular la Tierra y la naturaleza en general. Puede crear grandes estructuras de tierra, controlar elementos naturales como árboles y plantas, y generar poderosas técnicas relacionadas con la tierra y la naturaleza.\n"
                + "\n"
                + "Fruto del Árbol Divino: Kaguya consumió el fruto del Árbol Divino, lo que le otorgó poderes divinos y habilidades sobrehumanas. Estos poderes incluyen la capacidad de volar, una fuerza física extraordinaria, una regeneración rápida de heridas y la capacidad de lanzar ataques devastadores con su chakra.";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }

}

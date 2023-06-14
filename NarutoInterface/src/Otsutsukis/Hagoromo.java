package Otsutsukis;

import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;
import PaquetePersonajeAbstracto.Personaje;

public class Hagoromo extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Hagoromo() {
        setNombre("Hagoromo");
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
        return "Hagoromo Ōtsutsuki, también conocido como el Sabio de los Seis Caminos, es uno de los personajes más poderosos en la serie \"Naruto\" y posee habilidades divinas únicas. A continuación se describen algunos de sus poderes y habilidades especiales más destacadas:\n"
                + "\n"
                + "Rinnegan: Hagoromo es el primer usuario conocido del Rinnegan, un dojutsu supremo que le otorga un poder increíble. Con el Rinnegan, Hagoromo puede utilizar las Seis Vías del Pain, lo que le permite manipular los seis caminos del chakra: Deva, Asura, Humano, Animal, Preta y Naraka. Cada uno de estos caminos le brinda habilidades específicas, como la capacidad de controlar la gravedad, revivir a los muertos y absorber chakra.\n"
                + "\n"
                + "Chakra Divino: Hagoromo posee una inmensa cantidad de chakra divino, que es puro y lleno de energía espiritual. Su chakra es tan poderoso que le permite realizar técnicas extremadamente poderosas y sobrepasar a la mayoría de los demás personajes en términos de fuerza y habilidad.\n"
                + "\n"
                + "Creación de Jutsus: Hagoromo es considerado el padre del ninjutsu moderno y se le atribuye la creación de muchas técnicas poderosas. Desarrolló técnicas como el Chibaku Tensei, que puede usar para atrapar a sus enemigos en una esfera celestial gigante, y el Rinne Rebirth, una técnica que le permite revivir a los muertos a cambio de su propia vida.\n"
                + "\n"
                + "Sello del Dios de la Muerte: Hagoromo tiene el conocimiento y la capacidad de utilizar el Sello del Dios de la Muerte, una técnica que permite sellar el chakra y la conciencia de una persona. Esta técnica se utiliza para contener y controlar a entidades poderosas como el Zorro de Nueve Colas.\n"
                + "\n"
                + "Enseñanzas Espirituales: Hagoromo es conocido por ser un sabio y líder espiritual. Transmitió sus enseñanzas a través de los siglos, lo que permitió el desarrollo de nuevas técnicas y el surgimiento de diferentes aldeas ninja en el mundo de \"Naruto\". Sus enseñanzas influyeron en personajes como Hashirama Senju y Jiraiya.";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }

}

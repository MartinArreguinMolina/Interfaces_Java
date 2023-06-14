package Otsutsukis;

import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;
import PaquetePersonajeAbstracto.Personaje;

public class Indra extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Indra() {
        setNombre("Indra");
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
        return "Indra Ōtsutsuki es un personaje importante en la serie \"Naruto\" y es conocido como el hijo mayor de Hagoromo Ōtsutsuki, también conocido como el Sabio de los Seis Caminos. Indra es considerado el antepasado directo del Clan Uchiha y posee habilidades especiales distintivas. A continuación se describen algunos de los poderes y habilidades destacadas de Indra Ōtsutsuki:\n"
                + "\n"
                + "Sharingan: Indra es el primer usuario conocido del Sharingan, un dojutsu característico del Clan Uchiha. El Sharingan le otorga una visión mejorada, la capacidad de anticipar los movimientos del oponente y la capacidad de copiar y memorizar técnicas de otros ninjas. A medida que el Sharingan se desarrolla, puede desbloquear más niveles y habilidades, como el Mangekyō Sharingan.\n"
                + "\n"
                + "Manipulación del Chakra: Indra posee una gran cantidad de chakra y una habilidad excepcional para controlarlo. Puede usar su chakra para realizar potentes técnicas ninjutsu y genjutsu. Además, tiene una afinidad especial con el elemento Fuego, lo que le permite realizar técnicas de fuego avanzadas con facilidad.\n"
                + "\n"
                + "Habilidades en el Combate Cuerpo a Cuerpo: Indra es un hábil combatiente cuerpo a cuerpo. Su habilidad en el combate físico se combina con su Sharingan, lo que le permite anticipar y esquivar los ataques enemigos con precisión. También es capaz de utilizar el Kenjutsu, el arte de la esgrima, y es experto en el manejo de la espada.\n"
                + "\n"
                + "Control del Susanoo: Indra es conocido por ser uno de los primeros usuarios del Susanoo, una forma de manifestación del chakra avanzada que solo pueden utilizar aquellos que despiertan el Mangekyō Sharingan. El Susanoo crea una gigantesca entidad espiritual que protege al usuario y puede lanzar ataques poderosos.\n"
                + "\n"
                + "Espíritu de Liderazgo y Estrategia: Indra era un líder nato y un estratega talentoso. Era capaz de tomar decisiones rápidas y efectivas en situaciones de combate y liderar a otros hacia la victoria. Su astucia táctica y su habilidad para planificar estrategias lo hicieron un oponente formidable en la batalla.";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }

}

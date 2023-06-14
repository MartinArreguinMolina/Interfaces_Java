package Hatakes;

import PaquetePersonajeAbstracto.Personaje;
import Interfaces.PoderEspecialPersonaje;

public class Kakashi extends Personaje implements PoderEspecialPersonaje {

    public Kakashi() {
        setNombre("Kakashi");
        setKlan("Hatake");
        setPoderDeAtaque(400000000);
    }

    public String poderEspecialPersonaje() {
        return "Kakashi Hatake, uno de los personajes más destacados de la serie \"Naruto\", posee varias habilidades especiales que lo hacen único y poderoso. A continuación se describen algunas de sus habilidades más destacadas:\n"
                + "\n"
                + "Sharingan: Kakashi es conocido por su habilidad para utilizar el Sharingan, un dojutsu que le otorga una visión mejorada, percepción de chakra y la capacidad de copiar técnicas visuales de sus oponentes. Aunque no es un miembro natural del Clan Uchiha, Kakashi ha obtenido y utiliza el Sharingan de forma temporal en situaciones críticas. Con esta habilidad, puede anticipar y contrarrestar los movimientos de sus oponentes, así como analizar y copiar sus técnicas.\n"
                + "\n"
                + "Chidori/Raikiri: Kakashi es el creador y maestro del Chidori, una técnica de naturaleza relámpago. El Chidori es una concentración intensa de chakra en la mano, creando una corriente eléctrica que puede atravesar casi cualquier cosa. Posteriormente, Kakashi desarrolla una versión mejorada del Chidori llamada Raikiri (Destello del Relámpago), que es aún más poderosa y rápida. Esta técnica se utiliza principalmente para ataques precisos y letales.\n"
                + "\n"
                + "Kamui: Después de obtener el Mangekyo Sharingan, Kakashi desarrolla la habilidad de usar el Kamui, una técnica de espacio-tiempo que le permite manipular la realidad y enviar objetos a otra dimensión. Con el Kamui, puede teletransportarse, desviar ataques e incluso enviar partes de su propio cuerpo a otra dimensión para evitar daños.\n"
                + "\n"
                + "Dominio de múltiples elementos: Kakashi ha demostrado habilidades en el uso de múltiples elementos. Además de su dominio en técnicas relámpago, también es competente en el uso de técnicas de agua y tierra. Esta versatilidad le permite adaptarse a diferentes situaciones y oponentes.\n"
                + "\n"
                + "Estratega brillante: Kakashi es conocido por su inteligencia y habilidad táctica en el campo de batalla. Es capaz de analizar rápidamente las situaciones y encontrar soluciones efectivas. Su amplio conocimiento de técnicas y su experiencia le permiten elaborar planes y estrategias exitosas para superar a sus oponentes." + "\n\n\n";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }
}

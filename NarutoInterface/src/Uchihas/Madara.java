package Uchihas;

import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;
import PaquetePersonajeAbstracto.Personaje;

public class Madara extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Madara() {
        setNombre("Madara");
        setKlan("Uchiha");
        setPoderDeAtaque(1000000000);
    }

    public String habilidadEspecialDelKlan() {
        System.out.println("");
        return "Los Uchiha, en el mundo de Naruto, son conocidos por su linaje especial y sus habilidades únicas, especialmente el Sharingan, un poderoso dojutsu (técnica ocular) que les otorga varias capacidades. Algunos de los poderes asociados a los Uchiha y al Sharingan son:\n"
                + "\n"
                + "Sharingan: Es el dojutsu principal de los Uchiha. Les proporciona una visión especial que les permite percibir y anticipar los movimientos rápidos, ver a través de las ilusiones y copiar técnicas de sus oponentes después de haberlas visto una vez.\n"
                + "\n"
                + "Mangekyo Sharingan: Es una forma evolucionada del Sharingan que solo unos pocos Uchiha pueden obtener tras experimentar una gran pérdida emocional. Cada Mangekyo Sharingan tiene un patrón de diseño único y otorga habilidades especiales individuales. Algunas de estas habilidades son:\n"
                + "\n"
                + "Amaterasu: Crea un fuego negro inextinguible que puede quemar cualquier cosa. Es una técnica extremadamente poderosa y difícil de controlar.\n"
                + "\n"
                + "Tsukuyomi: Permite al usuario crear una ilusión extremadamente realista, donde puede controlar el tiempo y torturar mentalmente a su oponente.\n"
                + "\n"
                + "Susanoo: Invoca una gigantesca entidad espiritual que actúa como una armadura defensiva y ofensiva. Puede proteger al usuario de ataques poderosos y lanzar ataques devastadores.\n"
                + "\n"
                + "Kamui: Permite al usuario manipular el espacio-tiempo, creando una dimensión alternativa donde pueden teletransportarse o hacer que los objetos desaparezcan.\n"
                + "\n"
                + "Izanagi: Es una técnica de los Uchiha que permite al usuario manipular la realidad y convertir las ilusiones en realidad. Sin embargo, su uso requiere sacrificar la visión en uno de los ojos del Sharingan." + "\n\n\n";
    }

    public String poderEspecialPersonaje() {
        return "Madara Uchiha, otro personaje importante en la serie \"Naruto\", también posee poderes y habilidades excepcionales. A continuación, se describen algunos de los poderes y técnicas especiales asociados a Madara:\n"
                + "\n"
                + "Sharingan y Mangekyo Sharingan: Madara es reconocido por su dominio del Sharingan y su capacidad para despertar el Mangekyo Sharingan. Al igual que otros Uchiha, puede utilizar las capacidades básicas del Sharingan, como la percepción de movimientos rápidos y la visión a través de ilusiones. Con el Mangekyo Sharingan, Madara obtiene habilidades avanzadas y únicas, incluyendo:\n"
                + "\n"
                + "Susanoo: Madara puede invocar el Susanoo, una entidad espiritual masiva que proporciona una defensa y un ataque formidables. El Susanoo de Madara es particularmente poderoso y puede utilizar diferentes formas y armas, como espadas o arcos.\n"
                + "\n"
                + "Tsukuyomi Infinito: Madara es capaz de utilizar el Tsukuyomi Infinito, una versión extendida y mejorada del Tsukuyomi. Esta técnica sumerge a su objetivo en una ilusión eterna y agonizante, donde pueden ser sometidos a tormentos sin fin.\n"
                + "\n"
                + "Rinnegan: Madara adquiere el Rinnegan, el dojutsu supremo que combina las habilidades del Sharingan y el Mangekyo Sharingan. Con el Rinnegan, Madara puede utilizar diversas técnicas poderosas:\n"
                + "\n"
                + "Limbo: Madara puede crear imágenes invisibles y etéreas de sí mismo, conocidas como \"Sombras del Mundo Impalpable\" (Limbo), que son indetectables para la mayoría de las personas. Estas sombras pueden atacar a sus enemigos sin ser vistos ni tocados, lo que les da una ventaja táctica significativa.\n"
                + "\n"
                + "Camino Exterior: Como poseedor del Rinnegan, Madara tiene acceso a las seis vías del Camino Exterior, que le otorgan habilidades divinas. Esto incluye la capacidad de manipular la gravedad, extraer y absorber chakra, y realizar una variedad de técnicas poderosas.\n"
                + "\n"
                + "Ninjutsu de Elemento Madera (Mokuton): Madara tiene un control excepcional sobre el Mokuton, el elemento madera. Puede manipular árboles y vegetación para crear barreras defensivas, lanzar proyectiles y crear estructuras masivas, como el Bosque de la Muerte.\n"
                + "\n"
                + "Fuerza y habilidades físicas mejoradas: Madara posee una fuerza y habilidades físicas sobrehumanas, lo que le permite enfrentarse directamente a sus oponentes en combate cuerpo a cuerpo.";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }

}

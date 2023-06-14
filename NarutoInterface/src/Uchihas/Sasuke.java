package Uchihas;

import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;
import PaquetePersonajeAbstracto.Personaje;

public class Sasuke extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Sasuke() {
        setNombre("Sasuke");
        setKlan("Uchiha");
        setPoderDeAtaque(1000000);
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
        return "Sasuke Uchiha, uno de los personajes principales de la serie \"Naruto\", posee una variedad de poderes y habilidades especiales debido a su herencia como miembro del Clan Uchiha y su entrenamiento a lo largo de la serie. Aquí están algunos de los poderes especiales asociados con Sasuke:\n"
                + "\n"
                + "1. Sharingan: Sasuke es un portador del Sharingan, un dōjutsu que le permite percibir y anticipar los movimientos rápidos, ver a través de las ilusiones y copiar técnicas después de haberlas visto una vez. Con el tiempo, su Sharingan se desarrolla y evoluciona en formas más avanzadas, como el Mangekyō Sharingan y el Rinnegan.\n"
                + "\n"
                + "2. Mangekyō Sharingan: Después de presenciar la muerte de su hermano Itachi, Sasuke despierta el Mangekyō Sharingan. Con esta forma avanzada del Sharingan, Sasuke puede utilizar habilidades poderosas y únicas:\n"
                + "\n"
                + "   - Amaterasu: Sasuke puede invocar el Amaterasu, un fuego negro inextinguible que quema todo lo que toca. Puede controlar y manipular el fuego a su voluntad.\n"
                + "   \n"
                + "   - Susanoo: Sasuke es capaz de invocar el Susanoo, una entidad espiritual gigantesca y poderosa que actúa como una armadura defensiva y ofensiva. Puede protegerlo de ataques poderosos y lanzar ataques devastadores contra sus oponentes.\n"
                + "\n"
                + "3. Rinnegan: Después de recibir el poder de Hagoromo Ōtsutsuki (también conocido como el Sabio de los Seis Caminos), Sasuke despierta el Rinnegan, un dōjutsu supremo que le otorga habilidades divinas:\n"
                + "\n"
                + "   - Amenotejikara: Permite a Sasuke intercambiar lugares con objetos seleccionados a una velocidad increíble, lo que le brinda la capacidad de esquivar ataques o desplazarse rápidamente.\n"
                + "   \n"
                + "   - Teletransportación: Sasuke puede teletransportarse a cualquier lugar que desee, incluso a otras dimensiones, usando el Rinnegan.\n"
                + "\n"
                + "Además de estos poderes oculares, Sasuke también es un experto en el uso de jutsus de elemento Rayo (Raiton) y tiene habilidades físicas y de combate excepcionales. A lo largo de la serie, adquiere una amplia gama de técnicas y estrategias de batalla para enfrentarse a sus enemigos.\n"
                + ".\n";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }

}

package Uchihas;

import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;
import PaquetePersonajeAbstracto.Personaje;

public class Itachi extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Itachi() {
        setNombre("Itachi");
        setKlan("Uchiha");
        setPoderDeAtaque(10000000);
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
        return "Itachi Uchiha, un personaje destacado en la serie \"Naruto\", posee una amplia gama de poderes y habilidades especiales. A continuación, encontrarás algunos de los poderes y técnicas distintivas asociadas a Itachi:\n"
                + "\n"
                + "1. Sharingan: Itachi es un hábil usuario del Sharingan, un dojutsu que le otorga diversas habilidades visuales. Al ser un Uchiha, Itachi tiene un dominio excepcional del Sharingan y puede usarlo para predecir y anticipar los movimientos de sus oponentes, así como para leer y desenmascarar ilusiones.\n"
                + "\n"
                + "2. Mangekyo Sharingan: Itachi posee el Mangekyo Sharingan, una forma evolucionada y más poderosa del Sharingan. Su patrón de diseño único se asemeja a tres comas. Algunas de las habilidades más notables asociadas a su Mangekyo Sharingan incluyen:\n"
                + "\n"
                + "   - Amaterasu: Itachi puede invocar el Amaterasu, un fuego negro e inextinguible capaz de quemar cualquier cosa en su camino. El Amaterasu es extremadamente poderoso y difícil de apagar.\n"
                + "\n"
                + "   - Tsukuyomi: Itachi es maestro de Tsukuyomi, una técnica genjutsu que le permite manipular la percepción del tiempo y torturar mentalmente a su oponente en una ilusión extremadamente realista. En el Tsukuyomi, Itachi puede controlar la realidad y someter a su objetivo a tormentos psicológicos.\n"
                + "\n"
                + "   - Susanoo: Itachi puede invocar el Susanoo, una entidad espiritual gigantesca que actúa como una armadura defensiva y ofensiva. El Susanoo protege a Itachi de ataques poderosos y puede lanzar ataques devastadores contra sus oponentes.\n"
                + "\n"
                + "3. Genjutsu: Itachi es un maestro del genjutsu, una forma de ninjutsu que involucra ilusiones y manipulación de la mente. Su habilidad para crear genjutsu altamente efectivos y sutiles le permite controlar a sus oponentes y confundirlos en el campo de batalla.\n"
                + "\n"
                + "4. Ninjutsu de Elemento Fuego (Katon): Itachi tiene un dominio excepcional del ninjutsu de elemento fuego y puede usar varias técnicas de fuego con gran destreza y poder.\n"
                + "\n"
                + "Además de estos poderes, Itachi también es un estratega y táctico brillante, capaz de analizar rápidamente las situaciones y desarrollar planes efectivos para enfrentar a sus enemigos.\n"
                + "\n"
                + "Es importante tener en cuenta que mi conocimiento se basa en la serie hasta septiembre de 2021, por lo que puede haber más poderes o desarrollos adicionales en episodios o mangas más recientes.";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }

}

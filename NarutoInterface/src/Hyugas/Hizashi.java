package Hyugas;

import PaquetePersonajeAbstracto.Personaje;
import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;

public class Hizashi extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Hizashi() {
        setNombre("Hizashi");
        setKlan("Hyuga");
        setPoderDeAtaque(2000000000);
    }

    public String habilidadEspecialDelKlan() {
        System.out.println("");
        return "El Clan Hyuga, en el mundo de \"Naruto\", es conocido por su habilidad en el uso del Byakugan, un dojutsu que les otorga una visión extraordinaria y la capacidad de ver los puntos de chakra en el cuerpo de sus oponentes. A continuación, se detallan algunas de las habilidades asociadas al Clan Hyuga:\n"
                + "\n"
                + "Byakugan: El Byakugan es el dojutsu característico del Clan Hyuga. Al activarlo, los miembros del clan obtienen una visión casi panorámica de 360 grados, lo que les permite percibir cualquier movimiento a su alrededor, incluso detrás de ellos. También pueden ver a través de objetos sólidos y detectar puntos de chakra en el cuerpo de otras personas.\n"
                + "\n"
                + "Visión de los Ocho Trigramas: El Byakugan del Clan Hyuga les permite utilizar el estilo de lucha único conocido como \"Jūken\", o \"Golpes Suaves\". Esta técnica se basa en golpear los puntos de chakra en el cuerpo del oponente, lo que puede dañar órganos internos, interrumpir el flujo de chakra y debilitar al oponente.\n"
                + "\n"
                + "Protección del Clan: Los miembros del Clan Hyuga están protegidos por un sello especial que se encuentra en su frente, conocido como \"Sello de Maldición del Clan\". Este sello evita que los secretos y técnicas del clan sean revelados a personas no autorizadas. Si alguien intenta forzar a un miembro del clan a revelar información, el sello se activa y causa un intenso dolor.\n"
                + "\n"
                + "Estilo de Lucha Defensivo: Los Hyuga son conocidos por su estilo de lucha defensivo y evasivo. Utilizan su visión avanzada y su capacidad para prever los movimientos para esquivar ataques y contrarrestar a sus oponentes con precisión." + "\n\n\n";
    }

    public String poderEspecialPersonaje() {
        return "Hizashi Hyuga es un personaje del Clan Hyuga en \"Naruto\" y, desafortunadamente, hay poca información disponible sobre sus poderes y habilidades específicas. A lo largo de la serie, su participación y desarrollo se ven limitados en comparación con otros miembros del clan, como Hinata y Neji. Sin embargo, se sabe que Hizashi era un hábil usuario del Byakugan, el dojutsu característico del Clan Hyuga. Esto significa que tenía la capacidad de ver a su alrededor en un rango de 360 grados, percibir los puntos de chakra y tener una visión excepcionalmente aguda.\n"
                + "\n"
                + "Dado que Hizashi no ha sido explorado en detalle en la serie y no se le ha mostrado involucrado en batallas o entrenamientos significativos, no se conocen otras habilidades o poderes especiales específicos asociados a él. Es posible que haya sido un luchador hábil y haya dominado las técnicas básicas del Clan Hyuga, como el Jūken o Golpes Suaves, pero la serie no proporciona información adicional al respecto.";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }
}

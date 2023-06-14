package Hyugas;

import PaquetePersonajeAbstracto.Personaje;
import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;

public class Hinata extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Hinata() {
        setNombre("Hinata");
        setKlan("Hyuga");
        setPoderDeAtaque(20000);
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
        return "Hinata Hyuga, miembro del Clan Hyuga en la serie \"Naruto\", desarrolla habilidades y técnicas distintivas a lo largo de la historia. A continuación, se describen algunos de los poderes especiales asociados a Hinata:\n"
                + "\n"
                + "Byakugan: Al ser parte del Clan Hyuga, Hinata posee el Byakugan, un dojutsu que le otorga una visión excepcional. Con el Byakugan, Hinata puede percibir a su alrededor en un rango de 360 grados, ver a través de objetos sólidos y detectar los puntos de chakra en el cuerpo de sus oponentes. Esta visión mejorada le brinda una ventaja táctica en el combate.\n"
                + "\n"
                + "Jūken: Hinata ha sido entrenada en el estilo de lucha del Clan Hyuga conocido como Jūken o Golpes Suaves. Esta técnica se basa en golpear los puntos de chakra en el cuerpo del oponente para dañar órganos internos y debilitar al enemigo. Hinata ha demostrado habilidades destacadas en el Jūken y ha desarrollado una variante personalizada llamada \"Golpes del León Suave\".\n"
                + "\n"
                + "Protección del Clan: Hinata también está protegida por el Sello de Maldición del Clan Hyuga, que evita la revelación de los secretos y técnicas del clan. Si alguien intenta forzarla a revelar información, el sello se activa y causa un intenso dolor.\n"
                + "\n"
                + "Energía de la Adversidad: A lo largo de la serie, Hinata desarrolla una fuerza interior única llamada \"Energía de la Adversidad\". Esta energía le permite superar sus miedos y luchar valientemente, incluso en situaciones difíciles. Hinata canaliza su determinación y amor hacia sus seres queridos para impulsar su poder y mejorar su desempeño en el combate.";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }
}

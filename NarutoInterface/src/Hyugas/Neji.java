package Hyugas;

import PaquetePersonajeAbstracto.Personaje;
import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;

public class Neji extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Neji() {
        setNombre("Niji");
        setKlan("Hyuga");
        setPoderDeAtaque(20000000);
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
        return "Neji Hyuga, un personaje del Clan Hyuga en \"Naruto\", también desarrolla habilidades y poderes únicos a lo largo de la serie. A continuación, se describen algunos de los poderes especiales asociados a Neji:\n"
                + "\n"
                + "Byakugan: Al igual que otros miembros del Clan Hyuga, Neji posee el Byakugan, un dojutsu que le otorga una visión excepcional. Con el Byakugan, Neji puede ver a su alrededor en un rango de 360 grados, percibir los puntos de chakra en el cuerpo de sus oponentes y detectar objetos y personas a largas distancias.\n"
                + "\n"
                + "Jūken: Neji es un maestro del estilo de lucha característico del Clan Hyuga, conocido como Jūken o Golpes Suaves. Utiliza su habilidad en el Jūken para golpear los puntos de chakra del cuerpo del oponente, dañar órganos internos y desequilibrar el flujo de chakra de su oponente. Neji es especialmente hábil en el uso de esta técnica, permitiéndole incapacitar a sus oponentes con precisión.\n"
                + "\n"
                + "Rotación Protectora de los Ocho Trigramas: Neji desarrolla una técnica defensiva poderosa llamada \"Rotación Protectora de los Ocho Trigramas\" (Hakke Shō Kaiten). Al girar rápidamente, Neji crea una barrera de chakra que lo protege de los ataques físicos y de ninjutsu. Esta técnica es extremadamente efectiva en la defensa y puede desviar o reducir el impacto de los ataques enemigos.\n"
                + "\n"
                + "Lanzamiento de Proyectiles de Chakra: Neji también ha demostrado la capacidad de lanzar proyectiles de chakra con gran precisión y velocidad. Al concentrar chakra en sus palmas, puede disparar ráfagas de energía concentrada hacia sus oponentes, lo que le brinda una opción de ataque a distancia.\n"
                + "\n"
                + "Despertar del Sello de Maldición: En la etapa Shippuden de la serie, Neji logra despertar su Sello de Maldición y aumentar su poder y habilidades. Esto le permite acceder a niveles más altos de su potencial como miembro del Clan Hyuga y ampliar su capacidad para utilizar el Byakugan y el Jūken.";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }
}

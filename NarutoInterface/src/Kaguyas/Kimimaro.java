package Kaguyas;

import PaquetePersonajeAbstracto.Personaje;
import Interfaces.HabilidadesEspecialesDelKlan;
import Interfaces.PoderEspecialPersonaje;

public class Kimimaro extends Personaje implements HabilidadesEspecialesDelKlan, PoderEspecialPersonaje {

    public Kimimaro() {
        setNombre("Kimimaro");
        setKlan("Kaguya");
        setPoderDeAtaque(20000000);
    }

    public String habilidadEspecialDelKlan() {
        System.out.println("");
        return "El Clan Kaguya en \"Naruto\" es un clan extremadamente poderoso y antiguo que posee habilidades únicas y especiales. El clan es conocido por su linaje directo con la Princesa Kaguya Ōtsutsuki, quien fue la primera usuaria de chakra en la historia del mundo de \"Naruto\". A continuación se describen algunas de las habilidades especiales asociadas al Clan Kaguya:\n"
                + "\n"
                + "Huesos Manipulables: Los miembros del Clan Kaguya tienen la capacidad de manipular y hacer crecer sus propios huesos a voluntad. Pueden extenderlos y usarlos como armas afiladas para atacar a sus oponentes. Esta habilidad se conoce como Shikotsumyaku, el \"Poder de los Huesos Muertos\".\n"
                + "\n"
                + "Técnica del Árbol Divino: Los miembros del Clan Kaguya también tienen la capacidad de crear y controlar el Árbol Divino, una poderosa planta que absorbe chakra y drena la energía vital de las personas. El Árbol Divino puede crecer rápidamente y posee una gran resistencia, lo que lo convierte en una herramienta poderosa en batalla.\n"
                + "\n"
                + "Línea de Sangre de Chakra Puro: El Clan Kaguya es conocido por tener una línea de sangre pura y fuerte, lo que les otorga una gran cantidad de chakra y una afinidad natural con el chakra en general. Esto les da una ventaja en términos de fuerza y resistencia en el combate.\n"
                + "\n"
                + "Despertar del Ōtsutsuki: Algunos miembros del Clan Kaguya tienen la capacidad de despertar el poder de los Ōtsutsuki, que se manifiesta en forma de un tercer ojo en la frente. Esto les otorga un aumento significativo en sus habilidades y una conexión más cercana con los poderes divinos de los Ōtsutsuki." + "\n\n\n";
    }

    public String poderEspecialPersonaje() {
        return "Kimimaro Kaguya, miembro del Clan Kaguya en \"Naruto\", posee habilidades especiales únicas que lo distinguen como un poderoso shinobi. A continuación se describen algunas de sus habilidades más destacadas:\n"
                + "\n"
                + "Shikotsumyaku: Al igual que otros miembros del Clan Kaguya, Kimimaro posee la habilidad del Shikotsumyaku, conocido como el \"Poder de los Huesos Muertos\". Esta habilidad le permite manipular y hacer crecer sus propios huesos a voluntad. Puede transformar sus huesos en armas afiladas, como espadas o lanzas, para atacar a sus oponentes. Además, puede fortalecer su esqueleto para aumentar su defensa y resistencia.\n"
                + "\n"
                + "Danzas de la Clemátide: Kimimaro es conocido por su dominio de las Danzas de la Clemátide, una serie de técnicas de combate basadas en movimientos fluidos y rápidos que aprovechan al máximo su habilidad del Shikotsumyaku. Cada danza tiene un estilo y un propósito diferentes, y se caracterizan por sus movimientos elegantes y mortales. Algunas de las danzas notables incluyen la Danza de la Clemátide de la Lluvia, la Danza de la Clemátide de los Pétalos de Flores y la Danza de la Clemátide de los Bambúes.\n"
                + "\n"
                + "Regeneración acelerada: La línea de sangre del Clan Kaguya también les otorga una notable capacidad de regeneración. Kimimaro posee una regeneración acelerada, lo que le permite recuperarse rápidamente de heridas y lesiones. Esta habilidad combinada con su habilidad para manipular sus huesos lo convierte en un oponente formidable y difícil de derrotar.\n"
                + "\n"
                + "Fuerza y velocidad sobrehumanas: Kimimaro posee una fuerza y velocidad sobrehumanas, lo que lo convierte en un combatiente ágil y poderoso. Su habilidad para moverse rápidamente y esquivar ataques, combinado con su poder destructivo con los huesos, lo convierte en un enemigo temible en el campo de batalla.";
    }

    public String toString() {
        return "Nombre del personaje: " + getNombre() + "\n" + "Klan: " + getKlan() + "\n" + "Poder de ataque: " + getPoderDeAtaque() + "\n" + "-------------------- HABILIDADES ESPECIALES DEL KLAN HUCHIHA ------------------- " + "\n" + habilidadEspecialDelKlan() + "\n" + "-------------------- HABILIDAD ESPECIAL DEL PERSONAJE --------------------" + "\n" + poderEspecialPersonaje();
    }
}

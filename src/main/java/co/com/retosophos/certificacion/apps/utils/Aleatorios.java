package co.com.retosophos.certificacion.apps.utils;

import java.util.Random;

public class Aleatorios {

  private static final Random RANDOM = new Random();

  public static String generarAleatoriosNumeros(int longitudSerie) {
    StringBuilder serieNumeros = new StringBuilder();
    RANDOM.ints(longitudSerie, 0, 9).forEach(numero -> serieNumeros.append(numero));
    return serieNumeros.toString();
  }
}

DOimport java.util.Scanner;

public class Pasapalabra {

	// Crear las preguntas y las respuestas
	// CONSTANTES, DE TIPO STRING

	private static String PREGUNTA_A = "¿Cual es el animal marino que da electricidad si lo tocas?";

	private static String RESPUESTA_A = "Anguila";

	private static String PREGUNTA_E = "Animal grande con trompa";

	private static String RESPUESTA_E = "Elefante";

	private static String PREGUNTA_I = "Animal con la i";

	private static String RESPUESTA_I = "Iguana";

	private static String PREGUNTA_O = "Aparato auditivo";

	private static String RESPUESTA_O = "Oido";

	private static String PREGUNTA_U = "Fruta que se usa para hacer vino";

	private static String RESPUESTA_U = "Uva";

	private static String PASAPALABRA = "pasapalabra";

	private static int ESTADO_SIN_CONTESTAR = 0;
	private static int ESTADO_ACERTADA = 1;
	private static int ESTADO_FALLADA = 2;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int estadoPreguntaA = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaE = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaI = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaO = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaU = ESTADO_SIN_CONTESTAR;
		
		

		System.out.println("Bienvenido a Pasapalabra, cuanto quieres ganar hoy?");

		String respuesta;
		
		int contadorAcierto = 0;
		int contadorFallo= 0;
		
		// Pregunta A
		do {
			if (estadoPreguntaA == ESTADO_SIN_CONTESTAR) {

				System.out.println(PREGUNTA_A);
				respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase(PASAPALABRA)) {
					System.out.println("Siguiente pregunta");
				} else {
					if (respuesta.equalsIgnoreCase(RESPUESTA_A)) {
						System.out.println("Acierto");
						estadoPreguntaA = ESTADO_ACERTADA;
						 contadorAcierto++;
					} else {
						System.out.println("Fallo");
						estadoPreguntaA = ESTADO_FALLADA;
					}
				}
			}

			if (estadoPreguntaE == ESTADO_SIN_CONTESTAR) {

			}
			System.out.println(PREGUNTA_E);
			respuesta = teclado.nextLine();
			if (respuesta.equalsIgnoreCase(PASAPALABRA)) {
				System.out.println("Siguiente pregunta");
			} else {
				if (respuesta.equalsIgnoreCase(RESPUESTA_E)) {
					System.out.println("Acierto");
					estadoPreguntaE = ESTADO_ACERTADA;
					 contadorAcierto++;
				} else {
					System.out.println("Fallo");
					estadoPreguntaE = ESTADO_FALLADA;
				}
			}

			if (estadoPreguntaI == ESTADO_SIN_CONTESTAR) {
				System.out.println(PREGUNTA_I);
				respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase(PASAPALABRA)) {
					System.out.println("Siguiente pregunta");
				} else {
					if (respuesta.equalsIgnoreCase(RESPUESTA_I)) {
						System.out.println("Acierto");
						estadoPreguntaI = ESTADO_ACERTADA;
						 contadorAcierto++;
					} else {
						System.out.println("Fallo");
						estadoPreguntaI = ESTADO_FALLADA;

					}
				}
			}

			if (estadoPreguntaO == ESTADO_SIN_CONTESTAR) {
				System.out.println(PREGUNTA_O);
				respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase(PASAPALABRA)) {
					System.out.println("Siguiente pregunta");
				} else {
					if (respuesta.equalsIgnoreCase(RESPUESTA_O)) {
						System.out.println("Acierto");
						estadoPreguntaO = ESTADO_ACERTADA;
						 contadorAcierto++;

					} else {
						System.out.println("Fallo");
						estadoPreguntaO = ESTADO_FALLADA;

					}

				}
			}

			if (estadoPreguntaU == ESTADO_SIN_CONTESTAR) {
				System.out.println(PREGUNTA_U);
				respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase(PASAPALABRA)) {
					System.out.println("Siguiente pregunta");
				} else {
					if (respuesta.equalsIgnoreCase(RESPUESTA_U)) {
						System.out.println("Acierto");
						estadoPreguntaU = ESTADO_ACERTADA;
						 contadorAcierto++;

					} else {
						System.out.println("Fallo");
						estadoPreguntaU = ESTADO_FALLADA;
						contadorFallo++;

					}
				}
			}
		} while (estadoPreguntaA == ESTADO_SIN_CONTESTAR || estadoPreguntaE == ESTADO_SIN_CONTESTAR
				|| estadoPreguntaE == ESTADO_SIN_CONTESTAR || estadoPreguntaI == ESTADO_SIN_CONTESTAR
				|| estadoPreguntaO == ESTADO_SIN_CONTESTAR || estadoPreguntaU == ESTADO_SIN_CONTESTAR);
		
		System.out.println("Pasapalabra finalizado, has acertado" +contadorAcierto+" y fallado "+contadorFallo);

	}
}

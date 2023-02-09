
public class Ejecutable {

	public static void main(String args[]) {
		int contadorSerie = 0;
		int contadorVideojuego = 0;
		int maximoTemporadas = 0;
		int maximoHoras = 0;
		String serie = "";
		String juego = "";

		Serie arraySeries[] = new Serie[5];
		VideoJuego arrayVidejuego[] = new VideoJuego[5];
		
		arraySeries[0] = new Serie("The Witcher", 2, "Fantasia", "Daniel Valdes");
		arraySeries[1] = new Serie("Stranger Things", "Steven Grant");
		arraySeries[2] = new Serie();
		arraySeries[3] = new Serie("Suit", 8, "Abogados", "Harvey Specter");
		arraySeries[4] = new Serie("GOT", 2, "Fantasia", "Vicerys Dargeryan");
		
		arrayVidejuego[0] = new VideoJuego("FIFA", 8, "Deportes", "EA Sports");
		arrayVidejuego[1] = new VideoJuego("COD II", 5, "Accion", "Sony");
		arrayVidejuego[2] = new VideoJuego("Mario Bross", 7);
		arrayVidejuego[3] = new VideoJuego();
		arrayVidejuego[4] = new VideoJuego("Rocket League", 12, "Carros", "Unreal Tournament");

		arraySeries[0].entregar();
		arraySeries[3].entregar();
				
		arrayVidejuego[1].entregar();
		arrayVidejuego[2].entregar();
		arrayVidejuego[4].entregar();
		
		for (int i = 0; i < arraySeries.length; i++) {
			if(arraySeries[i].isEntregable()) {
				contadorSerie++;
			}
		}
		
		for (int i = 0; i < arrayVidejuego.length; i++) {
			if(arrayVidejuego[i].isEntregable()) {
				contadorVideojuego++;
			}
		}
		
		System.out.println("Series entregadas: " + contadorSerie);
		System.out.println("Videojuegos entregados: " + contadorVideojuego + "\n");

		for(int i = 0; i <  arraySeries.length; i++) {
			if(arraySeries[i].getNumTemporadas() > maximoTemporadas) {
				maximoTemporadas = arraySeries[i].getNumTemporadas();
				serie = arraySeries[i].toString();
			}
		}
		
		for(int i = 0; i <  arrayVidejuego.length; i++) {
			if(arrayVidejuego[i].getHorasEstimadas() > maximoHoras) {
				maximoHoras = arrayVidejuego[i].getHorasEstimadas();
				juego = arrayVidejuego[i].toString();
			}
		}
		
		System.out.println("Serie con mas temporadas: " + "\n" + serie);
		System.out.println("Videojuego con mas horas estimadas: " + "\n" + juego);		
		
	}	

}

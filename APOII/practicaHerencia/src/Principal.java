import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		
		int opcionUsuario;
		
		// Datos
		int id;
		String nombre;
		String apellido;
		int edad;
		
		// Furbolista
		int dorsal;
		String nacionalidad;
		
		// Entrenador
		int idFederacion;
		
		// Masajista
		String titulacion;
		int anniosExperiencia;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("¿A qué clase pertenece? " + "\n" + "Digite: 1 (Futbolista) | 2 (Entrenador | 3 (Masajista)");
		opcionUsuario = input.nextInt();
		
		if(opcionUsuario == 1 || opcionUsuario == 2 || opcionUsuario==3) {
		
			System.out.println("Digite su identificacion: ");
			id = input.nextInt();
			
			System.out.println("Digite su nombre: ");
			nombre = input.next();
			
			System.out.println("Digite su apellido: ");
			apellido = input.next();
			
			System.out.println("Digite su edad: ");
			edad = input.nextInt();
			
			if(opcionUsuario == 1) {				
				System.out.println("Digite el numero de la camiseta: ");
				dorsal = input.nextInt();
				
				System.out.println("Digite su nacionalidad: ");
				nacionalidad = input.next();
				
				Futbolista player = new Futbolista(id, nombre, apellido, edad, dorsal, nacionalidad);
				System.out.println(player.toString());
				
			} else if(opcionUsuario == 2) {
				System.out.println("Digite la identifiacion de la federacion: ");
				idFederacion = input.nextInt();
				
				Entrenador coach = new Entrenador(id, nombre, apellido, edad, idFederacion);
				System.out.println(coach.toString());
				
			} else if(opcionUsuario == 3) {
				System.out.println("Digite su titulacion: ");
				titulacion = input.next();
				
				System.out.println("Digite sus annios de experiencia: ");
				anniosExperiencia = input.nextInt();
				
				Masajista masajista = new Masajista(id, nombre, apellido, edad, titulacion, anniosExperiencia);						
				System.out.println(masajista.toString());
				
			} else {
				System.out.println("Aqui no deberia entrar nunca");
			}
			
		} else {
			System.out.println("Opcion no valida");
		}		
	}
}

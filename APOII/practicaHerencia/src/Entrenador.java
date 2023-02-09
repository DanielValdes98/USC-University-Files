
public class Entrenador extends Persona {

	private int idFederacion;
	
	public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}
	
	
	
	public int getIdFederacion() {
		return idFederacion;
	}


	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}


	public void dirigirPartido() {
		
	}
	
	public void dirigirEntrenamiento() {
		
	}
	
	public void viajarEntrenador() {
		System.out.println(super.viajar() + " como entrenador");
		
	}
	
	public void concentrarseEntrenador() {
		
	}



	@Override
	public String toString() {
		return super.toString() +  "Entrenador [idFederacion=" + idFederacion + "]";
	}
	
	
}

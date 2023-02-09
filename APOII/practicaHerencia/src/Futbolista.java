
public class Futbolista extends Persona {

	private int dorsal;
	private String nacionalidad;
	
	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String nacionalidad) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.nacionalidad = nacionalidad;
	}
	
		
	public int getDorsal() {
		return dorsal;
	}



	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}



	public String getNacionalidad() {
		return nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	public void jugarPartido() {
		
	}
	
	public void entrenar() {
		
	}
	
	public void viajarFutbolista() {
		System.out.println(super.viajar() + " como futbolista");
	}
	
	public void concentrarseFutbolista() {
		
	}


	@Override
	public String toString() {
		return super.toString()  + "Futbolista [dorsal=" + dorsal + ", nacionalidad=" + nacionalidad + "]";
	}
	
	
	

}

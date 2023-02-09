
public class Masajista extends Persona{

	private String titulacion;
	private int anniosExperiencia;
	
	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int anniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.anniosExperiencia = anniosExperiencia;
	}		
	
	
	public String getTitulacion() {
		return titulacion;
	}



	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}



	public int getAnniosExperiencia() {
		return anniosExperiencia;
	}



	public void setAnniosExperiencia(int anniosExperiencia) {
		this.anniosExperiencia = anniosExperiencia;
	}



	public void darMasaje() {
		
	}
	
	public void viajarMasajista() {
		System.out.println(super.viajar() + " como masajista");
	}
	
	public void concentrarseMasajista() {
		
	}


	@Override
	public String toString() {
		return super.toString() +  "Masajista [titulacion=" + titulacion + ", anniosExperiencia=" + anniosExperiencia + "]";
	}
	
	
}

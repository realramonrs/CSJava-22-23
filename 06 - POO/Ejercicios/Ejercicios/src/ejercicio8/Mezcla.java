package ejercicio8;

public class Mezcla {

	private Elemento e1;
	private Elemento e2;
	private float porcentajeE1;
	private float porcentajeE2;
	private float densidad;
	private float temperaturaFusion;
	private float temperaturaEbullicion;
	
	public Mezcla(Elemento e1, Elemento e2, float porcentajeE1, float porcentajeE2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
		this.porcentajeE1 = porcentajeE1;
		this.porcentajeE2 = porcentajeE2;
		actualizarDatos();
	}

	public Elemento getE1() {
		return e1;
	}

	public void setE1(Elemento e1) {
		this.e1 = e1;
		actualizarDatos();
		
	}

	public Elemento getE2() {
		return e2;
	}

	public void setE2(Elemento e2) {
		this.e2 = e2;
		actualizarDatos();
	}

	public float getPorcentajeE1() {
		return porcentajeE1;
	}

	public void setPorcentajeE1(float porcentajeE1) {
		this.porcentajeE1 = porcentajeE1;
		actualizarDatos();
	}

	public float getPorcentajeE2() {
		return porcentajeE2;
	}

	public void setPorcentajeE2(float porcentajeE2) {
		this.porcentajeE2 = porcentajeE2;
		actualizarDatos();
	}

	public float getDensidad() {
		return densidad;
	}

	public float getTemperaturaFusion() {
		return temperaturaFusion;
	}

	public float getTemperaturaEbullicion() {
		return temperaturaEbullicion;
	}
	
	
	private void calcularDensidad() {
		this.densidad = ((this.porcentajeE1/100)*this.e1.getDensidad() + (this.porcentajeE2/100)*this.e2.getDensidad())/2;
	}
	
	private void calcularTemperaturaFusion() {
		this.temperaturaFusion = ((this.porcentajeE1/100)*this.e1.getTemperaturaFusion() + (this.porcentajeE2/100)*this.e2.getTemperaturaFusion())/2;
	}
	
	private void calcularTemperaturaEbullicion() {
		this.temperaturaEbullicion = ((this.porcentajeE1/100)*this.e1.getTemperaturaEbullicion() + (this.porcentajeE2/100)*this.e2.getTemperaturaEbullicion())/2;
	}
	
	
	private void actualizarDatos() {
		calcularDensidad();
		calcularTemperaturaEbullicion();
		calcularTemperaturaFusion();
	}

	@Override
	public String toString() {
		return "Mezcla [e1=" + e1 + ", e2=" + e2 + ", porcentajeE1=" + porcentajeE1 + ", porcentajeE2=" + porcentajeE2
				+ ", densidad=" + densidad + ", temperaturaFusion=" + temperaturaFusion + ", temperaturaEbullicion="
				+ temperaturaEbullicion + "]";
	}
	
	
}

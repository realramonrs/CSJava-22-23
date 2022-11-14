package objetos;

public class Cliente {

	//Definimos los datos que necesitamos de cada cliente
	String dni;
	String nombre;
	float saldoTotal;
	boolean vip;
	
	//Constructores: 
	public Cliente() {
		super();
	}
	
	public Cliente(float saldo,boolean vip) {
		saldoTotal = saldo;
		this.vip = vip;
	}
	
	//Interfaz del objeto : Métodos públicos.
	public float consultaSaldo() {
		return saldoTotal;
	}
	public void quitarDinero(float cantidad) {
		
		if(saldoTotal - cantidad >= 0) {
			saldoTotal-= cantidad;
		}
	}
	
	public void ingresarDinero(float cantidad) {
		saldoTotal+=cantidad;
	}
	
	
}

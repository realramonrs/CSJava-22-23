package clases;

public class Televisor extends Producto {

	private int pulgadas;
	private int frecuencia;
	
	
	public Televisor() {
		super();
		
	}


	public Televisor(String codigo, String marca, String modelo, double precio , int pulgadas, int frecuencia)  {
		super(codigo, marca, modelo, precio);
		this.pulgadas = pulgadas;
		this.frecuencia = frecuencia;
	}


	public int getPulgadas() {
		return pulgadas;
	}


	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}


	public int getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}


	@Override
	public String toString() {
		return "Televisor :" +  super.toString() + "pulgadas=" + pulgadas + ", frecuencia=" + frecuencia ;
		
	}


	@Override
	public void aplicarDescuento() {
		// TODO Auto-generated method stub
		super.aplicarDescuento();
		
		if(this.pulgadas>60) {
			setPrecio(getPrecio()*0.9);
		}
	}


	@Override
	public void subirPrecio() {
		// TODO Auto-generated method stub
		if(this.pulgadas>60) {
			setPrecio(getPrecio()*1.15);
		}
		else {
			setPrecio(getPrecio()*1.10);
		}
	}


	@Override
	public void aumentar(int x) {
		// TODO Auto-generated method stub
		this.pulgadas+=x;
		
	}


	@Override
	public void disminuir(int x) {
		// TODO Auto-generated method stub
		this.pulgadas-=x;
		
	}

	
	
	
	
}

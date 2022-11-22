package clases;

public class Ordenador extends Producto {

	private int almacenamiento;
	private String sistemaOperativo;
	private byte ram;
	
	
	//Constructor por defecto
	public Ordenador() {
		super();		
	}
	
	public Ordenador(String codigo, String marca, String modelo, double precio, int almacenamiento, String so, byte ram)  {
		super(codigo, marca, modelo, precio);
		this.almacenamiento = almacenamiento;
		sistemaOperativo = so;
		this.ram = ram;
	}
	
	public int getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public String getSO() {
		return sistemaOperativo;
	}
	public void setSO(String sO) {
		sistemaOperativo = sO;
	}
	public byte getRam() {
		return ram;
	}
	public void setRam(byte ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		String info = "Ordenador: ";
		info+= super.toString();
		info+= "almacenamiento= " + almacenamiento + ", sistemaOperativo= " 
		+ sistemaOperativo + ", ram= " + ram;
		return info;
	}

	@Override
	public void aplicarDescuento() {
		// TODO Auto-generated method stub
		super.aplicarDescuento();
		if(!this.sistemaOperativo.contains("Windows")) {
			setPrecio(getPrecio()*0.95);
		}
	}

	@Override
	public void subirPrecio() {
		// TODO Auto-generated method stub
		
		if(this.ram > 12) {
			setPrecio(getPrecio()*1.15);
		}
		else if(this.ram > 4) {
			setPrecio(getPrecio()*1.1);
		}
		
	}

	@Override
	public void aumentar(int x) {
		// TODO Auto-generated method stub
		this.almacenamiento+=x;
		
	}

	@Override
	public void disminuir(int x) {
		// TODO Auto-generated method stub
		this.almacenamiento-=x;
	}
	
		
	
}

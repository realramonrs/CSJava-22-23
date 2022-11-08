package clases;

public class Producto {

	private String codigo;
	private String marca;
	private String modelo;
	private double precio;
	private static String tienda;
	 
	 public Producto() {
		
	}
	 
	 
	 public Producto(String codigo, String marca, String modelo, double precio) {
		
		setCodigo(codigo);
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		Producto.tienda = "Alcampo";  //No podemos usar this para una variable de clase(static)
	}


	//Métodos de acceso
	 
	 //Escritura para el código
	 public void setCodigo(String codigo) {
		 //Comprobamos que es correcto
		 if(codigo.length()==5) {
			 //Lo guardamos
			 this.codigo = codigo;
		 }
	 }
	 
	 //Lectura del codigo
	 public String getCodigo() {
		 return this.codigo;
	 }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Codigo= " + codigo + ", marca= " + marca + ", modelo= " + modelo + ", precio= " + precio + "€";
	}
	
	//aplicar descuentos
	public void aplicarDescuento() {
		//Primero comprobamos que el precio está establecido
		if(precio!=0) {
			if(this.precio>0 && this.precio <= 1000  ) {
				precio*=0.95;
			}
			else {
				precio*=0.9;
			}
		}
		
	}


	public static String getTienda() {
		return tienda;
	}


	public static void setTienda(String tienda) {
		Producto.tienda = tienda;
	}
	
	
	
	
	
	 
	 
	 
}

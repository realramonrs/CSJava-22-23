package clases;

public abstract class Producto implements Mutable {

	private String codigo;
	private String marca;
	private String modelo;
	private double precio;
	private static String tienda;
	 
	 public Producto() {
		
	}
	 
	 
//	 public Producto(String codigo, String marca, String modelo, double precio) {
//		
//		
//			try {
//				setCodigo(codigo);
//				this.marca = marca;
//				this.modelo = modelo;
//				this.precio = precio;
//				Producto.tienda = "Alcampo"; //No podemos usar this para una variable de clase(static)
//			} catch (ErrorCodigoExcepcion e) {
//				// TODO Auto-generated catch block
//				System.out.println("No se pudo guardar el código");
//				
//				
//			}
		
	
//	}
	 
	 public Producto(String codigo, String marca, String modelo, double precio)  {
			setCodigo(codigo);
			this.marca = marca;
			this.modelo = modelo;
			this.precio = precio;
		}


	//Métodos de acceso
	 
	 //Escritura para el código
	 public void setCodigo(String codigo)  {
		 //Comprobamos que es correcto
		 if(codigo.length()==5) {
			 //Lo guardamos
			 this.codigo = codigo;
		 }
		
	 }
	 
	


	public void otro() {
		 throw new ArithmeticException();
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
		return "Codigo= " + codigo + ", marca= " + marca + ", modelo= " + modelo + ", precio= " + precio + " € ";
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
	
	public abstract void subirPrecio();
	
	public final void imprimirMensaje() {
		System.out.println("Soy un producto de la tienda "+ Producto.tienda);
	}
	
	
	public static final boolean buscarPorCodigo(Producto []p , String codigo) {
		boolean encontrado = false;
		
		for(Producto pr : p) {
			if (pr.getCodigo()== codigo) {
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}
	
	 
	 
	 
}

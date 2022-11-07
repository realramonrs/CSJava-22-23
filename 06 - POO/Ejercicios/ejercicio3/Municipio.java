package ejercicio3;

public class Municipio {
	private String nombre;
	private String codigoMunicipio;
	private String codigoProvincia;
	private String dc;
	
	public Municipio(String nombre,int cm,int cp) {
		this.nombre = nombre;
		int valorNumerico = 9;
		// String cadena = String.format("%02d" , valorNumerico);
		setCodigoMunicipio(cm);
		setCodigoProvincia(cp);
		setDC();
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}




	public void setCodigoMunicipio(int codigoMunicipio) {
		if(codigoMunicipio < 999 && codigoMunicipio>=1)
		this.codigoMunicipio = String.format("%03d",codigoMunicipio);
	}

	public String getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(int codigoProvincia) {
		if(codigoProvincia>0 && codigoProvincia < 99)
		this.codigoProvincia = String.format("%03d",codigoProvincia);
	}
	
	
	@Override
	public String toString() {
		return "Municipio [nombre=" + nombre + ", codigoMunicipio=" + codigoMunicipio + ", codigoProvincia="
				+ codigoProvincia + ", dc=" + dc + "]";
	}




	private void setDC() {
		int[][] magicos = {
	         	{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
	         	{0, 3, 8, 2, 7, 4, 1, 5, 9, 6},
	         	{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}
	         	};
	       String codigo  =codigoMunicipio + codigoProvincia;
	       byte[] bytes = codigo.getBytes();
	         	 
	         	 int sum = 0, i = 0;
	                	for(Byte v : bytes){
	                       	sum+=magicos[2 - i % 3][v - 48];
	                       	i++;
	                	}
	         	
	         	int res = sum == 0?0:10 - sum % 10;
	         	this.dc = Integer.toString(res);
	}
	
	

}

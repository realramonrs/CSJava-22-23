package ejercicio03;

public class Municipio {
	private String nombre;
	private String codigoMunicipio;
	private String codigoProvincia;
	private String dc;
	
	public Municipio(String nombre,int cm,int cp) {
		this.nombre = nombre;
		//Establecemos el código del municipio y de la provincia llamando a los métodos set correspondientes
		//Esto centraliza el acceso en esos métodos, que es 
		setCodigoMunicipio(cm);
		setCodigoProvincia(cp);
		setDC();
	}	
	//**************************************Métodos de acceso : set y get ******************//
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
		//Validamos que el código sea un número positivo inferior a 999
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
	
	
	public String getDc() {
		return dc;
	}
	//********************************** Final métodos de acceso *****************************//
	@Override
	public String toString() {
		return "Municipio [nombre=" + nombre + ", codigoMunicipio=" + codigoMunicipio + ", codigoProvincia="
				+ codigoProvincia + ", dc=" + dc + "]";
	}

	//Este método es privado ya que es un cálculo interno que no interesa que pueda ser ejecutado desde el exterior
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

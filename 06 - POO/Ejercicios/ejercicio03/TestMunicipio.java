package ejercicio03;

public class TestMunicipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Municipio m1 = new Municipio("PAdrón",5,34);
		Municipio m2 = new Municipio("Valga",80,42);
		Municipio m3 = new Municipio("Cambados",20,9);
		Municipio m4 = new Municipio("Ferrol",124,53);
		Municipio m5 = new Municipio("Burela",450,45);
		
		//Mostrar DC y nombre de los municipios
		System.out.println(m1.getDc() +" "+ m1.getNombre());
		System.out.println(m2.getDc() +" "+ m2.getNombre());
		System.out.println(m3.getDc() +" "+ m3.getNombre());
		System.out.println(m4.getDc() +" "+ m4.getNombre());
		System.out.println(m5.getDc() +" "+ m5.getNombre());
		

	}

}

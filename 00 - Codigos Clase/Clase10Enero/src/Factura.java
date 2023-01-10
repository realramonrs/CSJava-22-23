import java.util.Objects;

public class Factura implements Comparable<Factura> {
	private String codigo;
	private float importe;
	public Factura(String codigo, float importe) {
		super();
		this.codigo = codigo;
		this.importe = importe;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "Factura [codigo=" + codigo + ", importe=" + importe + "]";
	}
	@Override
	public int hashCode() {
		return this.codigo.hashCode() + Float.valueOf(importe).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return Objects.equals(codigo, other.codigo)
				&& Float.floatToIntBits(importe) == Float.floatToIntBits(other.importe);
	}
	@Override
	public int compareTo(Factura o) {
		// TODO Auto-generated method stub
		Float importe2 = Float.valueOf(o.getImporte());
		return importe2.compareTo(this.importe);
	}
	
	
	
	

}

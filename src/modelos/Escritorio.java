package modelos;

public class Escritorio extends Producto {

	private float alto;
	private float ancho;
	
	public Escritorio(String nombre, int stock, float precio, float alto, float ancho) {
		super(nombre,stock,precio);
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public float getAlto() {
		return this.alto;
	}
	
	public void setAlto(float alto) {
		this.alto = alto;
	}
	
	public float getAncho() {
		return this.ancho;
	}
	
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	
	@Override
	public float calcularAumento(float porcentaje) {	
		return getPrecio() + ((getPrecio()*porcentaje)/100);
	}
	
	@Override
	public String toString() {
		
		return "El nombre de la escritorio es: "+getNombre()+"\n"+
				"El stock de la escritorio es: "+getStock()+"\n"+
				"El precio de la escritorio es: "+getPrecio()+"\n"+
				"El alto del escritorio es: " + alto+ "\n"+
				"El ancho del escritorio es: "+ancho;
		
	}
				
}

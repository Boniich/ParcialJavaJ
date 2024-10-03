package modelos;

import interfaces.DescuentoProducto;

public class Silla extends Producto implements DescuentoProducto {
	
	private boolean tieneRuedas;
	
	public Silla(String nombre, int stock, float precio,boolean tieneRuedas) {
		super(nombre,stock,precio);
		this.tieneRuedas = tieneRuedas;
	}
	
	public boolean getTieneRuedas() {
		return this.tieneRuedas;
	}
	
	public void setTieneRuedas(boolean tieneRuedas) {
		this.tieneRuedas = tieneRuedas;
	}
	
	private String mostramosSiTieneRuedas() {
		String tieneRuedasLiteral = "No";
		
		if(tieneRuedas) {
			tieneRuedasLiteral = "Si";
		}
		
		return tieneRuedasLiteral;
	}
	
	@Override
	public double descuento(double porcentaje) {
		return getPrecio() - ((getPrecio()*porcentaje)/100);
	}
	
	@Override
	public String toString() {
		

		
		return "El nombre de la silla es: "+getNombre()+"\n"+
				"El stock de la silla es: "+getStock()+"\n"+
				"El precio de la silla es: "+getPrecio()+"\n"+
				"Tiene ruedas? "+mostramosSiTieneRuedas();
	}

	@Override
	public float calcularAumento(float porcentaje) {	
		return getPrecio() + ((getPrecio()*porcentaje)/100);
	}

}

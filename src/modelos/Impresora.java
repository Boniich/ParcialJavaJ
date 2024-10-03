package modelos;

import interfaces.DescuentoProducto;

public class Impresora extends ProductoInformatico implements DescuentoProducto {
	
	private int impresionesPorMinuto;
	
	public Impresora(String nombre, int stock, float precio,String nombreFabricante, int impresionesPorMinuto) {
		super(nombre,stock,precio,nombreFabricante);
		this.impresionesPorMinuto = impresionesPorMinuto;
	}
	
	public int getImpresionesPorMinuto() {
		return this.impresionesPorMinuto;
	}
	
	public void setImpresionesPorMinuto(int impresionesPorMinuto) {
		this.impresionesPorMinuto = impresionesPorMinuto;
	}
	
	@Override
	public double descuento(double porcentaje) {
		return getPrecio() - ((getPrecio()*porcentaje)/100);
		//double precio = 0;
		//precio = getPrecio() - ((getPrecio()*porcentaje)/100);
		//setPrecio(precio);
	}
	
	@Override
	public float calcularAumento(float porcentaje) {	
		return getPrecio() + ((getPrecio()*porcentaje)/100);
	}
	
	@Override
	public String toString() {
		
		return "El nombre de la impresora es: "+getNombre()+"\n"+
				"El stock de la impresora es: "+getStock()+"\n"+
				"El precio de la impresora es: "+getPrecio()+"\n"+
				"El nombre del fabricante de la impresora es: " + getNombreFabricante()+"\n"+
				"Impresiones por minuto: "+impresionesPorMinuto;
		
	}

}

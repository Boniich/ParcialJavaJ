package modelos;

public class ProductoInformatico extends Producto {
	
	private String nombreFabricante;
	
	public ProductoInformatico(String nombre, int stock, float precio,String nombreFabricante) {
		super(nombre,stock,precio);
		this.nombreFabricante = nombreFabricante;
	}
	
	public String getNombreFabricante() {
		return this.nombreFabricante;
	}
	
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	
	@Override
	public float calcularAumento(float porcentaje) {	
		return getPrecio() + ((getPrecio()*porcentaje)/100);
	}
	
	@Override
	public String toString() {
		
		return "El nombre de la fabricante es: "+getNombre()+"\n"+
				"El stock de la fabricante es: "+getStock()+"\n"+
				"El precio de la fabricante es: "+getPrecio()+"\n"+
				"El nombre del fabricante es: "+nombreFabricante;

		
	}
	

}

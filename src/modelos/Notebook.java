package modelos;

public class Notebook extends ProductoInformatico {

	private int memoriaRam;
	
	public Notebook(String nombre, int stock, float precio,String nombreFabricante,int memoriaRam) {
		super(nombre,stock,precio,nombreFabricante);
		this.memoriaRam = memoriaRam;
	}
	
	public int getMemoriaRam() {
		return this.memoriaRam;
	}
	
	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	
	@Override
	public float calcularAumento(float porcentaje) {	
		return getPrecio() + ((getPrecio()*porcentaje)/100);
	}
	
	@Override
	public String toString() {
		
		return "El nombre de la notebook es: "+getNombre()+"\n"+
				"El stock de la notebook es: "+getStock()+"\n"+
				"El precio de la notebook es: "+getPrecio()+"\n"+
				"El nombre del fabricante de la notebook es: " + getNombreFabricante()+"\n"+
				"Memoria RAM: "+memoriaRam;
		
	}
}

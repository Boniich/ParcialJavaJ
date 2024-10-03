package modelos;

public abstract class Producto {

	private String nombre;
	private int stock;
	private float precio;
	
	public Producto(String nombre, int stock, float precio) {
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public abstract float calcularAumento(float porcentaje);

	
}

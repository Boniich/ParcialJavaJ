package main;

import java.util.ArrayList;
import java.util.List;

import modelos.Escritorio;
import modelos.Impresora;
import modelos.Notebook;
import modelos.Producto;
import modelos.Silla;

public class Main {

	public static void main(String[] args) {
		
		Escritorio escritorio1 = new Escritorio("Escritorio1",10,3000,1.2f,1.5f);
		Silla silla1 = new Silla("Silla1",20,4000,true);
		Impresora impresora1 = new Impresora("Impresora1",30,45000,"HP",300);
		Notebook notebook1 = new Notebook("Note1",20,3000,"asus",16);
		
		List<Producto> lista = new ArrayList<Producto>();
		
		lista.add(silla1);
		lista.add(escritorio1);
		lista.add(impresora1);
		lista.add(notebook1);
		
		
		for(Producto producto : lista) {
			System.out.println(producto);
			System.out.println("El tipo de instancia es: "+producto.getClass().getSimpleName());
			System.out.println("-------");
			System.out.println("");
			
		}
		


		
		System.out.println("Aplicamos descuento");
		for(Producto producto : lista) {
			
	
		
			if(producto instanceof Silla) {
				System.out.println("El descuento de la silla es: "+((Silla) producto).descuento(10));
			}
			
			if(producto instanceof Impresora) {
				System.out.println("El descuento de la impresora es: "+((Impresora) producto).descuento(10));
			}
			
		}
		
		System.out.println("");
		System.out.println("Precios con aumento y sin aumento");
		
		for(Producto producto : lista) {
			
			if(producto instanceof Silla) {
				System.out.println("Precio silla SIN aumento"+producto.getPrecio());
				producto.setPrecio(producto.calcularAumento(5));   
				
				System.out.println("Precio silla CON aumento"+producto.getPrecio());
			}
			
			System.out.println("");
			
			if(producto instanceof Escritorio) {
				System.out.println("Precio escritorio SIN aumento"+producto.getPrecio());
				producto.setPrecio(producto.calcularAumento(10));
				System.out.println("Precio escritorio CON aumento"+producto.getPrecio());
			}
			
			System.out.println("");
			
			if(producto instanceof Impresora) {
				System.out.println("Precio impresora SIN aumento"+producto.getPrecio());
				producto.setPrecio(producto.calcularAumento(15));
				System.out.println("Precio impresora CON aumento"+producto.getPrecio());
			}
			
			System.out.println("");
			
			if(producto instanceof Notebook) {
				System.out.println("Precio notebook SIN aumento"+producto.getPrecio());
				producto.setPrecio(producto.calcularAumento(20));
				System.out.println("Precio notebook CON aumento"+producto.getPrecio());

			}
			
		}
		
		
		
	}

}

package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="Productos")
public class Productos {
	
	//Campos 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String nombre;
	private String Precio;
	private int cantidad_stock;
	
	
	public Productos( String nombre, String precio, int cantidad_stock) {
		this.nombre = nombre;
		Precio = precio;
		this.cantidad_stock = cantidad_stock;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}
	public int getCantidad_stock() {
		return cantidad_stock;
	}
	public void setCantidad_stock(int cantidad_stock) {
		this.cantidad_stock = cantidad_stock;
	}
	
	
	
	

}

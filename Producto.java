
/** *************************************************************************
* Clase Producto, modela y crea productos de un "supermercado de barrio",
* ademas gracias al metodo compareTo() de la interfaz Comparable
* se comparan los precios para determinar el producto mas caro y el mas barato.
*
***	Fecha: 20-07-2019
*******	@Author Luis Espinoza

******************************************************************************/

public class Producto implements Comparable<Producto>{

	private String nombre;
	private int contenido;
	private float litros;
	private int precio;
	private String unidad_De_Venta;
	

	/* Tres constructores, para productos donde el contenido se mida en litros,mls, y kilos*/
 	public Producto(String nombre, int contenido, int precio){ //Constructor LITRO
 		this.nombre = nombre;
 		this.contenido = contenido;
 		this.precio = precio;
 		
 	}

 	public Producto(String nombre, float litro, int precio){//Constructor CONTENIDO ml
 		this.nombre = nombre;
 		this.litros = litro;
 		this.precio = precio;
 		
 	}

 	public Producto(String nombre, int precio, String unidadDeVenta){//Constructor KILO
 		this.nombre = nombre;
 		this.precio = precio;
 		this.unidad_De_Venta = unidadDeVenta;
 	}
 
    public String getNombre(){
    	return nombre;
    }

    public int getContenido(){
    	return contenido;
    }

    public float getLitros(){
    	return litros;
    }

    public int getPrecio(){
    	return precio;
    }
    public String getUnidadDeVenta(){
    	return unidad_De_Venta;
    }

	public String getConContenido(){
		return "Nombre: " + getNombre() + " /// " + "Contenido: " + getContenido() + "ml" + " /// " + "Precio: $"+ getPrecio();
	}
	public String getConLitro(){
		return "Nombre: " + getNombre() + " /// " + "Litros: " + getLitros() + " /// " + "Precio: $"+ getPrecio();
	}
	public String getConKilo(){
		return "Nombre: " + getNombre() + " /// " + "Precio: $" + getPrecio() + " /// " + "Unidad de venta: "+ getUnidadDeVenta();
	}
	
	public static void separador(){
 		System.out.println("============================="); 
 	}
	
 	@Override
 	public String toString(){
 			
 		String paraImprimir = "Nombre: " + this.getNombre();
 		if(this.getLitros() != 0.0f){
 		paraImprimir = paraImprimir + " /// " + "Litros: " + this.getLitros() + " /// " + "Precio: $" + this.getPrecio(); 
 		}if(this.getContenido() != 0){
 			paraImprimir = paraImprimir + " /// " + "Contenido: " + this.getContenido() + "ml" + " /// " + "Precio: $" + this.getPrecio();
 		}if(this.getUnidadDeVenta() != null){
 			paraImprimir = paraImprimir + " /// " + "Precio: $" + this.getPrecio() + " /// " + "Unidad de Venta: " + this.getUnidadDeVenta();
 		}
			
 	 return paraImprimir;
 	 }
 		
		
 
 	
	public int compareTo(Producto p){
		
		int resultado = 0;
		
		if(this.precio <= p.precio){
			resultado = -1;
		}else if(this.precio == p.precio){
			resultado = 0;
		}else if(this.precio >= p.precio){
			resultado = 1;	
		}
		return resultado;
	}

}
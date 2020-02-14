
import java.util.ArrayList;
import java.util.List;

/*******************************************************************************************************************************
   La clase Productos se encarga de crear y guardar objetos de tipo Producto en un arrayList para su facil acceso y modificacion.
   Ademas de proveer metodos para mostrar por consola: 1ro La lista de productos en mostrarPorConsola(),
  2do El producto mas caro en imprimirMasCaro() y, 3ro El prudcto mas barato en imprimirMasBarato().

  @Author Luis Espinoza

  *******************************************************************************************************************************/
public class Productos {
	
	List<Producto> productos = new ArrayList<>(4);

	public Productos(){
 		this.productos.add(new Producto("Coca-Cola Zero", 1.5F, 20));
 		this.productos.add(new Producto("Coca-Cola", 1.5F, 18));
 		this.productos.add(new Producto("Shampoo Sedal", 500, 19));
 		this.productos.add(new Producto("Frutillas",64, "kilo"));
 	}
	public void mostrarPorConsola(){
		for(Producto producto : productos){
			System.out.println(producto);
		}
	}
	
	public void imprimirMasCaro(){
		int i = 0;
		int o = 0;
		boolean loop = true;
		while(loop){
			if(productos.get(i).compareTo(productos.get(o)) == 1){ 
				o++;
				if(productos.get(i).compareTo(productos.get(o)) == 1){	
					o++;
					if(productos.get(i).compareTo(productos.get(o)) == 1){	
						if(productos.get(i).compareTo(productos.get(o)) == 1){
							System.out.println("Producto más caro: " + productos.get(i).getNombre());
						}
					}
				}
			}
			if( i == 3){
				loop = false;
			}	
			i = i + 1;
			}
		}
		
	
	
	public void imprimirMasBarato(){
		int i = 0;
		int o = 0;
		boolean loop = true;
		while(loop){ 
			if(productos.get(i).compareTo(productos.get(o)) == -1){
				o++;
				if(productos.get(i).compareTo(productos.get(o)) == -1){
					o++;
					if(productos.get(i).compareTo(productos.get(o)) == -1){	
						if(productos.get(i).compareTo(productos.get(o)) == -1){
							System.out.println("Producto más barato: " + productos.get(i).getNombre());
							loop = false;
					
						}
					}
				}
			}
			i= i+1;
		}
		
	}
}

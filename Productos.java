
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

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
			
			if(productos.get(i).compareTo(productos.get(o)) == 1){ //0>0
				o++;
				
				if(productos.get(i).compareTo(productos.get(o)) == 1){	//0>1
					o++;
					if(productos.get(i).compareTo(productos.get(o)) == 1){//0>2
						
						if(productos.get(i).compareTo(productos.get(o)) == 1){//0>3
							
							System.out.println("Producto más caro: " + productos.get(i).getNombre());
					
						}
					}
				}
			}if( i == 3){
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

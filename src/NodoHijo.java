
public class NodoHijo extends NodoPadre {
private String direccion;
public NodoHijo(int valor){
	super(valor);
	direccion = "Unknown" ; 
}
public void setDireccion(String direccion){
	this.direccion =direccion;
}
public String getDireccion(){
	return direccion;
}
public void mostrar(){
	System.out.println("El valor del nodo es:"+getvalor()+", y su direccion es:"+getDireccion());	
	
}

public static void main (String args[] ){
NodoHijo hijo = new NodoHijo(15);
hijo.setDireccion("abajo");
hijo.mostrar();
	
	
}
}
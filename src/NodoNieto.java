
public class NodoNieto extends NodoHijo {
private int pasos;
private String orientacionPasos;
public NodoNieto(int valor){
	super(valor);
}
public void setOrientacionPasos(String orientacionPasos){
	this.orientacionPasos = orientacionPasos;
}
public String getOrientacionPasos(){
	return orientacionPasos;
}
public int pasos(){
	return pasos;
}
public void mostrarPasosNieto(){
	System.out.println("Sus pasos Son:"+getOrientacionPasos());
	
}
public static void main (String args[] ){
NodoNieto nieto = new NodoNieto(12);
nieto.setDireccion("abajo");
nieto.setOrientacionPasos("arriba-abajo-arriva-abajo-abajo");
nieto.mostrar();
nieto.mostrarPasosNieto();
	
	
}
}

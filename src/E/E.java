package E;
import D.D;

public class E {
	//Inhaltliche Kopplung, weil wir ein neues Objekt myD vom typ D definieren und erzeugen
	public static D myD = new D();
	
	public void m1(){
		//Datenkopplung, weil wir auf ein m1 vom myd und dann auf ein m1 von myb zugreifen
		myD.m1().m1();
	}

}

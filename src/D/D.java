package D;
import B.B;

public class D {
	//Inhaltliche Koplung, weil wir ein myB vom typ B deklarieren
	private B myB;
	//get
	//steuerungskopplung, weil wir ein B zurückbekommen wollen
	public B m1(){
		//inhaltliche Kopplung, weil wir myb neu speichern als ein anderes myb
		myB = myB.m2();
		//steuerungskopplung, weil wir ein myB zurückgeben
		return myB;
	}

}

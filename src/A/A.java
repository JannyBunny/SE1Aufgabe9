package A;

import B.B;

public class A {
	//Inhaltliche Kopplung, weil ein Objekt myB vom Typ B definiert wurde
	private B myB;
	
	//set
	//Inhaltliche Kopplung, hier wird das myB objekt erzeugt
	public void m1(){
		myB = new B();
	}
	
	//get
	//Datenkopplung, weil Rückgabe von myB
	public B m2(){
		return myB;
	}
	
	//set
	//Steuerungskopplung weil wir m1 auf myB aufrufen
	public void m3(){
		myB.m1();
	}
	
	//set
	//Inhaltliche Kopplung, da wir myB einen neuen Wert von myB zuweisen
	public void m4(){
		myB = myB.m2();
	}

}

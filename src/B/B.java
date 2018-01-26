package B;
import C.C;

public class B {
	
	private int v;
	
	public B(){
		v = 0;
	}
	
	public B(int i){
		v = i;
	}
	//set
	//Inhaltliche kopplung, weil wir ein neues C erzeugen
	public void m1(){
		C m1c = new C(v);
		
		v +=  m1c.m2();
	}
	//get
	public B m2(){
		return new B(v++);
	}

}

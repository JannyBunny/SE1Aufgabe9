package C;
import A.A;

public class C {
	
	protected boolean v;
	
	public C(int i){
		if (i > 0)
			v = true;
		else
			v = false;
	}
	//konstrukt0r Steuerungskopplung, weil wir ein a von Typ A übergeben
	public C(int i, A a){
		if (i > 0){
			if (a.m2() != null){
				m3();
			}
			else
				m4();
		}else {
			if (a.m2() == null)
				m3();
			else
				m4();
		}
	}
	//get
	public int m2(){
		if(this.toString().startsWith("C")){
			return 1;
		}
		else
			return 2;
	}
	//set
	private void m3(){
	   v = true;
	}
	//set
	private void m4(){
	   v = false;	
	}

}

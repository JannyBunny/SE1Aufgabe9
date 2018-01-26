package F;
import C.C;
import E.E;

//Inhaltliche Kopplung, weil wir die Klasse C mit F extenden
public class F extends C{
	//get
	public F(int i){
		super(i);
		//repräsentationskopplung, weil wir v "umdrehen"(in nicht v verwandeln)
		v = (!v);
	}
	//get
	//steuerungskopplung, weil wir ein e vom Typ E übergeben 
	private boolean m3(E e){
		if (e.myD != null){
			return true;
		} else
			return false;
	}	
}

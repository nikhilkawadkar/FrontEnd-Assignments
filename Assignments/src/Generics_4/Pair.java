package Generics_4;

public class Pair<k, v> {
	
	private k key;
	private v value;
	
	public Pair(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}
 
	public <k,v> String showData() {
		
		return key+"  "+value;
	}

	 

}

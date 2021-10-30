package AssignmentThree_StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		 StringBuffer sb = new  StringBuffer();
		sb.append("String Buffer ");
		sb.append("is a peer class of String");
		sb.append("That provides much of");
		sb.append("the functionality of the string");
		
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("It is used to _ at the specified index position");
	//	sb1.insert(sb1.indexOf("_"),"insert" );
		System.out.println(sb1);
		sb1.replace(sb1.indexOf("_"),(sb1.indexOf("_")+1), "insert");
		System.out.println(sb1);
		
		
		System.out.println(sb1.reverse());

	}

}

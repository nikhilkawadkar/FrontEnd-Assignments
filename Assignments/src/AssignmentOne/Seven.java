package AssignmentOne;

public class Seven {

	public static void main(String[] args) {
		 int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		 
		 int searchEle =19;
		 
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i]==searchEle){
				System.out.println(searchEle +" is present in array");
			}else {
				System.out.println(searchEle+" is not present");
			}
		}
	}

}

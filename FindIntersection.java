package week1.day3;

public class FindIntersection {
	public void intersection(int []arr1, int []arr2) {
		System.out.println("intersection are ");
		for(int i=0 ; i<arr1.length; i++) {
			for(int j=0;j<arr2.length; j++) {
				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
		}
	}

	public static void main(String[] args) {
		int []arr1= {5,4,3,2,1};
		int []arr2= {6,7,5,8,9};
		FindIntersection inter = new FindIntersection();
		inter.intersection(arr1,arr2);

	}

}

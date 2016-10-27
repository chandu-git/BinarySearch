package binarySearch;


public class BinarySearch {

	//binarySearch needs a sorted array to find target element
	
	//recursive O(logn)
	public static int binarySearchR(int[] a, int start, int end, int target){
		if(end >= start){
			int middle = (start+end)/2;
			if(target == a[middle])
				return middle;
			else if(target < a[middle]){
				end = middle -1;
				return binarySearchR(a, start, end, target);
			}else{
				start = middle +1;
				return binarySearchR(a, start, end, target);
			}
		}
		return -1;
	}
	
	//iterative O(n)
	public static int binarySearchI(int[] a, int target){
		int start = 0, end = a.length-1;
		while(end >= start){
			int middle = (start+end)/2;
			if(target == a[middle])
				return middle;
			else if(target > a[middle])
				start = middle +1;
			else
				end = middle -1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int target = 15;
		
		int[] a = {3,4,7,9,16,34,46,56,78,79};
		//System.out.println(binarySearchR(a, 0, a.length-1, target));
		System.out.println(binarySearchI(a, target));
	}
}


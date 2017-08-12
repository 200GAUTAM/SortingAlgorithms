class Solution {
	void mergeSort(int[] arr) {
		int[] helper = new int[arr.length];
		mergesort(arr, helper, 0, arr.length-1);
	}
	void mergesort(int[] arr, int[] helper, int start, 
			int end) {
		if(start < end) {
			int mid = (start + end)/2;
			mergesort(arr,helper,start,mid);
			mergesort(arr,helper,mid+1,end);
			merge(arr,helper,start,mid,end);
		}
	}
	void merge(int[] arr, int[] helper, int start, 
			int mid, int end) { 
		for(int i = start; i<=end; i++) {
			helper[i] = arr[i];
		}
		
		int helperleft = start;
		int helperright = mid+1;
		int current = start;
		while(helperleft<=mid && helperright<=end) {
			if(helper[helperleft] <= helper[helperright]) {
				arr[current] = helper[helperleft];
				helperleft++;
			}else {
				arr[current] = helper[helperright];
				helperright++;
			}
			current++;
		}
		int remaining = mid-helperleft;
		for(int i =0; i<=remaining; i++) {
			arr[current+i] = helper[helperleft+i];
		}
		
	}
}
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {10, 9, 17, 23, 1, 55};
		Solution st = new Solution();
		st.mergeSort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}

}

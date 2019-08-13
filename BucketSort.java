
// Uses hashing and makes assumptions about the data
// Hashing the values we are sorting
// How it works: 
// a) Distribute items based on their hashed values (Scattering). The hashing function must produce a bucket with  X-1 < X < X+1
// b) sort items in the bucket
// c) merge the buckets (gathering phase)
// It's a generalization of counting sort

package datastractures.bucketsort;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class BucketSort {

	private static int [] myArray = {54,46,83,66,41,95,92,43};
	private List<Integer> [] bucket;


	public BucketSort() {
	 this.bucket = new List[10];
	}
	

	public static void main(String [] args) {
		BucketSort bs = new BucketSort();
		bs.bucketSort();

		for(int k: myArray) {
		System.out.println(k);
		}

	}


	private int hashFunction(int num) {
		return num / (int) 10;
	}


	private void bucketSort() {

		for(int i= 0; i < this.bucket.length; i ++) {
			this.bucket[i] = new ArrayList<Integer>();
		}

		for(int k = 0; k < this.myArray.length; k++) {

			this.bucket[hashFunction(this.myArray[k])].add(this.myArray[k]);
		}

		for(List myBucket: bucket) {

			Collections.sort(myBucket);
		}

		int j =0;

		for(int z = 0; z < bucket.length ; z++) {

			for(int value : bucket[z]) {
				System.out.print("z: " + z + " value: " + value + " ");
				myArray[j++] = value;
			}
			
		}

	}
}
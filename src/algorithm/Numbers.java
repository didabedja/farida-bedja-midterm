package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;


public class Numbers {
	public static class Sort{
		private long startTime,stopTime;
		public long executionTime;
		//--------------------
		public void selectionSort(int num[]){
			startTime = System.nanoTime();
			int N = num.length;
			for (int i = 0; i < N-1; i++) {
				int min_idx = i;
				for (int j = i+1; j < N; j++){
					if (num[j] < num[min_idx])
						min_idx = j;
				}
				int temp = num[min_idx];
				num[min_idx] = num[i];
				num[i] = temp;
			}
			stopTime = System.nanoTime();
			executionTime=stopTime-startTime;
		}
		//---------------------
		public void insertionSort(int num[]){
			startTime = System.nanoTime();
			int n = num.length;
			for (int i = 1; i < n; ++i) {
				int k = num[i];
				int j = i - 1;

				while (j >= 0 && num[j] > k) {
					num[j + 1] = num[j];
					j = j - 1;
				}
				num[j + 1] = k;
			}
			stopTime = System.nanoTime();
			executionTime=stopTime-startTime;
		}
		//------------------------
		public void bubbleSort(int num[]){
			startTime = System.nanoTime();
			int N = num.length;
			for (int i = 0; i < N-1; i++)
				for (int j = 0; j < N-i-1; j++)
					if (num[j] > num[j+1])
					{
						int temp = num[j];
						num[j] = num[j+1];
						num[j+1] = temp;
					}
			stopTime = System.nanoTime();
			executionTime=stopTime-startTime;
		}
	}

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//By following above, Continue for rest of the Sorting Algorithm....









		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize(int[] arr, int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}

package algorithm;

public class Sort {
    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for(int j=1;j<array.length-1;j++){
            int curr= j;
            int i = 0;
            j = i;
            double[] a = new double[0];
            while(j>0 && curr<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=curr;
        }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        // length of list
        int n = list.length;
        // defining variable temp to store required value
        int temp = 0;
        // Bubble sort algo
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                // if value at j-1 greater than at j
                // swap values
                if(list[j-1] > list[j]){
                    //swap values
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }



        return list;
    }


    public int[] mergeSort(int [] array){
        int [] list = array;
        //implement here
        if(list == null)
        {
            return list;
        }
        if(list.length > 1)
        {
            // mid of list
            int mid = list.length / 2;

            // Split left part
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = list[i];
            }

            // Split right part
            int[] right = new int[list.length - mid];
            for(int i = mid; i < list.length; i++)
            {
                right[i - mid] = list[i];
            }
            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays
            while(i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                {
                    list[k] = left[i];
                    i++;
                }
                else
                {
                    list[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length)
            {
                list[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length)
            {
                list[k] = right[j];
                j++;
                k++;
            }
        }

        return list;
    }

    private int partition(int[] list, int ints, int h) {
        return h;
    }


    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        // fetching length, lower limit and upper limit of index
        int n = list.length;
        int h = n-1;
        int l = 0;
        // Create an auxiliary stack
        int[] stack = new int[h - l + 1];

        // initialize top of stack
        int top = -1;

        // push initial values of l and h to stack
        stack[++top] = l;
        stack[++top] = h;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            // Pop h and l
            h = stack[top--];
            l = stack[top--];

            // Set pivot element at its correct position
            // in sorted array
            int p = partition(list, l, h);

            // If there are elements on left side of pivot,
            // then push left side to stack
            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot,
            // then push right side to stack
            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }




        return list;
    }

    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        buildMaxHeap(list);
        // fetching length of list
        int n = list.length;
        int temp;

        for (int i = n - 1; i > 0; i--)
        {
            // swap value of first indexed
            // with last indexed
            temp = list[0];
            list[0]=list[i];
            list[i] = temp;


            // maintaining heap property
            // after each swapping
            int j = 0, index;

            do
            {
                index = (2 * j + 1);

                // if left child is smaller than
                // right child point index variable
                // to right child
                if (index < (i - 1) && list[index] < list[index + 1])
                    index++;

                // if parent is smaller than child
                // then swapping parent with child
                // having higher value
                if (index < i && list[j] < list[index]){
                    temp = list[j];
                    list[j]=list[index];
                    list[index] = temp;
                }

                j = index;

            } while (index < i);
        }



        return list;
    }

    private void buildMaxHeap(int[] list) {
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }

    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
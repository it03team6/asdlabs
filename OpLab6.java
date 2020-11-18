public class OpLab6 {
    public static void main(String[] args) {
        double[] testArr = CreateArray();
        double[] firstCopy = testArr.clone();
        double[] secondCopy = testArr.clone();

        //System.out.println("//");
        InsertionSort(testArr);
        //System.out.println("//");
        BubbleSort(firstCopy);
        //System.out.println("//");
        SelectionSort(secondCopy);
        //PrintArr(testArr);
        InsertionSort(CrSortedArr());
        //System.out.println("//");
        BubbleSort(CrSortedArr());
        //System.out.println("//");
        SelectionSort(CrSortedArr());
    }
    private static void PrintArr(double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            double x = array[i];
            System.out.printf("%.2f  ", x);
        }
        System.out.println(" ");
    }

    private static double[] CrSortedArr()
    {
        int n = 10000;
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = i+1;
        }
        return array;
    }

    private static double[] CreateArray()
    {
        int n = 10000;
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = Math.random() * (100 - (-100) + 1) + (-100);
        }
        return array;
    }


    private static double[] BubbleSort(double[] array)
    {
        long m = System.nanoTime();
        for (int j = 0; j < array.length-1; j++)
        {
            for (int i = 0; i < array.length-j-1; i++)
            {
                if (array[i] > array[i+1])
                {
                    double swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                }
            }
        }
        System.out.println("Bubble Time:"+ (double) (System.nanoTime() - m));
        return array;
    }

    private static double[] SelectionSort(double[] array)
    {
        long m = System.nanoTime();
        for (int i = 0; i < array.length-1; i++) {
            int minIdx = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[minIdx] > array[j + 1]) {
                    minIdx = j + 1;
                }
            }
            double swap = array[minIdx];
            array[minIdx] = array[i];
            array[i] = swap;
        }
        System.out.println("Selection Time:"+ (double) (System.nanoTime() - m));
        return array;
    }

    private static double[] InsertionSort(double[] array)
    {
        long m = System.nanoTime();
        for (int i = 1; i < array.length-1; i++)
        {
            for (int j=i-1; j > 0 && array[j-1]>array[j]; j--)
            {
                    double tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
            }
        }
        System.out.println("Insertion Time:"+ (double) (System.nanoTime() - m));

return array;
    }

}

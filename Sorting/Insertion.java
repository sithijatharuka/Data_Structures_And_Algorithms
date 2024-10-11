class Insertion{
    void insertionSort(int[] a){
        for(int i = 1; i < a.length; i++){
            int temp = a[i];
            int j = i-1;

            while(j>= 0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = {10,4,70,50, 40,1};
        Insertion i = new Insertion();
        i.insertionSort(arr);

        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
// search one by one if found return index else return -1

class Linear{
    int[] arr = {10,20,30,40,50,60,70};

    int linearSearch(int target){
        int index = -1;
        for (int i = 0; i<arr.length; i++){
            if (target == arr[i]){
                index = i;
            }
        }  
        return index;
    }

    // Main Method
    public static void main(String[] arsg){
        Linear linearSearch = new Linear();

        int key = linearSearch.linearSearch(80);
        System.out.println(key);
    }
}
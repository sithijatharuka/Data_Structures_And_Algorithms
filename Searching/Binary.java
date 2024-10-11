class Binary{

    int[] arr = {10,20,30,40,50,60,70};

    int binarySearch(int target){
        int low = 0;
        int high = arr.length-1;
        
        while (low <= high){
            int middle = (low + high)/2;
            int middleVlaue = arr[middle];

            if(target == middleVlaue) return middle;            
            if(target < middleVlaue){
                high = middle-1;
            }else{
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main (String[] args){
        Binary bs = new Binary();
        int key = bs.binarySearch(90);
        System.out.println(key);
    }
}
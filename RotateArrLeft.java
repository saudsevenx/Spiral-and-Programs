class RotateArrLeft{
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = 3;        

        rotateArrLeft(n, arr);
    
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    static void rotateArrLeft(int n, int arr[]){
        int sizeOfArr = arr.length - 1;
        for(int i = 0; i < n; i++){
        int firstElem = arr[0];
            for(int j = 0; j < sizeOfArr; j++){
                arr[j] = arr[j + 1]; 
            }
        arr[sizeOfArr] = firstElem; 
        }
    }
}
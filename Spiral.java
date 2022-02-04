public class Spiral {
    public static void main(String[] args) throws Exception {

    //Set n accordingly
        int n = 5;
        
        int count = 1;
        int rowend = n - 1;
        int colend = n - 1;
        int rowstart = 0;
        int colstart = 0;
    
    //2D nxn zero matrix
        int[][] arr = new int[n][n];

    
        while(rowstart<=rowend && colstart <= colend){

            //print first row
            for(int i = colstart; i <= colend; i++){
                arr[rowstart][i] = count;
                count ++ ;
            }
            rowstart ++ ;
            
            //print last coloumn
            for(int i = rowstart; i <= rowend; i++){
                arr[i][colend] = count;
                count ++ ;
            }
            colend -- ;

            //print last row
            for(int i = colend; i >= colstart; i--){
                arr[rowend][i] = count;
                count ++ ;
            }
            rowend -- ;

            //print first coloumn
            for(int i = rowend; i >= rowstart; i--){
                arr[i][colstart] = count;
                count ++ ;
            }
            colstart ++ ;
        }

        //display 2D array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
//                                                 ~Saud Javed
    }
}

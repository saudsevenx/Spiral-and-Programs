public class Spiral {
    public static void main(String[] args)  {

    //Set n accordingly
        int n = 5;
        
        int count = 1;
        int rowEnd = n - 1;
        int colEnd = n - 1;
        int rowStart = 0;
        int colStart = 0;
    
    //2D nxn zero matrix
        int[][] matrix = new int[n][n];

        while(rowStart<=rowEnd && colStart <= colEnd){

            //print first row
            for(int i = colStart; i <= colEnd; i++){
                matrix[rowStart][i] = count;
                count ++ ;
            }
            rowStart ++ ;
            
            //print last coloumn
            for(int i = rowStart; i <= rowEnd; i++){
                matrix[i][colEnd] = count;
                count ++ ;
            }
         colEnd -- ;

            //print last row
            for(int i = colEnd; i >= colStart; i--){
                matrix[rowEnd][i] = count;
                count ++ ;
            }
            rowEnd -- ;

            //print first coloumn
            for(int i = rowEnd; i >= rowStart; i--){
                matrix[i][colStart] = count;
                count ++ ;
            }
            colStart ++ ;
        }

        //display 2D array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
//                                                 ~Saud Javed
    }
}

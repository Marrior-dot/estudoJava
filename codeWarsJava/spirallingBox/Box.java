public class Box{
    int row;
    int col;
    int matrix[][];

    public Box(int thisRow, int thisCol){
        this.row = thisRow;
        this.col = thisCol;
        this.matrix = new int[row][col];
    }

    public int[][] createBox(){

        boolean ratio = (row%2 == 0);

        if(ratio == true){
            int value;
            int halfRow = row/2; 

            for (int i = 0; i < row; i++){
                //Ivalue = i+1;
                for (int j = 0; j < col; j++) {
                    value = j+1;
                    if(i == 0 || i == row-1){
                        matrix[i][j] = 1;
                    }
                    else{
                        if(j < i){
                            matrix[i][j] = value;
                        }
                        else if(j >= col - i){
                            Ivalue --;
                            matrix[i][j] = Ivalue;
                        }
                        else{
                            matrix[i][j] = i + 1;
                        }                            
                    }

                    /*
                  if(j >= i && j > 0 && i > 0){
                    value = i+1;
                    matrix[i][j] = value;
                    System.out.println(matrix[i][j]);
                  }
                  else{
                    matrix[i][j] = j + 1;
                    System.out.println(matrix[i][j]);
                  }
                   */
                }
            }
            /*
            for (int i = row; i < halfRow; i--) {
                for (int j = 0; j < col; j++) {
                   // value = 
                    if(i == row){
                        matrix[i][j] = 1;

                    }
                }
            } */
        }
        else{
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
         
        return matrix;
    }
}


public void setZeroes(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;

    int col0 = 1;

    for (int r = 0 ; r < row ; r++) {
        for (int c = 0 ; c < col ; c++) {
            if (matrix[r][c] == 0) {
                matrix[r][0] = 0;
                if (c == 0) {
                    col0 = 0;
                    else matrix[0][c] = 0;
                }
            }
        }
    }

    for (int r = 1 ; r < row ; r++) 
        for (int c = 1 ; c < col ; c++) 
            if (matrix[r][0] == 0 || matrix[0][c] == 0) matrix[r][c] = 0;

    if (matrix[0][0] == 0) 
        for (int c = 0 ; c < col ; c++) 
           matrix[0][c] = 0;

    if (col0 == 0) 
        for (int r = 0 ; r < row ; r++) 
            matrx[r][0] = 0;
}
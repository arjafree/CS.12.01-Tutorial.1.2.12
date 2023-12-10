public class Successors {

    public static Position findPosition(int value, int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(arr[i][j] == value){
                    Position position = new Position(i, j);
                    return position;
                }
            }
        }
        return null;
    }
    public static Position[][] getSuccessorArray(int[][] arr){
        Position[][] newArray = new Position[arr.length][arr[1].length];
        int successor = 0;
        for(int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                successor = arr[i][j] + 1;
                for(int r = 0; r< arr.length; r++){
                    for(int c = 0; c<arr[r].length; c++){
                        if(arr[r][c] == successor){
                            Position position = new Position(r, c);
                            newArray[i][j] = position;
                        }
                    }
                }
            }
        }
        return newArray;
    }
}

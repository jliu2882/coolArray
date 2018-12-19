package jliu2882;

public class Successors {

    public static Position findPosition(int num, int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                if(arr[i][j]==num){
                    return new Position(i,j);
                }
            }
        }
        return null;
    }
    public static Position[][] getSuccessorArray(int[][] intArr){
        Position[][] newArr = new Position[intArr.length][intArr[0].length];
        for(int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr[i].length;j++){
                newArr[i][j] = findPosition(intArr[i][j]+1,intArr);
            }
        }
        return newArr;
    }
}

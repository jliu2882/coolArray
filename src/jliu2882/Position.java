package jliu2882;

public class Position {
    private int r;
    private int c;

    public Position(int r, int c){
        this.r = r;
        this.c = c;
    }

    public Position findPosition(int search, int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                if(arr[i][j]==search){
                    return new Position(i,j);
                }
            }
        }
        return null;
    }
}

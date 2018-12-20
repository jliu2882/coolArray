package jliu2882;

public class Main {

    public static void main(String[] args) {
        int[][] coolArray = {
                {15,5,9,10},
                {12,16,11,6},
                {14,8,13,7}
        };
        Position[][] successors = Successors.getSuccessorArray(coolArray);

        for(int i = 0; i < successors.length; i++){
            for(int j = 0; j < successors[i].length;j++){
                System.out.print(successors[i][j]);
            }
            System.out.println("");
        }
    }
}

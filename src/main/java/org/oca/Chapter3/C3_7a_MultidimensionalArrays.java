package org.oca.Chapter3;

public class C3_7a_MultidimensionalArrays {
    public static void main(String[] args) {
        //declaring
        int[][] ex1; //2d array
        int ex2 [][];//2d array
        int[] ex3[];//2d array
        int[] ex4, ex5 [][];//ex4-2d, ex5-3d

        //declare with size
        String [][] rectangle = new String[3][2];
        //set a value
        rectangle[0][0] = "set";

        //dif size
        int [][]difSize = {{1,4},{3},{9,8,7}};

        //in order to create asymetric arrays we can declare only the first dimensions length
        int [][] test1 = new int [4][];
        test1[0] = new int[5];
        test1[1] = new int[3];


        /**Using multidimensional Arrays*/
        int[][] twoD = new int [3][2];
        for(int i=0;i<twoD.length;i++){
            for(int j=0; j<twoD[i].length;j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nUsing for each:");
        /**Using multidimensional Arrays foreach */
        for(int[] inner : twoD){
            for(int num:inner){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}

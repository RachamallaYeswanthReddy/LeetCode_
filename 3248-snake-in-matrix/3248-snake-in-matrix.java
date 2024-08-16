class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][]arr = new int[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                arr[row][col]=(row*n)+col;
            }
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
        int i=0,j=0;
        for(int x=0;x<commands.size();x++){
            // System.out.println(commands.get(x));
            if(commands.get(x).equals("RIGHT")){
                j++;
            }
            else if(commands.get(x).equals("UP")){
                i--;
            }
            else if(commands.get(x).equals("DOWN")){
                i++;
            }else if(commands.get(x).equals("LEFT")){
                j--;
            }
        }
        System.out.println(i+" "+j);
        return arr[i][j];
    }
}
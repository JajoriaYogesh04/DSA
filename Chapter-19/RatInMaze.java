public class RatInMaze {
    public static boolean isSafe(int maze[][], int row, int col){
        int n= maze.length;
        int m= maze[0].length;
        if(row>=0 && col>=0 && row<n && col<m && maze[row][col]==1){
            return true;
        }
        return false;
    }
    public static boolean ratInMaze(int maze[][], int row, int col, int solution[][]){
        int n= maze.length;
        int m= maze[0].length;
        //base case
        if(row==n-1 && col==m-1 && maze[row][col]==1){
            solution[row][col]=1;
            return true;
        }
        //recursion
        if(isSafe(maze, row, col)){
            solution[row][col]= 1;
            if(ratInMaze(maze, row+1, col, solution)){
                return true;
            }
            if(ratInMaze(maze, row, col+1, solution)){
                return true;
            }
            if(ratInMaze(maze, row-1, col, solution)){
                return true;
            }
            if(ratInMaze(maze, row, col-1, solution)){
                return true;
            }
            solution[row][col]=0;
        }
        return false;
    }
    public static void printMaze(int maze[][]){
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                System.out.print(" "+maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int maze[][]= {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };
        int n= maze.length;
        int m= maze[0].length;
        int solution[][]= new int[n][m];
        printMaze(maze);
        if(ratInMaze(maze, 0, 0, solution)){
            System.out.println("PATH:-");
            printMaze(solution);
        }
        else{
            System.out.println("NO PATH");
        }
    }
}
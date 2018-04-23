package org.indranil.learning.practice;
public class Chess_Tournament {
    static String chess_board[][] = new String[8][8];
    static int coordinates_x;
    static int coordinates_y;
    static void display()
    {
        for(String chess_x[]:chess_board)
        {
            for(String chess_y:chess_x)
            {
                System.out.print(chess_y);
            }
            System.out.println();
        }
    }
    static void display_possibility(int x, int y)
    {
        System.out.print("The possible steps of the horse from("+x+","+y+")are:");
        combination_calculator(x,y,1,2);
        combination_calculator(x,y,1,-2);
        combination_calculator(x,y,-1,2);
        combination_calculator(x,y,-1,-2);
        combination_calculator(x,y,2,1);
        combination_calculator(x,y,2,-1);
        combination_calculator(x,y,-2,1);
        combination_calculator(x,y,-2,-1);  
        System.out.println();
    }
    static void combination_calculator(int x, int y,int combination1, int combination2)
    {
        x=x+combination1;
        y=y+combination2;
        if(x>0 && y>0 && x<9 && y<9)
        {
        System.out.print("("+x+","+y+")");
        }
    }
    static void find_path_to_Queen(int qx, int qy)
    {
        //for()
    }
    public static void main(String[] args)
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                coordinates_x=8-i;
                coordinates_y=j+1;
                display_possibility(coordinates_x,coordinates_y);
                chess_board[i][j]="("+coordinates_x+","+coordinates_y+")";
            }
        }
        find_path_to_Queen(3,4);
        //display();
        
    }
    
}

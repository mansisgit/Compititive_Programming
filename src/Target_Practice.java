import java.util.Scanner;

public class Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            char[][] arr = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,3,3,3,3,3,2,1},//map of points
            {1,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1}
            };
            int count =0;

            String guess = sc.next();

            for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(guess.toCharArray()[j]=='X') count+=arr[i][j];
            }

            }
            int score =0;
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(arr[i][j]=='X'){
                        
                    }
                }
            }

        }
    }
}

import java.util.Scanner;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int no_of_teams = sc.nextInt();
            int[] arr = new int[no_of_teams-1];
            int forgotten_efficiency = 0;
            for(int i=0;i<no_of_teams-1;i++){
                arr[i] = sc.nextInt();
                forgotten_efficiency+=arr[i];
            }
            //input taken
            forgotten_efficiency = forgotten_efficiency*(-1);
            System.out.println(forgotten_efficiency);



        }
    }
}

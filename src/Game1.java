import java.util.Scanner;
class Umpire{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        int userNum= user.inputNum();
        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println("Guess the number player1");
        int p1_num = p1.guessNumber();
        System.out.println("Guess the number player2");
        int p2_num= p2.guessNumber();
        System.out.println("Tick -Tick -Tok Umpire Validated the results!!!");
        System.out.println();
        if (p1_num == userNum && p2_num!=userNum){
            System.out.println("Player 1 is the Winner!!");
        }
        else if(p2_num == userNum && p1_num!=userNum){
            System.out.println("Player 2 is the Winner!!");
        }
        else if(p1_num!= userNum && p2_num!= userNum) {
            System.out.println("Both Player 1 and 2 are Loser!!! Wanna Play Again to be Winner?");
        }
        else
        {
            System.out.println("Both Player 1 and 2 are the Winners!!! Hurray!!!");
        }

    }
}
class Player{
    public int guessNumber(){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        return x;
    }
}
class User
{
    public int inputNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("User please enter first number!");
        int x = sc.nextInt();
        System.out.println("User please enter second number!");
        int y =sc.nextInt();
        System.out.println(" User Specify the range between "+x+" and "+y);

        int k =sc.nextInt();
        if(x<= k && y>=k)
            System.out.println(" Perfect!! Number is is in given range");
        else {
            System.out.println("Uh Oh!! No is not in range!Please Specify right range of number to Play again!!:) ");
            System.exit(0);
        }
        return k;
    }
}


import java.util.Scanner;
public class Game {
    private String hidden;
    private String guess;
    // private String hint;

    public static void main(String[]args){
        Game game = new Game();
        game.run();
    }
    public void run(){

        Scanner kb = new Scanner (System.in);
        System.out.println("Enter a hidden word");
        hidden = kb.next();
        hidden=hidden.toLowerCase();
        System.out.println("loading");
        for (int i = 0; i<9; i++)
        System.out.println("...");

        char [] hint = new char[hidden.length()];
        boolean runGame = true;
        System.out.println("Welcome to Wordle!");
        System.out.println("A word with "+hidden.length()+" letters has been generated! Start your first guess");

        while (runGame == true){

            guess = kb.next();
            guess=guess.toLowerCase();

            if (guess.equals(hidden)){
                System.out.print("Your guess is correct!");
                runGame = false;
            }
            else{
                for (int r = 0; r <hidden.length(); r++){
                    char ch = guess.charAt(r);

                    if (hidden.indexOf(ch)==-1) {
                        hint[r]='*';
                    }
                    else if (hidden.indexOf(ch)!=-1) {
                        if (guess.charAt(r)==hidden.charAt(r)){
                            hint[r]= guess.charAt(r);}
                        else{
                            hint[r]='+';}
                    }
                    System.out.print(hint[r]);
                }
                System.out.println();
                System.out.println("Guess again!");

            }

        }

    }}
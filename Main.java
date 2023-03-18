//Author: Erfan Abuei
//Date: 24 February 2023 - 18 March 2023
import javax.swing.plaf.synth.SynthMenuItemUI;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    //color of texts code:  =>  reference: www.stackoverflow.com
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE
    //color of background code:
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {

        mainMenuAppearance();
    }
    //Method for clear console in both OS (linux & Windows)
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
    //Show main menu:
    public static void mainMenuAppearance(){
        Scanner input = new Scanner(System.in);
        clearConsole();
        //!*********************************************************************************************
        System.out.print("\n" +
                "\n" + ANSI_RED +
                "████████╗██╗ ██████╗    ████████╗ █████╗  ██████╗    ████████╗ ██████╗ ███████╗\n" + ANSI_GREEN +
                "╚══██╔══╝██║██╔════╝    ╚══██╔══╝██╔══██╗██╔════╝    ╚══██╔══╝██╔═══██╗██╔════╝\n" + ANSI_YELLOW +
                "   ██║   ██║██║            ██║   ███████║██║            ██║   ██║   ██║█████╗  \n" + ANSI_BLUE +
                "   ██║   ██║██║            ██║   ██╔══██║██║            ██║   ██║   ██║██╔══╝  \n" + ANSI_PURPLE +
                "   ██║   ██║╚██████╗       ██║   ██║  ██║╚██████╗       ██║   ╚██████╔╝███████╗\n" + ANSI_CYAN +
                "   ╚═╝   ╚═╝ ╚═════╝       ╚═╝   ╚═╝  ╚═╝ ╚═════╝       ╚═╝    ╚═════╝ ╚══════╝\n" + RED_BOLD +
                "                                  Welcome!                                     \n" +
                "                                                                               \n" +
                "                         Choose your playing mode:                             \n" +
                "                                                                               \n" +
                "                             1-Single player                                   \n" +
                "                             2-Two players                                     \n" +
                "                             By Erfan Abuei                                    \n" +
                "                                   >>" +
                "");
        int command = input.nextInt();
        while (command!=1 && command!=2) {
            System.out.println("\t\t\t\t\t\t\tPlease enter a valid number: ");
            System.out.print("\t\t\t\t\t\t\t>>");
            command = input.nextInt();
        }
        if (command == 1)
            gameSPBack();
        else
            gameTPBack();

    }
    //Single Player mode method: (game S P Back)
    public static void gameSPBack() {
        Scanner input = new Scanner(System.in);
        String[] situation= new String[16];
        // Generate random numbers for block "#" cells:
        int block1 = (int)((Math.random()*10)%16);
        int block2 = (int)((Math.random()*10)%16);
        while (block1==block2) {
            block2 = (int)((Math.random()*10)%16);
        }
        int block3 = (int)((Math.random()*10)%16);
        while (block2==block3) {
            block3 = (int)((Math.random()*10)%16);
        }
        situation[block1]="#";
        situation[block2]="#";
        situation[block3]="#";
        for (int i = 0; i < 16; i++) {
            if(i!=block1 && i!=block2 && i!=block3)
                situation[i]=(String.valueOf(i+1));

        }
        clearConsole();
        System.out.println("\t\t\t\t\t\t\tWhich one do you choose? ");
        System.out.println("\t\t\t\t\t\t\t          1-X");
        System.out.println("\t\t\t\t\t\t\t          2-O");
        System.out.print("\t\t\t\t\t\t\t          >>");
        String xo;
        if (input.nextInt()==1)
            xo ="X";
        else
            xo = "O";
        int index,n=0;
        //****************************************************************************************
        while (true)
        {
            gameFront(situation);
            //------------------------------user's turn: ----------------------------------------
            System.out.println("\t\t\t\t\t\t\tEnter the cell number you want to put it in: ");
            System.out.print("\t\t\t\t\t\t\t>> ");
            index = input.nextInt()-1;
            while(situation[index].equals("#") || situation[index].equals("O") || situation[index].equals("X")){
                if (situation[index].equals("#")){
                System.out.println("\t\t\t\t\t\t\tYou are NOT allowed to make changes to locked cells");
                System.out.println("\t\t\t\t\t\t\tPlease try again:");
                System.out.print("\t\t\t\t\t\t\t>>");
                index = input.nextInt()-1;
                }
                if (situation[index].equals("O") || situation[index].equals("X")){
                    System.out.println("\t\t\t\t\t\t\tYou are NOT allowed to make changes to used cells");
                    System.out.println("\t\t\t\t\t\t\tPlease try again:");
                    System.out.print("\t\t\t\t\t\t\t>>");
                    index = input.nextInt()-1;
                }

            }
            situation[index]=xo;
            n++;

            //-------------------------check if someone win or not----------------------
            if (whoWin(situation)==wols.X) {
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tplayer X wins!");
                if (xo.equals("X"))
                    System.out.println("\t\t\t\t\t\tCongratulations! you win!");
                else
                    System.out.println("\t\t\t\t\t\tOops! You lost!");
                break;
            }
            else if (whoWin(situation)==wols.O){
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tplayer O wins!");
                if (xo.equals("O"))
                    System.out.println("\t\t\t\t\t\tCongratulations! you win!");
                else
                    System.out.println("\t\t\t\t\t\tOops! You lost!");
                break;
            }
            else if (n==13){
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tNo one wins!");
                break;
            }
            //----------------------------computer's turn: ---------------------------
            int randomCell = (int)((Math.random()*10)%16);
            while (situation[randomCell].equals("#") || situation[randomCell].equals("O") || situation[randomCell].equals("X")) {
                randomCell = (int)((Math.random()*10)%16);
            }
            if (xo.equals("X")) {
                situation[randomCell] = "O";
                n++;
            }
            else if (xo.equals("O")) {
                situation[randomCell] = "X";
                n++;
            }
            //-------------------------check if someone win or not----------------------
            if (whoWin(situation)==wols.X) {
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tplayer X wins!");
                if (xo.equals("X"))
                    System.out.println("\t\t\t\t\t\tCongratulations! you win!");
                else
                    System.out.println("\t\t\t\t\t\tOops! You lost!");
                break;
            }
            else if (whoWin(situation)==wols.O){
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tplayer O wins!");
                if (xo.equals("O"))
                    System.out.println("\t\t\t\t\t\tCongratulations! you win!");
                else
                    System.out.println("\t\t\t\t\t\tOops! You lost!");
                break;
            }
            else if (n==13){
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tNo one wins!");
                break;
            }


        }
        //***************************************************************************************
        System.out.println("\t\t\t\t\t\tEnter R to play again or Enter M to back to main menu: ");
        System.out.print("\t\t\t\t\t\t>> ");
        String command = input.next();
        while (!(command.equals("R") || command.equals("M") || command.equals("r") || command.equals("m"))) {
            System.out.println("\t\t\t\t\t\tEnter R to play again or Enter M to back to main menu: ");
            System.out.print("\t\t\t\t\t\t>> ");
            command = input.next();
        }
        if (command.equals("R") || command.equals("r")) {
            gameSPBack();
        }
        if (command.equals("M") || command.equals("m")) {
            mainMenuAppearance();
        }
    }
    //Two Player mode method: (game T P Back)
    public static void gameTPBack(){
        Scanner input = new Scanner(System.in);
        String[] situation= new String[16];
        // Generate random numbers for block "#" cells:
        int block1 = (int)((Math.random()*10)%16);
        int block2 = (int)((Math.random()*10)%16);
        while (block1==block2) {
            block2 = (int)((Math.random()*10)%16);
        }
        int block3 = (int)((Math.random()*10)%16);
        while (block2==block3 || block1==block3) {
            block3 = (int)((Math.random()*10)%16);
        }
        situation[block1]="#";
        situation[block2]="#";
        situation[block3]="#";
        for (int i = 0; i < 16; i++) {
            if(i!=block1 && i!=block2 && i!=block3)
                situation[i]=(String.valueOf(i+1));

        }
        clearConsole();
        System.out.println("\t\t\t\t\t\t\tEnter player 1 name:");
        System.out.print("\t\t\t\t\t\t\t>>");
        String player1Name= input.nextLine();
        System.out.println("\t\t\t\t\t\t\tEnter player 2 name:");
        System.out.print("\t\t\t\t\t\t\t>>");
        String player2Name= input.nextLine();
        System.out.println("\t\t\t\t\t\t\tWhich one "+player1Name+" choose? ");
        System.out.println("\t\t\t\t\t\t\t          1-X");
        System.out.println("\t\t\t\t\t\t\t          2-O");
        System.out.print("\t\t\t\t\t\t\t          >>");
        String xo,xo2;
        if (input.nextInt()==1) {
            xo = "X";
            xo2 = "O";
        }
        else {
            xo = "O";
            xo2 = "X";
        }
        int index;
        int n=0;
        //**********************************************************************************
        while (true)
        {
            //-------------------------------player 1's turn: ----------------------------------
            gameFront(situation);
            System.out.println("\t\t\t\t\t\t\t"+player1Name+"'s turn...");
            System.out.println("\t\t\t\t\t\t\tEnter the cell number you want to put it in: ");
            System.out.print("\t\t\t\t\t\t\t>> ");
            index = input.nextInt()-1;
            while(situation[index].equals("#") || situation[index].equals("O") || situation[index].equals("X")){
                if (situation[index].equals("#")){
                    System.out.println("\t\t\t\t\t\t\tYou are NOT allowed to make changes to locked cells");
                    System.out.println("\t\t\t\t\t\t\tPlease try again:");
                    System.out.print("\t\t\t\t\t\t\t>>");
                    index = input.nextInt()-1;
                }
                if (situation[index].equals("O") || situation[index].equals("X")){
                    System.out.println("\t\t\t\t\t\t\tYou are NOT allowed to make changes to used cells");
                    System.out.println("\t\t\t\t\t\t\tPlease try again:");
                    System.out.print("\t\t\t\t\t\t\t>>");
                    index = input.nextInt()-1;
                }

            }
            situation[index]=xo;
            n++;
            //-------------------------check if someone win or not----------------------
            if (whoWin(situation)==wols.X) {
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tplayer X wins!");
                if (xo.equals("X"))
                    System.out.println("\t\t\t\t\t\t"+player1Name+" win!");
                else
                    System.out.println("\t\t\t\t\t\t"+player2Name+" win!");
                break;
            }
            else if (whoWin(situation)==wols.O){
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tplayer O wins!");
                if (xo.equals("O"))
                    System.out.println("\t\t\t\t\t\t"+player1Name+" win!");
                else
                    System.out.println("\t\t\t\t\t\t"+player2Name+" win!");
                break;
            }
            else if (n==13){
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tNo one wins!");
                break;
            }
            //--------------------------player 2's turn: -------------------------------------------
            gameFront(situation);
            System.out.println("\t\t\t\t\t\t\t"+player2Name+"'s turn...");
            System.out.println("\t\t\t\t\t\t\tEnter the cell number you want to put it in: ");
            System.out.print("\t\t\t\t\t\t\t>> ");
            index = input.nextInt()-1;
            while(situation[index].equals("#") || situation[index].equals("O") || situation[index].equals("X")){
                if (situation[index].equals("#")){
                    System.out.println("\t\t\t\t\t\t\tYou are NOT allowed to make changes to locked cells");
                    System.out.println("\t\t\t\t\t\t\tPlease try again:");
                    System.out.print("\t\t\t\t\t\t\t>>");
                    index = input.nextInt()-1;
                }
                if (situation[index].equals("O") || situation[index].equals("X")){
                    System.out.println("\t\t\t\t\t\t\tYou are NOT allowed to make changes to used cells");
                    System.out.println("\t\t\t\t\t\t\tPlease try again:");
                    System.out.print("\t\t\t\t\t\t\t>>");
                    index = input.nextInt()-1;
                }

            }
            situation[index]=xo2;
            n++;
            //-------------------------check if someone win or not----------------------
            if (whoWin(situation)==wols.X) {
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tplayer X wins!");
                if (xo.equals("X"))
                    System.out.println("\t\t\t\t\t\t"+player1Name+" win!");
                else
                    System.out.println("\t\t\t\t\t\t"+player2Name+" win!");
                break;
            }
            else if (whoWin(situation)==wols.O){
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tplayer O wins!");
                if (xo.equals("O"))
                    System.out.println("\t\t\t\t\t\t"+player1Name+" win!");
                else
                    System.out.println("\t\t\t\t\t\t"+player2Name+" win!");
                break;
            }
            else if (n==13){
                gameFront(situation);
                System.out.println("\t\t\t\t\t\tNo one wins!");
                break;
            }


        }
        //***********************************************************************
        System.out.println("\t\t\t\t\t\tEnter R to play again or Enter M to back to main menu: ");
        System.out.print("\t\t\t\t\t\t>> ");
        String command = input.next();
        while (!(command.equals("R") || command.equals("M") || command.equals("r") || command.equals("m"))) {
            System.out.println("\t\t\t\t\t\tEnter R to play again or Enter M to back to main menu: ");
            System.out.println("\t\t\t\t\t\t>> ");
            command = input.next();
        }
        if (command.equals("R") || command.equals("r")) {
            gameTPBack();
        }
        if (command.equals("M") || command.equals("m")) {
            mainMenuAppearance();
        }
    }
    //Print the game's table:
    public static void gameFront(String[] situation ){
        clearConsole();
        System.out.println("\t\t\t\t\t\t╒═══════╤═══════╤═══════╤═══════╕");
        System.out.printf("\t\t\t\t\t\t|\t%s\t|\t%s\t|\t%s\t|\t%s\t|%n",situation[0],situation[1],situation[2],situation[3]);
        System.out.println("\t\t\t\t\t\t├───────┼───────┼───────┼───────┤");
        System.out.printf("\t\t\t\t\t\t|\t%s\t|\t%s\t|\t%s\t|\t%s\t|%n",situation[4],situation[5],situation[6],situation[7]);
        System.out.println("\t\t\t\t\t\t├───────┼───────┼───────┼───────┤");
        System.out.printf("\t\t\t\t\t\t|\t%s\t|\t%s\t|\t%s\t|\t%s\t|%n",situation[8],situation[9],situation[10],situation[11]);
        System.out.println("\t\t\t\t\t\t├───────┼───────┼───────┼───────┤");
        System.out.printf("\t\t\t\t\t\t|\t%s\t|\t%s\t|\t%s\t|\t%s\t|%n",situation[12],situation[13],situation[14],situation[15]);
        System.out.println("\t\t\t\t\t\t╘═══════╧═══════╧═══════╧═══════╛");

    }
    //This method checks if the gamers win or lose or none of them
    //using the enum: wols => Win or Lose Situation
    //If you have any questions about how this method works and how to recognize wins and losses,
    //please contact me on Telegram:
    //https://t.me/Erfan_AZB
    public static wols whoWin(String[] situation){
        wols wolsVar = wols.NONE; // win or lose situation
        for (int i = 0; i < 16; i++) {
            //-----------------------1- Vertical Win:--------------------------
            if (i<=7 && situation[i].equals(situation[i+4]) && situation[i+4].equals(situation[i+8])){
                if (situation[i].equals("O"))
                    return wolsVar = wols.O;
                else if (situation[i].equals("X"))
                    return wolsVar = wols.X;
            }
            //----------------------2- Horizontal Win:--------------------------
            if ((i%4==0 || i%4==1) && situation[i].equals(situation[i+1]) && situation[i+1].equals(situation[i+2])) {
                if (situation[i].equals("O"))
                    return wolsVar =wols.O;
                else if (situation[i].equals("X"))
                    return wolsVar =wols.X;
            }
            //---------------------3- Diagonal Win:------------------------------
            //********** left **************
            if (i<=7 && (i%4==0 || i%4==1) && situation[i].equals(situation[i+5]) && situation[i+5].equals(situation[i+10])){
                if (situation[i].equals("O"))
                    return wolsVar =wols.O;
                else if (situation[i].equals("X"))
                    return wolsVar =wols.X;
            }
            //*********** right *************
            if (i<=7 && (i%4==2 || i%4==3) && situation[i].equals(situation[i+3]) && situation[i+3].equals(situation[i+6])){
                if (situation[i].equals("O"))
                    return wolsVar =wols.O;
                else if (situation[i].equals("X"))
                    return wolsVar =wols.X;
            }
        }
        return wolsVar;
    }
}
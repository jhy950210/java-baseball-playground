package baseball;

import java.util.Scanner;

public class Main {
    private static Balls balls;
    private static Scanner scan = new Scanner(System.in);
    private static int isContinueGame = 1;
    private static String input;

    public static void main(String[] args) {

        balls = new Balls(RandomNumber.createAnswers());

        while(isContinueGame == 1){
            System.out.print("숫자를 입력해 주세요 : ");
            input = scan.nextLine();

            Game game = new Game(balls, input);

            printGameResult(game);

            completeGame(game);
        }


    }

    private static void printGameResult(Game game) {
        String result = "";
        if(game.getBall() != 0){
            result += game.getBall() + "볼 ";
        }
        if(game.getStrike() != 0){
            result += game.getStrike() + "스트라이크";
        }
        System.out.println(result);
    }

    private static void completeGame(Game game) {
        if(game.getStrike() == 3){
            System.out.println("정답입니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            isContinueGame = scan.nextInt();
            // 개행문자 제거하기 위해 추가
            scan.nextLine();

            createNewAnswer();
        }
    }

    private static void createNewAnswer() {
        if(isContinueGame == 1){
            balls = new Balls(RandomNumber.createAnswers());
        }
    }
}

package baseball;

public class Game {
    private int strike = 0;
    private int ball = 0;

    public Game(Balls balls, String input) {
        for (int i = 0; i < 3; i++) {
            int nowBallNo = Integer.parseInt(input.substring(i, i + 1));

            countStrikeOrBall(balls.compare(new Ball(i + 1, nowBallNo)));
        }
    }

    private void countStrikeOrBall(BallType ballType) {
        if(ballType.isStrike()){
            strike++;
        }

        if(ballType.isBall()){
            ball++;
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}

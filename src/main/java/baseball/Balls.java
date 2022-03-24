package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Integer> numbers) {
        this.balls = mapBalls(numbers);
    }

    private List<Ball> mapBalls(List<Integer> numbers) {
        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i+1, numbers.get(i)));
        }
        return balls;
    }

    public BallType compare(Ball ball) {
        /*BallType ballType = null;

        for (Ball answerBall : balls) {
            ballType = answerBall.compare(ball);

            if (!ballType.equals(BallType.NOTHING)){
                return ballType;
            }
        }*/

        return balls.stream()
                .map(answers -> answers.compare(ball))
                .filter(ballType -> ballType != BallType.NOTHING)
                .findFirst()
                .orElse(BallType.NOTHING);

    }
}

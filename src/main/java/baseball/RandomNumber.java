package baseball;

import java.util.*;

public class RandomNumber {

    public static List<Integer> createAnswers() {
        Random random = new Random();
        Set<Integer> tmpBalls = new HashSet<>();

        while(tmpBalls.size() < 3){
            int ballNo = random.nextInt(8) + 1;
            tmpBalls.add(ballNo);
        }

        return new ArrayList<>(tmpBalls);
    }
}

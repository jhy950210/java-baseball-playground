package baseball;

public class Ball{
    private int position;
    private int no;

    public Ball(int position, int no){
        this.position = position;
        this.no = no;
    }

    public BallType compare(Ball ball) {
        if( this.equals(ball) ){
            return BallType.STRIKE;
        }

        if( ball.matchBallNo(this.no) ){
            return BallType.BALL;
        }

        return BallType.NOTHING;
    }

    private boolean matchBallNo(int no){
        return this.no == no;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Ball ball = (Ball) obj;

        return this.position == ball.position &&
                this.no == ball.no;
    }
}

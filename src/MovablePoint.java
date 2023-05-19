public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){

    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed(){
        float[] arrSpeed = new float[2];
        arrSpeed[0] = getxSpeed();
        arrSpeed[1] = getySpeed();
        return arrSpeed;
    }

    public float[] move(){
        float[] result = new float[2];
        result[0] = getX() + getxSpeed();
        result[1] = getY() + getySpeed();
        return result;
    }

    @Override
    public String toString() {
        return "(x = " + getX() + ", y = " + getY() + "), speed = (xs = " + getxSpeed() + ", ys = " + getySpeed() + ")";
    }
}

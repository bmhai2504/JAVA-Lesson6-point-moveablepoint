public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        MovablePoint movablePoint = new MovablePoint(3,4);

        System.out.println(point);
        System.out.println(movablePoint);
    }
    public static void printArr(float[] arr){
        for(float element : arr){
            System.out.printf("%f ", element);
        }
        System.out.printf("\n");
    }
}
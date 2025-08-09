package PracticeSet.atlaslearnings.day25.Task01BridgeMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge Design Pattern - Structural DP!");

        ExcalidrawAPI frameAPI = new DrawingFrame();
        ExcalidrawAPI pictureAPI = new DrawingPicture();

        Shape square1 = new Square(frameAPI, 5);
        Shape square2 = new Square(pictureAPI, 8);

        square1.draw();
        square2.draw();
    }
}
package PracticeSet.atlaslearnings.day25.Task01BridgeMethod;

abstract public class Shape {
    protected ExcalidrawAPI excalidrawAPI;

    protected Shape(ExcalidrawAPI excalidrawAPI) {
        this.excalidrawAPI = excalidrawAPI;
    }
    abstract void draw();
}

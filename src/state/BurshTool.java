package state;

public class BurshTool implements  Tools {
    @Override
    public void mouseUp() {
        System.out.println("mouse up eraser icon");
    }
    @Override
    public void mouseDown() {
        System.out.println("Mouse down eraser icon");
    }
}

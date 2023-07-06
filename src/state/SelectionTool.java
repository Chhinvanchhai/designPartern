package state;

public class SelectionTool implements Tools{
    @Override
    public void mouseUp() {
        System.out.println("mouse up selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Mouse down selecton icon");
    }
}

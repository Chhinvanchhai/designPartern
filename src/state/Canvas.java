package state;

public class Canvas {
    private Tools currentTool;
    public void mouseDown(){
        currentTool.mouseDown();
    }
    public  void  mouseUp() {
        currentTool.mouseUp();
    }
    public Tools getCurrentTool() {
        return currentTool;
    }
    public void setCurrentTool(Tools currentTool) {
        this.currentTool = currentTool;
    }
}

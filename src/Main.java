import factory.Shap;
import factory.ShapFactory;
import memeto.Editor;
import memeto.History;
import state.BurshTool;
import state.Canvas;
import state.SelectionTool;

public class Main {
    public static void main(String[] args) {

        System.out.println("============momento ===========");
        drawUIController(new TextBox());

        System.out.println("============momento ===========");
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());

        System.out.println("============state parten===========");
        var canvas = new Canvas();
        canvas.setCurrentTool(new BurshTool());
        canvas.mouseDown();
        canvas.mouseUp();

        System.out.println("===========Factory===========");
        ShapFactory shapFactory = new ShapFactory();
        Shap draw1 = shapFactory.getShap("circle");
        draw1.draw();

    }

    public  static void drawUIController(UIControl control){
        control.draw();
    }
}
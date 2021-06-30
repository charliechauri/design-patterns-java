package design.patterns.state;

/**
 * In State design pattern this is called Context
 */
public class Canvas {
    private Tool currentTool;

    public String mouseDown() {
        return currentTool.mouseDown();
    }

    public String mouseUp() {
        return currentTool.mouseUp();
    }


    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}

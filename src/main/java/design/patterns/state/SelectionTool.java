package design.patterns.state;

/**
 * In State design pattern this is called ConcreteState
 */
public class SelectionTool implements Tool {
    @Override
    public String mouseDown() {
        return "SelectionTool.mouseDown()!";
    }

    @Override
    public String mouseUp() {
        return "SelectionTool.mouseUp()!";
    }
}

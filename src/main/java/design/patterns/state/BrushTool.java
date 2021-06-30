package design.patterns.state;

/**
 * In State design pattern this is called ConcreteState
 */
public class BrushTool implements Tool {

    @Override
    public String mouseDown() {
        return "BrushTool.mouseDown()!";
    }

    @Override
    public String mouseUp() {
        return "BrushTool.mouseUp()!";
    }
}

package design.patterns.state;

/**
 * In State design pattern this is called ConcreteState
 */
public class EraserTool implements Tool {
    @Override
    public String mouseDown() {
        return "EraserTool.mouseDown()!";
    }

    @Override
    public String mouseUp() {
        return "EraserTool.mouseUp()!";
    }
}

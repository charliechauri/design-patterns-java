package design.patterns.state;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Canvas")
class CanvasTests {
    @Test
    @DisplayName("mouseDown acts based on current tool")
    void onMouseDown () {
        var canvas = new Canvas();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();

        assertEquals("BrushTool.mouseDown()!", canvas.mouseDown());

        canvas.setCurrentTool(new SelectionTool());

        assertEquals("SelectionTool.mouseDown()!", canvas.mouseDown());
    }

    @Test
    @DisplayName("mouseUp acts based on current tool")
    void onMouseUp () {
        var canvas = new Canvas();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();

        assertEquals("BrushTool.mouseUp()!", canvas.mouseUp());

        canvas.setCurrentTool(new SelectionTool());

        assertEquals("SelectionTool.mouseUp()!", canvas.mouseUp());
    }

    @Test
    @DisplayName("returns current tool")
    void getCurrentTool() {
        var canvas = new Canvas();

        canvas.setCurrentTool(new EraserTool());

        assertEquals("EraserTool.mouseDown()!", canvas.getCurrentTool().mouseDown());
        assertEquals("EraserTool.mouseUp()!", canvas.getCurrentTool().mouseUp());
    }
}

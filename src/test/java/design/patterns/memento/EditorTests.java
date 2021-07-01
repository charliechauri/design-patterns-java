package design.patterns.memento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Editor")
public class EditorTests {
    @Test
    @DisplayName("should set editor author and content")
    void setEditorAuthorAndContent () {
        var editor = new Editor();

        editor.setAuthor("Jane Doe");
        editor.setContent("New entry");

        assertEquals("Jane Doe", editor.getAuthor());
        assertEquals("New entry", editor.getContent());
    }

    @Test
    @DisplayName("should create a state from an editor")
    void setEditorState () {
        var editor = new Editor();

        editor.setAuthor("Jane Doe");
        editor.setContent("New entry");

        var editorState = editor.createState();

        assertEquals(editor.getAuthor(), editorState.getAuthor());
        assertEquals(editor.getContent(), editorState.getContent());
    }

    @Test
    @DisplayName("should restore editor with history")
    void restoreEditorFromHistory () {
        var editor = new Editor();
        var history = new History();

        editor.setAuthor("Jane Doe");
        editor.setContent("New entry");

        history.push(editor.createState());

        editor.setAuthor("Pikachu");
        editor.setContent("pikaa!");

        history.push(editor.createState());

        editor.setAuthor("Ash");
        editor.setContent("I'm having a major hat crisis. Could you try to steal Pikachu some other time?");

        history.push(editor.createState());

        editor.restore(history.pop());

        assertEquals(2, history.getSize());
        assertEquals("Ash", editor.getAuthor());
        assertEquals("I'm having a major hat crisis. Could you try to steal Pikachu some other time?", editor.getContent());
    }

}

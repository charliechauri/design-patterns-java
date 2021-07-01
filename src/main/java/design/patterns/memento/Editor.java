package design.patterns.memento;

/**
 * In Memento pattern this is called Originator
 */
public class Editor {
    private String content;
    private String author;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(content, author);
    }

    public void restore(EditorState state) {
        content = state.getContent();
        author = state.getAuthor();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

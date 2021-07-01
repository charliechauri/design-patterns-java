package design.patterns.memento;

/**
 * In Memento pattern this is called Memento
 */
class EditorState {
    private final String content;
    private final String author;

    EditorState(String content, String author) {
        this.content = content;
        this.author = author;
    }

    String getContent() {
        return content;
    }

    String getAuthor() {
        return author;
    }
}

package org.patterns.prototype.prototypeLections;

// new String(autoh)
public class Referat implements Cloneable {

    private String author;
    private String text;

    private Object object;

    Referat(String author, String text, Object object) {
        this.author = new String(author);
        this.text = new String(text);
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public Referat clone() {
        try {
            return (Referat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}

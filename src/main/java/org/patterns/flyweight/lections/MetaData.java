package org.patterns.flyweight.lections;

// take a data from some database
public class MetaData {
    private final String img;
    private final byte[] sound;

    public MetaData(String img, byte[] sound) {
        this.img = img;
        this.sound = sound;
    }
}

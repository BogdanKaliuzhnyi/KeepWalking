package org.javaRoad.Lesson020_Exceptions.task1.enums;

public enum FileType {
    TEXT("text"), IMAGE("image"), VIDEO("video"), AUDIO("audio");
    final String type;

    FileType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}

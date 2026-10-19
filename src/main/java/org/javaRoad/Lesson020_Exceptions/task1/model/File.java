package org.javaRoad.Lesson020_Exceptions.task1.model;

import org.javaRoad.Lesson020_Exceptions.task1.enums.FileType;

public class File {
    private String name;
    private int size;
    private FileType type;

    public File(String name, int size, FileType type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static File[] createTestDataset() {
        return new File[]{
                new File("readme.txt", 175, FileType.TEXT),
                new File("DatabaseList.txt", 84, FileType.TEXT),
                new File("Knife party - Boss mode.mp3", 4785, FileType.AUDIO),
                new File("Nero - Doomsday.mp3", 4785, FileType.AUDIO),
                new File("202615101732.jpeg", 2341, FileType.IMAGE),
                new File("202615101735.jpeg", 2443, FileType.IMAGE),
                new File("202615101738.jpeg", 2212, FileType.IMAGE),
                new File("Nero - Departure.mp4", 256364, FileType.VIDEO),
                new File("Nero - Into The Night.mp4", 198573, FileType.VIDEO),
                new File("Fisher - Stay (live).mp4", 213049, FileType.VIDEO)
        };
    }

    @Override
    public String toString() {
        return name + ", " + size + "KB, " + type.toString();
    }
}

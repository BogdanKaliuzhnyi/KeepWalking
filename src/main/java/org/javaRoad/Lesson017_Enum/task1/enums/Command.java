package org.javaRoad.Lesson017_Enum.task1.enums;

public enum Command {
    HI("Hi", "Hello"),
    BYE("Bye", "Good bye"),
    HOW_ARE_YOU("How are you", "How are you doing");

    private final String answerMessage;
    private final String shortPhrase;

    Command(String shortPhrase, String answerMessage) {
        this.shortPhrase = shortPhrase;
        this.answerMessage = answerMessage;
    }

    public String getAnswerMessage() {
        return answerMessage;
    }

    public static Command findAnswer(String input) {
        for (Command com : values()) {
            if (com.shortPhrase.equalsIgnoreCase(input)) {
                return com;
            }
        }
        return null;
    }
}

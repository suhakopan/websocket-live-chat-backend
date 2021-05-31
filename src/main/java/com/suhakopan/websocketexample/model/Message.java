package com.suhakopan.websocketexample.model;

/**
 * Message
 *
 * @author suhakopan
 * @since 5/31/2021
 */

public class Message {
    private String from;
    private String text;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

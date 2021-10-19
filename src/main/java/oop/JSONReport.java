package oop;

import oop.TextReport;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        String srt = "\"";
        return "{" + System.lineSeparator() + " \"name\" : " + "\"" + name + "\""
                + System.lineSeparator() + " \"body\" : " + "\"" + body + "\"" + System.lineSeparator() + "}";
    }
}

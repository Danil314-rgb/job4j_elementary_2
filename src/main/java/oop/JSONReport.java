package oop;

import oop.TextReport;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        String srt = "\"";
        return "{\n" + " \"name\" : " + "\"" + name + "\"" + System.lineSeparator() + " \"body\" : " + "\"" + body + "\"\n" + "}";
    }
}

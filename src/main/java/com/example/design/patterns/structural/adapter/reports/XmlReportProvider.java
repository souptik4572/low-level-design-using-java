package com.example.design.patterns.structural.adapter.reports;

public class XmlReportProvider {

    private final String root;

    public XmlReportProvider(String root) {
        this.root = root;
    }

    public String getXmlData(String data) {
        StringBuilder xmlData = new StringBuilder();
        if(data == null) {
            return xmlData.toString();
        }
        String[] parts = data.split(";");
        addStartTag(xmlData, root);
        for (String part: parts) {
            if(part == null || !part.contains(":")) {
                continue;
            }
            String[] pair = part.split(":");
            String key = pair[0], value = pair[1];
            addStartTag(xmlData, key);
            xmlData.append(value);
            addEndTag(xmlData, key);
        }
        addEndTag(xmlData, root);
        return xmlData.toString();
    }

    private void addStartTag(StringBuilder builder, String tag) {
        builder.append("<").append(tag).append(">");
    }

    private void addEndTag(StringBuilder builder, String tag) {
        builder.append("</").append(tag).append(">");
    }
}

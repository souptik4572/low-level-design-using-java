package com.example.design.patterns.structural.adapter.reports;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class XmlReportProviderAdapter implements Reports {

    private final XmlReportProvider xmlReportProvider;

    public XmlReportProviderAdapter(XmlReportProvider xmlReportProvider) {
        this.xmlReportProvider = xmlReportProvider;
    }

    @Override
    public String getJsonData(String data) throws Exception {
        String xmlData = xmlReportProvider.getXmlData(data);
        StringBuilder json = new StringBuilder();
        json.append("{\n");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(new InputSource(new StringReader(xmlData)));
            Element root = doc.getDocumentElement();
            NodeList children = root.getChildNodes();

            for (int i = 0; i < children.getLength(); i++) {
                Node node = children.item(i);
                if (node instanceof Element) {
                    String tag = node.getNodeName();
                    String value = node.getTextContent().trim();
                    json.append("  \"").append(tag).append("\": \"").append(value).append("\",\n");
                }
            }

            int lastCommaIndex = json.lastIndexOf(",");
            if (lastCommaIndex != -1) {
                json.deleteCharAt(lastCommaIndex);
            }

        } catch (Exception e) {
            return "{ \"error\": \"Invalid XML format or parsing error.\" }";
        }

        json.append("}");
        return json.toString();
    }
}

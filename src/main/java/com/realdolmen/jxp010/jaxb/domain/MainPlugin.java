package com.realdolmen.jxp010.jaxb.domain;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * Created by heleneshaikh on 08/03/16.
 */
public class MainPlugin {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = factory.newDocumentBuilder();

        Document document = db.parse(new File("./pom.xml")); //current directory

        createPlugin("org.slf4j", "slf4j-parent", "1.7.18", document);

        Element el = (Element) document.getElementsByTagName("build").item(0);
        el.getElementsByTagName("plugins");
        NodeList nodeList = el.getElementsByTagName("plugin");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String groupId = element.getElementsByTagName("groupId").item(0).getTextContent();
            String artifact = element.getElementsByTagName("artifactId").item(0).getTextContent();
            String version = element.getElementsByTagName("version").item(0).getTextContent();
            System.out.println("Group id = " + groupId);
            System.out.println("ArtifactId = " + artifact);
            System.out.println("Version = " + version + " \n");

        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(new DOMSource(document), new StreamResult(new File("./newOutput.xml")));

    }

    private static void createPlugin(String groupId, String artifact, String version, Document document) {
        Element pluginElement = document.createElement("plugin");
        Element groupIdElement = document.createElement("groupId");
        groupIdElement.setTextContent(groupId);
        Element artifactElement = document.createElement("artifactId");
        artifactElement.setTextContent(artifact);
        Element versionElement = document.createElement("version");
        versionElement.setTextContent(version);
        pluginElement.appendChild(groupIdElement);
        pluginElement.appendChild(artifactElement);
        pluginElement.appendChild(versionElement);

    }


}


package homework7.task3;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("src/homework7/task3/test.xml"));
        writer.writeStartDocument();
        writer.writeStartElement("city");
        writer.writeAttribute("size","big");
        writer.writeCharacters("Kyiv");
        writer.writeStartElement("street");
        writer.writeCharacters("Khrechatyk");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();
    }
}

package homework7.task4;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class City {
    String size;
    String street;
    int dom;

    public String getSize() {
        return size;
    }
@XmlAttribute
    public void setSize(String size) {
        this.size = size;
    }

    public String getStreet() {
        return street;
    }
    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    public int getDom() {
        return dom;
    }
    @XmlElement
    public void setDom(int dom) {
        this.dom = dom;
    }
}

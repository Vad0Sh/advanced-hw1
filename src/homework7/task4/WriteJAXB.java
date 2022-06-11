package homework7.task4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class WriteJAXB {
    public static void main(String[] args) throws JAXBException {
    City city = new City();
    city.setSize("big");
    city.setStreet("Khreschatyk");
    city.setDom(15);
        File file = new File("src/homework7/task4/test.xml");
        JAXBContext context = JAXBContext.newInstance(City.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(city, file);
        marshaller.marshal(city, System.out);
    }

}

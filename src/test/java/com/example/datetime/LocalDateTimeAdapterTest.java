
package com.example.datetime;

import org.junit.jupiter.api.Test;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LocalDateTimeAdapterTest {

    @Test
    public void testUnmarshalDateWithoutTime() throws Exception {
        String xml = "<MyModel><myDateTimeField>2023-03-25</myDateTimeField></MyModel>";
        JAXBContext context = JAXBContext.newInstance(MyModel.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        MyModel model = (MyModel) unmarshaller.unmarshal(new StringReader(xml));

        assertNotNull(model);
        assertEquals(25, model.getMyDateTimeField().getDayOfMonth());
        assertEquals(3, model.getMyDateTimeField().getMonthValue());
        assertEquals(2023, model.getMyDateTimeField().getYear());
        assertEquals(0, model.getMyDateTimeField().getHour());
        assertEquals(0, model.getMyDateTimeField().getMinute());
    }

    @Test
    public void testUnmarshalDateWithTime() throws Exception {
        String xml = "<MyModel><myDateTimeField>2023-03-25T15:30:00</myDateTimeField></MyModel>";
        JAXBContext context = JAXBContext.newInstance(MyModel.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        MyModel model = (MyModel) unmarshaller.unmarshal(new StringReader(xml));

        assertNotNull(model);
        assertEquals(25, model.getMyDateTimeField().getDayOfMonth());
        assertEquals(3, model.getMyDateTimeField().getMonthValue());
        assertEquals(2023, model.getMyDateTimeField().getYear());
        assertEquals(15, model.getMyDateTimeField().getHour());
        assertEquals(30, model.getMyDateTimeField().getMinute());
    }
}

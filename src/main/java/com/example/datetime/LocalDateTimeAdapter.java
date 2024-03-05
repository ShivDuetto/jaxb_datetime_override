package com.example.datetime;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class LocalDateTimeAdapter extends XmlAdapter<XMLGregorianCalendar, LocalDateTime> {

    @Override
    public LocalDateTime unmarshal(XMLGregorianCalendar v) throws Exception {
        if (v == null) {
            return null;
        }
        return v.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
    }

    @Override
    public XMLGregorianCalendar marshal(LocalDateTime v) throws Exception {
        if (v == null) {
            return null;
        }
        GregorianCalendar gregorianCalendar = GregorianCalendar.from(v.atZone(ZoneId.systemDefault()));
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
    }
}

package com.example.datetime;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

@XmlRootElement(name = "MyModel")
@XmlAccessorType(XmlAccessType.FIELD)
public class MyModel {
    
    @XmlElement
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime myDateTimeField;

    public LocalDateTime getMyDateTimeField() {
        return myDateTimeField;
    }

    public void setMyDateTimeField(LocalDateTime myDateTimeField) {
        this.myDateTimeField = myDateTimeField;
    }
}

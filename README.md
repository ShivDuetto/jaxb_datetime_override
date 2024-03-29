<div align="left">
This project demonstrates how to override date and time fields in XML using JAXB in a Java Maven project.

- The project uses a custom LocalDateTimeAdapter to convert between XMLGregorianCalendar and LocalDateTime types.
- The `LocalDateTimeAdapter` class extends `XmlAdapter` and provides a way to convert between `XMLGregorianCalendar` and `LocalDateTime` types.
- The `unmarshal` method takes an `XMLGregorianCalendar` object and converts it to a `LocalDateTime` object. If the input is `null`, it returns `null`. Otherwise, it converts the `XMLGregorianCalendar` to a `GregorianCalendar` using the `toGregorianCalendar` method, then to a `ZonedDateTime` using the `toZonedDateTime` method, and finally to a `LocalDateTime` using the `toLocalDateTime` method.
- The `marshal` method takes a `LocalDateTime` object and converts it to an `XMLGregorianCalendar` object. If the input is `null`, it returns `null`. Otherwise, it converts the `LocalDateTime` to a `ZonedDateTime` using the `atZone` method with the system's default time zone, then to a `GregorianCalendar` using the `from` method, and finally to an `XMLGregorianCalendar` using the `newXMLGregorianCalendar` method of a `DatatypeFactory` instance.
- The XML schema for the model is defined in MyModel.xsd.
- Unit tests for the LocalDateTimeAdapter are provided in LocalDateTimeAdapterTest.

To build the project and run the tests, use the following Maven command: mvn clean test
This will compile the Java classes, run the tests, and generate a report in target/surefire-reports.
</div>

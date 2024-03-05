<div align="left">
This project demonstrates how to override date and time fields in XML using JAXB in a Java Maven project.

- The project uses a custom LocalDateTimeAdapter to convert between XMLGregorianCalendar and LocalDateTime types.
- The `LocalDateTimeAdapter` class extends `XmlAdapter` and provides a way to convert between `XMLGregorianCalendar` and `LocalDateTime` types.
- The `unmarshal` method takes an `XMLGregorianCalendar` object and converts it to a `LocalDateTime` object. If the input is `null`, it returns `null`.
- The `marshal` method takes a `LocalDateTime` object and converts it to an `XMLGregorianCalendar` object. If the input is `null`, it returns `null`.
- The XML schema for the model is defined in MyModel.xsd.
- Unit tests for the LocalDateTimeAdapter are provided in LocalDateTimeAdapterTest.

To build the project and run the tests, use the following Maven command: mvn clean test
This will compile the Java classes, run the tests, and generate a report in target/surefire-reports.
</div>

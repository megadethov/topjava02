package ru.javawebinar.topjava.model.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @link https://community.oracle.com/blogs/montanajava/2014/06/16/using-java-8-datetime-classes-jpa
 */
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {
    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime ldt) {
        return Timestamp.valueOf(ldt);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp ts) {
        return ts.toLocalDateTime();
    }
}

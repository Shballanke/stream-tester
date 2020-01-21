package ru.romanov.st.extra.factory;

import lombok.Data;
import ru.romanov.st.service.Value;

import java.util.Date;

@Data
public class DateValue implements Value<Date> {
    private Date value;
}

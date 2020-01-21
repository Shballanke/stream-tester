package ru.romanov.st.extra.factory;

import lombok.Data;
import ru.romanov.st.service.Value;

@Data
public class StringValue implements Value<String>{
    private String value;
}

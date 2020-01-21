package ru.romanov.st.extra.factory;

import ru.romanov.st.service.Value;

public class ValueFactory {
    public Value getObjectWithValue(ValuesTypes type) {
        switch (type) {
            case STRING:
                return new StringValue();
            case LONG:
                return new LongValue();
            case DATE:
                return new DateValue();
            default:
                throw new IllegalArgumentException("Wrong value type: " + type);
        }
    }
}

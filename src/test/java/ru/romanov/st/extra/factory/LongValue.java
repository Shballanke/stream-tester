package ru.romanov.st.extra.factory;

import lombok.Data;
import ru.romanov.st.service.Value;

@Data
public class LongValue implements Value<Long> {
    private static final int MILLION = 1000000;
    private Long value;

    public LongValue() {
        this.value = getRandomLong();
    }

    private long getRandomLong() {
        return (long) Math.random() * MILLION;
    }
}

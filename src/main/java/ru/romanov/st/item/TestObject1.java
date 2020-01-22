package ru.romanov.st.item;

import lombok.Data;

import java.util.Date;

@Data
public class TestObject1 {
    private static final int MILLION = 1000000;
    private static final int DEFAULT_STRING_LENGTH = 32;
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "abcdefghijklmnopqrstuvxyz";


    Long longValue;
    String stringValue;
    Date dateValue;

    public TestObject1() {
        this.longValue = initRandomLong();
        this.stringValue = initRandomString(DEFAULT_STRING_LENGTH);
        this.dateValue = initRandomDate();
    }

    private long initRandomLong() {
        return (long) Math.random() * MILLION;
    }

    private String initRandomString(int stringLength) {
        StringBuilder stringBuilder = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            int index = (int) (ALPHA_NUMERIC_STRING.length() * Math.random());
            stringBuilder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }

        return stringBuilder.toString();

    }

    private Date initRandomDate() {
        return new Date(new Date().getTime() - initRandomLong());
    }
}

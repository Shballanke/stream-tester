package ru.romanov.st.service;

public interface Value<T> {
    T getValue();
    void setValue(T o);

}

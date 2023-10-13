package com.javatokotlin.chapter2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {

    @NotNull
    final String notNullName;
    @Nullable
    final String nullableName;

    public Person(String notNullName, String nullableName) {

        this.notNullName = notNullName;
        this.nullableName = nullableName;
    }

    @NotNull
    public String getNotNullName() {

        return notNullName;
    }

    @Nullable
    public String getNullableName() {

        return nullableName;
    }
}

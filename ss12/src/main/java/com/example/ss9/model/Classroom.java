package com.example.ss9.model;

public class Classroom {
    private int codeClass;
    private String nameClass;

    public Classroom() {
    }

    public Classroom(int codeClass, String nameClass) {
        this.codeClass = codeClass;
        this.nameClass = nameClass;
    }

    public int getCodeClass() {
        return codeClass;
    }

    public void setCodeClass(int codeClass) {
        this.codeClass = codeClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}

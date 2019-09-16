package com.mauriciog.spinner.data;

public class ListaHogar {
    private String name;
    private int categoryID;

    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryID;
    }

    public ListaHogar(String name, int categoryID) {
        this.name = name;
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return name;
    }
}

package by.tovpenets.patterns.adapter;

public class AdapterJavaToDatabase extends JavaApp implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}

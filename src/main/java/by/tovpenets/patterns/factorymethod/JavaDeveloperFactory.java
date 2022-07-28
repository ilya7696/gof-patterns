package by.tovpenets.patterns.factorymethod;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
}

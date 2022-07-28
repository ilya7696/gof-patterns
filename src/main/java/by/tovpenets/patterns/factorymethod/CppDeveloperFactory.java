package by.tovpenets.patterns.factorymethod;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new CppDeveloper();
    }
}

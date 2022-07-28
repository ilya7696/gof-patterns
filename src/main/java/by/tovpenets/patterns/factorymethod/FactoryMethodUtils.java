package by.tovpenets.patterns.factorymethod;

public final class FactoryMethodUtils {

    public static DeveloperFactory createDeveloperByDevType(DeveloperType developerType) {
        if (developerType == DeveloperType.JAVA)
            return new JavaDeveloperFactory();
        else if (developerType == DeveloperType.CPP)
            return new CppDeveloperFactory();
        else throw new IllegalArgumentException("Unsupported developer type " + developerType);
    }

}

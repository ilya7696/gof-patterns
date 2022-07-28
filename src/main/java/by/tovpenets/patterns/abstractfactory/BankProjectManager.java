package by.tovpenets.patterns.abstractfactory;

public class BankProjectManager implements ProjectManager {
    @Override
    public void manage() {
        System.out.println("Bank project manager manages project...");
    }
}

package by.tovpenets.patterns.abstractfactory;

public class BankTeam implements Team {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankProjectManager();
    }
}

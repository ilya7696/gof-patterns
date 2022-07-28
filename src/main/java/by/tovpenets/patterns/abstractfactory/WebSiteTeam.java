package by.tovpenets.patterns.abstractfactory;

public class WebSiteTeam implements Team {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSiteProjectManager();
    }
}

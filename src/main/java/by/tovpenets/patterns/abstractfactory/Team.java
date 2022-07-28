package by.tovpenets.patterns.abstractfactory;

public interface Team {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}

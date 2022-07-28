package by.tovpenets.patterns.abstractfactory;

public class WebSiteProjectManager implements ProjectManager {
    @Override
    public void manage() {
        System.out.println("website project manager manages project...");
    }
}

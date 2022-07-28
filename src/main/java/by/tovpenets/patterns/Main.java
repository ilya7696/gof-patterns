package by.tovpenets.patterns;

import by.tovpenets.patterns.abstractfactory.BankTeam;
import by.tovpenets.patterns.abstractfactory.ProjectManager;
import by.tovpenets.patterns.abstractfactory.Team;
import by.tovpenets.patterns.adapter.AdapterJavaToDatabase;
import by.tovpenets.patterns.adapter.Database;
import by.tovpenets.patterns.builder.Director;
import by.tovpenets.patterns.builder.EnterpriseWebsiteBuilder;
import by.tovpenets.patterns.builder.VisitCardWebsiteBuilder;
import by.tovpenets.patterns.decorator.Developer;
import by.tovpenets.patterns.decorator.JavaDeveloper;
import by.tovpenets.patterns.decorator.JavaTeamLead;
import by.tovpenets.patterns.decorator.SeniorJavaDeveloper;
import by.tovpenets.patterns.facade.BugTracker;
import by.tovpenets.patterns.facade.Job;
import by.tovpenets.patterns.facade.WorkFlow;
import by.tovpenets.patterns.factorymethod.DeveloperFactory;
import by.tovpenets.patterns.factorymethod.DeveloperType;
import by.tovpenets.patterns.singleton.Logger;

import static by.tovpenets.patterns.factorymethod.FactoryMethodUtils.createDeveloperByDevType;

/**
 * 1. Создать проект для реализации паттерна абстрактная фабрика.
 * 2. Создать проект для реализации паттерна фабричный метод.
 * 3. Создать проект для реализации паттерна билдер.
 * 4. Создать проект для реализации паттерна “адаптер”.
 * 5. Создать проект для реализации паттерна “одиночка”.
 * 6. Создать проект для реализации паттерна “фасад”.
 * 7. Создать проект для реализации паттерна “декоратор”.
 *
 * w/o Дополнительное задание
 * 1. Создать проект для реализации паттерна прототип.
 * 2. Создать проект для реализации паттерна прокси.
 * 3. Создать проект для реализации паттерна “стратегия”.
 * 4. Создать проект для реализации паттерна “наблюдатель”.
 * 5. Создать проект для реализации паттерна “цепочка обязанностей”.
 */

public class Main {

    public static void main(String[] args) {
        abstractFactoryTest();
        factoryMethodTest();
        builderTest();
        adapterTest();
        singletonTest();
        facadeTest();
        decoratorTest();
    }

    private static void abstractFactoryTest() {
        // Abstract factory (in terms of teams)
        System.out.println("Customer orders a banking system");
        System.out.println("Builds banking team...");
        System.out.println("Gets 2 dev, 1 tester and 1 PM...");

        Team bankTeam = new BankTeam();
        ProjectManager bankPM = bankTeam.getProjectManager();
        bankPM.manage();
        bankTeam.getDeveloper().develop();
        bankTeam.getDeveloper().develop();
        bankTeam.getTester().test();
        bankPM.manage();

        System.out.println("Customer uses created banking system\n\n");

        ///////////////////////////////////////////////////////

        System.out.println("Customer orders a website");
        System.out.println("Builds website team...");
        System.out.println("Gets 2 dev, 2 tester and 1 PM...");

        Team websiteTeam = new BankTeam();
        ProjectManager websitePM = websiteTeam.getProjectManager();
        websitePM.manage();
        websiteTeam.getDeveloper().develop();
        websiteTeam.getDeveloper().develop();
        websiteTeam.getTester().test();
        websiteTeam.getTester().test();
        websitePM.manage();

        System.out.println("Customer uses created website\n\n");
    }

    private static void factoryMethodTest() {
        // Factory method with Developer factory
        DeveloperFactory developerFactory = createDeveloperByDevType(DeveloperType.JAVA);
        developerFactory.getDeveloper().writeCode();

        System.out.println();

        developerFactory = createDeveloperByDevType(DeveloperType.CPP);
        developerFactory.getDeveloper().writeCode();

        System.out.println();
    }

    private static void builderTest() {
        // Builder for creating websites
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        System.out.println(director.buildWebsite());

        director.setBuilder(new EnterpriseWebsiteBuilder());
        System.out.println(director.buildWebsite() + "\n\n");
    }

    private static void adapterTest() {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.select();
        database.update();
        database.delete();

        System.out.println("\n\n");
    }

    private static void singletonTest() {
        // Singleton for logger
        Logger.getLogger().addLogInfo("First log....");
        Logger.getLogger().addLogInfo("Second log....");
        Logger.getLogger().addLogInfo("Third log....");

        Logger.getLogger().showLogFile();

        System.out.println("\n\n");
    }

    private static void facadeTest() {
        new WorkFlow().solveProblems();

        System.out.println("\n\n");
    }

    public static void decoratorTest() {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }

}
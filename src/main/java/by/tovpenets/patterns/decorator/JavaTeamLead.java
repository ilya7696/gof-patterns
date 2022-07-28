package by.tovpenets.patterns.decorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String makeWeekReport() {
        return "Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeWeekReport();
    }
}

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now())
                .to(LocalDate.of(2024, 4, 17))
                .build();
        System.out.println(STR."Before being processed: \{application}");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(STR."After being processed: \{application}");
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead lead = new ProjectLead(manager);
        return lead;
    }
}
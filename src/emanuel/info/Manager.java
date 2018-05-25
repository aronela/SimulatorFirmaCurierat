package emanuel.info;

public class Manager extends Approver {
    public Manager(StareColet stareColet) {
        super(stareColet);
    }

    @Override
    public void processRequest(String nume) {
        stareColet.add(nume);
        System.out.println("Produsul este perdut, perdut pentru vecii.");
    }
}

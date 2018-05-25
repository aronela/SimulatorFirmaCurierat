package emanuel.info;

public abstract class Approver {
    protected Approver succesor;
    protected StareColet stareColet;

    public Approver(StareColet stareColet) {
        this.stareColet = stareColet;
    }

    public void setSuccesor(Approver succesor) {
        this.succesor = succesor;
    }

    public abstract void processRequest(String nume);
}

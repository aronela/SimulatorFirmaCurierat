package emanuel.info;

public class Dispecer extends Approver {
    public Dispecer(StareColet stareColet) {
        super(stareColet);
    }

    @Override
    public void processRequest(String nume) {
        int nivel = stareColet.cautare(nume);
        if (nivel > 0) {
            System.out.println("Produsul este in tranzit.");
        } else {
            succesor.processRequest(nume);
        }
    }
}

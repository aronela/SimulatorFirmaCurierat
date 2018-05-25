package emanuel.info;

public class AngajatHala extends Approver {
    public AngajatHala(StareColet stareColet) {
        super(stareColet);
    }

    @Override
    public void processRequest(String nume) {
        int nivel = stareColet.cautare(nume);
        if (nivel > 0) {
            System.out.println("Produsul este in depozit pe nivelul: " + nivel);
        } else {
            succesor.processRequest(nume);
        }
    }
}

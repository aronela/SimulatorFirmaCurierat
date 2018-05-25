package emanuel.info;

public class CurierDemo {
    public static StringBuilder compositeBuilder = new StringBuilder();
    private StareColet depozit;
    private StareColet tranzit;
    private StareColet pierdut;
    private Approver dispecer;

    public void start() {
        // Initializare
        depozit = new StareColet();
        tranzit = new StareColet();
        pierdut = new StareColet();

        // Depozit
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Produse in depozit:");
        adaugaProduseInDepozit();
        depozit.listeaza();

        // Tranzit
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Produse in tranzit:");
        adaugaProduseInTranzit();
        tranzit.listeaza();

        // Adauga personal
        creeazaPersonal();

        // Cautare produs
        System.out.println();
        System.out.println("-----------------------------------");
        dispecer.processRequest("Ochelari");


        System.out.println();
        System.out.println("-----------------------------------");
    }

    private void adaugaProduseInDepozit() {
        Colet colet1 = new Colet("colet1");
        Colet colet2 = new Colet("colet2");
        Colet colet3 = new Colet("colet3");

        Produse produs1 = new Produse("laptop");
        Produse produs2 = new Produse("Samsung Galaxy 9");
        Produse produs3 = new Produse("Iphone X");
        Produse produs4 = new Produse("Ipad");
        Produse produs5 = new Produse("LG G6");
        Produse produs6 = new Produse("LG");

        colet1.add(produs1);
        colet1.add(produs2);
        colet1.add(colet2);

        colet2.add(produs3);
        colet2.add(colet3);

        colet3.add(produs4);

        depozit.add(colet1);
        depozit.add(produs5);
        depozit.add(produs6);
    }

    private void adaugaProduseInTranzit() {
        Colet colet1 = new Colet("colet10");
        Produse produs1 = new Produse("Ochelari");

        tranzit.add(colet1);
        tranzit.add(produs1);
    }

    private void creeazaPersonal() {
        Approver ana = new Dispecer(tranzit);
        Approver john = new AngajatHala(depozit);
        Approver maria = new Manager(pierdut);

        ana.setSuccesor(john);
        john.setSuccesor(maria);

        dispecer = ana;
    }
}

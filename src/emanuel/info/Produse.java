package emanuel.info;

public class Produse implements IColet {
    private String nume;

    public Produse(String nume) {
        this.nume = nume;
    }

    @Override
    public void listeaza() {
        System.out.println(CurierDemo.compositeBuilder + nume);
    }

    @Override
    public int cautare(String nume) {
        if(this.nume == nume){
            return 1;
        } else {
            return 0;
        }
    }
}

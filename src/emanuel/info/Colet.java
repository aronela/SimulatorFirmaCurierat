package emanuel.info;

import java.util.ArrayList;

public class Colet implements IColet {
    private String nume;
    private ArrayList includedFiles = new ArrayList();

    public Colet(String nume) {
        this.nume = nume;
    }

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    @Override
    public void listeaza() {
        System.out.println(CurierDemo.compositeBuilder + nume);
        CurierDemo.compositeBuilder.append("   ");

        for (Object obj : includedFiles) {
            IColet colet = (IColet) obj;
            colet.listeaza();
        }

        CurierDemo.compositeBuilder.delete(0, 3);
    }

    public int cautare(String nume) {
        if(this.nume == nume){
            return 1;
        } else {
            for (Object obj : includedFiles) {
                IColet colet = (IColet) obj;
                int gasit = colet.cautare(nume);
                if (gasit > 0) {
                    return gasit + 1;
                }
            }
            return 0;
        }
    }
}

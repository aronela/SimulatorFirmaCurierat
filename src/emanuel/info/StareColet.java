package emanuel.info;

import java.util.ArrayList;

public class StareColet implements IColet {
    private ArrayList includedFiles = new ArrayList();

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    @Override
    public void listeaza() {
        for (Object obj : includedFiles) {
            IColet colet = (IColet) obj;
            colet.listeaza();
        }
    }

    public int cautare(String nume) {
        for (Object obj : includedFiles) {
            IColet colet = (IColet) obj;
            int gasit = colet.cautare(nume);
            if (gasit > 0) {
                return gasit;
            }
        }
        return 0;
    }
}

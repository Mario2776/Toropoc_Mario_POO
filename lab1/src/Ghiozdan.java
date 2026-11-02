public class Ghiozdan {
    private Rechizita[] rechizite = new Rechizita[10];
    private int nrRechizite = 0;

    public void addCaiet(Caiet caiet){
        if(nrRechizite < rechizite.length){
            rechizite[nrRechizite] = caiet;
            nrRechizite++;
        }
    }

    public void addManual(Manual manual){
        if(nrRechizite < rechizite.length){
            rechizite[nrRechizite] = manual;
            nrRechizite++;
        }
    }


    public void Afisare(){
        for (int i = 0; i < nrRechizite; i++){
            System.out.println(rechizite[i].getNume());
        }
    }

}

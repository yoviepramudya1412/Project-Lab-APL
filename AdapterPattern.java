

public class AdapterPattern implements Ringan {
    Berat hewanHerbivora;


    public AdapterPattern(Berat hewanHerbivora) {
        this.hewanHerbivora = hewanHerbivora;
    }


    @Override
    public void ringan() {
        hewanHerbivora.berat();
    }
}

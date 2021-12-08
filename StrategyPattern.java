

public class StrategyPattern {
    private Ringan presentaseYodium;


    public void setYodiumRingan(Ringan presentaseYodium) {
        this.presentaseYodium = presentaseYodium;
    }


    public Ringan getYodiumRingan() {
        return this.presentaseYodium;
    }


    public void ringan() {
        presentaseYodium.ringan();
    }


 
}

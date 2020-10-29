public abstract class Bird {
    private String feathers;
    private boolean layEggs;
    abstract void fly();
    public void putFeathers(String feathers){
        this.feathers = feathers;
    }
    public void putLayEggs(boolean layEggs){
        this.layEggs = layEggs;
    }
    public String getFeathers(){
        return feathers;
    }
    public boolean getLayEggs(){
        return layEggs;
    }
}

package oops;

public class AnnaBaker implements cakebakingservices{
    @Override
    public void mixingIngredients() {
        System.out.println("mixing fruits");
    }

    @Override
    public void bakecake() {
        System.out.println("baking for 40 mins");
    }

    @Override
    public void frostcake() {
        System.out.println("not frosting");
    }
}

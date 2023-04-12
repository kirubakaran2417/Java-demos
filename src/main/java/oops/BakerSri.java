package oops;

public class BakerSri implements cakebakingservices{
    @Override
    public void mixingIngredients() {
        System.out.println("mixing choclate");
    }

    @Override
    public void bakecake() {
        System.out.println("baking for 30mins");
    }

    @Override
    public void frostcake() {
        System.out.println("frosting is mandatory");
    }
}

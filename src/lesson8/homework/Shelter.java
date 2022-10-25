package lesson8.homework;

public class Shelter {
    private int cats;
    private int dogs;
    private int costForItem;
    private int days;

    public Shelter(int cats, int dogs, int costForItem, int days) {
        this.cats = cats;
        this.dogs = dogs;
        this.costForItem = costForItem;
        this.days = days;
    }

    public int eatPerCats() {
        return this.cats * 50 * 3 * this.days;
    }

    public int eatPerDogs() {
        return this.dogs * 50 * 3 * this.days;
    }

    public int overallCost() {
        return (3 * this.days * (this.cats + this.dogs)) * costForItem;
    }
}

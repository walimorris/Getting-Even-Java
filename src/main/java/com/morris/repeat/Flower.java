package com.morris.repeat;

/**
 * Flower has 3 attributes: it's name, number of petals and price.
 * @author Wali Morris<wmmorris@gmail.com>
 */
public class Flower {
    private String name;
    private int petals;
    private float price;

    /**
     * Flower constructor.
     * @param name : name of flower.
     * @param petals : number of flower petals.
     * @param price : price of flower.
     */
    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    /**
     * Sets flower's name.
     * @param name : name of flower.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets petal count.
     * @param petals : number of petals.
     */
    public void setPetals(int petals) {
        this.petals = petals;
    }

    /**
     * Sets flower price.
     * @param price : price of flower.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return : name of flower.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return : Flower's petal count.
     */
    public int getPetals() {
        return petals;
    }

    /**
     * @return : price of flower as a float.
     */
    public float getPrice() {
        return this.price;
    }
}

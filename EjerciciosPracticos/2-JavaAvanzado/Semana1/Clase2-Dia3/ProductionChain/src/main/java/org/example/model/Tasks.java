package org.example.model;

public class Tasks {
    private final boolean assembleProducts;
    private final boolean performQualityChecks;
    private final boolean packProducts;

    public Tasks(boolean assembleProducts, boolean performQualityChecks, boolean packProducts) {
        this.assembleProducts = assembleProducts;
        this.performQualityChecks = performQualityChecks;
        this.packProducts = packProducts;
    }

    public boolean isAssembleProducts() {
        return assembleProducts;
    }

    public boolean isPerformQualityChecks() {
        return performQualityChecks;
    }

    public boolean isPackProducts() {
        return packProducts;
    }
    @Override
    public String toString() {
        return "Tasks{" +
                "assembleProducts=" + assembleProducts +
                ", performQualityChecks=" + performQualityChecks +
                ", packProducts=" + packProducts +
                '}';
    }
}

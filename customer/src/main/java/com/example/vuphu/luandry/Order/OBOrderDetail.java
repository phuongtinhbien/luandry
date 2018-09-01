package com.example.vuphu.luandry.Order;

import com.example.vuphu.luandry.Categories.OBCategories;

public class OBOrderDetail extends OBCategories implements IOrderDetail {

    private String production;
    private String material;
    private String unit;
    private long   count;
    private long    selectedIndx; //default -1...not selected

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getSelectedIndx() {
        return selectedIndx;
    }

    public void setSelectedIndx(long selectedIndx) {
        this.selectedIndx = selectedIndx;
    }
}

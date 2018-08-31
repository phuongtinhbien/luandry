package com.example.vuphu.luandry.Order;

public interface IOrderDetail {

    public String getAvatar();

    public void setAvatar(String avatar);

    public String getTitle();

    public void setTitle(String title);

    public String getPricing();

    public void setPricing(String pricing);

    public String getProduction();

    public void setProduction(String production);

    public String getMaterial();

    public void setMaterial(String material);

    public String getUnit();

    public void setUnit(String unit);
    public long getCount();
    public void setCount(long count);
}

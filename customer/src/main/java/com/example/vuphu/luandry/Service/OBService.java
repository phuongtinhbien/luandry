package com.example.vuphu.luandry.Service;

import java.io.Serializable;

import me.aflak.filter_annotation.Filterable;

@Filterable
public class OBService implements Serializable {

    private long id;
    private String name;
    private String desc;
    private String icon;

    private String selectedInd;

    public OBService(long id, String name, String desc, String icon) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.icon = icon;
    }

    public OBService() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSelectedInd() {
        return selectedInd;
    }

    public void setSelectedInd(String selectedInd) {
        this.selectedInd = selectedInd;
    }
}

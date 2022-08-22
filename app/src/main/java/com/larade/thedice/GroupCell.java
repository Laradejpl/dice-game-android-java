package com.larade.thedice;

import java.util.List;

public class GroupCell {
    private List<Cellule> group;


    public GroupCell(List<Cellule> group) {
        this.group = group;
    }

    public List<Cellule> getGroup() {
        return group;
    }

    public void setGroup(List<Cellule> group) {
        this.group = group;
    }
}

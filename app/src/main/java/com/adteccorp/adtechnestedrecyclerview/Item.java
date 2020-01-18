package com.adteccorp.adtechnestedrecyclerview;

import java.util.List;

public class Item {
    private String itemtitle;
    private List<SubItem> subitemlist;

    public Item(String itemtitle, List<SubItem> subitemlist) {
        this.itemtitle = itemtitle;
        this.subitemlist = subitemlist;
    }

    public String getItemtitle() {
        return itemtitle;
    }

    public void setItemtitle(String itemtitle) {
        this.itemtitle = itemtitle;
    }

    public List<SubItem> getSubitemlist() {
        return subitemlist;
    }

    public void setSubitemlist(List<SubItem> subitemlist) {
        this.subitemlist = subitemlist;
    }
}

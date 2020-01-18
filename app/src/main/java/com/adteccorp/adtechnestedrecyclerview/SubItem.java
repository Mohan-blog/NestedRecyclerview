package com.adteccorp.adtechnestedrecyclerview;

public class SubItem {
    private String subitemtitle;
    private String subitemdescription;
    private int subitemimg;

    public SubItem(String subitemtitle, String subitemdescription) {
        this.subitemtitle = subitemtitle;
        this.subitemdescription = subitemdescription;
    }

    public String getSubitemtitle() {
        return subitemtitle;
    }

    public void setSubitemtitle(String subitemtitle) {
        this.subitemtitle = subitemtitle;
    }

    public String getSubitemdescription() {
        return subitemdescription;
    }

    public void setSubitemdescription(String subitemdescription) {
        this.subitemdescription = subitemdescription;
    }

    public int getSubitemimg() {
        return subitemimg;
    }

    public void setSubitemimg(int subitemimg) {
        this.subitemimg = subitemimg;
    }
}

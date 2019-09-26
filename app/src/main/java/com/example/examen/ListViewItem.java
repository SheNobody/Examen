package com.example.examen;

public class ListViewItem {
    private int imageResource;
    private String title;
    private int colorid;

    public ListViewItem(int imageResource, String title, int colorid) {
        this.imageResource = imageResource;
        this.title = title;
        this.colorid = colorid;
    }


    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public int getColorid() {
        return colorid;
    }
}

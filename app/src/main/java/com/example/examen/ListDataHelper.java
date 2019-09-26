package com.example.examen;
import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Azul brillosito", android.R.color.holo_blue_bright));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Lagrimas", android.R.color.holo_blue_light)) ;
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Verde brillitos", android.R.color.holo_green_light));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Rojito rosado", android.R.color.holo_red_light)) ;
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Moradito", android.R.color.holo_purple)) ;
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Azul oscurito", android.R.color.holo_blue_dark)) ;
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, "Verde feito", android.R.color.holo_green_dark)) ;
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,"Rojito", android.R.color.holo_red_dark)) ;
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,"Naranjita", android.R.color.holo_orange_dark)) ;

        return list;
    }
}


package com.adteccorp.adtechnestedrecyclerview;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recyclerView = findViewById( R.id.recyclerview );
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( this );
        ItemAdapter itemAdapter = new ItemAdapter( builditemlist() );
        recyclerView.setAdapter( itemAdapter );
        recyclerView.setLayoutManager( linearLayoutManager );
    }


    private List<Item> builditemlist() {
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Item item = new Item( "Item " + i, bundleSubItemList() );

            itemList.add( item );

        }
        return itemList;
    }

    private List<SubItem> bundleSubItemList() {

        List<SubItem> subItemList = new ArrayList<>(  );
        for(int i=0;i<10;i++){
            SubItem subItem = new SubItem( "SubItem " +i,"Description" +i );
            subItemList.add( subItem );
        }
        return subItemList;

    }

}

package com.adteccorp.adtechnestedrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
    private List<Item> itemList;

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_layout, parent, false );

        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = itemList.get( position );
        holder.tvitemtitle.setText( item.getItemtitle() );

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( holder.rvsubitem.getContext(), LinearLayoutManager.VERTICAL, false );
        linearLayoutManager.setInitialPrefetchItemCount( item.getSubitemlist().size() );
        SubItemAdapter subItemAdapter = new SubItemAdapter( item.getSubitemlist() );
        holder.rvsubitem.setLayoutManager( linearLayoutManager );
        holder.rvsubitem.setAdapter( subItemAdapter );
        holder.rvsubitem.setRecycledViewPool( viewPool );


    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvitemtitle;
        private RecyclerView rvsubitem;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );
            tvitemtitle = itemView.findViewById( R.id.itemtitle );
            rvsubitem = itemView.findViewById( R.id.subitems );
        }
    }
}

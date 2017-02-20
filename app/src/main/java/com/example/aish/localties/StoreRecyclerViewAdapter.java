package com.example.aish.localties;

import android.app.Dialog;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import android.content.Intent;
import java.util.Locale;

/**
 * Created by Aish on 2/13/2017.
 */
public class StoreRecyclerViewAdapter extends RecyclerView.Adapter<StoreRecyclerViewHolder> {

    private ArrayList<StoreObject> _recyclerData = new ArrayList<StoreObject>();

    public void updateList(ArrayList<StoreObject> dataToUpdate){
        try{
            _recyclerData.clear();
            _recyclerData.addAll(dataToUpdate);
            notifyDataSetChanged();
        }
        catch (Exception e){e.printStackTrace();}
    }

    @Override
    public int getItemCount() {
        try {
            return _recyclerData.size();
        }
        catch (Exception e){e.printStackTrace();return 0;}
    }


    @Override
    public StoreRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        try {

            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            View itemView = inflater.inflate(R.layout.recycleritem_store, viewGroup, false);
            return new StoreRecyclerViewHolder(itemView);
        }
        catch (Exception e){e.printStackTrace();return null;}
    }

    @Override
    public void onBindViewHolder(final StoreRecyclerViewHolder viewHolder, int position) {
        try {
            final StoreObject _rowStoreObject = _recyclerData.get(position);
            viewHolder.txtStoreName.setText(_rowStoreObject.getStoreName().toUpperCase());
            viewHolder.txtStoreAddress.setText(_rowStoreObject.getStoreAddress());
            viewHolder.txtStoreId.setText(_rowStoreObject.getStoreId());
            viewHolder.txtDistanceDisplay.setText(_rowStoreObject.getStoreDistance());
            viewHolder.imgStoreImage.setImageResource(R.drawable.grocery_store);

            viewHolder.rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView txtStoreId = (TextView) v.findViewById(R.id.txtStoreId);
                    String storeId = txtStoreId.getText().toString();
                    Intent specificStore = new Intent(viewHolder.rowView.getContext(), StorePageActivity.class);
                    specificStore.putExtra("StoreId", storeId);
                    viewHolder.rowView.getContext().startActivity(specificStore);
                }
            });
        }
        catch (Exception e){e.printStackTrace();}
    }
}

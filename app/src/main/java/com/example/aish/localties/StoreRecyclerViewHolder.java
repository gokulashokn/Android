package com.example.aish.localties;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aish on 2/13/2017.
 */
public class StoreRecyclerViewHolder extends RecyclerView.ViewHolder {
    View rowView;
    TextView txtStoreId;
    ImageView imgStoreImage;
    TextView txtStoreName;
    TextView txtStoreAddress;
    TextView txtDistanceDisplay;
    public StoreRecyclerViewHolder(View itemView){
        super(itemView);
        try{
            rowView = itemView;
            txtStoreName = (TextView) itemView.findViewById(R.id.txtStoreName);
            txtStoreAddress = (TextView) itemView.findViewById(R.id.txtAddress);
            txtStoreId = (TextView) itemView.findViewById(R.id.txtStoreId);
            txtDistanceDisplay = (TextView) itemView.findViewById(R.id.txtDistanceDisplay);
            imgStoreImage = (ImageView) itemView.findViewById(R.id.imgStoreImage);
        }
        catch (Exception e){ e.printStackTrace();   }
    }
}

package com.dicoding.rifki.worldbillionaires;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewBillionairesAdapter extends RecyclerView.Adapter<CardViewBillionairesAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Billionaires> listBillionaires;

    public CardViewBillionairesAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Billionaires> getListBillionaires() {
        return listBillionaires;
    }

    public void setListBillionaires(ArrayList<Billionaires> listBillionaires) {
        this.listBillionaires = listBillionaires;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_billionaires, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        Billionaires b = getListBillionaires().get(i);
        Glide.with(context)
                .load(b.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvName.setText(b.getName());
        cardViewViewHolder.tvMoney.setText(b.getMoney());
        cardViewViewHolder.billionaires = b;

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+getListBillionaires().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+getListBillionaires().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListBillionaires().size();
    }
    public void startactivity(Intent intent){

    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvName, tvMoney;
        Button btnFavorite, btnShare;
        Billionaires billionaires;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvMoney = (TextView)itemView.findViewById(R.id.tv_item_money);
            btnFavorite = (Button)itemView.findViewById(R.id.btn_set_favorite);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);
            imgPhoto.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailBillionairesActivity.class);
            intent.putExtra("key", billionaires);
            context.startActivity(intent);
        }
    }
}

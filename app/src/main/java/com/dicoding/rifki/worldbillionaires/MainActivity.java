package com.dicoding.rifki.worldbillionaires;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBillionaires;
    private ArrayList<Billionaires> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBillionaires = findViewById(R.id.rv_billionaries);
        rvBillionaires.setHasFixedSize(true);

        list.addAll(BillionairesData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvBillionaires.setLayoutManager(new LinearLayoutManager(this));
        CardViewBillionairesAdapter cardViewBillionairesAdapter = new CardViewBillionairesAdapter(this);
        cardViewBillionairesAdapter.setListBillionaires(list);
        rvBillionaires.setAdapter(cardViewBillionairesAdapter);
    }
}

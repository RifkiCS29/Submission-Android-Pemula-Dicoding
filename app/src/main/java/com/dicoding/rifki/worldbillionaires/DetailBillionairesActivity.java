package com.dicoding.rifki.worldbillionaires;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailBillionairesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_billionaires);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Billionaires billionairesaccept = getIntent().getParcelableExtra("key");

        ImageView photo = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView company = (TextView)findViewById(R.id.tv_item_company);
        TextView money = (TextView)findViewById(R.id.tv_item_money);
        TextView age = (TextView)findViewById(R.id.content_age);
        TextView citizenship = (TextView)findViewById(R.id.content_citizenship);
        TextView description = (TextView)findViewById(R.id.content_description);

        Glide.with(this).load(billionairesaccept.getPhoto()).apply(new RequestOptions().override(350, 550)).into(photo);
        name.setText(billionairesaccept.getName());
        company.setText(billionairesaccept.getCompany());
        money.setText(billionairesaccept.getMoney());
        age.setText(billionairesaccept.getAge());
        citizenship.setText(billionairesaccept.getCitizenship());
        description.setText(billionairesaccept.getDescription());

        setActionBarTitle(billionairesaccept.getName());

        Log.i("photo", billionairesaccept.getPhoto());
        Log.i("deskripsi", billionairesaccept.getDescription());
    }

    private void setActionBarTitle(String name) {
        getSupportActionBar().setTitle(name);
    }
}

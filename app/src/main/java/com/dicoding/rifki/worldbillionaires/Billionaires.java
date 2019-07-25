package com.dicoding.rifki.worldbillionaires;

import android.os.Parcel;
import android.os.Parcelable;

public class Billionaires implements Parcelable {
    private String name;
    private String company;
    private String money;
    private String photo;
    private String age;
    private String citizenship;
    private String description;

    public Billionaires() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.company);
        parcel.writeString(this.money);
        parcel.writeString(this.photo);
        parcel.writeString(this.age);
        parcel.writeString(this.citizenship);
        parcel.writeString(this.description);
    }


    protected Billionaires(Parcel in) {
        name = in.readString();
        company = in.readString();
        money = in.readString();
        photo = in.readString();
        age = in.readString();
        citizenship = in.readString();
        description = in.readString();
    }

    public static final Creator<Billionaires> CREATOR = new Creator<Billionaires>() {
        @Override
        public Billionaires createFromParcel(Parcel in) {
            return new Billionaires(in);
        }

        @Override
        public Billionaires[] newArray(int size) {
            return new Billionaires[size];
        }
    };
}

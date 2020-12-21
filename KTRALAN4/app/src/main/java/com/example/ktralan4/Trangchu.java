package com.example.ktralan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;
import com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem;

import java.util.ArrayList;

public class Trangchu extends AppCompatActivity {
HorizontalScrollMenuView menu;
ArrayList arrayList;
GridView gridView;
ArrayList<Product> arrayProduct,array;
ProductAdapter adapter,adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);
        getSupportActionBar().hide();
        menu = findViewById(R.id.menu);
        AnhXa();
array= new ArrayList<>();
        adapter = new ProductAdapter(this,R.layout.line,arrayProduct);
        gridView.setAdapter(adapter);
        initMenu();
        clickMenu();

    }
    private void initMenu(){
        arrayList = new ArrayList();
        menu.addItem("Tất cả",R.drawable.music);
        menu.addItem("SmartPhone",R.drawable.smartphones);
        menu.addItem("HeadPhone",R.drawable.music);
        menu.addItem("USB",R.drawable.pendrive);
        menu.addItem("SmartPhone",R.drawable.smartphones);
        menu.addItem("HeadPhone",R.drawable.music);
        menu.addItem("USB",R.drawable.pendrive);
    }
    private void AnhXa(){
        gridView  = (GridView)findViewById(R.id.gr);
        arrayProduct = new ArrayList<>();
        arrayProduct.add(new Product("SmartPhone OPPO","1 triệu",R.drawable.dt1));
        arrayProduct.add(new Product("SmartPhone OPPO","1 triệu",R.drawable.dt2));
        arrayProduct.add(new Product("SmartPhone OPPO","1 triệu",R.drawable.dt5));
        arrayProduct.add(new Product("SmartPhone OPPO","1 triệu",R.drawable.dt6));
        arrayProduct.add(new Product("HeadPhone RES","1 triệu",R.drawable.hp2));
        arrayProduct.add(new Product("HeadPhone Low","1 triệu",R.drawable.hp4));
        arrayProduct.add(new Product("HeadPhone SEE","1 triệu",R.drawable.hp5));
        arrayProduct.add(new Product("USB không dây","1 triệu",R.drawable.usb1));
        arrayProduct.add(new Product("USB vàng","1 triệu",R.drawable.usb2));
        arrayProduct.add(new Product("USB hồng","1 triệu",R.drawable.usb3));
    }
    public void clickMenu(){

        menu.setOnHSMenuClickListener(new HorizontalScrollMenuView.OnHSMenuClickListener() {
            @Override
            public void onHSMClick(MenuItem menuItem, int position) {
                array.clear();

                for(Product item : arrayProduct)
                {
                    if(item.getTen().toUpperCase().contains(menuItem.getText().toUpperCase()))
                    {
                        array.add(item);

                    }
                }
                if(array.isEmpty())
                {
                    adapter = new ProductAdapter(Trangchu.this,R.layout.line,arrayProduct);
                    gridView.setAdapter(adapter);
                }
                else{
                    adap = new ProductAdapter(Trangchu.this,R.layout.line,array);
                    gridView.setAdapter(adap);}

            }
        });
    }
}
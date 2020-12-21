package com.example.ktralan4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<Product> productList;
    Product product;

    public ProductAdapter(Context context, int layout, List<Product> productList) {
        this.context = context;
        this.layout = layout;
        this.productList = productList;
    }
    public int getCount(){
        return  productList.size();
    }
    public Object getItem(int position){
        return null;
    }
  public long getItemId(int position){return 0;}

public class ViewHolder{
        TextView txt1,txt2;
        ImageView img;
}
public View getView(int position, View view, ViewGroup parent){
        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.txt1= (TextView)view.findViewById(R.id.txtTen);
            holder.txt2 = (TextView)view.findViewById(R.id.txtGia);
            holder.img =(ImageView)view.findViewById(R.id.hinh);
            view.setTag(holder);

        }
        else{
            holder = (ViewHolder) view.getTag();
        }
        product = productList.get(position);
        holder.txt1.setText(product.getTen());
        holder.txt2.setText(product.getGia());
        holder.img.setImageResource(product.getHinh());
        return view;
}


}

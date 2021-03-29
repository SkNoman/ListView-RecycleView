package com.example.courses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder> {

    Context context;
    String [] title , desc;
    int[] images;

    public MyAdapter(Context context, String[] title, String[] desc, int[] images) {
        this.context = context;
        this.title = title;
        this.desc = desc;
        this.images = images;


    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.simple,viewGroup,false);

        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder myviewHolder, int i)
    {
        myviewHolder.titleTextview.setText(title[i]);
        myviewHolder.desctextview.setText(desc[i]);
        myviewHolder.flagImageView.setImageResource(images[i]);



    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    class MyviewHolder extends RecyclerView.ViewHolder{
        TextView titleTextview,desctextview;
        ImageView flagImageView;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextview = itemView.findViewById(R.id.titletextviewid);
            desctextview = itemView.findViewById(R.id.desctextviewid);
            flagImageView = itemView.findViewById(R.id.imageviewid);
        }
    }
}

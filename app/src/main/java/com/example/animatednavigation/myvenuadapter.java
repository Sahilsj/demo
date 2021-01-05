package com.example.animatednavigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myvenuadapter extends  RecyclerView.Adapter<myvenuadapter.ViewHolder> {

    myvenudata [] myvenudata;
    Context context;
    public myvenuadapter( myvenudata[] myvenudata,recycleview activity) {
        this.myvenudata = myvenudata;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.weddingvenu,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     final myvenudata myvenudatalist  = myvenudata[position];
     holder.textvenuname.setText(myvenudatalist.getVenuName());
     holder.textViewaddrerss.setText(myvenudatalist.getAddressvenu());
     holder.movieImage.setImageResource(myvenudatalist.getMovieImage());

     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Toast.makeText(context, myvenudatalist.getVenuName(),Toast.LENGTH_SHORT).show();}
     });
    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{

        ImageView movieImage;
        TextView textvenuname;
        TextView textViewaddrerss;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            movieImage = itemView.findViewById(R.id.imageView);
            textvenuname = itemView.findViewById(R.id.textName);
            textViewaddrerss = itemView.findViewById(R.id.textName);

        }
    }
}

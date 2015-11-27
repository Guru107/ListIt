package com.gurudatt.listit.renderedview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gurudatt.listit.R;
import com.listit.models.ListItem;

import java.util.ArrayList;

/**
 * Created by gurudattkulkarni on 26/11/15.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    private ArrayList<ListItem> mTodoList;

    public MyRecyclerAdapter(ArrayList<ListItem> mTodoList) {
        this.mTodoList = mTodoList;
    }


    @Override
    public MyRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);

        //ViewHolder viewHolder = new ViewHolder(v);
        return null;
    }

    @Override
    public void onBindViewHolder(MyRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;


        public ViewHolder(TextView itemView) {
            super(itemView);
            mTextView = itemView;
        }
    }
}

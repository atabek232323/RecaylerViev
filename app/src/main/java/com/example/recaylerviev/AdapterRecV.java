package com.example.recaylerviev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class AdapterRecV extends RecyclerView.Adapter<AdapterRecV.VievHolder> {
    private final LayoutInflater inflater;
    private List<STATE> states;

    AdapterRecV(Context context,List<STATE> states){
        this.states  = states;
        this.inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public AdapterRecV.VievHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list,parent,false);
        return new VievHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecV.VievHolder holder, int position) {
        STATE state = states.get(position);
         holder.text.setText(state.getName());
        holder.te_1.setText(state.getCapital());

    }

    @Override
    public int getItemCount() {
        return states.size();
    }
    public static class VievHolder extends RecyclerView.ViewHolder{
        final TextView text,te_1;
        public BreakIterator textView;


        public VievHolder(@NonNull View viev) {
                super(viev);
                text= (TextView) viev.findViewById(R.id.textView);
                te_1 = (TextView) viev.findViewById(R.id.textView2);
            }
        }
    }


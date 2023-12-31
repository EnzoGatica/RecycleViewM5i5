package com.example.recycleviewm5i5;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewm5i5.databinding.ItemBinding;

import java.util.List;

public class AdapterWords extends RecyclerView.Adapter<AdapterWords.ViewHolder> {

    private List<String> words;
    @NonNull
    @Override
    public AdapterWords.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWords.ViewHolder holder, int position) {
        String item = words.get(position);
        holder.mostrarInformacion(item);
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public void setData(List<String> data) {
        this.words = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding itembinding;
        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            itembinding = binding;
        }

        public void mostrarInformacion(String words)
        {

            itembinding.textView.setText(words);
        }
    }
}

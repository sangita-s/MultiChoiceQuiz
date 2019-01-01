package generisches.lab.multichoicequiz.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import generisches.lab.multichoicequiz.Model.Category;
import generisches.lab.multichoicequiz.R;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    Context context;
    List<Category> mCategories;

    public CategoryAdapter(Context pContext, List<Category> pCategories) {
        context = pContext;
        mCategories = pCategories;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_category, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt_category_name.setText(mCategories.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        CardView card_category;
        TextView txt_category_name;

        public MyViewHolder(View itemView) {
            super(itemView);
            card_category = itemView.findViewById(R.id.card_category);
            txt_category_name = itemView.findViewById(R.id.txt_category_name);
            card_category.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Category clicked: " + mCategories.get(getAdapterPosition()).getName(),Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}

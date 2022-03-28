package borboa.andrea.reel_proyectomoviles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PromosAdapter extends RecyclerView.Adapter<PromosAdapter.PromosViewHolder> {

    public class PromosViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;


        public PromosViewHolder (@NonNull View itemView){
            super(itemView);

            mImageView = itemView.findViewById(R.id.imagePromo);
        }
    }

    private List<PromosItem> promosList;


    public PromosAdapter(List<PromosItem> promosList){
        this.promosList=promosList;



    }

    @NonNull
    @Override
    public PromosAdapter.PromosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.promos_item, parent, false);
        return new PromosAdapter.PromosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PromosAdapter.PromosViewHolder holder, int position) {
        holder.mImageView.setImageResource(promosList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return promosList.size();
    }




}

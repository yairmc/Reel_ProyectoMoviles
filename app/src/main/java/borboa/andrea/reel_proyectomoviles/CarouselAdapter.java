package borboa.andrea.reel_proyectomoviles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder> {


    private List<CarouselItem> carouselList;



    public CarouselAdapter(List<CarouselItem> carouselList){
        this.carouselList=carouselList;
    }


    public class CarouselViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;


        public CarouselViewHolder (@NonNull View itemView){
            super(itemView);

            mImageView = itemView.findViewById(R.id.imageCarousel);
        }
    }


    @NonNull
    @Override
    public CarouselViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carousel_item, parent, false);
        return new CarouselViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarouselViewHolder holder, int position) {
        holder.mImageView.setImageResource(carouselList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return carouselList.size();
    }



}

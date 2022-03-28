package borboa.andrea.reel_proyectomoviles;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InicioActivity extends AppCompatActivity {

    private RecyclerView CarouselRecyclerview, PromosRecyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        //CarouselRecyclerView

        CarouselRecyclerview = findViewById(R.id.CarouselRecyclerview);
        CarouselRecyclerview.setHasFixedSize(true);
        CarouselRecyclerview.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        List<CarouselItem> imageList = new ArrayList();
        imageList.add(new CarouselItem(R.drawable.godzilla_vs_kong));
        imageList.add(new CarouselItem(R.drawable.liga_de_la_justicia));
        imageList.add(new CarouselItem(R.drawable.el_seor_de_los_anillos));
        imageList.add(new CarouselItem(R.drawable.pastor_impostor));

        CarouselAdapter carouselAdapter = new CarouselAdapter(imageList);

        CarouselRecyclerview.setAdapter(carouselAdapter);

        //PromosRecyclerView

        PromosRecyclerview = findViewById(R.id.PromosRecyclerview);
        PromosRecyclerview.setHasFixedSize(true);
        PromosRecyclerview.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        List<PromosItem> promosList = new ArrayList();
        promosList.add(new PromosItem(R.drawable.dosporuno));
        promosList.add(new PromosItem(R.drawable.precio_especial_1));
        promosList.add(new PromosItem(R.drawable.precio_especial_2));
        promosList.add(new PromosItem(R.drawable.precio_especial_3));

        PromosAdapter promosAdapter = new PromosAdapter(promosList);

        PromosRecyclerview.setAdapter(promosAdapter);

    }

}

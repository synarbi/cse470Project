package com.nadxlib.dort.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;
import com.nadxlib.dort.Controller.CaController;
import com.nadxlib.dort.Model.PlaceInfo;
import com.nadxlib.dort.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HotelDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_details);

        String s = getIntent().getStringExtra("name");
        HashMap<String, List<PlaceInfo>> places = new HashMap<>();


        //Badarbann
        PlaceInfo riverview = new PlaceInfo("Hotel River View", R.drawable.hotel_river_view, new LatLng(22.19315382768352, 92.21342199899208));
        PlaceInfo plaza = new PlaceInfo("Hotel Plaza",R.drawable.hotel_plaza,new
                LatLng(22.19497378234779, 92.21816289834351)
        );


        List<PlaceInfo> bagerhat = new ArrayList<PlaceInfo>();
        bagerhat.add(riverview);
        bagerhat.add(plaza);
        places.put("Bandarban",bagerhat);


        //barisal

        PlaceInfo gp = new PlaceInfo("Hotel Grand Park", R.drawable.hotel_grand_park, new LatLng(22.691280715307652, 90.36872544486928));
        PlaceInfo rich = new PlaceInfo("Hotel Rich Mart",R.drawable.rich_mart,new
                LatLng(22.70077973629298, 90.37444589768477)
        );


        List<PlaceInfo> bari = new ArrayList<PlaceInfo>();
        bari.add(gp);
        bari.add(rich);
        places.put("Barisal",bari);

        //chittagong

        PlaceInfo agra = new PlaceInfo("Hotel Agrabad", R.drawable.hotel_agrabaad, new LatLng(22.328585307625488, 91.81604533878405));
        PlaceInfo well = new PlaceInfo("Hotel Well Park",R.drawable.well_park,new
                LatLng(22.359790640778787, 91.82317272287976)
        );


        List<PlaceInfo> chitt = new ArrayList<PlaceInfo>();
        chitt.add(agra);
        chitt.add(well);
        places.put("Chittagong",chitt);


        //Dhaka

        PlaceInfo dha = new PlaceInfo("Dhaka Regency Hotel", R.drawable.reg, new LatLng(23.829857654938476, 90.41928883962528));
        PlaceInfo hot = new PlaceInfo("Hotel Sarina",R.drawable.hotel_sarina,new
                LatLng(23.793276680586057, 90.4043306662485)
        );


        List<PlaceInfo> dhaka = new ArrayList<PlaceInfo>();
        dhaka.add(dha);
        dhaka.add(hot);
        places.put("Dhaka",dhaka);

        //Khagrachori

        PlaceInfo queen = new PlaceInfo("Hotel Hill Queen", R.drawable.hill_queen, new LatLng(23.108616700730252, 91.98644011077415));
        PlaceInfo gairing = new PlaceInfo("Hotel Gairing",R.drawable.hotel_gairing,new
                LatLng(23.10777401034018, 91.98715610675592)
        );


        List<PlaceInfo> khag = new ArrayList<PlaceInfo>();
        khag.add(queen);
        khag.add(gairing);
        places.put("Khagrachori",khag);

        //Khulna


        PlaceInfo salam = new PlaceInfo("Hotel Castle Salam", R.drawable.castle_salam, new LatLng(22.809844519200514, 89.56245333284762));
        PlaceInfo tiger = new PlaceInfo("Hotel Tiger Garden",R.drawable.tiger_garden,new
                LatLng(22.831442329658127, 89.55323480130086)
        );


        List<PlaceInfo> khu = new ArrayList<PlaceInfo>();
        khu.add(salam);
        khu.add(tiger);
        places.put("Khulna",khu);


        //Maumensingh

        PlaceInfo mer = new PlaceInfo("Hotel le merian", R.drawable.hotel_le_marian, new LatLng(24.716676490166172, 90.41046987466888));
        PlaceInfo silver_castle = new PlaceInfo("Hotel Silver Castle",R.drawable.hotel_silver_castle,new
                LatLng(24.779547455242565, 90.36719941032274)
        );


        List<PlaceInfo> my = new ArrayList<PlaceInfo>();
        my.add(mer);
        my.add(silver_castle);
        places.put("Maymensingh",my);

        //rajshahi

        PlaceInfo grand = new PlaceInfo("Hotel Grand Riverview", R.drawable.grand_riverview, new LatLng(24.36879399558063, 88.5794551790291));
        PlaceInfo star_international = new PlaceInfo("Hotel Star International",R.drawable.hotel_silver_castle,new
                LatLng(24.4075143632511, 88.6142773182348)
        );


        List<PlaceInfo> raj = new ArrayList<PlaceInfo>();
        raj.add(grand);
        raj.add(star_international);
        places.put("Rajshahi",raj);






        //adepter setup
        CaController caController = new CaController(this,places.get(s));
        ListView listView = findViewById(R.id.recyclerView);
        listView.setAdapter(caController);

    }
}
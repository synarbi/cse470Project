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

public class PlaceDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);
        String s = getIntent().getStringExtra("name");
        HashMap<String,List<PlaceInfo>> places = new HashMap<>();
        //Bager Hat
        PlaceInfo khan_jahan = new PlaceInfo("Khan Jahan Alir Majar", R.drawable.khan_jahan_alir_majar, new LatLng(22.66133912475847, 89.76001913617972));
        PlaceInfo shat_gombuj = new PlaceInfo("Shat Gombuj Mosque",R.drawable.shat_gombuj_mosjid,new
                LatLng(22.674764174520266, 89.74185735451977)
        );
        PlaceInfo mongla_port = new PlaceInfo("Mongla Port",R.drawable.mongla_port, new
                LatLng(22.487270285971707, 89.60283915947277));

        List<PlaceInfo> bagerhat = new ArrayList<PlaceInfo>();
        bagerhat.add(khan_jahan);
        bagerhat.add(shat_gombuj);
        bagerhat.add(mongla_port);
            places.put("Bagerhat",bagerhat);

        //bandarban
        PlaceInfo golden_tample = new PlaceInfo("Bandarban Golden Temple Buddha Dhatu Jadi", R.drawable.buddha_dhatu_jadi,new
                LatLng(22.222749062511333, 92.19746786706665)
);
        PlaceInfo boga = new PlaceInfo("Boga Lake",R.drawable.boga_lake_bandarban,new
                LatLng(22.222749062511333, 92.19746786706665)
);
        PlaceInfo mata = new PlaceInfo("Matamuhuri",R.drawable.matamuhuri, new
                LatLng(21.766393577058157, 91.89735184696505)
);

        List<PlaceInfo> Bandarban = new ArrayList<PlaceInfo>();
        Bandarban.add(golden_tample);
        Bandarban.add(boga);
        Bandarban.add(mata);

        places.put("Bandarban",Bandarban);
        //barisal

        PlaceInfo dighi = new PlaceInfo("Durgasagor Dighi", R.drawable.durgasagor_dighi,new
                LatLng(22.761045445156075, 90.2895498129305)
        );
        PlaceInfo guti = new PlaceInfo("Gutiya Mosque",R.drawable.gutiya_mosque,new
                LatLng(22.783262318958283, 90.23871223991122)
        );
        PlaceInfo kitto = new PlaceInfo("Kittonkhola Nodi",R.drawable.kirtonkhola_nodi,new
                LatLng(22.70045309510455, 90.36987501210602)
        );

        List<PlaceInfo> Barisal = new ArrayList<PlaceInfo>();
        Barisal.add(dighi);
        Barisal.add(guti);
        Barisal.add(kitto);
        places.put("Barisal",Barisal);


        // Comilla

        PlaceInfo chondi = new PlaceInfo("Chondi Murra Tample", R.drawable.chondi_mura_temple_comilla,new
                LatLng(23.353555033411595, 91.13177449759516)
            );
        PlaceInfo gomti_river = new PlaceInfo("Gomti River",R.drawable.gomti_river_comilla,new
                LatLng(23.46535918364436, 91.17950238410715)
        );
        PlaceInfo shalbon = new PlaceInfo("Shalbon",R.drawable.shalbon_bihar,new
                LatLng(23.42626417412406, 91.13777765526976)
        );

        List<PlaceInfo> Comilla = new ArrayList<PlaceInfo>();
        Comilla.add(chondi);
        Comilla.add(gomti_river);
        Comilla.add(shalbon);
        places.put("Comilla",Comilla);


       // coxs bazar
        PlaceInfo adinath = new PlaceInfo("Adinath Tample", R.drawable.adinath_temple,new
                LatLng(21.528205210843765, 91.97481936872514)
        );
        PlaceInfo coxs = new PlaceInfo("Coxs Bazar",R.drawable.coxs_bazar,new
                LatLng(21.528205210843765, 91.97481936872514)
        );
        PlaceInfo himchori = new PlaceInfo("Shalbon",R.drawable.himchori_waterfall,new
                LatLng(21.355190252236124, 92.02623383988549)
        );

        List<PlaceInfo> coxsB = new ArrayList<PlaceInfo>();
        coxsB.add(adinath);
        coxsB.add(coxs);
        coxsB.add(himchori);
        places.put("Coxs Bazar",coxsB);


        //dhaka
        PlaceInfo ahsan = new PlaceInfo("Ahsan Manjil", R.drawable.ahsan_manzil,new
                LatLng(23.708797774731817, 90.40600739760191)
        );
        PlaceInfo dhake = new PlaceInfo("Dhakeshaweri Temple",R.drawable.dhakeshawari_temple_front,new
                LatLng(23.708797774731817, 90.40600739760191)
        );
        PlaceInfo lalbag = new PlaceInfo("Lalbag Fort",R.drawable.lalbagh_fort_mosque,new
                LatLng(23.7190274682488, 90.38811668225568)
        );

        List<PlaceInfo> dhaka = new ArrayList<PlaceInfo>();
        dhaka.add(ahsan);
        dhaka.add(dhake);
        dhaka.add(lalbag);
        places.put("Dhaka",dhaka);


        //goalganj

        PlaceInfo samadhi = new PlaceInfo("Samadhi", R.drawable.bangabandhu_somadhi, new
                LatLng(22.906503592257994, 89.89633561293316))
                ;
        PlaceInfo boddo = new PlaceInfo("Boddhobhumi",R.drawable.boddhyobhumi,new
                LatLng(23.708797774731817, 90.40600739760191)
        );
        PlaceInfo thakur = new PlaceInfo("Thakur Bari",R.drawable.orakandi_thakur_bari,new
                LatLng(23.177774168652054, 89.82183062642842)
        );

        List<PlaceInfo> gopal = new ArrayList<PlaceInfo>();
        gopal.add(samadhi);
        gopal.add(boddo);
        gopal.add(thakur);
        places.put("Gopalganj",gopal);



        //jhalokathi
        PlaceInfo floati = new PlaceInfo("Floating Market", R.drawable.floating_market, new
                LatLng(22.75416231171196, 90.17336125168194));
        PlaceInfo gab = new PlaceInfo("Gabkhan Bridge",R.drawable.boddhyobhumi,new
                LatLng(22.641277408835485, 90.17897428619911)
        );
        PlaceInfo zam = new PlaceInfo("Kristipara Zamidar Bari",R.drawable.orakandi_thakur_bari,new
                LatLng(22.641277408835485, 90.17897428619911)
        );

        List<PlaceInfo> jhal = new ArrayList<PlaceInfo>();
        jhal.add(floati);
        jhal.add(gab);
        jhal.add(zam);
        places.put("Jhalokathi",jhal);


        //khagrachori

        PlaceInfo alu = new PlaceInfo("Alutila Cave", R.drawable.alutila_cave_khagrachari, new
                LatLng(23.10582533042092, 91.98043758224397));
        PlaceInfo hang = new PlaceInfo("Hanging Bridge",R.drawable.risang_jharna,new
                LatLng(23.10582533042092, 91.98043758224397)
        );
        PlaceInfo jh = new PlaceInfo("Risang Jharan",R.drawable.risang_jharna,new
                LatLng(23.066130827133264, 91.94365401293618)
        );

        List<PlaceInfo> khag = new ArrayList<PlaceInfo>();
        khag.add(alu);
        khag.add(hang);
        khag.add(jh);
        places.put("Khagrachori",khag);


        //khulna

            PlaceInfo aliSetu = new PlaceInfo("Khan Jahan Ali Setu", R.drawable.khan_jahan_alisetu, new
                    LatLng(22.777702422186046, 89.58422176874771));
            PlaceInfo shir = new PlaceInfo("Shoromoni Monument",R.drawable.shiromoni_monument,new
                    LatLng(22.91553103913274, 89.49269763328084)
            );
            PlaceInfo sun = new PlaceInfo("Sundarban",R.drawable.sundarban,new
                    LatLng(22.81918186330985, 89.56444378409495)
            );

            List<PlaceInfo> khulna = new ArrayList<PlaceInfo>();
            khulna.add(aliSetu);
            khulna.add(shir);
            khulna.add(sun);
            places.put("Khulna",khulna);


            //maymensingh


            PlaceInfo alCas = new PlaceInfo("Alexander Castle", R.drawable.alexander_castle, new
                    LatLng(24.76584040490545, 90.40202759762275));
            PlaceInfo kalu = new PlaceInfo("Kalu Sha Dighi",R.drawable.kalu_sha_dighi,new
                    LatLng(23.97031544830073, 90.03406808226052)
            );
            PlaceInfo surj = new PlaceInfo("Surjakanta Bari",R.drawable.surjakanta_bari,new
                    LatLng(24.677490133136633, 89.9523102841308)
            );

            List<PlaceInfo> may = new ArrayList<PlaceInfo>();
            may.add(alCas);
            may.add(kalu);
            may.add(surj);
            places.put("Maymensingh",may);



            //sylhet

            PlaceInfo bichana = new PlaceInfo("Bichanakandi", R.drawable.bichana, new
                    LatLng(25.176070828711683, 91.88658233995781));
            PlaceInfo shah = new PlaceInfo("Shah Jalal Majar",R.drawable.shah_jalal,new
                    LatLng(24.902749385085258, 91.86664581297194)
            );
            PlaceInfo jaflong = new PlaceInfo("Jaflong",R.drawable.jaflong,new
                    LatLng(24.902749385085258, 91.86664581297194)
            );

            List<PlaceInfo> syl = new ArrayList<PlaceInfo>();
            syl.add(bichana);
            syl.add(shah);
            syl.add(jaflong);
            places.put("Sylhet",syl);


            //Rangpur

            PlaceInfo begum = new PlaceInfo("Begum Rokeya Complex", R.drawable.rok, new
                    LatLng(25.71798490576795, 89.25922918532036));
            PlaceInfo town = new PlaceInfo("Town Hall",R.drawable.town_hall,new
                    LatLng(24.76220079250337, 90.39983689762266)
            );
            PlaceInfo dao = new PlaceInfo("Daoyan Bari",R.drawable.dao,new
                    LatLng(25.748513457449942, 89.27591150787205)
            );

            List<PlaceInfo> rang = new ArrayList<PlaceInfo>();
            rang.add(begum);
            rang.add(town);
            rang.add(dao);
            places.put("Rangpur",rang);


            //rajshahi
            PlaceInfo bagha = new PlaceInfo("Bagha Mosque", R.drawable.bagha, new
                    LatLng(24.19597498846154, 88.83940109761141));
            PlaceInfo padmaPar = new PlaceInfo("Padma Par",R.drawable.padma,new
                    LatLng(23.93385879711073, 89.20376157415492)
            );
            PlaceInfo puth = new PlaceInfo("Puthia Bari",R.drawable.put,new
                    LatLng(23.93385879711073, 89.20376157415492)
            );

            List<PlaceInfo> raj = new ArrayList<PlaceInfo>();
            raj.add(bagha);
            raj.add(padmaPar);
            raj.add(puth);
            places.put("Rajshahi",raj);













        CaController caController = new CaController(this,places.get(s));
        ListView listView = findViewById(R.id.recyclerView);
        listView.setAdapter(caController);






    }
}
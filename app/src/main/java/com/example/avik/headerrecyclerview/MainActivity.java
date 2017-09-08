package com.example.avik.headerrecyclerview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView tvCountryName;

    private List<String> myArraylist = new ArrayList<>();
    private List<Model> countryArraylist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }



    private void initView() {
        tvCountryName = (TextView) findViewById(R.id.tvCountryName);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        //setData();
        setCountry();

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(countryArraylist,this);
        recyclerView.setAdapter(recyclerViewAdapter);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    int firstVisiblePosition = ((LinearLayoutManager)recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                    if (firstVisiblePosition == 0) {
                        //Toast.makeText(MainActivity.this, myArraylist.get(newState), Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });

        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int positionView = ((LinearLayoutManager)recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();

                Model countryModel = countryArraylist.get(positionView);

                String countryNameString = countryModel.getCountry();

                if(countryModel.getName().equals(countryNameString)){
                    tvCountryName.setText(countryNameString);
                    tvCountryName.setTextColor(getResources().getColor(R.color.colorTransparent));
                    return;
                }

                else if (countryModel.getCountry().equals(countryNameString)){
                    tvCountryName.setText(countryNameString);
                    tvCountryName.setTextColor(getResources().getColor(R.color.colorText));
                }

//               if (countryModel.getType().equals("country")){
//
//                   String country = countryModel.getName();
//                   String type = countryModel.getCountry();
//                   if(type==country){
//
//                       String  countryname = countryModel.getCountry();
//                       tvCountryName.setText(countryname);
//                   }
//               }

               String name = String.valueOf(countryArraylist.get(positionView));
                System.out.println("positionView"+positionView);
                System.out.println("positionname"+name);
            }
        });
    }

    private void setCountry() {
        countryArraylist.add(new Model("country","India","India"));
        countryArraylist.add(new Model("city","Delhi","India"));
        countryArraylist.add(new Model("city","Mumbai","India"));
        countryArraylist.add(new Model("city","Kokata","India"));
        countryArraylist.add(new Model("city","Bangalore","India"));
        countryArraylist.add(new Model("city","Hyderabad","India"));
        countryArraylist.add(new Model("city","Ahmedabad","India"));
        countryArraylist.add(new Model("city","Chennai","India"));
        countryArraylist.add(new Model("country","China","China"));
        countryArraylist.add(new Model("city","Shanghai","China"));
        countryArraylist.add(new Model("city","Beijing","China"));
        countryArraylist.add(new Model("city","Chengdu","China"));
        countryArraylist.add(new Model("city","Xi'an","China"));
        countryArraylist.add(new Model("city","Nanjing","China"));
        countryArraylist.add(new Model("city","Harbin","China"));
        countryArraylist.add(new Model("city","Shantou","China"));
        countryArraylist.add(new Model("country","France","France"));
        countryArraylist.add(new Model("city","Paris","France"));
        countryArraylist.add(new Model("city","Marseille","France"));
        countryArraylist.add(new Model("city","Strasbourg","France"));
        countryArraylist.add(new Model("city","Bordeaux","France"));
        countryArraylist.add(new Model("city","Rennes","France"));
        countryArraylist.add(new Model("city","Amiens","France"));
        countryArraylist.add(new Model("city","Nîmes","France"));
        countryArraylist.add(new Model("city","Tours","France"));

    }

    private void setData() {

        myArraylist.add("Argentina");
        myArraylist.add("Australia");
        myArraylist.add("Bangladesh");
        myArraylist.add("Brazil");
        myArraylist.add("Canada");
        myArraylist.add("China");
        myArraylist.add("Egypt");
        myArraylist.add("France");
        myArraylist.add("Germany");
        myArraylist.add("Hungary");
        myArraylist.add("India");
        myArraylist.add("Italy");
        myArraylist.add("Japan");
        myArraylist.add("Malaysia");
        myArraylist.add("Netherlands");
        myArraylist.add("Philippines");
        myArraylist.add("Russia");
        myArraylist.add("Serbia");
        myArraylist.add("Singapore");
        myArraylist.add("Slovakia");
        myArraylist.add("Spain");
        myArraylist.add("Swaziland");
        myArraylist.add("Thailand");
        myArraylist.add("Turkey");
        myArraylist.add("Uganda");
        myArraylist.add("Vietnam");
        myArraylist.add("Yemen");
        myArraylist.add("Zimbabwe");
    }
}

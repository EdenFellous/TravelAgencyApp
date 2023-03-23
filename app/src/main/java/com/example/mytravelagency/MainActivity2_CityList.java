package com.example.mytravelagency;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity2_CityList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_city_list);
        getSupportActionBar().hide();

        List<City> cities = new ArrayList<>();
        List<Integer> parisImages = Arrays.asList(
                R.drawable.paris_1, R.drawable.paris_2, R.drawable.paris_3,
                R.drawable.paris_4, R.drawable.paris_5);
        City paris = new City(
                R.drawable.paris_wide,
                parisImages,
                "Paris, France",
                "Paris, also known as the city of love, is one of the most beautiful cities in the world. It has remarkable monuments, museums, architecture, and restaurants. We especially recommend this city for couples who are looking for a honeymoon destination, art lovers, and food lovers who enjoy fine french cuisine.",
                "1. Eiffel Tower\n2. Arc de Triomphe\n" +
                        "3. Louvres Museum\n4. Dinner on Seine River\n" +
                        "5. Versailles Palace and Gardens Tour");

        List<Integer> nycImages = Arrays.asList(
                R.drawable.nyc_1, R.drawable.nyc_2, R.drawable.nyc_3,
                R.drawable.nyc_4, R.drawable.nyc_5);
        City nyc = new City(
                R.drawable.nyc,
                nycImages,
                "New York City, U.S.A",
                "New York City, also known as the city that never sleeps, is a vibrant city in the United States of America. We recommend this destination for young adults who wish to stay up all night and explore the exciting night life, as well as for musical fans who will love everything Broadway has to offer.",
                "1. Times Square\n2. Empire State Building\n" +
                        "3. Central Park\n4. Statue of Liberty\n" +
                        "5. Manhattan Bridge");

        List<Integer> londonImages = Arrays.asList(
                R.drawable.london_1, R.drawable.london_2, R.drawable.london_3,
                R.drawable.london_4, R.drawable.london_5);
        City london = new City(
                R.drawable.london,
                londonImages,
                "London, U.K",
                "London is the capital and largest city in England. It is both old and new where you can find an ancient castle right next to modern skyscrapers. Enjoy the unique Changing of the Guard ceremony which takes place at 11:30am every day in the summer months at the Buckingham Palace.",
                "1. Big Ben\n2. Buckingham Palace\n" +
                        "3. London Bridge\n4. Westminster Abbey\n" +
                        "5. Hyde Park");
        cities.add(paris);
        cities.add(nyc);
        cities.add(london);

        TextView title = findViewById(R.id.titleTextView);
        title.setText("Destinations");

        TextView description = findViewById(R.id.descriptionTextView);
        description.setText("Select a destination below to see more details on each city and our top exploring recommendations");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(new CityAdapter(cities));
    }
}
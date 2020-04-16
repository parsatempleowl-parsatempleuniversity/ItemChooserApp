package com.example.itemchooserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ItemListFragment.ItemSelectedInterface{

    boolean singleContainer;
    ItemDetailsFragment itemDetailsFragment = new ItemDetailsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = {"Blu-Ray: Star Trek: The Motion Picture Collection (All 6 Movies)", "Blu-Ray: The Boy Who Cried Werewolf: Nickelodeon",
                "Blu-Ray: Real Steel", "Blu-Ray: BumbleBee", "Blu-Ray: Wimbledon", "Blu-Ray: Family Double Feature: A Cinderella Story, Another Cinderella Story",
                "Blu-Ray: Star Trek", "Blu-Ray: She’s Out Of My League", "Blu-Ray: Fast & Furious: 7-Movie Collection", "Blu-Ray: The Hunger Games: Complete 4-Film Collection",
                "Blu-Ray: Transformers: 5-Movie Collection", "Blu-Ray: Frozen: Disney", "Blu-Ray: Fifty Shades: 3-Movie Collection", "Blu-Ray: Twilight", "Blu-Ray: Transformers: 2-Movie Collection"};

        getSupportFragmentManager().beginTransaction().replace(R.id.container_1, ItemListFragment.newInstance(items)).addToBackStack(null).commit();
        singleContainer = findViewById(R.id.container_2) == null;
        if(!singleContainer) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container_2, itemDetailsFragment).addToBackStack(null).commit();
        }
    }

    @Override
    public void chosenItem(String item) {
        if(singleContainer) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container_1, ItemDetailsFragment.newInstance(item)).addToBackStack(null).commit();
        }
        else {
            itemDetailsFragment.displayItemInformation(item);
        }
    }
    }
}

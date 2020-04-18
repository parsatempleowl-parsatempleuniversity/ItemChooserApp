package com.example.itemchooserapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailsFragment extends Fragment {

    private View view;
    private final static String ITEM_KEY = "itemKey";
    private String item;

    public ItemDetailsFragment() {
        // Required empty public constructor
    }

    static ItemDetailsFragment newInstance(String item) {
        Bundle bundle = new Bundle();
        ItemDetailsFragment itemDetailsFragment = new ItemDetailsFragment();
        bundle.putString(ITEM_KEY, item);
        itemDetailsFragment.setArguments(bundle);
        return itemDetailsFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle != null) {
            this.item = bundle.getString(ITEM_KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_item_details, container, false);
        if(item != null) {
            displayItemInformation(item);
        }
        return view;
    }

    void displayItemInformation(String item) {
        ImageView imageView;
        imageView = view.findViewById(R.id.imageView);
        TextView textView1;
        textView1 = view.findViewById(R.id.textView1);
        TextView textView2;
        textView2 = view.findViewById(R.id.textView2);
        TextView textView3;
        textView3 = view.findViewById(R.id.textView3);
        switch (item) {
            case "Blu-Ray: Star Trek: The Motion Picture Collection (All 6 Movies)":
                imageView.setImageResource(R.drawable.image1);
                textView1.setText(R.string.price1);
                textView2.setText(R.string.pricePlusTax1);
                textView3.setText(R.string.item1);
                break;
            case "Blu-Ray: The Boy Who Cried Werewolf: Nickelodeon":
                imageView.setImageResource(R.drawable.image2);
                textView1.setText(R.string.price2);
                textView2.setText(R.string.pricePlusTax2);
                textView3.setText(R.string.item2);
                break;
            case "Blu-Ray: Real Steel":
                imageView.setImageResource(R.drawable.image3);
                textView1.setText(R.string.price2);
                textView2.setText(R.string.pricePlusTax2);
                textView3.setText(R.string.item3);
                break;
            case "Blu-Ray: BumbleBee":
                imageView.setImageResource(R.drawable.image4);
                textView1.setText(R.string.price2);
                textView2.setText(R.string.pricePlusTax2);
                textView3.setText(R.string.item4);
                break;
            case "Blu-Ray: Wimbledon":
                imageView.setImageResource(R.drawable.image5);
                textView1.setText(R.string.price2);
                textView2.setText(R.string.pricePlusTax2);
                textView3.setText(R.string.item5);
                break;
            case "Blu-Ray: Family Double Feature: A Cinderella Story, Another Cinderella Story":
                imageView.setImageResource(R.drawable.image6);
                textView1.setText(R.string.price3);
                textView2.setText(R.string.pricePlusTax3);
                textView3.setText(R.string.item6);
                break;
            case "Blu-Ray: Star Trek":
                imageView.setImageResource(R.drawable.image7);
                textView1.setText(R.string.price2);
                textView2.setText(R.string.pricePlusTax2);
                textView3.setText(R.string.item7);
                break;
            case "Blu-Ray: She’s Out Of My League":
                imageView.setImageResource(R.drawable.image8);
                textView1.setText(R.string.price2);
                textView2.setText(R.string.pricePlusTax2);
                textView3.setText(R.string.item8);
                break;
            case "Blu-Ray: Fast & Furious: 7-Movie Collection":
                imageView.setImageResource(R.drawable.image9);
                textView1.setText(R.string.price4);
                textView2.setText(R.string.pricePlusTax4);
                textView3.setText(R.string.item9);
                break;
            case "Blu-Ray: The Hunger Games: Complete 4-Film Collection":
                imageView.setImageResource(R.drawable.image10);
                textView1.setText(R.string.price5);
                textView2.setText(R.string.pricePlusTax5);
                textView3.setText(R.string.item10);
                break;
            case "Blu-Ray: Transformers: 5-Movie Collection":
                imageView.setImageResource(R.drawable.image11);
                textView1.setText(R.string.price6);
                textView2.setText(R.string.pricePlusTax6);
                textView3.setText(R.string.item11);
                break;
            case "Blu-Ray: Frozen: Disney":
                imageView.setImageResource(R.drawable.image12);
                textView1.setText(R.string.price2);
                textView2.setText(R.string.pricePlusTax2);
                textView3.setText(R.string.item12);
                break;
            case "Blu-Ray: Fifty Shades: 3-Movie Collection":
                imageView.setImageResource(R.drawable.image13);
                textView1.setText(R.string.price7);
                textView2.setText(R.string.pricePlusTax7);
                textView3.setText(R.string.item13);
                break;
            case "Blu-Ray: Twilight":
                imageView.setImageResource(R.drawable.image14);
                textView1.setText(R.string.price2);
                textView2.setText(R.string.pricePlusTax2);
                textView3.setText(R.string.item14);
                break;
            case "Blu-Ray: Transformers: 2-Movie Collection":
                imageView.setImageResource(R.drawable.image15);
                textView1.setText(R.string.price3);
                textView2.setText(R.string.pricePlusTax3);
                textView3.setText(R.string.item15);
                break;
        }
    }
}

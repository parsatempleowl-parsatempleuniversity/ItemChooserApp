package com.example.itemchooserapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ItemListFragment extends Fragment {

    private ItemSelectedInterface parent;
    private String[] items;
    private final static String ITEMS_KEY = "itemsKey";

    public ItemListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        parent = (ItemSelectedInterface) context;
    }

    static ItemListFragment newInstance(String[] items) {
        Bundle bundle = new Bundle();
        ItemListFragment itemListFragment = new ItemListFragment();
        bundle.putStringArray(ITEMS_KEY, items);
        itemListFragment.setArguments(bundle);
        return itemListFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle != null) {
            items = bundle.getStringArray(ITEMS_KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        ListView listView = view.findViewById(R.id.listView);

        ArrayAdapter arrayAdapter = new ArrayAdapter<>((Context) parent, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                ItemListFragment.this.parent.chosenItem(item);
            }
        });
        return view;
    }

    interface ItemSelectedInterface {
        void chosenItem(String item);
    }
}

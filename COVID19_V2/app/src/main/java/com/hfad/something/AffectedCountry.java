package com.hfad.something;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class AffectedCountry extends Fragment {
    EditText edtSearch;
    ListView listView;

    public static List<CountryModel> countryModelList = new ArrayList<>();
    CountryModel countryModel;
    MyCustomAdapter myCustomAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_affected_country, container, false);

        edtSearch = view.findViewById(R.id.edtSearch);
        listView = view.findViewById(R.id.listView);
        fetchData();

        return view;
    }

    private void fetchData() {
        String url = "//api.covid19api.com/summary"; //chua co API
    }
}

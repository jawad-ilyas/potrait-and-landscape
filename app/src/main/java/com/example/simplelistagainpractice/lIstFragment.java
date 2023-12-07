package com.example.simplelistagainpractice;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class lIstFragment extends ListFragment {



    public  interface onItemClicked
    {

        void itemClicked (int position);
    }
    onItemClicked myActivity;


    public lIstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        myActivity.itemClicked(position);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        myActivity = (onItemClicked) context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<String> names = new ArrayList<>();
        names.add("jawad");
        names.add("ilyas");
        names.add("mughal");
        names.add("ahmad");

        setListAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_single_choice, names));
    }



//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_l_ist, container, false);
//    }
}
package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentASayfaBinding;
import com.example.odev4.databinding.FragmentAnasayfaBinding;

public class ASayfaFragment extends Fragment {

    private FragmentASayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentASayfaBinding.inflate(inflater, container, false);

        binding.ASayfaBtn.setOnClickListener(view -> {
            //Snackbar.make(view,"A Sayfasındasın",Snackbar.LENGTH_SHORT).show();
            Navigation.findNavController(view).navigate(R.id.BSayfaFragment);

        });

        return binding.getRoot();
    }
}
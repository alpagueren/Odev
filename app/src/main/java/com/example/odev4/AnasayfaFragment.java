package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentAnasayfaBinding;
import com.google.android.material.snackbar.Snackbar;

public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.AnasayfaBtnBir.setOnClickListener(view -> {
            //Snackbar.make(view,"Merhaba",Snackbar.LENGTH_SHORT).show();
            Navigation.findNavController(view).navigate(R.id.ASayfaFragment);

        });

        binding.AnasayfaBtnIki.setOnClickListener(view -> {
            //Snackbar.make(view,"Dünyalı",Snackbar.LENGTH_SHORT).show();
            Navigation.findNavController(view).navigate(R.id.XSayfaFragment);
        });

        return binding.getRoot();
    }
}
package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentASayfaBinding;
import com.example.odev4.databinding.FragmentBSayfaBinding;

public class BSayfaFragment extends Fragment {

    private FragmentBSayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBSayfaBinding.inflate(inflater, container, false);

        binding.BSayfaBtn.setOnClickListener(view -> {
            //Snackbar.make(view,"B Sayfasındasın",Snackbar.LENGTH_SHORT).show();
            Navigation.findNavController(view).navigate(R.id.YSayfaFragment);

        });

        return binding.getRoot();
    }
}
package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentASayfaBinding;
import com.example.odev4.databinding.FragmentXSayfaBinding;

public class XSayfaFragment extends Fragment {

    private FragmentXSayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentXSayfaBinding.inflate(inflater, container, false);

        binding.XSayfaBtn.setOnClickListener(view -> {
            //Snackbar.make(view,"X Sayfasındasın",Snackbar.LENGTH_SHORT).show();
            Navigation.findNavController(view).navigate(R.id.YSayfaFragment);

        });

        return binding.getRoot();
    }
}
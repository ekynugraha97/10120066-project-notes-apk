package com.eky.tugasuts.ui.profile;

/*
 * NIM : 10120066
 *Nama : Eky Nugraha Heriawan
 *Kelas : IF2
 *Email : eky.10120066@mahasiswa.unikom.ac.id
 * */


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eky.tugasuts.DialogAbout;
import com.eky.tugasuts.R;

import androidx.fragment.app.Fragment;

public class FragmentProfile extends Fragment {
    ImageView Instagram, Whatsapp, Telegram, Gmail, Github, Linkedin, Maps;
    TextView Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);


        Abouts = root.findViewById(R.id.about);



        Abouts.setOnClickListener(view -> {
            DialogAbout DialogAbout = new DialogAbout();
            DialogAbout.show(requireFragmentManager(),"Putri Silva Amrillah");
        });

        return root;
    }
}


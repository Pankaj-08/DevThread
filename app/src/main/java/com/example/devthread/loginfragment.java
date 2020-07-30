package com.example.devthread;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class loginfragment extends Fragment {
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentlogin, container, false);

        Button button = view.findViewById(R.id.log);
        button.setOnClickListener(new View.OnClickListener() {
            private Context context;
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),homepage.class);
                startActivity(intent);

            }
        });
        return view;
    }

}

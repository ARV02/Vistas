package com.example.myapplication.gastosembarque;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.LoggingMXBean;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    private EditText Total;
    private Button edit;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_blank, container, false);
        Total=rootView.findViewById(R.id.total);
        edit=rootView.findViewById(R.id.editar);
        Total(rootView);
        return rootView;
    }
    public void Total(View v){
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total=Double.parseDouble(Total.getText().toString());
                NumberFormat formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","MX"));
                Toast.makeText(getActivity(), "El totak es de: "+formatoImporte.format(total), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.monikathatipally.tabstackv2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Tab1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.tab1_view, container, false);


        Button bt=(Button)V.findViewById(R.id.button);
       final EditText et=(EditText)V.findViewById(R.id.editText);
       final  EditText et2=(EditText)V.findViewById(R.id.editText2);
        final EditText et3=(EditText)V.findViewById(R.id.editText3);
        bt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

try {

    final String ets = et.getText().toString();
    double wgt = Double.parseDouble(ets);


    String et2s = et2.getText().toString();
    double hgt = Double.parseDouble(et2s);


    double bmi = (wgt / ((hgt * hgt) / 10000));

    if (bmi >= 30) {
        et3.setText("Obese");
    } else if (bmi >= 25) {
        et3.setText("Overweight");
    } else if (bmi >= 18.5) {
        et3.setText("Normal Weight");
    } else {
        et3.setText("Under Weight");
    }
}catch (NumberFormatException e){
                    Toast.makeText(getActivity().getBaseContext(),"Please input the values",Toast.LENGTH_LONG).show();
                    }
                }}
        );
        return V;
    }
}
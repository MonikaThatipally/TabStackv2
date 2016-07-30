package com.example.monikathatipally.tabstackv2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tab2Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.tab2_view, container, false);
        Button tbt=(Button)V.findViewById(R.id.tabbutton);
        final EditText tet=(EditText)V.findViewById(R.id.tabeditText);
        final  EditText tet2=(EditText)V.findViewById(R.id.tabeditText2feet);
        final EditText tetnew=(EditText)V.findViewById(R.id.tabeditText2inch);
        final EditText tet3=(EditText)V.findViewById(R.id.tabeditText3);

        tbt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
try {
    String tets = tet.getText().toString();
    double twgt = Double.parseDouble(tets);

    String tet2s = tet2.getText().toString();
    double thgt = Double.parseDouble(tet2s);

    String tetnews = tetnew.getText().toString();
    double tnew = Double.parseDouble(tetnews);


    double height = ((thgt * 12) + tnew) * ((thgt * 12) + tnew);
    double bminew = (twgt / height) * 703;

    if (bminew >= 30) {
        tet3.setText("Obese");
    } else if (bminew >= 25) {
        tet3.setText("Overweight");
    } else if (bminew >= 18.5) {
        tet3.setText("Normal Weight");
    } else {
        tet3.setText("Under Weight");
    }


}

catch (NumberFormatException e){
    Toast.makeText(getActivity().getBaseContext(),"Please input the values",Toast.LENGTH_LONG).show();
}
                    }}
        );
        return V;
    }
}
package proyects.carosdrean.xyz.encuentralobetha.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import proyects.carosdrean.xyz.encuentralobetha.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleCategoriaFragment extends Fragment {


    public DetalleCategoriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalle_categoria, container, false);
    }

}

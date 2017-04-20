package proyects.carosdrean.xyz.encuentralobetha.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import proyects.carosdrean.xyz.encuentralobetha.Adaptador.AdaptadorCategoria;
import proyects.carosdrean.xyz.encuentralobetha.R;
import proyects.carosdrean.xyz.encuentralobetha.pojo.Categoria;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExplorarFragment extends Fragment {

    ArrayList<Categoria> categorias;
    private RecyclerView listacategoria;

    public ExplorarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_explorar, container, false);
        listacategoria = (RecyclerView)v.findViewById(R.id.lista_explorar);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listacategoria.setLayoutManager(llm);

        inicializar();
        inicializarAdaptador();
        return v;
    }

    public void inicializarAdaptador(){
        AdaptadorCategoria adaptadorCategoria = new AdaptadorCategoria(categorias, getActivity());
        listacategoria.setAdapter(adaptadorCategoria);
    }

    public void inicializar(){
        categorias = new ArrayList<>();

        categorias.add(new Categoria("Software", "CarosDrean", "Drean", "Caros", R.drawable.fondo, R.drawable.perfil, R.drawable.fondo));
        categorias.add(new Categoria("Golosina", "CarosDrean", "Drean", "Caros", R.drawable.fondo, R.drawable.perfil, R.drawable.fondo));
        categorias.add(new Categoria("Combustible", "CarosDrean", "Drean", "Caros", R.drawable.fondo, R.drawable.perfil, R.drawable.fondo));
        categorias.add(new Categoria("Software", "CarosDrean", "Drean", "Caros", R.drawable.fondo, R.drawable.perfil, R.drawable.fondo));
        categorias.add(new Categoria("Software", "CarosDrean", "Drean", "Caros", R.drawable.fondo, R.drawable.perfil, R.drawable.fondo));
        categorias.add(new Categoria("Software", "CarosDrean", "Drean", "Caros", R.drawable.fondo, R.drawable.perfil, R.drawable.fondo));
    }

}

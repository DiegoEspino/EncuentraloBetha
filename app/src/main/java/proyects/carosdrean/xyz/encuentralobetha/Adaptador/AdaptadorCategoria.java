package proyects.carosdrean.xyz.encuentralobetha.Adaptador;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import proyects.carosdrean.xyz.encuentralobetha.MainActivity;
import proyects.carosdrean.xyz.encuentralobetha.R;
import proyects.carosdrean.xyz.encuentralobetha.pojo.Categoria;

/**
 * Created by josue on 19/04/2017.
 */

public class AdaptadorCategoria extends RecyclerView.Adapter<AdaptadorCategoria.CategoriaViewHolder> {

    ArrayList<Categoria> categorias;
    Activity activity;
    MainActivity mainActivity;

    public AdaptadorCategoria(ArrayList<Categoria> categorias, Activity activity) {
        this.categorias = categorias;
        this.activity = activity;
    }

    @Override
    public CategoriaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_explorar, parent, false);
        return new CategoriaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final CategoriaViewHolder categoriaViewHolder, int position) {
        final Categoria categoria = categorias.get(position);
        categoriaViewHolder.categoria.setText(categoria.getCategoria());
        categoriaViewHolder.imgP.setImageResource(categoria.getImgP());
        categoriaViewHolder.imgS.setImageResource(categoria.getImgS());
        categoriaViewHolder.imgT.setImageResource(categoria.getImgT());
        categoriaViewHolder.nombreP.setText(categoria.getNombreP());
        categoriaViewHolder.nombreS.setText(categoria.getNombreS());
        categoriaViewHolder.nombreT.setText(categoria.getNombreT());

        categoriaViewHolder.categoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "ver " + categoria.getCategoria(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return categorias.size();
    }

    public static class CategoriaViewHolder extends RecyclerView.ViewHolder{

        private TextView categoria;
        private TextView nombreP;
        private TextView nombreS;
        private TextView nombreT;
        private ImageView imgP;
        private ImageView imgS;
        private ImageView imgT;

        public CategoriaViewHolder(View itemView) {
            super(itemView);
            categoria = (TextView)itemView.findViewById(R.id.categoria);
            nombreP = (TextView)itemView.findViewById(R.id.tv_nombre_p);
            nombreS = (TextView)itemView.findViewById(R.id.tv_nombre_s);
            nombreT = (TextView)itemView.findViewById(R.id.tv_nombre_t);
            imgP = (ImageView)itemView.findViewById(R.id.iv_p);
            imgS = (ImageView)itemView.findViewById(R.id.iv_s);
            imgT = (ImageView)itemView.findViewById(R.id.iv_t);
        }
    }
}

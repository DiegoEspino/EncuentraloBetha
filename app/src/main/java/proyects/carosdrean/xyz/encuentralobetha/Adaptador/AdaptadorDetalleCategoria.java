package proyects.carosdrean.xyz.encuentralobetha.Adaptador;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import proyects.carosdrean.xyz.encuentralobetha.R;
import proyects.carosdrean.xyz.encuentralobetha.pojo.EmpresaVenta;

/**
 * Created by josue on 20/04/2017.
 */

public class AdaptadorDetalleCategoria extends RecyclerView.Adapter<AdaptadorDetalleCategoria.AdaptadorDetalleCategoriaViewHolder> {

    ArrayList<EmpresaVenta> empresas;

    public AdaptadorDetalleCategoria(ArrayList<EmpresaVenta> empresas) {
        this.empresas = empresas;
    }

    @Override
    public AdaptadorDetalleCategoriaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detalle_categoria, parent, false);
        return new AdaptadorDetalleCategoriaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdaptadorDetalleCategoriaViewHolder holder, int position) {
        EmpresaVenta empresa = empresas.get(position);
        holder.categoria.setText(empresa.getCategoria());
        holder.nombreEmpresa.setText(empresa.getNombreEmpresa());
        holder.direccion.setText(empresa.getDireccion());
        holder.perfil.setImageResource(empresa.getLogo());
    }

    @Override
    public int getItemCount() {
        return empresas.size();
    }

    public static class AdaptadorDetalleCategoriaViewHolder extends RecyclerView.ViewHolder{

        private TextView categoria;
        private TextView nombreEmpresa;
        private TextView direccion;
        private CircleImageView perfil;

        public AdaptadorDetalleCategoriaViewHolder(View itemView) {
            super(itemView);
            categoria = (TextView)itemView.findViewById(R.id.tv_categoria);
            nombreEmpresa = (TextView)itemView.findViewById(R.id.tv_name);
            direccion = (TextView)itemView.findViewById(R.id.tv_direccion);
            perfil = (CircleImageView)itemView.findViewById(R.id.iv_avatar);
        }
    }
}

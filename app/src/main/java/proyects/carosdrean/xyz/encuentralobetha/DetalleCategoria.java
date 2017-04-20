package proyects.carosdrean.xyz.encuentralobetha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import proyects.carosdrean.xyz.encuentralobetha.Adaptador.AdaptadorDetalleCategoria;
import proyects.carosdrean.xyz.encuentralobetha.pojo.EmpresaVenta;

public class DetalleCategoria extends AppCompatActivity {

    private ArrayList<EmpresaVenta> empresas;
    private RecyclerView listaDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_categoria);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarDetealleCategoria);
        setSupportActionBar(toolbar);

        listaDetalle = (RecyclerView)findViewById(R.id.lista_detale_categoria);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        listaDetalle.setLayoutManager(llm);

        inicalizarDatos();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        AdaptadorDetalleCategoria adc = new AdaptadorDetalleCategoria(empresas);
        listaDetalle.setAdapter(adc);
    }

    public void inicalizarDatos(){
        empresas = new ArrayList<>();
        empresas.add(new EmpresaVenta("Software", "Drean", "Acomayo", "Empresa dedicada a la venta de...", R.drawable.perfil));
        empresas.add(new EmpresaVenta("Software", "Caros", "Acomayo", "Empresa dedicada a la venta de...", R.drawable.perfil));
        empresas.add(new EmpresaVenta("Software", "Oscar", "Acomayo", "Empresa dedicada a la venta de...", R.drawable.perfil));
    }
}

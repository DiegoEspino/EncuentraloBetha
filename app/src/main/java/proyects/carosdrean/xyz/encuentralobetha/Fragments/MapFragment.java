package proyects.carosdrean.xyz.encuentralobetha.Fragments;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import proyects.carosdrean.xyz.encuentralobetha.R;

/**
 * Created by josue on 16/04/2017.
 */

public class MapFragment extends SupportMapFragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        getMapAsync(this);

        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap map)  {
        // Posicionar el mapa en una localización y con un nivel de zoom
        LatLng latLng = new LatLng(-14.064047, -75.729112);
        // Un zoom mayor que 13 hace que el emulador falle, pero un valor deseado para
        // callejero es 17 aprox.
        float zoom = 15;
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom));

        map.addMarker(new MarkerOptions()
                .position(new LatLng(-14.063087, -75.729737))
                .title("Radio")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.imagen))
        );

        map.addMarker(new MarkerOptions()
                        .position(new LatLng(-14.063122, -75.727747))
                        .title("velazco")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.imagen))
        );

        map.addMarker(new MarkerOptions()
                        .position(new LatLng(-14.065752, -75.728000))
                        .title("Cosmopolitan")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.imagen))
        );
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-14.063980, -75.727405))
                .title("Ayacucho")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.imagen))
        );
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-14.062044, -75.728031))
                .title("Independencia")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.imagen))
        );
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-14.062044, -75.728031))
                .title("Sf")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.imagen))
        );
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-14.062044, -75.728031))
                .title("Oeshle")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.imagen))
        );

        // Colocar un marcador en la misma posición
        map.addMarker(new MarkerOptions().position(latLng));
        // Más opciones para el marcador en:
        // https://developers.google.com/maps/documentation/android/marker

        // Otras configuraciones pueden realizarse a través de UiSettings
        // UiSettings settings = getMap().getUiSettings();
    }
}

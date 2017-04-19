package proyects.carosdrean.xyz.encuentralobetha;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import proyects.carosdrean.xyz.encuentralobetha.Fragments.ExplorarFragment;
import proyects.carosdrean.xyz.encuentralobetha.Fragments.MapFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private Button ofertas;
    private Toolbar toolbarDemas;
    private AppBarLayout contToolbar;
    private AppBarLayout contToolDemas;
    private DrawerLayout drawer;
    private boolean demas = false;
    private Toolbar menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();

        if(demas){
            setSupportActionBar(toolbarDemas);
        }else{
            setSupportActionBar(toolbar);
        }

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if(navigationView != null){
            onNavigationItemSelected(navigationView.getMenu().getItem(0));
            contToolDemas.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        boolean inicio = false;

        boolean fragementManager = false;
        Fragment fragment = null;

        if (id == R.id.nav_camera) {
            inicio = true;
            demas = false;
            fragementManager = true;
            fragment = new MapFragment();
        } else if (id == R.id.nav_gallery) {
            demas = true;
            inicio = false;
            fragementManager = true;
            fragment = new ExplorarFragment();
        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_share) {

        }

        if (fragementManager){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content_main, fragment)
                    .commit();

            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());

            if(inicio){
                contToolDemas.setVisibility(View.INVISIBLE);
                contToolbar.setVisibility(View.VISIBLE);
                ofertas.setVisibility(View.VISIBLE);
                setSupportActionBar(toolbar);
                ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
                drawer.setDrawerListener(toggle);
                toggle.syncState();
                getSupportActionBar().setTitle("¿Que estas buscando hoy?");

            }

            if (demas){
                contToolbar.setVisibility(View.INVISIBLE);
                contToolDemas.setVisibility(View.VISIBLE);
                ofertas.setVisibility(View.INVISIBLE);
                setSupportActionBar(toolbarDemas);
                ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                        this, drawer, toolbarDemas, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
                drawer.setDrawerListener(toggle);
                toggle.syncState();
                getSupportActionBar().setTitle(item.getTitle());
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void inicializar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        ofertas = (Button)findViewById(R.id.ofertas);
        toolbarDemas = (Toolbar)findViewById(R.id.toolbarDemas);
        contToolbar = (AppBarLayout)findViewById(R.id.cont_toolbar);
        contToolDemas = (AppBarLayout)findViewById(R.id.cont_tooldemas);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    }
}

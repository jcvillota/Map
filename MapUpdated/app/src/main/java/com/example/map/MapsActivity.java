package com.example.map;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);


        LatLng urdaneta = new LatLng(15.980659, 120.560805);
        LatLng rosales = new LatLng(15.891507117010121, 120.63056276974392);
        LatLng ervin = new LatLng(15.966980220164183, 120.49985780347349);


        mMap.addMarker(new MarkerOptions().position(urdaneta).title("Marker in Urdaneta City University"));
        mMap.addMarker(new MarkerOptions().position(rosales).title("Marker in Rosales (Villota)"));
        mMap.addMarker(new MarkerOptions().position(ervin).title("Marker in Zamora House"));





        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.891507117010121, 120.63056276974392),
                        new LatLng(15.894287772593382, 120.6305054241724),
                        new LatLng(15.895895990724659, 120.62842722035592),
                        new LatLng(15.896440353796134, 120.62784917026694),
                        new LatLng(15.897227940313707, 120.62677736906029),
                        new LatLng(15.897830210276112, 120.6255730980416),
                        new LatLng(15.897922867061386, 120.62444108309353),
                        new LatLng(15.898015523775964, 120.62356196524986),
                        new LatLng(15.897864956593097, 120.62239382236173),
                        new LatLng(15.894125130724785, 120.61414165829598),
                        new LatLng(15.88940524810093, 120.60867828182892),
                        new LatLng(15.885953608965737, 120.60260875568854),
                        new LatLng(15.885795547007449, 120.60175027162208),
                        new LatLng(15.885760798634578, 120.59973913902083),
                        new LatLng(15.885598639481882, 120.5975473657668),
                        new LatLng(15.89553465883042, 120.59180250352341),
                        new LatLng(15.898655818763006, 120.58934661998109),
                        new LatLng(15.905910219605076, 120.58522424403505),
                        new LatLng(15.928908940122419, 120.58014819065062),
                        new LatLng(15.936048580108796, 120.58115495092599),

                        new LatLng(15.944701064628136, 120.58044144728333),
                        new LatLng(15.95897896570218, 120.57452672913186),
                        new LatLng(15.972744860608579, 120.57104968551012),

                        new LatLng(15.979194, 120.571094),
                        new LatLng(15.978749, 120.566048),
                        new LatLng(15.981051, 120.561371),

                        new LatLng(15.980659, 120.560805))
                .width(10)
                .color(Color.BLUE));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.966980220164183, 120.49985780347349),
                        new LatLng(15.96859369210447, 120.49790948950867),
                        new LatLng(15.96925775517028, 120.49714698133411),
                        new LatLng(15.96954512912741, 120.49689404444425),
                        new LatLng( 15.970452851415143, 120.49623487188467),
                        new LatLng(15.971171287679987, 120.49571166726518),
                        new LatLng(15.972214950321089, 120.49525263951352),
                        new LatLng(15.972605015225552, 120.49502965210674),
                        new LatLng(15.973386107284158, 120.49428290926298),
                        new LatLng(15.975623989730126, 120.49282098200877),
                        new LatLng(15.982501074681869, 120.52542844559645),
                        new LatLng(15.979806266038306, 120.5367455948701),
                        new LatLng(15.974981697101635, 120.54583749892267),
                        new LatLng(15.974591480735354, 120.55465490734565),
                        new LatLng(15.975081042116296, 120.56023778489951),
                        new LatLng(15.97558367657384, 120.56369270909573),
                        new LatLng(15.979998474759377, 120.56344116171991))
                .width(10)
                .color(Color.BLUE));






       CameraPosition cameraPosition= new CameraPosition.Builder()
               .target(urdaneta)
                .zoom(17)
              .bearing(90)
               .tilt(40)
                .build();
        mMap.animateCamera(CameraUpdateFactory. newCameraPosition(cameraPosition));

    }
}
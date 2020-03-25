package com.alejandrazuleta.practica7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val ciudaduniversitaria = LatLng(6.2677479, -75.5688416)
        val antiguaEscFacultadDerecho =LatLng(6.2461633,-75.5654699)
        val edSuramericana = LatLng(6.2498141,-75.5695823)
        val sedePosgrados =LatLng(6.1980163,-75.5868495)
        val edSanIgn = LatLng(6.2465173,-75.5683697)
        val secOriente =LatLng(6.1056047,-75.389768)
        val secOccidente = LatLng(6.5550179,-75.8286603)
        val secBajoCauca = LatLng(7.9917824,-75.2036302)
        val sedeSonson = LatLng(5.718755,-75.2988935)
        val puntomedio = LatLng(6.9640204,-75.4281147)

        mMap.addMarker(MarkerOptions().position(ciudaduniversitaria).title("Ciudad Universitaria"))
        mMap.addMarker(MarkerOptions().position(antiguaEscFacultadDerecho).title("Antigua Escuela Facultad de Derecho"))
        mMap.addMarker(MarkerOptions().position(edSuramericana).title("Edificio Suramericana"))
        mMap.addMarker(MarkerOptions().position(sedePosgrados).title("Sede Posgrados"))
        mMap.addMarker(MarkerOptions().position(edSanIgn).title("Edificio San Ignacio UdeA"))
        mMap.addMarker(MarkerOptions().position(secOriente).title("Seccional Oriente"))
        mMap.addMarker(MarkerOptions().position(secOccidente).title("Seccional Occidente"))
        mMap.addMarker(MarkerOptions().position(secBajoCauca).title("Seccional Bajo Cauca"))
        mMap.addMarker(MarkerOptions().position(sedeSonson).title("Sede Sonsón"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(puntomedio))
        //mMap.moveCamera(CameraUpdateFactory.zoomTo(10f))
        mMap.setMinZoomPreference(8f)
    }
}

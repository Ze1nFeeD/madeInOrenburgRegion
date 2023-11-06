package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.MapObjectCollection
import com.yandex.mapkit.map.PlacemarkMapObject
import com.yandex.mapkit.mapview.MapView
import com.yandex.runtime.image.ImageProvider

class OrenburgMolokoZavodActivity : AppCompatActivity() {

    lateinit var mapView: MapView
    private lateinit var mapObjects: MapObjectCollection
    private lateinit var mapObjectCollection: MapObjectCollection
    private lateinit var placemarkMapObject: PlacemarkMapObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_orenburg_moloko_zavod)

        mapView = findViewById(R.id.mapview1)


        mapView.map.mapType = com.yandex.mapkit.map.MapType.MAP
        mapObjects = mapView.map.mapObjects.addCollection()



        val cameraPosition = CameraPosition(Point(51.802191, 55.084883), 15.0f, 0.0f, 0.0f)
        mapView.map.move(cameraPosition)


        val point = Point(51.802191, 55.084883)

        val marker = R.drawable.marker
        mapObjectCollection = mapView.map.mapObjects
        placemarkMapObject = mapObjectCollection.addPlacemark(point, ImageProvider.fromResource(this, marker))
        placemarkMapObject.setText("Оренбургский Молочный Комбинат")

        val buttonLink = findViewById<Button>(R.id.btnLinkToSite)

        buttonLink.setOnClickListener {
            val url = "https://a7agro.ru/"

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

    }
    fun maps(view: View) {
        val geoUriString = "geo:51.802191, 55.084883?z=15"
        val geoUri: Uri = Uri.parse(geoUriString)
        val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
        startActivity(mapIntent)
    }
    override fun onStop() {

        mapView.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {

        mapView.onStart()
        MapKitFactory.getInstance().onStart()
        super.onStart()
    }
}
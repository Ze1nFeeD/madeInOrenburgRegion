package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ScrollView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.MapObjectCollection
import com.yandex.mapkit.map.PlacemarkMapObject
import com.yandex.mapkit.mapview.MapView
import com.yandex.runtime.image.ImageProvider

class OrskMasoKombinatActivity : AppCompatActivity() {

    lateinit var mapView: MapView
    private lateinit var mapObjects: MapObjectCollection
    private lateinit var mapObjectCollection: MapObjectCollection
    private lateinit var placemarkMapObject: PlacemarkMapObject
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_orsk_maso_kombinat)
        mapView = findViewById(R.id.mapview1)


        mapView.map.mapType = com.yandex.mapkit.map.MapType.MAP
        mapObjects = mapView.map.mapObjects.addCollection()




        val cameraPosition = CameraPosition(Point(51.199688, 58.620408), 15.0f, 0.0f, 0.0f)
        mapView.map.move(cameraPosition)


        val point = Point(51.199688, 58.620408)

        val marker = R.drawable.marker
        mapObjectCollection = mapView.map.mapObjects
        placemarkMapObject = mapObjectCollection.addPlacemark(point, ImageProvider.fromResource(this, marker))

        val buttonLink = findViewById<Button>(R.id.btnLinkToSite)

        buttonLink.setOnClickListener {
            val url = "https://orskmk.ru/"

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val constraintLayoutMap: ConstraintLayout = findViewById(R.id.lockMap)
        constraintLayoutMap.setOnClickListener {
            val myToast = Toast.makeText(this, "Нажали кнопку!", Toast.LENGTH_SHORT)
            myToast.show()
            constraintLayoutMap.visibility = View.GONE
                val myview: ScrollView = findViewById(R.id.myview)
                myview.stopNestedScroll()
        }

    }
    fun maps(view: View) {
        val geoUriString = "geo:51.199688, 58.620408?z=15"
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
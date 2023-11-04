package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.MapObjectCollection
import com.yandex.mapkit.map.PlacemarkMapObject
import com.yandex.mapkit.mapview.MapView
import com.yandex.runtime.image.ImageProvider

class ParkPobediOrenActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>

    lateinit var mapView: MapView
    private lateinit var mapObjects: MapObjectCollection
    private lateinit var mapObjectCollection: MapObjectCollection
    private lateinit var placemarkMapObject: PlacemarkMapObject
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.initialize(this)

        setContentView(R.layout.activity_park_pobedi_oren)
        mapView = findViewById(R.id.mapview1)

        mapView.map.mapType = com.yandex.mapkit.map.MapType.MAP
        mapObjects = mapView.map.mapObjects.addCollection()


        val cameraPosition = CameraPosition(Point(51.776910,  55.165685), 15.0f, 0.0f, 0.0f)
        mapView.map.move(cameraPosition)

        // Добавление маркера
        val point = Point(51.776910,  55.165685)

        val marker = R.drawable.marker
        mapObjectCollection = mapView.map.mapObjects
        placemarkMapObject = mapObjectCollection.addPlacemark(point, ImageProvider.fromResource(this, marker))
        placemarkMapObject.setText("Парк победы") // Устанавливаем текст сверху метки



        viewPager = findViewById(R.id.idViewPager)

        val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)

        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.park4
        imageList = imageList + R.drawable.park5
        imageList = imageList + R.drawable.park6
        imageList = imageList + R.drawable.park7
        imageList = imageList + R.drawable.park8


        viewPagerAdapter = ViewPagerAdapter(this@ParkPobediOrenActivity, imageList)


        viewPager.adapter = viewPagerAdapter
        dotsIndicator.attachTo(viewPager)
    }
    fun maps(view: View) {
        val geoUriString = "geo:51.776910, 55.165685?z=15"
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
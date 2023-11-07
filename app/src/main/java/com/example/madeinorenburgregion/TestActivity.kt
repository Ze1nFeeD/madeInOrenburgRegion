package com.example.madeinorenburgregion

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isGone
import com.example.madeinorenburgregion.databinding.ActivityMainBinding
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.MapKitFactory.setApiKey
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.MapObjectCollection
import com.yandex.mapkit.mapview.MapView
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.PlacemarkMapObject
import com.yandex.runtime.image.ImageProvider


class TestActivity : AppCompatActivity() {

     lateinit var mapView: MapView
    private lateinit var mapObjects: MapObjectCollection
    private lateinit var mapObjectCollection: MapObjectCollection
    private lateinit var placemarkMapObject: PlacemarkMapObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey("33b9b2ff-c110-4b33-9d66-1433f24ea7a7")
        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_test)
        mapView = findViewById(R.id.mapview1)


        mapView.map.mapType = com.yandex.mapkit.map.MapType.MAP
        mapObjects = mapView.map.mapObjects.addCollection()


       // Установка начальной позиции и масштаба карты
       val cameraPosition = CameraPosition(Point(51.755481, 55.108387), 15.0f, 0.0f, 0.0f)
       mapView.map.move(cameraPosition)

        // Добавление маркера
        val point = Point(51.755481, 55.108387)

        val marker = R.drawable.marker // Добавляем ссылку на картинку
        mapObjectCollection = mapView.map.mapObjects // Инициализируем коллекцию различных объектов на карте
        placemarkMapObject = mapObjectCollection.addPlacemark(point, ImageProvider.fromResource(this, marker)) // Добавляем метку со значком
        placemarkMapObject.setText("Музей города Оренбург") // Устанавливаем текст сверху метки

        val constraintLayoutMap: ConstraintLayout = findViewById(R.id.con3)
        constraintLayoutMap.setOnClickListener {
            val myToast = Toast.makeText(this, "Нажали кнопку!", Toast.LENGTH_SHORT)
            myToast.show()
            constraintLayoutMap.visibility = View.GONE
        }
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
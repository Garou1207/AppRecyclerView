package pe.edu.idat.apprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import pe.edu.idat.apprecyclerview.databinding.ActivityMainBinding
import pe.edu.idat.apprecyclerview.databinding.ItemAndroidBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvAndroid.layoutManager = LinearLayoutManager(applicationContext)
        binding.rvAndroid.adapter = AdapterAndroid(
            listaAndroid(),applicationContext)

        //binding.rvAndroid.layoutManager = StaggeredGridLayoutManager
        //binding.rvAndroid.layoutManager = GridLayoutManager
    }

    fun listaAndroid(): List<Android>{
        var lista = ArrayList<Android>()
        lista.add(Android("Angel Cake", "Android 1.0", R.drawable.image1))
        lista.add(Android("Petite Four", "Android 1.1", R.drawable.image2))
        lista.add(Android("Cupcake", "Android 1.5", R.drawable.image3))
        lista.add(Android("Donut", "Android 1.6", R.drawable.image4))
        lista.add(Android("Eclair", "Android 2.0 - 2.1", R.drawable.image5))
        lista.add(Android("Froyo", "Android 2.2 - 2,2,3", R.drawable.image6))
        lista.add(Android("Gingerbread", "Android 2.3 - 2.3.7", R.drawable.image7))
        lista.add(Android("Honeycomb", "Android 3.0 - 3,2,6", R.drawable.image8))
        lista.add(Android("Jelly Bean", "Android 4.1 - 4.3.1", R.drawable.image9))
        lista.add(Android("Mashmellow", "Android 6.0 - 6.1", R.drawable.image10))
        return lista
    }

}
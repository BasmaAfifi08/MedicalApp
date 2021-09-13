package basmaibrahim.example.medicalapp2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import basmaibrahim.example.medicalapp2.R
import basmaibrahim.example.medicalapp2.databinding.ActivityMainBinding
import basmaibrahim.example.medicalapp2.model.User
import basmaibrahim.example.medicalapp2.ui.adapter.UserRecyclerView
import basmaibrahim.example.medicalapp2.ui.adapter.onListItemClick

class MainActivity : AppCompatActivity(){
    // lateinit var rv_showData: RecyclerView


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // val recyclerview = findViewById<RecyclerView>(R.id.rv_showData)


    }
}
/* private fun generateList(size: Int): List<User> {
         val list = ArrayList<ExampleItem>()
         for (i in 0 until size) {
             val drawable = when (i % 3) {
                 0 -> R.drawable.ic_android
                 1 -> R.drawable.ic_audio
                 else -> R.drawable.ic_sun
             }
             val item = User(drawable, "Item $i", "Line 2")
             list += item
         }
         return list
     }*/

package basmaibrahim.example.medicalapp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import basmaibrahim.example.medicalapp2.databinding.FragmentDoctorsNamesBinding
import basmaibrahim.example.medicalapp2.model.User
import basmaibrahim.example.medicalapp2.ui.adapter.UserRecyclerView
import basmaibrahim.example.medicalapp2.ui.adapter.onListItemClick

class DoctorsNamesFragment : Fragment(), onListItemClick {
    var data = ArrayList<User>()
    val userRecyclerView: UserRecyclerView by lazy {
        UserRecyclerView(data)
    }
    lateinit var binding: FragmentDoctorsNamesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDoctorsNamesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvShowData.layoutManager = LinearLayoutManager(context)

        for (i in 0..10) {
            data.add(User("DoctorName" + i, "Address " + i, R.drawable.doctort3))
        }
        binding.rvShowData.adapter = userRecyclerView


        userRecyclerView.onListItemClick = this

        //  rv_showData = findViewById(R.id.rv_showData)
    }

    override fun onItemClick(user: User) {
        Toast.makeText(context, "more about  ${user.name}", Toast.LENGTH_LONG).show()
    }
}


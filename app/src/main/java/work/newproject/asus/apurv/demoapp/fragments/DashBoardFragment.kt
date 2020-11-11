package work.newproject.asus.apurv.demoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_dash_board.*
import work.newproject.asus.apurv.demoapp.R

class DashBoardFragment : Fragment() {

   // var bt_floting_action: Floti?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_dash_board, container, false)
     //   bt_floting_action=view.findViewById(R.id.bt_floting_action)
        bt_floting_action.setOnClickListener {
            Snackbar.make(it, "Demo", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        txtText.setText(R.string.hello_blank_fragment)
        return view
    }
}
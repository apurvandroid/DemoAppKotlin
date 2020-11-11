package work.newproject.asus.apurv.demoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_dash_board.*
import work.newproject.asus.apurv.demoapp.R

class DashBoardFragment : Fragment() {

   lateinit var txtText : TextView
    lateinit var  bt_floting_action : FloatingActionButton
    lateinit var btNext:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_dash_board, container, false)
        txtText=view.findViewById(R.id.txtText)
        btNext=view.findViewById(R.id.btNext)
        bt_floting_action=view.findViewById(R.id.bt_floting_action)
        txtText.setText(R.string.hello_blank_fragment)

        bt_floting_action
            .setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        btNext.setOnClickListener {
            openSecDashboard()
        }

        return view
    }

    private fun openSecDashboard() {
        val args = Bundle()
        val fragmentt: Fragment = SecoundFragment()
        val transaction = fragmentManager?.beginTransaction()
        fragmentt.arguments = args
        transaction?.replace(R.id.fragment, fragmentt)
        transaction?.addToBackStack("sec")?.commit()
    }
}
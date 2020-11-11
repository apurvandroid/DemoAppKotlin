package work.newproject.asus.apurv.demoapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import work.newproject.asus.apurv.demoapp.R
import java.util.*

class ThirdFragment : Fragment() {

    var number: String = "";
    lateinit var txtCount: TextView
    lateinit var txtTitle: TextView
    lateinit var bt_floting_action: FloatingActionButton
    lateinit var btPre: Button
    //
    //;;;

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        number = arguments?.get("number").toString();
        txtCount = view.findViewById(R.id.txtCount)
        bt_floting_action = view.findViewById(R.id.bt_floting_action)
        btPre = view.findViewById(R.id.btPre)
        txtTitle = view.findViewById(R.id.txtTitle)

        bt_floting_action
            .setOnClickListener { view ->
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }


        txtTitle.setText("Here is a random number between 0 and $number")
        val value = number.toInt()
        txtCount.setText(rand(0, value).toString())

        btPre.setOnClickListener {
            activity!!.onBackPressed()
        }

        return view
    }

    val random = Random()
    fun rand(from: Int, to: Int): Int {
        return random.nextInt(to - from) + from
    }


}
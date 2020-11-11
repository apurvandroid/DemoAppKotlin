package work.newproject.asus.apurv.demoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import work.newproject.asus.apurv.demoapp.R
import java.util.*


class SecoundFragment : Fragment() {

    lateinit var btToast:Button
    lateinit var btCount: Button
    lateinit var txtCount:TextView
    lateinit var btRandom:Button
    lateinit var  bt_floting_action : FloatingActionButton
    var countNumber :Int =0
    var count:Int ?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_secound, container, false)
        btToast=view.findViewById(R.id.btToast)
        txtCount=view.findViewById(R.id.txtCount)
        btCount=view.findViewById(R.id.btCount)
        btRandom=view.findViewById(R.id.btRandom)
        btToast.setOnClickListener {
            Toast.makeText(context, R.string.toast, Toast.LENGTH_LONG).show()
        }


        bt_floting_action=view.findViewById(R.id.bt_floting_action)

        bt_floting_action
            .setOnClickListener { view ->
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }



        btCount.setOnClickListener {
            getCount()
        }

        btRandom.setOnClickListener {
            if (!txtCount.text.toString().equals("0")){
                opentThirDashboard();
            }else{
                Toast.makeText(context, "Invalid Counter Number", Toast.LENGTH_LONG).show()
            }

        }

        return view
    }

    fun getCount(){
      countNumber++
       txtCount.setText(countNumber.toString())

    }

    private fun opentThirDashboard() {
        val args = Bundle()
        val fragmentt: Fragment = ThirdFragment()
        args.putString("number",txtCount.text.toString())
        val transaction = fragmentManager?.beginTransaction()
        fragmentt.arguments = args
        transaction?.replace(R.id.fragment, fragmentt)
        transaction?.addToBackStack("the")?.commit()
    }
}
package work.newproject.asus.apurv.demoapp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import work.newproject.asus.apurv.demoapp.fragments.DashBoardFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dashBoard()
    }


    private fun dashBoard() {
        val args = Bundle()
        val fragmentt: Fragment = DashBoardFragment()
        val transaction = supportFragmentManager.beginTransaction()
        fragmentt.arguments = args
        transaction.replace(R.id.fragment, fragmentt)
        transaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
}
package pt.ipt.dama2026.curriculumvitae

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etAnswer = findViewById<EditText>(R.id.etAnswer)
        val btnShowCV = findViewById<Button>(R.id.btnShowCV)
        val cvLayout = findViewById<LinearLayout>(R.id.cvLayout)

        btnShowCV.setOnClickListener {
            if (etAnswer.text.toString().trim().equals("sim", ignoreCase = true)) {
                cvLayout.visibility = View.VISIBLE
            } else {
                cvLayout.visibility = View.GONE
            }
        }
    }
}
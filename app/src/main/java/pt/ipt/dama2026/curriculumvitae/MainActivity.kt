package pt.ipt.dama2026.curriculumvitae

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // EditText for user input
        val etAnswer = findViewById<EditText>(R.id.etAnswer)
        // Button to trigger CV display
        val btnShowCV = findViewById<Button>(R.id.btnShowCV)
        // Layout containing CV info
        val cvLayout = findViewById<LinearLayout>(R.id.cvLayout)

        // CV field TextViews
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvContact = findViewById<TextView>(R.id.tvContact)
        val tvResumo = findViewById<TextView>(R.id.tvResumo)
        val tvEducacaoTitle = findViewById<TextView>(R.id.tvEducacaoTitle)
        val tvEducacao = findViewById<TextView>(R.id.tvEducacao)
        val tvExperienciaTitle = findViewById<TextView>(R.id.tvExperienciaTitle)
        val tvExperiencia = findViewById<TextView>(R.id.tvExperiencia)
        val tvHabilidadesTitle = findViewById<TextView>(R.id.tvHabilidadesTitle)
        val tvHabilidades = findViewById<TextView>(R.id.tvHabilidades)

        btnShowCV.setOnClickListener {
            val answer = etAnswer.text.toString().trim().lowercase()
            when (answer) {
                "guilherme" -> {
                    cvLayout.visibility = View.VISIBLE
                    tvName.setText(R.string.cv_name)
                    tvContact.setText(R.string.cv_contact)
                    tvResumo.setText(R.string.cv_summary)
                    tvEducacaoTitle.setText(R.string.cv_education_title)
                    tvEducacao.setText(R.string.cv_education)
                    tvExperienciaTitle.setText(R.string.cv_experience_title)
                    tvExperiencia.setText(R.string.cv_experience)
                    tvHabilidadesTitle.setText(R.string.cv_skills_title)
                    tvHabilidades.setText(R.string.cv_skills)
                }
                "joao" -> {
                    cvLayout.visibility = View.VISIBLE
                    tvName.setText(R.string.cv_name_joao)
                    tvContact.setText(R.string.cv_contact_joao)
                    tvResumo.setText(R.string.cv_summary_joao)
                    tvEducacaoTitle.setText(R.string.cv_education_title_joao)
                    tvEducacao.setText(R.string.cv_education_joao)
                    tvExperienciaTitle.setText(R.string.cv_experience_title_joao)
                    tvExperiencia.setText(R.string.cv_experience_joao)
                    tvHabilidadesTitle.setText(R.string.cv_skills_title_joao)
                    tvHabilidades.setText(R.string.cv_skills_joao)
                }
                else -> {
                    cvLayout.visibility = View.GONE
                }
            }
        }
    }
}

package layout.atividadefinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.atividadefinal.R

class ResultActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultTextView = findViewById(R.id.textViewResult)

        val result = intent.getDoubleExtra("result", 0.0)
        resultTextView.text = result.toString()
    }
}

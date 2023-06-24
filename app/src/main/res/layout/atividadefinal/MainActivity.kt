import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var sumButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1EditText = findViewById(R.id.editTextNumber1)
        number2EditText = findViewById(R.id.editTextNumber2)
        sumButton = findViewById(R.id.buttonSum)

        sumButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDouble()
            val number2 = number2EditText.text.toString().toDouble()
            val result = number1 + number2

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("result", result)
            startActivity(intent)
        }
    }
}

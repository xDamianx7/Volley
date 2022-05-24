package morales.damian.volley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://www.google.com"

        val stringRequest = StringRequest(Request.Method.GET,url,Response.Listener { respuesta ->
            Log.d("peticion","${respuesta.subSequence(0,500)}")
        }, Response.ErrorListener {
            Log.e("peticion", "ERROR")

        })
        queue.add(stringRequest)
    }
}
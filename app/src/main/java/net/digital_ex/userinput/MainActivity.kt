package net.digital_ex.userinput

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    var numberOfCoffee = 0
    var price = 0
    var quantityTextView : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        quantityTextView = findViewById<TextView>(R.id.count_text_view)
    }
    fun plusNumberOfCoffee (view: View) {
        numberOfCoffee++
        quantityTextView!!.text = numberOfCoffee.toString()

    }
    fun minsNumberOfCoffee (view: View) {
        numberOfCoffee--
        quantityTextView!!.text = numberOfCoffee.toString()

    }
    fun submitOrder(view: View) {
        price = numberOfCoffee * 5;
        var priceTextView = findViewById<TextView>(R.id.price_text_view)
        priceTextView.text = NumberFormat.getCurrencyInstance().format(price.toLong())
    }
}

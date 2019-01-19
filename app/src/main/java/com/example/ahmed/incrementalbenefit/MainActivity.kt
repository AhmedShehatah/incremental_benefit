package com.example.ahmed.incrementalbenefit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            calc.setOnClickListener {
                try{
                var mainMoney = Integer.parseInt(main.text.toString())
                var percent = Integer.parseInt(inc.text.toString())
                var years = Integer.parseInt(yrs.text.toString())
                var x = 1 + (percent / 100.0)
                var y = Math.pow(x, years.toDouble()) // method to calc the power
                /*
                var sum = 1.0
                while (years != 0){  // output --> (1+percent/100)^years
                    sum *= x
                    --years
                }
                */
                var result = mainMoney * y
                money.text = result.toString()
            } catch (ex: Exception) {
            Toast.makeText(this, ex.message.toString(), Toast.LENGTH_SHORT).show()
        }

            }



    }
}

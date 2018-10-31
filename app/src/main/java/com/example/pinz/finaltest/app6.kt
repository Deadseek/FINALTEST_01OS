package com.example.pinz.finaltest

import android.content.Context
import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app6.*

class app6 : AppCompatActivity(), SensorEventListener {



    var running = false
    var sensorManager:SensorManager?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app6)
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

    }


    override fun onResume() {
        super.onResume()
        running = true
        var stepsSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)

        if (stepsSensor == null){
            Toast.makeText(this,"No Step Counter Sensor!",Toast.LENGTH_SHORT).show()
        } else {
            sensorManager?.registerListener(this,stepsSensor,SensorManager.SENSOR_DELAY_UI)
        }

    }

    override fun onPause() {
        super.onPause()
        running = false
        sensorManager?.unregisterListener(this)
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }

    override fun onSensorChanged(event: SensorEvent) {
if (running){
    tv_step.setText(""+event.values[0])
    var kcal = tv_kcal.text.toString()
    var step = tv_step.text.toString()
    if (step.toInt() == 10000){
        kcal = kcal + 500
    }
}
    }



}

package com.example.gpd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    private Sensor lightSensor;
    private Sensor proximitySensor;

    private TextView lightSensorValueTextView;
    private TextView proximitySensorValueTextView;

    private TextView notiflight;
    private TextView notifproximity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightSensorValueTextView = findViewById(R.id.lightSensorValueTextView);
        proximitySensorValueTextView = findViewById(R.id.proximitySensorValueTextView);
        notiflight = findViewById(R.id.lightSensorNotificationTextView);
        notifproximity = findViewById(R.id.proximitySensorNotificationTextView);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        if (sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) != null) {
            lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        } else {
            lightSensorValueTextView.setText("Light Sensor not available");
        }

        if (sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY) != null) {
            proximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        } else {
            proximitySensorValueTextView.setText("Proximity Sensor not available");
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (lightSensor != null) {
            sensorManager.registerListener(this, lightSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }

        if (proximitySensor != null) {
            sensorManager.registerListener(this, proximitySensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_LIGHT) {
            float lightSensorValue = event.values[0];
            lightSensorValueTextView.setText("Light Sensor Value: " + lightSensorValue);

            if (lightSensorValue < 10) {
                // Cahaya terlalu gelap, berikan notifikasi
                String message = "Cahaya terlalu gelap!";
                notiflight.setText(message);
            } else if (lightSensorValue > 100) {
                // Cahaya terlalu terang, berikan notifikasi
                String message = "Cahaya terlalu terang!";
                notiflight.setText(message);
            }
        } else if (event.sensor.getType() == Sensor.TYPE_PROXIMITY) {
            float proximitySensorValue = event.values[0];
            proximitySensorValueTextView.setText("Proximity Sensor Value: " + proximitySensorValue);

            if (proximitySensorValue < proximitySensor.getMaximumRange()) {
                // Objek terdeteksi dalam jarak yang cukup dekat, berikan notifikasi
                String message = "Objek dekat!";
                notifproximity.setText(message);
            } else {
                // Objek tidak terdeteksi dalam jarak yang cukup dekat, berikan notifikasi
                String message = "Objek jauh!";
                notifproximity.setText(message);
            }
        }
    }



    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
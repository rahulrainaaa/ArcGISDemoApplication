package app.demo.arcgisdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.esri.android.map.MapView;


public class MainActivity extends AppCompatActivity {

    private MapView mMapView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMapView = findViewById(R.id.map);

    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mMapView != null) {
            mMapView.pause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mMapView != null) {
            mMapView.unpause();
        }
    }
}

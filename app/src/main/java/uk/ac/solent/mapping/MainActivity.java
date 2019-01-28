package uk.ac.solent.mapping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* add in the mapping view this will loccate the long/lat of the given
        location usind the activity.main page as well
         */


      MapView mv = findViewById(R.id.map1);

      mv.setBuiltInZoomControls(true);
      mv.setClickable(true);

      mv.getController().setZoom(14);
      mv.getController().setCenter(new GeoPoint(51.05, -0.72));



      // btn area






    }
}

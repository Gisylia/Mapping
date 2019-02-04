package uk.ac.solent.mapping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.sun.org.apache.xpath.internal.operations.Bool;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;


//ensure that the main activity implements the stuff on the activity main page
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this is calling the btn action from the activity main
        Button b = (Button) findViewById(R.id.btn1);
        // listener for the button
        b.setOnClickListener(this);

        /* add in the mapping view this will locate the long/lat of the given
        location used in the activity.main page as well
         */
        MapView mv = findViewById(R.id.map1);

        mv.setBuiltInZoomControls(true);
        mv.setClickable(true);
        mv.getController().setZoom(14);
        mv.getController().setCenter(new GeoPoint(51.05, -0.72));
    }


    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.Menu.menu, menu);

        return true;
    }

    public void onClick(View view) {
        // this is from the activity main
        TextView tv = (TextView) findViewById(R.id.tv1);
        EditText et = (EditText) findViewById(R.id.et1);

    }

}

package uk.ac.solent.mapping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


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
        /*
        MapView mv = findViewById(R.id.map1);

        mv.setBuiltInZoomControls(true);
        mv.setClickable(true);
        mv.getController().setZoom(14);
        mv.getController().setCenter(new GeoPoint(51.05, -0.72));
    */
    }

// inflates the xml menu and makes the menu appear in the activity
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
// reacts to an item being selected
    public boolean onOptionsItemsSelected(MenuItem item)

    {
        // use the .id from the menu.xml file
        if(item.getItemId() == R.id.changeMapStyle1)
        {
            Intent intent= new Intent( this, MapChooseActivity.class)
            //start activity actually starts the activity
            startActivity(intent);
            return true;
        }
        return false;

    }

// intent = a message from one application component to another
    public void onClick(View view) {
        // this is from the activity main
        TextView tv = (TextView) findViewById(R.id.tv1);
        EditText et = (EditText) findViewById(R.id.et1);

    }

    // week 6 list views and list activites


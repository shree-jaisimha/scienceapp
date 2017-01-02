/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.jaisimhas.science;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Electricity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);

//The view will display the data in either grid, lineary layout
//The array adaptor defines the data model. It contains the data we plan on displaying
//Array list is used since this is an array which we can use to increase or decrease in size.


        ArrayList<Terms> notes = new ArrayList<Terms>();
        notes.add(new Terms("Voltage","Potential"));
        notes.add(new Terms("Voltage","Potential"));

    //    Log.v("ElectricityActivity", "Word at index 0: " + notes.get(0));

  //      LinearLayout rootview = (LinearLayout)findViewById(R.id.rootView);


        //The adaptor is key as this recycles the memory for the view slots when it is not in focus
        //thereby providing an optimum memory utilization.
        Term_CustomAdaptor adapter = new Term_CustomAdaptor(this,notes);

        ListView listView = (ListView) findViewById(R.id.listing);
        listView.setAdapter(adapter);


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_electricity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

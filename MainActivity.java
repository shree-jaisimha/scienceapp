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

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Forces category
        TextView forces = (TextView) findViewById(R.id.forces);

        // Set a click listener on that View
        forces.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent forcesIntent = new Intent(MainActivity.this, ForceActivity.class);

                // Start the new activity
                startActivity(forcesIntent);
            }
        });

        // Find the View that shows the Simple Machines category
        TextView energysources = (TextView) findViewById(R.id.energysources);

        // Set a click listener on that View
        energysources.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent energysourceIntent = new Intent(MainActivity.this, EnergySources.class);

                // Start the new activity
                startActivity(energysourceIntent);
            }
        });

        // Find the View that shows the Simple Machines category
        TextView energy = (TextView) findViewById(R.id.energy);

        // Set a click listener on that View
        energy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent energyIntent = new Intent(MainActivity.this, Electric.class);

                // Start the new activity
                startActivity(energyIntent);
            }
        });


        // Find the View that shows the Simple Machines category
        TextView environment = (TextView) findViewById(R.id.environment);

        // Set a click listener on that View
        environment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent environmentIntent = new Intent(MainActivity.this, Environment.class);

                // Start the new activity
                startActivity(environmentIntent);
            }
        });


        // Find the View that shows the Simple Machines category
        TextView question_answer = (TextView) findViewById(R.id.question_answer);

        // Set a click listener on that View
        question_answer.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent question_answerIntent = new Intent(MainActivity.this, QuestionAnswerActivity.class);

                // Start the new activity
                startActivity(question_answerIntent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

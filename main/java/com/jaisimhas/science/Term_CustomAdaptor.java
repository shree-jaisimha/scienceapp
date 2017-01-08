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

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Padmalakshmi on 1/1/2017.
 */
public class Term_CustomAdaptor extends ArrayAdapter<Terms> {

//constructor
public Term_CustomAdaptor(Activity context, ArrayList<Terms> Terms)
{
    super(context,0, Terms);
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        Terms currentTerms = getItem(position);
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.terms_list,parent,false);
        }

        Terms currentWord = getItem(position);

        TextView QuestionTextview = (TextView)listItemView.findViewById(R.id.Question);
        QuestionTextview.setText(currentWord.getmQuestion());

        TextView AnswerTextview = (TextView)listItemView.findViewById(R.id.Answer);
        AnswerTextview.setText(currentWord.getmAnswers());

        return listItemView;

    }
}

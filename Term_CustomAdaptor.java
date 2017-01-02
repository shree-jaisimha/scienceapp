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

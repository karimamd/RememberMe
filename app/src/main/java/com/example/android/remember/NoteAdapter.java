package com.example.android.remember;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kareem on 24/01/18.
 */

public class NoteAdapter extends ArrayAdapter<Note> {

    public NoteAdapter(@NonNull Context context, @NonNull List<Note> notes) {
        super(context,0, notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Note note=getItem(position);
        TextView miwok=(TextView) listItemView.findViewById(R.id.note_title);
        miwok.setText(note.getTitle());

        TextView defaultT=(TextView) listItemView.findViewById(R.id.note_content);
        defaultT.setText(note.getContent());

        return listItemView;
        //return super.getView(position, convertView, parent);
    }
}


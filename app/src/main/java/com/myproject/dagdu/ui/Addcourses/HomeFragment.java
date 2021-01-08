package com.myproject.dagdu.ui.Addcourses;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.myproject.dagdu.R;

public class HomeFragment extends Fragment {

    View myview;
    Context mcontext;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mcontext= getContext();
        myview = inflater.inflate(R.layout.fragment_home, container, false);

        return myview;

    }
}
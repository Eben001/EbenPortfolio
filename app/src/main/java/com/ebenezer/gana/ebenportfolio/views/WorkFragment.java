package com.ebenezer.gana.ebenportfolio.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ebenezer.gana.ebenportfolio.R;

public class WorkFragment extends Fragment {

    public WorkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View workFragment = inflater.inflate(R.layout.fragment_work, container, false);
        return workFragment;
    }
}

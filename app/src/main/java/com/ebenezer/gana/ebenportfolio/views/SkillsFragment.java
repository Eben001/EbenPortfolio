package com.ebenezer.gana.ebenportfolio.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ebenezer.gana.ebenportfolio.R;

public class SkillsFragment extends Fragment {
    public SkillsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View skillsFragment = inflater.inflate(R.layout.fragment_skills, container, false);
        return skillsFragment;
    }
}

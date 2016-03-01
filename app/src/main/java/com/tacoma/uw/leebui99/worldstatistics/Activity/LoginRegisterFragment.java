package com.tacoma.uw.leebui99.worldstatistics.Activity;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tacoma.uw.leebui99.worldstatistics.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginRegisterFragment extends Fragment {


    public LoginRegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_register, container, false);
    }


}

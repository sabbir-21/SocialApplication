package com.invissibleapps.socialapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.invissibleapps.socialapplication.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ImageView heartLove;
    private TextView likecount;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
            heartLove = root.findViewById(R.id.heart_love);
            likecount = root.findViewById(R.id.likecount);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        heartLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //heartLove.setColorFilter(ContextCompat.getColor(getContext(),R.color.red));
                Boolean clicked = true;
                if (clicked) {
                    clicked = true;
                    heartLove.setImageResource(R.drawable.redheart);
                    likecount.setText("17,590 likes");
                } else {
                    clicked = false;
                    heartLove.setImageResource(R.drawable.heart);
                    likecount.setText("17,589 likes");
                }
            }
        });
    }
}
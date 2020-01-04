package com.example.fragmentinterfacecomm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentinterfacecomm.Rxbus.RxBus;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


/**

 */
public class SecondFragment extends Fragment {
    private TextView txtName;


    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);

        RxBus.getInstance().listen().subscribe(getInputObserver());
    }

    private Observer<String> getInputObserver() {
        return new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                txtName.setText(s);

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }



        };
    }



}



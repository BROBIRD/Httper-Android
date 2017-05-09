package org.mushare.httper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dklap on 5/4/2017.
 */

public class ResultRawFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_raw_result, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        Bundle bundle = getArguments();
        byte[] data;
        if (bundle != null && (data = bundle.getByteArray("content")) != null)
            textView.setText(new String(data));
        return view;
    }
}
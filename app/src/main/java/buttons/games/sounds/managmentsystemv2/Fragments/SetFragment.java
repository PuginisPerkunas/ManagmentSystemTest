package buttons.games.sounds.managmentsystemv2.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import buttons.games.sounds.managmentsystemv2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SetFragment extends Fragment {

    //TODO !!!ADD FUNCTIONALITY TO ADD BUTTON!!! INIT FRAGMENT, FILL RECYCLER VIEW WITH ITEMS

    public SetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_set, container, false);
    }

}

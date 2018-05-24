package buttons.games.sounds.managmentsystemv2.Fragments.MainFragments;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import buttons.games.sounds.managmentsystemv2.Fragments.AddFragments.AddDevicesSetFragment;
import buttons.games.sounds.managmentsystemv2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SetFragment extends Fragment {

    //TODO !!!ADD FUNCTIONALITY TO ADD BUTTON!!! INIT FRAGMENT, FILL RECYCLER VIEW WITH ITEMS

    FloatingActionButton floatingAddDivice;
    android.support.v4.app.FragmentManager fragmentManager;
    FragmentTransaction ft;

    public SetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_set, container, false);
        final int contentId = R.id.content_frame;
        floatingAddDivice = view.findViewById(R.id.add_set_fb);

        floatingAddDivice.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
                ft = fragmentManager.beginTransaction();
                ft.setCustomAnimations(android.R.animator.fade_in,android.R.animator.fade_out);
                ft.replace(contentId, new AddDevicesSetFragment());
                ft.commit();
            }
        });
        return view;
    }

}

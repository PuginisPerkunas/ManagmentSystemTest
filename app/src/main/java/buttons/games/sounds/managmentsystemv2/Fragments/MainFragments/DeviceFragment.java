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

import buttons.games.sounds.managmentsystemv2.Fragments.AddFragments.AddDeviceFragment;
import buttons.games.sounds.managmentsystemv2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeviceFragment extends Fragment {

    //TODO !!!ADD FUNCTIONALITY TO ADD BUTTON!!! INIT FRAGMENT, FILL RECYCLER VIEW WITH ITEMS

    FloatingActionButton floatingAddDivice;
    android.support.v4.app.FragmentManager fragmentManager;
    FragmentTransaction ft;

    public DeviceFragment() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_device, container, false);
        final int contentId = R.id.content_frame;
        floatingAddDivice = view.findViewById(R.id.add_device_fb);

        floatingAddDivice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
                ft = fragmentManager.beginTransaction();
                ft.setCustomAnimations(android.R.animator.fade_in,android.R.animator.fade_out);
                ft.replace(contentId, new AddDeviceFragment());
                ft.commit();
            }
        });
        return view;
    }

}

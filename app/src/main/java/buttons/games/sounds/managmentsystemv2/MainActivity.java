package buttons.games.sounds.managmentsystemv2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import buttons.games.sounds.managmentsystemv2.Fragments.DeviceFragment;
import buttons.games.sounds.managmentsystemv2.Fragments.PersonFragment;
import buttons.games.sounds.managmentsystemv2.Fragments.SetFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigation;
    android.support.v4.app.FragmentManager fragmentManager;
    FragmentTransaction ft;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_persons);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            int contentId = R.id.content_frame;

            fragmentManager = getSupportFragmentManager();
            ft = fragmentManager.beginTransaction();
            ft.setCustomAnimations(R.animator.slide_in_left, R.animator.slide_out_right);

            switch (item.getItemId()) {
                case R.id.navigation_devices:
                    ft.replace(contentId, new DeviceFragment());
                    ft.commit();
                    return true;
                case R.id.navigation_persons:
                    ft.replace(contentId, new PersonFragment());
                    ft.commit();
                    return true;
                case R.id.navigation_sets:
                    ft.replace(contentId, new SetFragment());
                    ft.commit();
                    return true;
            }
            return false;
        }
    };

}

package examples.edwin.android.mac.com.org.simple_event_bus;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Fragment oneFragment;
    private Fragment twoFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame_fragment_one, oneFragment, oneFragment.getClass().getSimpleName())
                .add(R.id.frame_fragment_two, twoFragment, twoFragment.getClass().getSimpleName())
                .commit();

    }




}

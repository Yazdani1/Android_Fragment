package androidsqlite.com.fragmenttutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class fragmentA extends android.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        Button btn=(Button)getActivity().findViewById(R.id.button2_fr);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"Clicked Add",Toast.LENGTH_SHORT).show();

            }
        });


        super.onActivityCreated(savedInstanceState);
    }
}

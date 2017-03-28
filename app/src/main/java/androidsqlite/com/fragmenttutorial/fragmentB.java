package androidsqlite.com.fragmenttutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class fragmentB extends android.app.Fragment {


    EditText e1,e2;
    Button b1;
    TextView t1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewm= inflater.inflate(R.layout.fragment_fragment_b, container, false);

        e1=(EditText)viewm.findViewById(R.id.edit_text1);
        e2=(EditText)viewm.findViewById(R.id.edit_text2);
        b1=(Button)viewm.findViewById(R.id.button1_fb);
        t1=(TextView)viewm.findViewById(R.id.result_f_xml);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mymethodsresult();
            }
        });



        return viewm;
    }

    public void mymethodsresult(){

        String s1,s2,s3;

        s1=e1.getText().toString();

        s2=e2.getText().toString();

        s3=s1+s2;
        t1.setText(s3);

        Toast.makeText(this.getActivity(),s3,Toast.LENGTH_SHORT).show();

    }




}

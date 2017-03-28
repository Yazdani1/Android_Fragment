package androidsqlite.com.fragmenttutorial;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    fragmentA frA=new fragmentA();
    fragmentB frB=new fragmentB();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm=getFragmentManager();

        FragmentTransaction ft=fm.beginTransaction();

        ft.replace(R.id.fragment,frA,"fragment 1");

        ft.commit();

    }



    public void method1(View myview)
    {

        FragmentManager fm=getFragmentManager();

        FragmentTransaction ft=fm.beginTransaction();

        ft.replace(R.id.fragment,frA,"fragment 1");

        ft.commit();



    }

    public void method2(View myview)
    {

        FragmentManager fm=getFragmentManager();

        FragmentTransaction ft=fm.beginTransaction();

        ft.replace(R.id.fragment,frB,"fragment2");

        ft.commit();
    }


}

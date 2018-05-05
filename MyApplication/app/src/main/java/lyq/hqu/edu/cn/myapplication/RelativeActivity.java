package lyq.hqu.edu.cn.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Data : 2018/4/16
 *
 * @author : TLJ
 * @parameter :
 * @return :
 */
public class RelativeActivity extends Activity {

    private Button bn_back;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);

        bn_back = (Button)findViewById(R.id.relative_bn_back);

        bn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelativeActivity.this, com.example.tlj.interfaceprogrammingforandroidapplications.MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

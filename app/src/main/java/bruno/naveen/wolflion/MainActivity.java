package bruno.naveen.wolflion;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6,b7,b8;
    private ImageView i;
    private Toast mm;
    int bru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button5);
        b3=(Button)findViewById(R.id.button6);
        b4=(Button)findViewById(R.id.button7);
        b5=(Button)findViewById(R.id.button8);
        b6=(Button)findViewById(R.id.button9);
        b7=(Button)findViewById(R.id.button2);
        b8=(Button)findViewById(R.id.button3);
        i=(ImageView)findViewById(R.id.im1);
        final Wolf wo=new Wolf();
        final Lion li=new Lion();
        b1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                mm.makeText(MainActivity.this,""+li.sleep(),mm.LENGTH_SHORT).show();
                i.setImageResource(R.drawable.lionsleep);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                mm.makeText(MainActivity.this,""+li.eat(),mm.LENGTH_SHORT).show();
                i.setImageResource(R.drawable.lioneat);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                mm.makeText(MainActivity.this,""+li.cub(),mm.LENGTH_SHORT).show();
                i.setImageResource(R.drawable.lioncub);
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                mm.makeText(MainActivity.this,""+li.girl(),mm.LENGTH_SHORT).show();
                i.setImageResource(R.drawable.lionwoman);
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                mm.makeText(MainActivity.this,""+wo.sleep(),mm.LENGTH_SHORT).show();
                i.setImageResource(R.drawable.wolfsleep);
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                mm.makeText(MainActivity.this,""+wo.eat(),mm.LENGTH_SHORT).show();
                i.setImageResource(R.drawable.wolfeat);
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                mm.makeText(MainActivity.this,""+wo.cub(),mm.LENGTH_SHORT).show();
                i.setImageResource(R.drawable.wolfpup);
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                mm.makeText(MainActivity.this,""+wo.girl(),mm.LENGTH_SHORT).show();
                i.setImageResource(R.drawable.wolfwoman);
            }
        });
    }
}
package resembrink.dev.pptviewer;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itsrts.pptviewer.PPTViewer;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    PPTViewer pptViewer;
    String path = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pptViewer = (PPTViewer) findViewById(R.id.pptviewer);
           File f = new File(Environment.getExternalStorageDirectory().getPath(), "cinematica.ppt");

            //File f = FileUtils.fileFromAsset(MainActivity.this, "junit.ppt");          path = f.getPath().toString();
            pptViewer.setNext_img(R.drawable.ic_navigate_nex).setPrev_img(R.drawable.ic_navigate_before)
                    .setSettings_img(R.drawable.ic_settings)
                    .setZoomin_img(R.drawable.ic_zoom_in_black_24dp)
                    .setZoomout_img(R.drawable.ic_zoom_out);
            pptViewer.loadPPT(this, path);
        }
    }


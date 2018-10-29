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
            File f = new File(Environment.getExternalStorageDirectory().getPath(), "/Download/fashion.ppt");

            //  File f = FileUtils.fileFromAsset(MainActivity.this, "junit.ppt");          path = f.getPath().toString();
            pptViewer.setNext_img(R.drawable.next).setPrev_img(R.drawable.prev)
                    .setSettings_img(R.drawable.settings)
                    .setZoomin_img(R.drawable.zoomin)
                    .setZoomout_img(R.drawable.zoomout);
            pptViewer.loadPPT(this, path);
        }
    }


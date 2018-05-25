package com.andriod.hzj.android_ui;

import android.app.Activity;
import android.os.Handler;
import android.os.Bundle;

public class ProgressBar extends Activity {
    private static final int PROGRESS = 0x1;

    private android.widget.ProgressBar mProgress;
    private int mProgressStatus = 0;

    private int[] data = new int[100];
    int hasData = 0;

    private Handler mHandler = new Handler();

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.activity_progressbarl);

        mProgress = (android.widget.ProgressBar) findViewById(R.id.progress_bar);

        // Start lengthy operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                while (mProgressStatus < 100) {
                    mProgressStatus = doWork();

                    // Update the progress bar
                    mHandler.post(new Runnable() {
                        public void run() {
                            mProgress.setProgress(mProgressStatus);
                        }
                    });
                }
            }
        }).start();
    }

    private int doWork() {
        data[hasData++] = (int) (Math.random() * 100);
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return hasData;
    }

}

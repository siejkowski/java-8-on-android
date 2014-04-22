package net.siejkowski.lambdandroid.retro;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.TimedText;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;

import retrofit.RestAdapter;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;
import rx.Observable;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
            }
        };
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.github.com")
                .build();

        GitHubService service = restAdapter.create(GitHubService.class);
        MediaPlayer mediaPlayer = new MediaPlayer();

        new Button(this).setOnClickListener(v -> {

        });

        service.listReps("siejkowski")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(v -> {

                });


        handler.postAtTime(() -> {

        }, 1000);

        mediaPlayer.setOnBufferingUpdateListener((mp,percent) -> {

        });
        mediaPlayer.setOnCompletionListener(mp -> {

        });
        mediaPlayer.setOnErrorListener((mp,what,extra) -> {
            return false;
        });
        mediaPlayer.setOnInfoListener((mp,what,extra) -> {
            return false;
        });
        mediaPlayer.setOnPreparedListener(mp -> {

        });
        mediaPlayer.setOnSeekCompleteListener(mp -> {

        });
        mediaPlayer.setOnTimedTextListener((mp,text) -> {

        });
        mediaPlayer.setOnVideoSizeChangedListener((mp,width,height) -> {

        });

    }

    View.OnClickListener onClickListener = v -> System.out.println("clicked!");

    private Observable<File> downloadFileObservable() {
        return Observable.create(new Observable.OnSubscribe<File>() {
            @Override
            public void call(Subscriber<? super File> subscriber) {

            }
        });
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

}

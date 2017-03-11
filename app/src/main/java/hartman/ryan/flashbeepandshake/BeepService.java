package hartman.ryan.flashbeepandshake;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.IBinder;
import android.widget.Toast;

public class BeepService extends Service {
    ToneGenerator toneGenerator1;

    @Override
    public void onStart(Intent intent, int startId) {
        // TODO Auto-generated method stub
        super.onStart(intent, startId);
        int streamType = AudioManager.STREAM_MUSIC;
        int volume = 100;
        ToneGenerator toneGenerator = new ToneGenerator(streamType, volume);
        int toneType = ToneGenerator.TONE_DTMF_0;
        int durationMs = 500;
        toneGenerator.startTone(toneType, durationMs);

        toneGenerator1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 50);
        Toast.makeText(getApplicationContext(), "Phone is Beeping", Toast.LENGTH_LONG).show();



    }

    @Override
    public IBinder onBind(Intent intent)
    {
        // TODO Auto-generated method stub
        return null;
    }
}

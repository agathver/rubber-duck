package `in`.amitosh.rubberduck

import android.media.AudioManager
import android.media.SoundPool
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soundPool = SoundPool(2, AudioManager.STREAM_MUSIC, 1)
        val soundId = soundPool.load(this,R.raw.quack, 1)
        duck.setOnClickListener {
            soundPool.play(soundId, 1.0f, 1.0f, 1,0, 1.0f)

        }
    }
}

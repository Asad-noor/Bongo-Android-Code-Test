package com.worldvisionsoft.simplevideoplayerdemo

import android.media.MediaPlayer.OnPreparedListener
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val VIDEO_SAMPLE = "sample_video"

    // Current playback position (in milliseconds).
    private var mCurrentPosition = 0

    // Tag for the instance state bundle.
    private val PLAYBACK_TIME = "play_time"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(PLAYBACK_TIME);
        }

        /*create a new MediaController object and use setMediaPlayer()
         to connect the object to the VideoView.
         */
        val controller = MediaController(this)
        controller.setMediaPlayer(vvPlayer)

        /*Use setMediaController() to do the reverse connection, that is,
         to tell the VideoView that the MediaController will be used to control it:
         */
        vvPlayer.setMediaController(controller)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Save the current playback position (in milliseconds) to the
        // instance state bundle.
        outState.putInt(PLAYBACK_TIME, vvPlayer.getCurrentPosition())
    }

    override fun onStart() {
        super.onStart()

        initializePlayer()
    }

    override fun onStop() {
        super.onStop()

        releasePlayer()
    }

    override fun onPause() {
        super.onPause()

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            vvPlayer.pause();
        }
    }

    private fun releasePlayer() {
        vvPlayer.stopPlayback()
    }

    private fun initializePlayer() {
        val videoUri = getMedia(VIDEO_SAMPLE)
        vvPlayer.setVideoURI(videoUri)

        // Listener for onPrepared() event (runs after the media is prepared).
        vvPlayer.setOnPreparedListener(
            OnPreparedListener {
                // Hide buffering message.
                //mBufferingTextView.setVisibility(VideoView.INVISIBLE)
                // Restore saved position, if available.
                if (mCurrentPosition > 0) {
                    vvPlayer.seekTo(mCurrentPosition)
                } else { // Skipping to 1 shows the first frame of the video.
                    vvPlayer.seekTo(1)
                }
                // Start playing!
                vvPlayer.start()
            })
    }

    private fun getMedia(mediaName: String): Uri {
        return Uri.parse("android.resource://" + getPackageName() +
                "/raw/" + mediaName)
    }
}

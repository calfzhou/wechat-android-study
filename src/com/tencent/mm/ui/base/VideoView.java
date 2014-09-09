package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;

public class VideoView extends SurfaceView
{
  private MediaPlayer.OnCompletionListener dIn;
  private MediaPlayer.OnErrorListener dIo;
  private int dNK;
  private int dNL;
  private SurfaceHolder gNu = null;
  private String jfO;
  private MediaPlayer jfP = null;
  private boolean jfQ;
  private MediaPlayer.OnPreparedListener jfR;
  private int jfS;
  private boolean jfT;
  private int jfU;
  private gf jfV;
  MediaPlayer.OnVideoSizeChangedListener jfW = new fz(this);
  MediaPlayer.OnPreparedListener jfX = new ga(this);
  private MediaPlayer.OnCompletionListener jfY = new gb(this);
  private MediaPlayer.OnErrorListener jfZ = new gc(this);
  private MediaPlayer.OnBufferingUpdateListener jga = new gd(this);
  SurfaceHolder.Callback jgb = new ge(this);
  private Context mContext;
  private int pC;
  private int uP;
  private int uQ;

  public VideoView(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    aTy();
  }

  public VideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.mContext = paramContext;
    aTy();
  }

  public VideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    aTy();
  }

  private void aTB()
  {
    if ((this.jfO == null) || (this.gNu == null))
      return;
    Intent localIntent = new Intent("com.android.music.musicservicecommand");
    localIntent.putExtra("command", "pause");
    this.mContext.sendBroadcast(localIntent);
    if (this.jfP != null)
    {
      this.jfP.reset();
      this.jfP.release();
      this.jfP = null;
    }
    try
    {
      this.jfP = new MediaPlayer();
      this.jfP.setOnPreparedListener(this.jfX);
      this.jfP.setOnVideoSizeChangedListener(this.jfW);
      this.jfQ = false;
      z.v("!32@/B4Tb64lLpI0gAQi2o+bKagiX16xHWF7", "reset duration to -1 in openVideo");
      this.pC = -1;
      this.jfP.setOnCompletionListener(this.jfY);
      this.jfP.setOnErrorListener(this.jfZ);
      this.jfP.setOnBufferingUpdateListener(this.jga);
      this.jfS = 0;
      this.jfP.setDataSource(this.jfO);
      this.jfP.setDisplay(this.gNu);
      this.jfP.setAudioStreamType(3);
      this.jfP.setScreenOnWhilePlaying(true);
      this.jfP.prepareAsync();
      this.dNL = this.jfP.getVideoHeight();
      this.dNK = this.jfP.getVideoWidth();
      return;
    }
    catch (IOException localIOException)
    {
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
  }

  private void aTy()
  {
    this.dNK = 0;
    this.dNL = 0;
    getHolder().addCallback(this.jgb);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
  }

  public final void BT(String paramString)
  {
    this.jfO = paramString;
    this.jfT = false;
    this.jfU = 0;
    aTB();
    requestLayout();
    invalidate();
  }

  public final int aTA()
  {
    if (this.jfP == null)
      return 0;
    return this.jfP.getDuration() - this.jfP.getCurrentPosition();
  }

  public final boolean aTC()
  {
    return this.jfP == null;
  }

  public final void aTx()
  {
    if ((this.dNL == 0) || (this.dNK == 0))
      return;
    int i = this.dNK;
    int j = this.dNL;
    z.v("!32@/B4Tb64lLpI0gAQi2o+bKagiX16xHWF7", "video size before:" + i + "   " + j);
    z.v("!32@/B4Tb64lLpI0gAQi2o+bKagiX16xHWF7", "layout size before:" + getWidth() + "   " + getHeight());
    int k = getWidth();
    int m = getHeight();
    if (k <= 0);
    for (int n = i; ; n = k)
    {
      if (m <= 0);
      for (int i1 = j; ; i1 = m)
      {
        float f1 = 1.0F * n / i;
        float f2 = 1.0F * i1 / j;
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
        if (f1 > f2)
          localLayoutParams.width = ((int)(f2 * i));
        for (localLayoutParams.height = i1; ; localLayoutParams.height = ((int)(f1 * j)))
        {
          localLayoutParams.addRule(13);
          setLayoutParams(localLayoutParams);
          invalidate();
          z.v("!32@/B4Tb64lLpI0gAQi2o+bKagiX16xHWF7", "video size after:" + this.jfP.getVideoWidth() + "   " + this.jfP.getVideoHeight());
          z.v("!32@/B4Tb64lLpI0gAQi2o+bKagiX16xHWF7", "layout size after:" + localLayoutParams.width + "   " + localLayoutParams.height);
          return;
          localLayoutParams.width = n;
        }
      }
    }
  }

  public final String aTz()
  {
    return this.jfO;
  }

  public final void dx()
  {
    if (this.jfP != null)
      this.jfP.setLooping(true);
  }

  public final int getCurrentPosition()
  {
    if ((this.jfP != null) && (this.jfQ))
      return this.jfP.getCurrentPosition();
    return 0;
  }

  public final boolean isPlaying()
  {
    if ((this.jfP != null) && (this.jfQ))
      return this.jfP.isPlaying();
    return false;
  }

  public final void pause()
  {
    if ((this.jfP != null) && (this.jfQ) && (this.jfP.isPlaying()))
      this.jfP.pause();
    this.jfT = false;
  }

  public final void setOnCompletionListener(MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.dIn = paramOnCompletionListener;
  }

  public final void setOnErrorListener(MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.dIo = paramOnErrorListener;
  }

  public final void setOnPreparedListener(MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.jfR = paramOnPreparedListener;
  }

  public final void start()
  {
    if ((this.jfP != null) && (this.jfQ))
    {
      this.jfP.start();
      this.jfT = false;
      return;
    }
    this.jfT = true;
  }

  public final void stopPlayback()
  {
    if (this.jfP != null)
    {
      this.jfP.stop();
      this.jfP.release();
      this.jfP = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.VideoView
 * JD-Core Version:    0.6.2
 */
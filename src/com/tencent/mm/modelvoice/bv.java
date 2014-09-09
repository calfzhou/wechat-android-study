package com.tencent.mm.modelvoice;

import android.media.MediaPlayer;
import com.tencent.mm.a.c;
import com.tencent.mm.compatible.c.a;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.z;

final class bv
  implements d
{
  private e dIr = null;
  private f dIs = null;
  private MediaPlayer daf = new MediaPlayer();
  private String rI = "";
  private int status = 0;

  public bv()
  {
    BP();
    BQ();
  }

  public bv(byte paramByte)
  {
    this();
  }

  private void BP()
  {
    this.daf.setOnCompletionListener(new bw(this));
  }

  private void BQ()
  {
    this.daf.setOnErrorListener(new bx(this));
  }

  private void b(boolean paramBoolean, int paramInt)
  {
    int i = 3;
    if (!c.ac(this.rI))
      return;
    int j;
    if (paramBoolean)
      j = i;
    while (true)
    {
      try
      {
        if (!v.dNC.dLc)
          break label125;
        v.dNC.dump();
        if (v.dNC.dLj != 1)
          break label125;
        this.daf.setAudioStreamType(i);
        this.daf.setDataSource(this.rI);
        this.daf.prepare();
        if (paramInt > 0)
          this.daf.seekTo(paramInt);
        this.daf.start();
        return;
      }
      catch (Exception localException)
      {
        z.e("!24@40VYnhE9NJIehP//35gXMQ==", "playImp : fail, exception = " + localException.getMessage());
        return;
      }
      j = 0;
      continue;
      label125: i = j;
    }
  }

  private boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    if (this.status != 0)
    {
      z.e("!24@40VYnhE9NJIehP//35gXMQ==", "startPlay error status:" + this.status);
      return false;
    }
    this.rI = paramString;
    try
    {
      b(paramBoolean, paramInt);
      this.status = 1;
      return true;
    }
    catch (Exception localException1)
    {
      try
      {
        b(true, paramInt);
      }
      catch (Exception localException2)
      {
        z.e("!24@40VYnhE9NJIehP//35gXMQ==", "startPlay File[" + this.rI + "] failed");
        this.status = -1;
      }
    }
    return false;
  }

  public final void U(boolean paramBoolean)
  {
    z.d("!24@40VYnhE9NJIehP//35gXMQ==", "setSpeakerOn=" + paramBoolean);
    if (this.daf == null)
      return;
    if (bi.ta())
    {
      z.v("!24@40VYnhE9NJIehP//35gXMQ==", "setSpeakOn return when calling");
      return;
    }
    int i = this.daf.getCurrentPosition();
    md();
    this.daf = new MediaPlayer();
    BP();
    BQ();
    c(this.rI, paramBoolean, i);
  }

  public final void a(e parame)
  {
    this.dIr = parame;
  }

  public final void a(f paramf)
  {
    this.dIs = paramf;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final boolean isPlaying()
  {
    return this.status == 1;
  }

  public final boolean j(String paramString, boolean paramBoolean)
  {
    return c(paramString, paramBoolean, 0);
  }

  public final boolean md()
  {
    if ((this.status != 1) && (this.status != 2))
    {
      z.e("!24@40VYnhE9NJIehP//35gXMQ==", "stop not STATUS_PLAYING or STATUS_PAUSE error status:" + this.status);
      return false;
    }
    try
    {
      this.daf.stop();
      this.daf.release();
      this.status = 0;
      return true;
    }
    catch (Exception localException)
    {
      z.e("!24@40VYnhE9NJIehP//35gXMQ==", "stop File[" + this.rI + "] ErrMsg[" + localException.getStackTrace() + "]");
      this.status = -1;
    }
    return false;
  }

  public final boolean pause()
  {
    if (this.status != 1)
    {
      z.e("!24@40VYnhE9NJIehP//35gXMQ==", "pause not STATUS_PLAYING error status:" + this.status);
      return false;
    }
    try
    {
      this.daf.pause();
      this.status = 2;
      return true;
    }
    catch (Exception localException)
    {
      z.e("!24@40VYnhE9NJIehP//35gXMQ==", "pause File[" + this.rI + "] ErrMsg[" + localException.getStackTrace() + "]");
      this.status = -1;
    }
    return false;
  }

  public final boolean tc()
  {
    if (this.status != 2)
    {
      z.e("!24@40VYnhE9NJIehP//35gXMQ==", "resume not STATUS_PAUSE error status:" + this.status);
      return false;
    }
    try
    {
      this.daf.start();
      this.status = 1;
      return true;
    }
    catch (Exception localException)
    {
      z.e("!24@40VYnhE9NJIehP//35gXMQ==", "resume File[" + this.rI + "] ErrMsg[" + localException.getStackTrace() + "]");
      this.status = -1;
    }
    return false;
  }

  public final double td()
  {
    if ((this.status != 1) && (this.status != 2))
      return 0.0D;
    int i;
    int j;
    try
    {
      i = this.daf.getCurrentPosition();
      j = this.daf.getDuration();
      if (j == 0)
      {
        z.e("!24@40VYnhE9NJIehP//35gXMQ==", "getDuration File[" + this.rI + "] Failed");
        return 0.0D;
      }
    }
    catch (Exception localException)
    {
      z.e("!24@40VYnhE9NJIehP//35gXMQ==", "getNowProgress File[" + this.rI + "] ErrMsg[" + localException.getStackTrace() + "]");
      md();
      return 0.0D;
    }
    return i / j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bv
 * JD-Core Version:    0.6.2
 */
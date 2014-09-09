package com.tencent.mm.booter.notification.a;

import android.media.MediaPlayer;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class j extends cm
{
  j(i parami, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    z.i("!56@/B4Tb64lLpKR3MWtFvfaIMJb62Pm/jgsLT1nr0NtEmCplLo3H1kkFg==", "play sound handler, try to stop notify mediaplayer");
    try
    {
      if ((i.a(this.djo)) && (i.b(this.djo) != null) && (i.b(this.djo).isPlaying()))
      {
        i.b(this.djo).stop();
        i.b(this.djo).release();
        i.c(this.djo);
      }
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localIllegalStateException.getMessage();
      z.w("!56@/B4Tb64lLpKR3MWtFvfaIMJb62Pm/jgsLT1nr0NtEmCplLo3H1kkFg==", "Exception in playSoundHander %s", arrayOfObject);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.j
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.booter;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.mm.model.ao;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.List;

final class s
  implements MediaPlayer.OnCompletionListener
{
  s(i parami)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    if (i.a(this.dil) == null);
    do
    {
      return;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i.i(this.dil));
      z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "completed currentPoint: %d", arrayOfObject1);
      i.a(this.dil).release();
      i.j(this.dil);
      if (i.k(this.dil) == null)
      {
        this.dil.lg();
        i.d(this.dil).aNu();
      }
      synchronized (i.b(this.dil))
      {
        Iterator localIterator = i.c(this.dil).iterator();
        while (localIterator.hasNext())
        {
          ao localao = (ao)localIterator.next();
          if ((localao != null) && (i.k(this.dil) == null))
          {
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = localao.toString();
            z.d("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "on finish call back: %s", arrayOfObject2);
            localao.onFinish();
          }
        }
      }
      i.l(this.dil);
    }
    while ((!i.m(this.dil)) || (i.k(this.dil) != null));
    z.d("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "NEXT MUSIC PLAY.");
    this.dil.lu();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.s
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.modelvoice;

import android.media.AudioTrack;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.qqpinyin.voicerecoapi.a;
import java.io.FileInputStream;
import java.io.IOException;

final class bi extends Thread
{
  bi(bf parambf)
  {
  }

  public final void run()
  {
    byte[] arrayOfByte;
    try
    {
      Process.setThreadPriority(-16);
      bf.a(this.dIE, new FileInputStream(bf.e(this.dIE)));
      while (true)
      {
        if ((bf.g(this.dIE) != 1) && (bf.g(this.dIE) != 2))
          break label611;
        bf.b(this.dIE, bf.i(this.dIE).read(bf.h(this.dIE)));
        if (bf.j(this.dIE) == -1)
          break label555;
        arrayOfByte = bf.k(this.dIE).r(bf.h(this.dIE), bf.j(this.dIE));
        if ((arrayOfByte != null) && (arrayOfByte.length != 0))
          break;
        bf.a(this.dIE, 0);
      }
    }
    catch (Exception localException1)
    {
      if (bf.p(this.dIE) != null)
        bf.p(this.dIE).onError(null, 0, 0);
      bf.a(this.dIE, 0);
    }
    while (true)
    {
      if (bf.i(this.dIE) != null);
      try
      {
        bf.i(this.dIE).close();
        bf.a(this.dIE, null);
        int i = bf.k(this.dIE).bdo();
        if (bf.g(this.dIE) != 3)
        {
          if (bf.q(this.dIE) != null)
            bf.q(this.dIE).te();
          if (bf.r(this.dIE) != null)
            bf.r(this.dIE).onCompletion(null);
        }
        if (i != 0)
          z.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "res: " + i);
        return;
        int j = arrayOfByte.length;
        int k = 0;
        while ((j >= bf.l(this.dIE)) && (bf.g(this.dIE) == 1))
          if (bf.m(this.dIE))
          {
            Thread.sleep(20L);
          }
          else if ((bf.b(this.dIE) != null) && (!bf.m(this.dIE)))
          {
            bf.b(this.dIE).write(arrayOfByte, k, bf.l(this.dIE));
            k += bf.l(this.dIE);
            j -= bf.l(this.dIE);
          }
        if ((j < bf.l(this.dIE)) && (j > 0) && (bf.b(this.dIE) != null))
          bf.b(this.dIE).write(arrayOfByte, k, j);
        label455: if (bf.g(this.dIE) != 2);
      }
      catch (IOException localIOException)
      {
        try
        {
          label502: synchronized (bf.n(this.dIE))
          {
            z.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "before mOk.notify");
            bf.n(this.dIE).notify();
            z.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "after mOk.notify");
          }
          try
          {
            label541: synchronized (bf.o(this.dIE))
            {
              z.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "before mpause.wait");
              bf.o(this.dIE).wait();
              z.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "after mpause.wait");
            }
            label555: bf.a(this.dIE, 0);
            break label455;
            localObject2 = finally;
            throw localObject2;
            try
            {
              label597: synchronized (bf.n(this.dIE))
              {
                bf.n(this.dIE).notify();
              }
              label611: if (bf.g(this.dIE) == 3)
                continue;
              Thread.sleep(1000L);
              continue;
              localIOException = localIOException;
            }
            catch (Exception localException2)
            {
              break label597;
            }
          }
          catch (Exception localException4)
          {
            break label541;
          }
        }
        catch (Exception localException3)
        {
          break label502;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bi
 * JD-Core Version:    0.6.2
 */
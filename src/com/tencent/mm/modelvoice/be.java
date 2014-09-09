package com.tencent.mm.modelvoice;

import android.media.AudioTrack;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.z;

final class be extends Thread
{
  private be(bb parambb)
  {
  }

  public final void run()
  {
    byte[] arrayOfByte;
    short s;
    int i;
    try
    {
      Process.setThreadPriority(-16);
      arrayOfByte = new byte[2 * AudioTrack.getMinBufferSize(bb.g(this.dIp), 2, 2)];
      s = (short)(20 * bb.g(this.dIp) / 1000);
      if (bb.h(this.dIp) != 1)
        if (bb.h(this.dIp) != 2)
          break label597;
    }
    catch (Exception localException1)
    {
      synchronized (bb.Bz())
      {
        while (true)
        {
          if (bb.BA() != bb.i(this.dIp))
          {
            Object[] arrayOfObject4 = new Object[2];
            arrayOfObject4[0] = Integer.valueOf(bb.i(this.dIp));
            arrayOfObject4[1] = Integer.valueOf(bb.BA());
            z.i("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "[%d] diff id, useDeocder: %d", arrayOfObject4);
            bb.a(this.dIp, bb.e(this.dIp));
          }
          i = MediaRecorder.SilkDoDec(arrayOfByte, s);
          if (i >= 0)
            break;
          bb.a(this.dIp, 0);
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(bb.i(this.dIp));
          arrayOfObject2[1] = Integer.valueOf(i);
          z.e("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "[%d] SilkDoDec failed: %d", arrayOfObject2);
        }
        localException1 = localException1;
        if (bb.n(this.dIp) != null)
          bb.n(this.dIp).onError(null, 0, 0);
        bb.a(this.dIp, 0);
      }
    }
    while (true)
    {
      synchronized (bb.Bz())
      {
        if (bb.BA() == bb.i(this.dIp))
        {
          MediaRecorder.SilkDecUnInit();
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(bb.i(this.dIp));
          z.i("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "[%d] SilkDecUnInit", arrayOfObject1);
          bb.BB();
        }
        if (bb.h(this.dIp) != 3)
        {
          if (bb.o(this.dIp) != null)
            bb.o(this.dIp).te();
          if (bb.p(this.dIp) != null)
            bb.p(this.dIp).onCompletion(null);
        }
        return;
        localObject4 = finally;
        throw localObject4;
        if (bb.j(this.dIp))
        {
          Thread.sleep(20L);
          continue;
        }
        bb.b(this.dIp).write(arrayOfByte, 0, s * 2);
        bb.k(this.dIp);
        if (i == 0)
        {
          bb.a(this.dIp, 0);
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(bb.i(this.dIp));
          z.d("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "[%d] play completed", arrayOfObject3);
          break;
        }
        if (bb.h(this.dIp) != 2);
      }
      try
      {
        label500: synchronized (bb.l(this.dIp))
        {
          z.v("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "before mOk.notify");
          bb.l(this.dIp).notify();
          z.v("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "after mOk.notify");
        }
        try
        {
          label539: synchronized (bb.m(this.dIp))
          {
            z.v("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "before mpause.wait");
            bb.m(this.dIp).wait();
            z.v("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "after mpause.wait");
          }
          localObject6 = finally;
          throw localObject6;
          try
          {
            label583: synchronized (bb.l(this.dIp))
            {
              bb.l(this.dIp).notify();
            }
            label597: if (bb.h(this.dIp) == 3)
              continue;
            Thread.sleep(1000L);
            continue;
            localObject2 = finally;
            throw localObject2;
          }
          catch (Exception localException2)
          {
            break label583;
          }
        }
        catch (Exception localException4)
        {
          break label539;
        }
      }
      catch (Exception localException3)
      {
        break label500;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.be
 * JD-Core Version:    0.6.2
 */
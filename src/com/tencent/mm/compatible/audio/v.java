package com.tencent.mm.compatible.audio;

import android.media.AudioRecord;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Arrays;

final class v extends Thread
{
  public v(t paramt)
  {
    super("RecordThread");
  }

  public final void run()
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(t.a(this.dKL));
    z.i("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "RecordThread started. frameSize:%d", arrayOfObject1);
    if (t.c(this.dKL))
      Process.setThreadPriority(-19);
    t.a(this.dKL, true);
    byte[] arrayOfByte1 = new byte[t.a(this.dKL)];
    while (true)
    {
      if (t.d(this.dKL))
        synchronized (t.e(this.dKL))
        {
          boolean bool = t.f(this.dKL);
          if (!bool);
        }
      try
      {
        t.e(this.dKL).wait();
        label106: if (!t.d(this.dKL));
        int i;
        do
        {
          while (true)
          {
            z.i("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "RecordThread exited.");
            return;
            if (t.g(this.dKL) != null)
              break;
            z.i("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "RecordThread, mAudioRecord is null, so stop record.");
            t.a(this.dKL, false);
          }
          localObject = finally;
          throw localObject;
          if (t.h(this.dKL))
            arrayOfByte1 = new byte[t.a(this.dKL)];
          i = t.g(this.dKL).read(arrayOfByte1, 0, t.a(this.dKL));
        }
        while (!t.d(this.dKL));
        if (this.dKL.dKn != null)
          this.dKL.dKn.b(i, arrayOfByte1);
        if (t.a(this.dKL) != i)
          z.i("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "read len " + i);
        if (i < t.a(this.dKL))
          z.i("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "read too fast? sleep 10 ms");
        try
        {
          Thread.sleep(10L);
          label302: if ((t.b(this.dKL) == null) || (i <= 0))
            continue;
          Object[] arrayOfObject2 = new Object[3];
          arrayOfObject2[0] = Integer.valueOf(i);
          arrayOfObject2[1] = Integer.valueOf(arrayOfByte1.length);
          arrayOfObject2[2] = Integer.valueOf(t.a(this.dKL));
          z.i("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "Timer RecordThread, audioRecord.read ret:%d, BufferLen:%d, sizePreFrame:%d", arrayOfObject2);
          if (i > arrayOfByte1.length)
            i = arrayOfByte1.length;
          if (t.i(this.dKL) != null)
          {
            if (t.j(this.dKL))
              Arrays.fill(arrayOfByte1, 0, i, (byte)0);
            int j = t.i(this.dKL).c(arrayOfByte1, i);
            if (j != 0)
            {
              Object[] arrayOfObject4 = new Object[2];
              arrayOfObject4[0] = Integer.valueOf(j);
              arrayOfObject4[1] = Integer.valueOf(t.i(this.dKL).mk());
              z.e("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "Timer RecordThread: WriteToBuffer Failed, ret:%d AudioBuffer length:", arrayOfObject4);
              continue;
            }
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = Integer.valueOf(j);
            arrayOfObject3[1] = Integer.valueOf(t.i(this.dKL).mk());
            z.d("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "Timer RecordThread: WriteToBuffer ok, ret:%d AudioBuffer length:", arrayOfObject3);
            continue;
          }
          if (t.b(this.dKL) == null)
            continue;
          t.b(this.dKL).e(arrayOfByte1, i);
        }
        catch (InterruptedException localInterruptedException1)
        {
          break label302;
        }
      }
      catch (InterruptedException localInterruptedException2)
      {
        break label106;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.v
 * JD-Core Version:    0.6.2
 */
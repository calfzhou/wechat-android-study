package com.tencent.mm.modelvoice;

import android.media.AudioRecord;
import android.os.Process;
import com.tencent.mm.compatible.audio.o;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.qqpinyin.voicerecoapi.a;
import java.io.File;
import java.io.FileOutputStream;

final class bk
  implements Runnable
{
  bk(bj parambj)
  {
  }

  public final void run()
  {
    Process.setThreadPriority(-19);
    int i;
    try
    {
      i = AudioRecord.getMinBufferSize(16000, 1, 2);
      if (i >= 0)
      {
        if (v.dNG.dMH <= 0)
          break label169;
        bj.a(this.dIH, v.dNG.dMH);
      }
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(o.dJZ);
        z.i("!32@/B4Tb64lLpKxxZlLZKhWt+g3aFejQlb6", "new AudioRecord [%d]", arrayOfObject);
        bj.a(this.dIH, new AudioRecord(1, 16000, 1, 2, i * bj.a(this.dIH)));
        bj.b(this.dIH).getState();
        bj.a(this.dIH, new a());
        int j = bj.d(this.dIH).bdl();
        if (j == 0)
          break;
        z.e("!32@/B4Tb64lLpKxxZlLZKhWt+g3aFejQlb6", "speexInit failed :" + j);
        bj.c(this.dIH);
        return;
        label169: bj.a(this.dIH, 5);
      }
    }
    catch (Exception localException1)
    {
      z.e("!32@/B4Tb64lLpKxxZlLZKhWt+g3aFejQlb6", "init record failed");
      bj.c(this.dIH);
      return;
    }
    while (true)
    {
      short[] arrayOfShort;
      int k;
      try
      {
        File localFile = new File(bj.e(this.dIH));
        localFile.delete();
        bj.a(this.dIH, new FileOutputStream(localFile));
        try
        {
          bj.b(this.dIH).startRecording();
          arrayOfShort = new short[i];
          if (bj.f(this.dIH) != 1)
            break;
          k = bj.b(this.dIH).read(arrayOfShort, 0, i);
          if (k == -3)
            throw new IllegalStateException("read() returned AudioRecord.ERROR_INVALID_OPERATION");
        }
        catch (Exception localException3)
        {
          return;
        }
      }
      catch (Exception localException2)
      {
        z.e("!32@/B4Tb64lLpKxxZlLZKhWt+g3aFejQlb6", "filename open failed");
        bj.c(this.dIH);
        return;
      }
      if (k == -2)
        throw new IllegalStateException("read() returned AudioRecord.ERROR_BAD_VALUE");
      bj.a(this.dIH, arrayOfShort, k);
      byte[] arrayOfByte1 = new byte[k * 2];
      int m = 0;
      int n = 0;
      while (n < k)
      {
        arrayOfByte1[m] = ((byte)(0xFF & arrayOfShort[n]));
        arrayOfByte1[(m + 1)] = ((byte)(0xFF & arrayOfShort[n] >> 8));
        n++;
        m += 2;
      }
      if (arrayOfByte1.length > 0)
      {
        byte[] arrayOfByte2 = bj.d(this.dIH).q(arrayOfByte1, arrayOfByte1.length);
        StringBuilder localStringBuilder = new StringBuilder(" pcmlen(short):").append(k).append(" inSpeexBuffer:").append(Integer.valueOf(arrayOfByte1.length)).append(" outSpeexBuf:");
        if (arrayOfByte2 == null);
        Integer localInteger;
        for (Object localObject = "null"; ; localObject = localInteger)
        {
          z.d("!32@/B4Tb64lLpKxxZlLZKhWt+g3aFejQlb6", localObject);
          if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0))
            break;
          bj.g(this.dIH).write(arrayOfByte2);
          bj.g(this.dIH).flush();
          bj localbj = this.dIH;
          localbj.dIG += arrayOfByte2.length;
          break;
          localInteger = Integer.valueOf(arrayOfByte2.length);
        }
      }
    }
    try
    {
      bj.c(this.dIH);
      return;
    }
    catch (Exception localException4)
    {
      z.e("!32@/B4Tb64lLpKxxZlLZKhWt+g3aFejQlb6", "StopRecord ErrMsg[" + localException4.getMessage() + "]");
      bj.h(this.dIH);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bk
 * JD-Core Version:    0.6.2
 */
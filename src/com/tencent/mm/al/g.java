package com.tencent.mm.al;

import android.media.AudioRecord;
import android.os.Process;
import com.tencent.mm.compatible.audio.o;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.modelvoice.i;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.qqpinyin.voicerecoapi.c;
import com.tencent.qqpinyin.voicerecoapi.d;
import java.io.File;
import java.io.FileOutputStream;

final class g
  implements Runnable
{
  com.tencent.qqpinyin.voicerecoapi.a dDF = null;
  FileOutputStream dDG = null;
  i dGH = null;
  AudioRecord dIF = null;
  c dJo = null;
  int dJp = 0;
  boolean dJq = false;
  cm gQj = new h(this);

  g(f paramf)
  {
  }

  private void reset()
  {
    if ((this.dIF != null) && (1 == this.dIF.getState()))
    {
      this.dIF.stop();
      this.dIF.release();
      Object[] arrayOfObject = new Object[1];
      int i = o.dJZ;
      o.dJZ = i + 1;
      arrayOfObject[0] = Integer.valueOf(i);
      z.i("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "recordrInstance.release() [%d]", arrayOfObject);
    }
    this.dIF = null;
    if (this.dJo != null)
      this.dJo.stop();
    this.dJo = null;
    if (this.dDF != null)
    {
      this.dDF.bdm();
      this.dDF = null;
    }
    if (this.dGH != null)
    {
      i.release();
      this.dGH = null;
    }
    if (this.dDG != null);
    try
    {
      this.dDG.close();
      label147: this.dDG = null;
      if (f.e(this.dJr) != null)
        f.e(this.dJr).BR();
      this.dJp = 0;
      this.dJq = false;
      return;
    }
    catch (Exception localException)
    {
      break label147;
    }
  }

  public final void run()
  {
    z.d("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "start RecordingRunnable! file:" + f.d(this.dJr));
    f.a(this.dJr, 0);
    f.b(this.dJr, 0);
    Process.setThreadPriority(-19);
    if (!f.c(this.dJr))
    {
      this.dDF = new com.tencent.qqpinyin.voicerecoapi.a();
      int i2 = this.dDF.bdl();
      if (i2 != 0)
      {
        f.b(this.dJr, 14);
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(i2);
        z.e("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "speexInit failed:%d and switch to amr", arrayOfObject4);
        if (this.dDF != null)
        {
          this.dDF.bdm();
          this.dDF = null;
        }
        f.f(this.dJr);
        this.dGH = new i();
        if (!this.dGH.eN(1))
        {
          z.e("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "AMR native_init failed ret and return");
          reset();
        }
      }
    }
    else
    {
      this.dGH = new i();
      this.dGH.eN(1);
    }
    int i = 16000;
    if (f.c(this.dJr))
      i = 8000;
    while (true)
    {
      int j;
      try
      {
        if ((!f.c(this.dJr)) && (v.dNG.dMH > 0))
        {
          f.c(this.dJr, v.dNG.dMH);
          j = AudioRecord.getMinBufferSize(i, 1, 2);
          Object[] arrayOfObject1 = new Object[3];
          arrayOfObject1[0] = Integer.valueOf(i);
          arrayOfObject1[1] = Integer.valueOf(1);
          arrayOfObject1[2] = Integer.valueOf(2);
          z.d("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "AudioRecord.getMinBufferSize(%s, %s, %s)", arrayOfObject1);
          if (j < 0)
          {
            f.b(this.dJr, 10);
            if (this.dIF.getState() != 1)
              f.b(this.dJr, 11);
            this.dJo = new c(f.h(this.dJr));
            int k = this.dJo.bdp();
            if (k == 0)
              break;
            f.b(this.dJr, 13);
            z.e("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "init VoiceDetectAPI failed :" + k);
            reset();
          }
        }
        else
        {
          f.c(this.dJr, 5);
          continue;
        }
      }
      catch (Exception localException1)
      {
        f.b(this.dJr, 12);
        z.e("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "init record failed");
        reset();
        return;
      }
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(o.dJZ);
      z.i("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "new AudioRecord [%d]", arrayOfObject2);
      this.dIF = new AudioRecord(1, i, 1, 2, j * f.g(this.dJr));
      Object[] arrayOfObject3 = new Object[5];
      arrayOfObject3[0] = Integer.valueOf(1);
      arrayOfObject3[1] = Integer.valueOf(i);
      arrayOfObject3[2] = Integer.valueOf(1);
      arrayOfObject3[3] = Integer.valueOf(2);
      arrayOfObject3[4] = Integer.valueOf(j * f.g(this.dJr));
      z.d("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "new AudioRecord(%s, %s, %s, %s, %s)", arrayOfObject3);
    }
    short[] arrayOfShort;
    d locald;
    int m;
    try
    {
      File localFile = new File(f.d(this.dJr));
      localFile.delete();
      this.dDG = new FileOutputStream(localFile);
      if (f.c(this.dJr))
      {
        this.dDG.write("#!AMR\n".getBytes());
        this.dDG.flush();
      }
      try
      {
        this.dIF.startRecording();
        arrayOfShort = new short[2 * (1 * (i * 120) / 1000) / 2];
        locald = new d();
        if (f.i(this.dJr) == 0)
        {
          m = this.dIF.read(arrayOfShort, 0, arrayOfShort.length);
          if (m != -3)
            break label819;
          throw new IllegalStateException("read() returned AudioRecord.ERROR_INVALID_OPERATION");
        }
      }
      catch (Exception localException3)
      {
        f.a(this.dJr, 1);
        z.d("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "Reocording stop running flag:" + f.i(this.dJr));
        if (f.e(this.dJr) != null)
          f.e(this.dJr).BR();
        this.gQj.sendEmptyMessage(2);
        if (!this.dJq)
          this.gQj.sendEmptyMessage(3);
        reset();
        return;
      }
    }
    catch (Exception localException2)
    {
      f.b(this.dJr, 15);
      z.e("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "filename open failed");
      reset();
      return;
    }
    label819: if (m == -2)
      throw new IllegalStateException("read() returned AudioRecord.ERROR_BAD_VALUE");
    this.dJo.a(arrayOfShort, m, locald);
    if ((locald.kdA == 2) || (locald.kdA == 3))
      f.a(this.dJr, 4);
    f.a(this.dJr, arrayOfShort, m);
    byte[] arrayOfByte1 = new byte[m * 2];
    int n = 0;
    int i1 = 0;
    while (i1 < m)
    {
      arrayOfByte1[n] = ((byte)(0xFF & arrayOfShort[i1]));
      arrayOfByte1[(n + 1)] = ((byte)(0xFF & arrayOfShort[i1] >> 8));
      i1++;
      n += 2;
    }
    if (!f.c(this.dJr))
    {
      arrayOfByte2 = this.dDF.q(arrayOfByte1, arrayOfByte1.length);
      StringBuilder localStringBuilder2 = new StringBuilder("speex mode | pcmlen(short):").append(m).append(" pcmBufferInBytes:").append(arrayOfByte1.length).append(" outSpeexBuf:");
      if (arrayOfByte2 == null);
      for (Object localObject2 = "null"; ; localObject2 = Integer.valueOf(arrayOfByte2.length))
      {
        z.d("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", localObject2);
        label1037: if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0))
          break label1222;
        this.dDG.write(arrayOfByte2);
        this.dDG.flush();
        this.dJp += arrayOfByte2.length;
        if ((this.dJp <= 3300) || (this.dJq))
          break;
        z.d("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "sendEmptyMessage(0)");
        this.gQj.sendEmptyMessage(0);
        this.dJq = true;
        break;
      }
    }
    PByteArray localPByteArray = new PByteArray();
    this.dGH.a(arrayOfByte1, arrayOfByte1.length, localPByteArray, 0);
    byte[] arrayOfByte2 = localPByteArray.value;
    StringBuilder localStringBuilder1 = new StringBuilder("amr mode | pcmlen(short):").append(m).append(" pcmBufferInBytes:").append(arrayOfByte1.length).append(" outAmrBuf:");
    if (arrayOfByte2 == null);
    label1222: Integer localInteger;
    for (Object localObject1 = "null"; ; localObject1 = localInteger)
    {
      z.d("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", localObject1);
      break label1037;
      break;
      localInteger = Integer.valueOf(arrayOfByte2.length);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.g
 * JD-Core Version:    0.6.2
 */
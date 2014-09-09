package com.tencent.mm.compatible.audio;

import android.media.MediaRecorder;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ch;

public class SimpleMediaRecorder
{
  public static final int[] dcX = { 13, 14, 16, 18, 20, 21, 27, 32 };
  private static long dde = 0L;
  private static Object ddf = new Object();
  private ae dKM;
  private aa dKN = null;
  private af dKO;
  private int dcZ = 0;
  private String dda = null;
  private long ddc = 0L;
  private long ddd = 0L;
  private MediaRecorder ddg;
  private int ddh;
  private o ddi = null;
  private c ddj;
  private int ddl = 8000;
  private int ddm = 0;
  private l ddn = new l();
  private q ddo = new z(this);

  public SimpleMediaRecorder(c paramc)
  {
    this.ddj = paramc;
    if (paramc == c.dJI)
    {
      this.ddh = 7;
      this.ddg = new MediaRecorder();
      return;
    }
    this.ddl = 8000;
    int i = ch.a((Integer)com.tencent.mm.compatible.c.o.mT().get(102401), 0);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "dk16k sr:" + this.ddl + " notsu:" + i);
    if (i == 1)
      this.ddl = 8000;
    this.dcZ = 0;
    this.dda = null;
    this.dKN = null;
    try
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "!!out mutex :" + ddf.hashCode());
      synchronized (ddf)
      {
        this.ddi = new o(this.ddl, 120, true, 0);
        this.ddi.a(this.ddo);
        this.dKO = af.dKT;
        this.ddh = 1;
        return;
      }
    }
    catch (Exception localException)
    {
      if (localException.getMessage() == null)
        break label297;
    }
    com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", localException.getMessage());
    while (true)
    {
      this.dKO = af.dKW;
      break;
      label297: com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "Unknown error occured while initializing recording");
    }
  }

  private static native boolean native_init();

  private static native boolean native_pcm2amr(int paramInt1, byte[] paramArrayOfByte, int paramInt2, PByteArray paramPByteArray, int paramInt3);

  private static native boolean native_pcmresamp(byte[] paramArrayOfByte, int paramInt, PByteArray paramPByteArray);

  private static native boolean native_release();

  public final void a(ae paramae)
  {
    if (this.ddj == c.dJI)
      if (this.ddg != null);
    while (true)
    {
      return;
      this.dKM = paramae;
      this.ddg.setOnErrorListener(new y(this));
      this.dKO = af.dKW;
      return;
      try
      {
        if (this.dKO == af.dKT)
        {
          this.dKM = paramae;
          return;
        }
      }
      catch (Exception localException)
      {
        if (localException.getMessage() == null)
          break label87;
      }
    }
    com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", localException.getMessage());
    while (true)
    {
      this.dKO = af.dKW;
      return;
      label87: com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "Unknown error occured while setting output path");
    }
  }

  public final int getMaxAmplitude()
  {
    if (this.ddj == c.dJI)
      if (this.ddg != null);
    while (this.dKO != af.dKV)
    {
      return 0;
      return this.ddg.getMaxAmplitude();
    }
    int i = this.dcZ;
    this.dcZ = 0;
    return i;
  }

  public final void ma()
  {
    if ((this.ddj != c.dJI) || (this.ddg == null))
      return;
    this.ddg.setAudioEncoder(1);
  }

  public final void mb()
  {
    if ((this.ddj != c.dJI) || (this.ddg == null))
      return;
    this.ddg.setAudioSource(1);
  }

  public final void mc()
  {
    if ((this.ddj != c.dJI) || (this.ddg == null))
      return;
    this.ddg.setOutputFormat(3);
  }

  public final boolean md()
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg != null)
      {
        this.ddg.stop();
        this.ddg.release();
        this.ddg = null;
      }
      return true;
    }
    l locall = new l();
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "Stop now  state:" + this.dKO);
    if (this.dKO != af.dKV)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "stop() called on illegal state");
      this.dKO = af.dKW;
      return true;
    }
    synchronized (ddf)
    {
      if (this.ddi != null)
      {
        this.ddi.lZ();
        this.ddi.a(null);
      }
      long l1 = locall.nM();
      this.dKO = af.dKX;
      long l2 = locall.nM();
      this.dKN.mh();
      long l3 = ch.ac(this.ddd);
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "toNow " + l3 + " sStartTS " + this.ddd + " bufferLen " + dde);
      if ((l3 > 2000L) && (dde == 0L))
      {
        com.tencent.mm.compatible.c.o.mT().set(102401, Integer.valueOf(1));
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "16k not suppourt");
      }
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "Wait Stop Time Media:" + l1 + " Read:" + l2 + " Thr:" + locall.nM());
      return false;
    }
  }

  public final void prepare()
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.prepare();
      return;
    }
    if ((this.dKO != af.dKT) || (this.dda == null))
    {
      this.dKO = af.dKW;
      release();
      return;
    }
    this.dKO = af.dKU;
  }

  public final void release()
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.release();
      return;
    }
    if (this.dKO == af.dKV)
      md();
    while (true)
      synchronized (ddf)
      {
        if (this.ddi != null)
        {
          this.ddi.lZ();
          this.ddi = null;
        }
        return;
      }
  }

  public final void setMaxDuration(int paramInt)
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.setMaxDuration(3600010);
      return;
    }
    this.ddc = 3600010L;
  }

  public final void setOutputFile(String paramString)
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.setOutputFile(paramString);
      this.dda = paramString;
      return;
    }
    if (this.dKO == af.dKT)
    {
      this.dda = paramString;
      return;
    }
    this.dKO = af.dKW;
  }

  public final void start()
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.start();
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "Start now  state:" + this.dKO);
    if (this.dKO == af.dKU)
    {
      this.ddd = System.currentTimeMillis();
      dde = 0L;
      this.dKO = af.dKV;
      synchronized (ddf)
      {
        if (this.dKN == null)
        {
          this.dKN = new aa();
          aa.a(this.dKN, this.ddh, this.dda);
        }
        this.ddi.mB();
        return;
      }
    }
    com.tencent.mm.compatible.c.o.mT().set(102401, Integer.valueOf(1));
    com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "start() called on illegal state");
    this.dKO = af.dKW;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.SimpleMediaRecorder
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.compatible.audio;

import android.media.AudioRecord;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Timer;

public final class t extends w
{
  private v dKA = new v(this);
  private a dKB = null;
  private q dKC;
  private final Object dKD = new Object();
  private final byte[] dKE = new byte[0];
  private Timer dKF = null;
  private boolean dKG = false;
  private boolean dKH = false;
  private boolean dKg;
  private AudioRecord dKi;
  private int dKs;
  private boolean dKt = false;
  private boolean dKw;
  private boolean dKx;
  private boolean dKy;
  private int dKz = 12800;

  public t(AudioRecord paramAudioRecord, boolean paramBoolean1, boolean paramBoolean2, int paramInt, q paramq, boolean paramBoolean3)
  {
    this.dKi = paramAudioRecord;
    this.dKw = paramBoolean1;
    this.dKg = paramBoolean2;
    this.dKs = paramInt;
    this.dKC = paramq;
    this.dKH = paramBoolean3;
  }

  public final void af(boolean paramBoolean)
  {
    this.dKt = paramBoolean;
  }

  public final int f(byte[] paramArrayOfByte, int paramInt)
  {
    synchronized (this.dKD)
    {
      if (this.dKB != null)
      {
        int i = this.dKB.d(paramArrayOfByte, paramInt);
        return i;
      }
      return -1;
    }
  }

  public final boolean mB()
  {
    int i = -1;
    this.dKA.start();
    if (true == this.dKH)
    {
      this.dKB = new a();
      int k;
      if (this.dKB == null)
      {
        z.e("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "new m_audioBuffer error ");
        k = 0;
      }
      while (k == 0)
      {
        z.e("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "initAudioBuffer failed");
        return false;
        this.dKz = (20 * this.dKs);
        z.i("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "audioBuffer init mAudioBufferSize: " + this.dKz);
        int j = this.dKB.bZ(this.dKz);
        if (j != 0)
        {
          z.e("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "audioBuffer init failed, error code = " + j);
          k = 0;
        }
        else
        {
          k = 1;
        }
      }
      if ((this.dKG) || (this.dKF != null))
        z.w("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "Timer has been created or, timer has been started, " + this.dKG);
      while (i != 0)
      {
        z.e("!32@/B4Tb64lLpIVCVMiNqR56NpvaOgHdsgM", "InitAudioRecTimer failed, error code = -1");
        return false;
        this.dKF = new Timer();
        if (this.dKF != null)
          i = 0;
      }
      this.dKF.scheduleAtFixedRate(new u(this), 60L, 20L);
      this.dKG = true;
    }
    return true;
  }

  public final void mE()
  {
    this.dKx = false;
    synchronized (this.dKE)
    {
      this.dKE.notify();
      this.dKA.interrupt();
    }
    try
    {
      this.dKA.join(1000L);
      label38: if (this.dKB != null)
        this.dKB.mg();
      synchronized (this.dKD)
      {
        this.dKB = null;
        this.dKC = null;
        if (this.dKF != null)
        {
          this.dKF.cancel();
          this.dKF = null;
        }
        this.dKG = false;
        this.dKB = null;
        return;
        localObject1 = finally;
        throw localObject1;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      break label38;
    }
  }

  public final int mF()
  {
    synchronized (this.dKD)
    {
      if (this.dKB != null)
      {
        int i = this.dKB.mi();
        return i;
      }
      return -1;
    }
  }

  public final int mG()
  {
    synchronized (this.dKD)
    {
      if (this.dKB != null)
      {
        int i = this.dKB.mk();
        return i;
      }
      return -1;
    }
  }

  public final boolean tb()
  {
    return this.dKy;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.t
 * JD-Core Version:    0.6.2
 */
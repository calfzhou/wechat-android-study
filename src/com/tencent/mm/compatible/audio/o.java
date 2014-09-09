package com.tencent.mm.compatible.audio;

import android.media.AudioRecord;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.c.a;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.z;

public final class o
{
  public static int dJZ = 0;
  private int dIb = 2;
  private int dIc = 8000;
  private int dKa = 0;
  private int dKb = 0;
  private int dKc = 0;
  private int dKd = 0;
  private int dKe = 1;
  private int dKf = 120;
  private boolean dKg = false;
  private int dKh = -1;
  private AudioRecord dKi;
  private q dKj;
  private w dKk;
  private k dKl;
  private int dKm = 1;
  private x dKn = new p(this);

  public o(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    this.dIc = paramInt1;
    this.dKf = paramInt2;
    this.dKg = paramBoolean;
    this.dKh = paramInt3;
    if (this.dKe == 2);
    for (this.dIb = 3; ; this.dIb = 2)
    {
      if ((this.dKh == 0) && (v.dNG.dME > 0))
        this.dKf = v.dNG.dME;
      if (v.dNG.dMP > 0)
        this.dIb = v.dNG.dMP;
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = Integer.valueOf(this.dIc);
      arrayOfObject[1] = Integer.valueOf(this.dKe);
      arrayOfObject[2] = Integer.valueOf(this.dKf);
      arrayOfObject[3] = Boolean.valueOf(this.dKg);
      arrayOfObject[4] = Integer.valueOf(this.dKh);
      z.i("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "MMPcmRecorder sampleRate:%d channelCnt:%d durationPreFrame:%d newBufPreFrame:%b Biz:%d", arrayOfObject);
      return;
    }
  }

  private static int mC()
  {
    int i = 1;
    int j;
    if (Build.VERSION.SDK_INT < 11)
    {
      j = i;
      if (!v.dNC.dLc)
        break label45;
    }
    while (true)
    {
      if (v.dNC.dLz >= 0)
        i = v.dNC.dLz;
      return i;
      j = 7;
      break;
      label45: i = j;
    }
  }

  public final boolean N(boolean paramBoolean)
  {
    z.i("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "switchMute mute:" + paramBoolean);
    if (this.dKk != null)
      this.dKk.af(paramBoolean);
    return true;
  }

  public final void a(q paramq)
  {
    this.dKj = paramq;
  }

  public final int getState()
  {
    return this.dKm;
  }

  public final boolean lZ()
  {
    z.i("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "stopRecord, " + java.lang.Thread.currentThread().getStackTrace()[2].getMethodName());
    if (this.dKi == null)
    {
      z.e("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "audioRecord is null");
      return false;
    }
    if (this.dKi.getState() != 1)
    {
      z.e("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "audioRecord sate error " + this.dKi.getState());
      return false;
    }
    if (this.dKk != null)
    {
      this.dKk.mE();
      this.dKk = null;
    }
    this.dKi.stop();
    this.dKi.release();
    this.dKi = null;
    return true;
  }

  public final boolean mB()
  {
    z.i("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "startRecord, " + java.lang.Thread.currentThread().getStackTrace()[2].getMethodName());
    if (this.dKi != null)
    {
      z.e("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "start error ,is recording ");
      return false;
    }
    this.dKm = 1;
    boolean bool1;
    int i;
    if (v.dNG.dMA == 2)
    {
      bool1 = false;
      if (v.dNG.dMz <= 0)
        break label157;
      i = v.dNG.dMz;
    }
    int j;
    int k;
    while (true)
    {
      j = AudioRecord.getMinBufferSize(this.dIc, this.dIb, 2);
      if ((j != -2) && (j != -1))
        break label184;
      z.e("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "MMPcmRecorder  getMinBufferSize error " + j);
      this.dKm = 3;
      this.dKa = 1;
      k = 0;
      if (k != 0)
        break label649;
      z.e("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "startRecord init error");
      return false;
      bool1 = true;
      break;
      label157: if ((this.dKh == 1) || (this.dKh == 2))
        i = 1;
      else
        i = 10;
    }
    label184: int m = this.dIc * this.dKf * this.dKe / 1000;
    int n = m * 2;
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Integer.valueOf(j);
    arrayOfObject[1] = Integer.valueOf(this.dIc);
    arrayOfObject[2] = Integer.valueOf(m);
    arrayOfObject[3] = Integer.valueOf(n);
    arrayOfObject[4] = Integer.valueOf(i);
    arrayOfObject[5] = Boolean.valueOf(bool1);
    z.i("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "MMPcmRecorder Construct AudioRecord, minBufSize:%d, sampleRate:%d, sampleCntPreFrame:%d, sizePreFrame:%d, timesOfMinBuffer:%d, readMode:%b", arrayOfObject);
    if (this.dKh == 1)
    {
      this.dKi = new AudioRecord(mC(), this.dIc, this.dIb, 2, i * j);
      label313: if ((this.dKi.getState() == 0) && (this.dKh == 1))
      {
        z.e("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "MMPcmRecorder mAudioRecord.getState() == AudioRecord.STATE_UNINITIALIZED  error");
        this.dKi.release();
        this.dKa = 2;
        if (mC() != 7)
          break label454;
      }
    }
    label454: for (this.dKi = new AudioRecord(1, this.dIc, this.dIb, 2, i * j); ; this.dKi = new AudioRecord(0, this.dIc, this.dIb, 2, i * j))
    {
      if (this.dKi.getState() != 0)
        break label481;
      z.e("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "MMPcmRecorder STATE_UNINITIALIZED audioRecord.release()");
      this.dKi.release();
      this.dKi = null;
      this.dKm = 2;
      this.dKa = 3;
      k = 0;
      break;
      this.dKi = new AudioRecord(1, this.dIc, this.dIb, 2, i * j);
      break label313;
    }
    label481: AudioRecord localAudioRecord;
    boolean bool2;
    label510: boolean bool3;
    q localq;
    boolean bool4;
    if (bool1)
    {
      localAudioRecord = this.dKi;
      if ((this.dKh == 1) || (this.dKh == 2))
      {
        bool2 = true;
        bool3 = this.dKg;
        localq = this.dKj;
        if (this.dKh != 1)
          break label613;
        bool4 = true;
      }
    }
    label533: for (this.dKk = new t(localAudioRecord, bool2, bool3, n, localq, bool4); ; this.dKk = new r(this.dKi, this.dKj, this.dKg, m, n))
    {
      this.dKk.a(this.dKn);
      this.dKl = new k();
      this.dKl.a(this.dKi, this.dKh);
      z.i("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "MMPcmRecorder leave  init");
      k = 1;
      break;
      bool2 = false;
      break label510;
      label613: bool4 = false;
      break label533;
    }
    label649: this.dKi.startRecording();
    if (this.dKi.getRecordingState() != 3)
    {
      z.e("!32@/B4Tb64lLpJ9BY7/AxE8KqlzjdhE0nS4", "MMPcmRecorder mAudioRecord.startRecording()  error");
      this.dKm = 2;
      this.dKa = 4;
      return false;
    }
    if (this.dKk != null)
      return this.dKk.mB();
    return false;
  }

  public final int mD()
  {
    return this.dKa;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.o
 * JD-Core Version:    0.6.2
 */
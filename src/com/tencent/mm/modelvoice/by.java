package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.audio.c;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.z;

public final class by
{
  private static int ddM = 100;
  private MediaRecorder dIR;
  private ca dIS = null;
  private String rI = "";
  private int status = 0;

  public by(c paramc)
  {
    this.dIR = new MediaRecorder(paramc);
  }

  public final int Bg()
  {
    return this.dIR.Bg();
  }

  public final void a(ca paramca)
  {
    this.dIS = paramca;
  }

  public final String getFileName()
  {
    return this.rI;
  }

  public final int getMaxAmplitude()
  {
    if (this.status == 1)
    {
      int i = this.dIR.getMaxAmplitude();
      if (i > ddM)
        ddM = i;
      return i * 100 / ddM;
    }
    return 0;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final boolean iq(String paramString)
  {
    l locall = new l();
    if (this.rI.length() > 0)
    {
      z.e("!24@J/TNaXmTnT2mD815LCdsDw==", "Duplicate Call startRecord , maybe Stop Fail Before");
      return false;
    }
    this.rI = paramString;
    try
    {
      this.dIR.a(new bz(this));
      this.dIR.mb();
      this.dIR.mc();
      this.dIR.ma();
      this.dIR.setOutputFile(this.rI);
      this.dIR.Bi();
      this.dIR.prepare();
      this.dIR.start();
      z.d("!24@J/TNaXmTnT2mD815LCdsDw==", "StartRecord File[" + this.rI + "] start time:" + locall.nM());
      this.status = 1;
      return true;
    }
    catch (Exception localException)
    {
      z.e("!24@J/TNaXmTnT2mD815LCdsDw==", "StartRecord File[" + this.rI + "] ErrMsg[" + localException.getMessage() + "]");
      this.status = -1;
    }
    return false;
  }

  public final boolean lZ()
  {
    if (this.dIR == null)
      return true;
    try
    {
      this.dIR.md();
      this.dIR.release();
      this.rI = "";
      this.status = 0;
      return true;
    }
    catch (Exception localException)
    {
      z.e("!24@J/TNaXmTnT2mD815LCdsDw==", "StopRecord File[" + this.rI + "] ErrMsg[" + localException.getMessage() + "]");
      this.status = -1;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.by
 * JD-Core Version:    0.6.2
 */
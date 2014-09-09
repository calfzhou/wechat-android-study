package com.tencent.mm.modelvoice;

import android.media.AudioRecord;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.qqpinyin.voicerecoapi.a;
import java.io.FileOutputStream;

public final class bj
{
  private a dDF = null;
  private FileOutputStream dDG = null;
  private AudioRecord dIF = null;
  int dIG = 0;
  private int dcZ = 0;
  private int dcz = 5;
  private String rI = "";
  private int status = 0;

  public final int getMaxAmplitude()
  {
    z.d("amp", "cAmplitude " + this.dcZ);
    int i = this.dcZ;
    this.dcZ = 0;
    return i;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final boolean iq(String paramString)
  {
    if (this.rI.length() > 0)
    {
      z.e("!32@/B4Tb64lLpKxxZlLZKhWt+g3aFejQlb6", "Duplicate Call startRecord , maybe Stop Fail Before");
      return false;
    }
    try
    {
      this.status = 1;
      this.dcZ = 0;
      new Thread(new bk(this)).start();
      label47: this.rI = paramString;
      return true;
    }
    catch (Exception localException)
    {
      break label47;
    }
  }

  public final boolean lZ()
  {
    this.rI = "";
    this.status = 0;
    if (this.dIF == null);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bj
 * JD-Core Version:    0.6.2
 */
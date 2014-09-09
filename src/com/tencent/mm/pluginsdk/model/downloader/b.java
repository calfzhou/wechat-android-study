package com.tencent.mm.pluginsdk.model.downloader;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class b extends AsyncTask
{
  private String cNf;
  private String cNg = "";
  private c hvV;

  public b(String paramString, c paramc)
  {
    this.cNf = paramString;
    this.hvV = paramc;
  }

  private Boolean a(File[] paramArrayOfFile)
  {
    if ((paramArrayOfFile == null) || (paramArrayOfFile.length == 0))
    {
      z.e("!44@/B4Tb64lLpLcNOM+65p2NToD88OPKXd2vmHQ6ns9m6s=", "no file param exist ");
      return Boolean.valueOf(false);
    }
    try
    {
      long l1 = System.currentTimeMillis();
      this.cNg = aj.k(paramArrayOfFile[0]);
      long l2 = System.currentTimeMillis();
      z.d("!44@/B4Tb64lLpLcNOM+65p2NToD88OPKXd2vmHQ6ns9m6s=", "start time: " + l1 + "end time: " + l2 + ", total Time: " + (l2 - l1));
      z.d("!44@/B4Tb64lLpLcNOM+65p2NToD88OPKXd2vmHQ6ns9m6s=", "origMd5 : " + this.cNf + ", checkedMd5 :" + this.cNg);
      if ((!TextUtils.isEmpty(this.cNf)) && (this.cNf.startsWith("qq_browser_apk_md5")))
        return Boolean.valueOf(true);
      if ((!ch.jb(this.cNg)) && (!ch.jb(this.cNf)) && (this.cNf.equalsIgnoreCase(this.cNg)))
        return Boolean.valueOf(true);
      if ((!ch.jb(this.cNf)) && (this.cNg == null))
      {
        File localFile = paramArrayOfFile[0];
        if ((localFile != null) && (localFile.exists()))
        {
          z.i("!44@/B4Tb64lLpLcNOM+65p2NToD88OPKXd2vmHQ6ns9m6s=", "check from file failed, may caused by low memory while check md5");
          Boolean localBoolean = Boolean.valueOf(true);
          return localBoolean;
        }
      }
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpLcNOM+65p2NToD88OPKXd2vmHQ6ns9m6s=", "check md5 failed: " + localException.getMessage());
    }
    return Boolean.valueOf(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.b
 * JD-Core Version:    0.6.2
 */
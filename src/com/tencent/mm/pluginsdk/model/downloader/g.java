package com.tencent.mm.pluginsdk.model.downloader;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.net.Uri;
import android.os.Environment;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sdk.platformtools.aj;
import java.io.File;

@TargetApi(9)
public final class g extends DownloadManager.Request
  implements k
{
  private String cHL;
  private boolean cNa;
  private String eYY;
  private String ezw;
  private String frZ;
  private int hwg;
  private boolean hwh;
  private String mFileName;
  private Uri mUri;

  private g(Uri paramUri)
  {
    super(paramUri);
    this.mUri = paramUri;
    setAllowedNetworkTypes(3);
    setShowRunningNotification(true);
  }

  public g(String paramString)
  {
    this(Uri.parse(paramString));
  }

  public final String azh()
  {
    return this.ezw;
  }

  public final Uri azi()
  {
    return this.mUri;
  }

  public final String azj()
  {
    return this.cHL;
  }

  public final int azk()
  {
    return this.hwg;
  }

  public final boolean azl()
  {
    return this.hwh;
  }

  public final boolean azm()
  {
    return this.cNa;
  }

  public final String azn()
  {
    return this.eYY;
  }

  public final void db(boolean paramBoolean)
  {
    this.cNa = paramBoolean;
  }

  public final void dc(boolean paramBoolean)
  {
    this.hwh = paramBoolean;
  }

  public final String getFileName()
  {
    return this.mFileName;
  }

  public final String getKey()
  {
    return this.frZ;
  }

  public final void hT(String paramString)
  {
    super.setTitle(paramString);
    this.mFileName = paramString;
  }

  public final void mp(int paramInt)
  {
    this.hwg = paramInt;
  }

  public final void setKey(String paramString)
  {
    this.frZ = paramString;
  }

  public final void vj(String paramString)
  {
    this.cHL = paramString;
    long l = System.currentTimeMillis();
    String str = aj.AN(paramString + l);
    setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str + ".apk");
    this.ezw = (m.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + "/" + str + ".apk");
  }

  public final void vk(String paramString)
  {
    this.eYY = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.g
 * JD-Core Version:    0.6.2
 */
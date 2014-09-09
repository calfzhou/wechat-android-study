package com.tencent.mm.pluginsdk.f;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.MediaRecorder;
import android.media.ThumbnailUtils;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.e;

public final class b
{
  private Context context;
  private int fileSize;
  private String filename;
  private int hwJ;
  private a hwK;
  private MediaRecorder hwL;
  private h hwM;
  private int hwN = 0;
  private final int hwO = 5;
  private boolean hwP = false;
  private d hwR = new d(Looper.getMainLooper());

  @SuppressLint({"NewApi"})
  private void a(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2)
  {
    while (true)
    {
      if (this.hwM == null)
      {
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "yuvRecoder is null");
        label14: return;
      }
      Camera localCamera = this.hwM.azC();
      if ((paramSurfaceHolder == null) || (localCamera == null))
      {
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "holder or cam is null ");
        return;
      }
      int i;
      label54: int j;
      if (v.dNG.dMT == -1)
      {
        i = paramInt1;
        j = h.azA();
      }
      try
      {
        localCamera.unlock();
        label69: this.hwL = new MediaRecorder();
        this.hwL.setCamera(localCamera);
        this.hwL.setAudioSource(5);
        this.hwL.setVideoSource(1);
        this.hwL.setOutputFormat(2);
        this.hwL.setVideoSize(this.hwK.hww, this.hwK.hwv);
        this.hwL.setVideoEncoder(2);
        this.hwL.setAudioEncoder(3);
        if (Build.VERSION.SDK_INT > 7)
          this.hwL.setVideoEncodingBitRate(this.hwK.hwx);
      }
      catch (Exception localException1)
      {
        try
        {
          if (v.dND.dNJ)
            this.hwL.setVideoFrameRate(v.dND.dNM);
          while (true)
          {
            this.hwL.setOutputFile(this.hwK.hwG);
            this.hwL.setPreviewDisplay(paramSurfaceHolder.getSurface());
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(j);
            arrayOfObject2[1] = this.hwK.toString();
            com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "doStart camid[%s] params:\n%s", arrayOfObject2);
            if (j != 0)
              break label457;
            if (v.dNG.dML != -1)
              break label446;
            m = 90;
            setOrientationHint(m);
            try
            {
              this.hwL.prepare();
              this.hwL.start();
              return;
            }
            catch (Exception localException3)
            {
              Object[] arrayOfObject3 = new Object[2];
              arrayOfObject3[0] = localException3.getMessage();
              arrayOfObject3[1] = Integer.valueOf(this.hwN);
              com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "exception in mediaRecorder[%s] doStartCount[%s]", arrayOfObject3);
              this.hwN = (1 + this.hwN);
            }
            if (this.hwN >= 5)
              break label14;
            paramInt1 = this.hwM.aK(paramInt2, paramInt1);
            paramInt2++;
            break;
            i = v.dNG.dMT;
            break label54;
            localException1 = localException1;
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = localException1.getMessage();
            com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "exception in cam.unlock() [%s]", arrayOfObject1);
            break label69;
            this.hwL.setVideoFrameRate(i);
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "try set fps failed: " + i);
            continue;
            label446: int m = v.dNG.dML;
          }
        }
      }
    }
    label457: if (v.dNG.dMM == -1);
    for (int k = 270; ; k = v.dNG.dMM)
    {
      setOrientationHint(k);
      break;
    }
  }

  @TargetApi(9)
  private void setOrientationHint(int paramInt)
  {
    com.tencent.mm.compatible.a.a.a(9, new c(this, paramInt));
  }

  public final int AU()
  {
    return this.hwK.dGd;
  }

  public final int a(Activity paramActivity, boolean paramBoolean)
  {
    this.context = paramActivity;
    int i = this.hwM.a(paramActivity, this.hwK, paramBoolean);
    if (i != 0)
      return i;
    return 0;
  }

  public final int a(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    int i = 1;
    this.hwJ = paramInt;
    a locala2;
    if (i == this.hwJ)
    {
      a locala1 = new a();
      locala1.tj = 30;
      locala1.dMp = 0;
      locala1.hwy = 320;
      locala1.hwz = 240;
      locala1.hwv = 320;
      locala1.hww = 240;
      locala1.hwx = 327680;
      locala1.hwA = 4;
      locala1.hwB = i;
      locala1.hwC = "/sdcard/2.yuv";
      locala1.hwG = "/sdcard/2.mp4";
      locala1.hwD = "/sdcard/2.pcm";
      locala1.hwF = "/sdcard/2.x264";
      locala1.hwH = 0;
      locala1.dGd = 0;
      locala1.hwI = 0;
      this.hwK = locala1;
      if (v.dND.dNJ)
      {
        this.hwK.hwy = v.dND.dNL;
        this.hwK.hwz = v.dND.dNK;
        this.hwK.hwx = v.dND.dNN;
      }
      this.filename = paramString4;
      this.hwK.hwG = paramString2;
      this.hwK.hwE = paramString3;
      this.hwK.hwD = (paramString1 + "temp.pcm");
      this.hwK.hwC = (paramString1 + "temp.yuv");
      this.hwK.hwF = (paramString1 + "temp.vid");
      this.hwK.hwI = com.tencent.mm.compatible.c.d.getNumberOfCameras();
      locala2 = this.hwK;
      if (!paramBoolean)
        break label483;
    }
    while (true)
    {
      locala2.dMp = i;
      this.hwK.dGd = 0;
      this.hwM = new h();
      return 0;
      a locala3 = new a();
      locala3.tj = 30;
      locala3.dMp = 0;
      locala3.hwy = 640;
      locala3.hwz = 480;
      locala3.hwv = 640;
      locala3.hww = 480;
      locala3.hwx = 1440000;
      locala3.hwA = i;
      locala3.hwB = 4;
      locala3.hwC = "/sdcard/1.yuv";
      locala3.hwG = "/sdcard/1.mp4";
      locala3.hwD = "/sdcard/1.pcm";
      locala3.hwF = "/sdcard/1.x264";
      locala3.hwH = 0;
      locala3.dGd = 0;
      locala3.hwI = 0;
      this.hwK = locala3;
      break;
      label483: i = 0;
    }
  }

  public final void azs()
  {
    boolean bool = true;
    if (this.hwM == null)
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "trigger zoom, but yuv recorder is null");
    Camera.Parameters localParameters;
    do
    {
      return;
      localParameters = this.hwM.azC().getParameters();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(this.hwP);
      arrayOfObject[bool] = Boolean.valueOf(localParameters.isZoomSupported());
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "trigger zoom, has zoomed %B, isSupported %B", arrayOfObject);
    }
    while (!localParameters.isZoomSupported());
    this.hwR.removeMessages(4353);
    if (this.hwP)
    {
      this.hwR.hwP = false;
      this.hwR.hwU = (-1 * localParameters.getMaxZoom() / 2 / 5);
      this.hwR.sendMessage(Message.obtain(this.hwR, 4353, 0, 0, this.hwM.azC()));
      if (this.hwP)
        break label205;
    }
    while (true)
    {
      this.hwP = bool;
      return;
      this.hwR.hwP = bool;
      this.hwR.hwU = (localParameters.getMaxZoom() / 2 / 5);
      this.hwR.sendMessage(Message.obtain(this.hwR, 4353, 0, 0, this.hwM.azC()));
      break;
      label205: bool = false;
    }
  }

  public final int azt()
  {
    this.hwM.azB();
    return 0;
  }

  public final int azu()
  {
    if (this.hwM.azC() == null)
      return 0;
    return this.hwM.azC().getParameters().getPreviewSize().width;
  }

  public final int azv()
  {
    if (this.hwM.azC() == null)
      return 0;
    return this.hwM.azC().getParameters().getPreviewSize().height;
  }

  public final Bitmap bk(Context paramContext)
  {
    String str = this.hwK.hwE;
    Bitmap localBitmap1;
    if ((str == null) || (str.length() <= 0))
      localBitmap1 = null;
    Bitmap localBitmap2;
    do
    {
      return localBitmap1;
      localBitmap2 = e.c(str.trim(), com.tencent.mm.aq.a.getDensity(paramContext));
      if (localBitmap2 == null)
        break;
      int i = localBitmap2.getWidth();
      int j = localBitmap2.getHeight();
      int k = e.a(paramContext, 224.0F);
      float f = i / k;
      localBitmap1 = Bitmap.createScaledBitmap(localBitmap2, k, (int)(j / f), true);
    }
    while (localBitmap2 == localBitmap1);
    localBitmap2.recycle();
    return localBitmap1;
    return localBitmap2;
  }

  public final void cancel()
  {
    if (this.hwL != null)
    {
      this.hwL.stop();
      this.hwL.release();
      this.hwL = null;
    }
  }

  public final void cz(long paramLong)
  {
    if (this.hwL != null);
    try
    {
      this.hwL.stop();
      this.hwL.release();
      this.hwL = null;
      this.hwK.dGd = ((int)(paramLong / 1000L));
      a locala = this.hwK;
      if (this.hwK.dGd > 0)
      {
        i = this.hwK.dGd;
        locala.dGd = i;
        this.hwK.hwH = (this.hwK.dGd * this.hwK.tj);
        if ((com.tencent.mm.a.c.ac(this.hwK.hwG)) && (!com.tencent.mm.a.c.ac(this.hwK.hwE)) && (this.context != null))
        {
          if (!com.tencent.mm.compatible.g.g.cp(8))
            break label283;
          localBitmap = ThumbnailUtils.createVideoThumbnail(this.hwK.hwG, 1);
          if (localBitmap == null)
            break label241;
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "saveBitmapToImage " + this.hwK.hwE);
          g.a(localBitmap, Bitmap.CompressFormat.JPEG, this.hwK.hwE);
          if (com.tencent.mm.a.c.ac(this.hwK.hwG))
            this.fileSize = com.tencent.mm.a.c.ab(this.hwK.hwG);
          return;
          localException1 = localException1;
          com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpI1e8tUm4Rri4eXlBH2dRe1", "video[tiger] video stop failed");
          continue;
          int i = 1;
          continue;
          try
          {
            label241: g.a(BitmapFactory.decodeStream(this.context.getResources().openRawResource(com.tencent.mm.h.Us)), Bitmap.CompressFormat.JPEG, this.hwK.hwE);
          }
          catch (Exception localException2)
          {
          }
          continue;
        }
        catch (Exception localException3)
        {
          continue;
        }
        label283: Bitmap localBitmap = null;
      }
    }
  }

  public final int d(SurfaceHolder paramSurfaceHolder)
  {
    return this.hwM.d(paramSurfaceHolder);
  }

  public final void e(SurfaceHolder paramSurfaceHolder)
  {
    this.hwN = 0;
    a(paramSurfaceHolder, this.hwK.tj, 0);
  }

  public final String getFileName()
  {
    return this.filename;
  }

  public final int getFileSize()
  {
    return this.fileSize;
  }

  public final void j(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.filename = paramString4;
    this.hwK.hwG = paramString2;
    this.hwK.hwE = paramString3;
    this.hwK.hwD = (paramString1 + "temp.pcm");
    this.hwK.hwC = (paramString1 + "temp.yuv");
    this.hwK.hwF = (paramString1 + "temp.vid");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.b
 * JD-Core Version:    0.6.2
 */
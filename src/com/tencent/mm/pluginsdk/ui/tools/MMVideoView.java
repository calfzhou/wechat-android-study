package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.tencent.mm.ak.m;
import com.tencent.mm.compatible.g.o;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class MMVideoView extends ImageView
{
  private int cKi = -1;
  protected String dFC = "";
  private Bitmap eXB;
  private int hMb = 0;
  protected int hMc = -1;
  private int hMd = 41;
  private Bitmap hMe;
  private Bitmap hMf;
  private Bitmap hMg;
  private Canvas hMh;
  private Canvas hMi;
  private Paint hMj;
  private Paint hMk;
  private Rect hMl;
  private NinePatchDrawable hMm;
  private final int hMn = (int)(0.7D * getResources().getDisplayMetrics().widthPixels);
  private long hMo;
  private final boolean hMp;
  private ba hMq;
  private ay hMr;
  private az hMs;
  private cm jzh = new cm(Looper.getMainLooper());

  public MMVideoView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public MMVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!ch.jb(o.cI("FFmpeg")));
    for (boolean bool = true; ; bool = false)
    {
      this.hMp = bool;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(this.hMp);
      z.i("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "native ok %B", arrayOfObject);
      return;
    }
  }

  private boolean aFd()
  {
    return (this.hMs != null) && (!this.hMs.hMu) && (this.hMr != null) && (!this.hMr.hMu);
  }

  private boolean aFf()
  {
    if (Build.VERSION.SDK_INT >= 11)
      if (this.hMb >= 3)
      {
        z.e("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "match not check bad fps, but now is bad fps");
        this.hMb = 0;
      }
    while (this.hMb < 3)
      return false;
    return true;
  }

  private void aM(int paramInt1, int paramInt2)
  {
    this.hMf = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    this.hMg = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    this.hMj = new Paint(1);
    this.hMj.setFilterBitmap(false);
    this.hMm.setBounds(0, 0, this.hMf.getWidth(), this.hMf.getHeight());
    this.hMe = Bitmap.createBitmap(this.hMf.getWidth(), this.hMf.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(this.hMe);
    this.hMm.draw(localCanvas);
    this.hMh = new Canvas(this.hMf);
    this.hMi = new Canvas(this.hMg);
    this.hMk = new Paint(1);
    this.hMk.setFilterBitmap(false);
    this.hMk.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    this.hMl = new Rect(0, 0, this.hMf.getWidth(), this.hMf.getHeight());
  }

  private static native int drawFrame(int paramInt1, Bitmap paramBitmap1, int paramInt2, Bitmap paramBitmap2, boolean paramBoolean);

  private static native int freeObj(int paramInt);

  private static native double getVideoDurationt(int paramInt);

  private static native int getVideoHeight(int paramInt);

  private static native double getVideoRate(int paramInt);

  private static native double getVideoStartTime(int paramInt);

  private static native int getVideoWidth(int paramInt);

  private static native int openFile(String paramString);

  public final String Bb()
  {
    return this.dFC;
  }

  public final void N(String paramString, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = this.dFC;
    arrayOfObject[3] = Boolean.valueOf(paramBoolean);
    arrayOfObject[4] = Integer.valueOf(this.hMc);
    z.d("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x data: set video[%s], old path[%s], fling[%B], last video id %d", arrayOfObject);
    if (!this.hMp)
      return;
    if (aFf())
    {
      z.e("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "is bad fps, do nothing when set video path");
      clear();
      return;
    }
    if (paramBoolean)
    {
      aFc();
      return;
    }
    if (this.dFC.equals(paramString))
    {
      restart();
      return;
    }
    clear();
    if (paramString == null)
      paramString = "";
    this.dFC = paramString;
    this.hMq = new ba(this, (byte)0);
    m.c(this.hMq, 0L);
  }

  public final void aFb()
  {
    this.cKi = -1;
    this.hMm = null;
    this.hMe = null;
    this.hMh = null;
    this.hMi = null;
    this.hMf = null;
    this.hMg = null;
  }

  protected final void aFc()
  {
    if (this.hMq != null)
    {
      m.d(this.hMq);
      this.hMq.hMu = true;
    }
    if (this.hMs != null)
    {
      this.jzh.removeCallbacks(this.hMs);
      this.hMs.hMu = true;
    }
    if (this.hMr != null)
    {
      m.d(this.hMr);
      this.hMr.hMu = true;
    }
  }

  public final boolean aFe()
  {
    return (!this.hMp) || (aFf());
  }

  public final void clear()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    arrayOfObject[1] = Integer.valueOf(this.hMc);
    arrayOfObject[2] = Boolean.valueOf(aFd());
    z.i("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x do clear, remove render job, video id %d, runing %B", arrayOfObject);
    aFc();
    this.hMo = 0L;
    int i = this.hMc;
    if (this.hMp)
      m.c(new ax(this, i), 0L);
    this.hMc = -1;
    this.dFC = "";
  }

  protected void onDetachedFromWindow()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    arrayOfObject[1] = Integer.valueOf(this.hMc);
    z.i("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x clear, on deattached to window, video id %d", arrayOfObject);
    clear();
    super.onDetachedFromWindow();
  }

  protected final void restart()
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(hashCode());
    z.d("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x restart", arrayOfObject1);
    if (!this.hMp)
      return;
    if (aFd())
    {
      z.w("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "is runing, do nothing when restart request asked");
      return;
    }
    aFc();
    this.hMo = 0L;
    if (aFf())
    {
      z.e("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "is bad fps, do nothing when restart");
      return;
    }
    if (this.hMc < 0)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(hashCode());
      z.w("!32@/B4Tb64lLpKrX3YeIn+69ZdRhSAKmsJc", "#0x%x restart match error video id, reopen video", arrayOfObject2);
      this.hMq = new ba(this, (byte)0);
      m.c(this.hMq, 0L);
      return;
    }
    this.hMr = new ay(this, (byte)0);
    this.hMs = new az(this, (byte)0);
    this.hMr.hMv = this.hMs;
    this.hMs.hMw = this.hMr;
    m.c(this.hMr, 0L);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    int i;
    if (paramBitmap == null)
    {
      i = 140;
      if (paramBitmap != null)
        break label80;
    }
    label80: for (int j = 208; ; j = paramBitmap.getWidth())
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      if (localLayoutParams.height != i * this.hMn / j)
      {
        localLayoutParams.width = this.hMn;
        localLayoutParams.height = (i * this.hMn / j);
        setLayoutParams(localLayoutParams);
      }
      return;
      i = paramBitmap.getHeight();
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.MMVideoView
 * JD-Core Version:    0.6.2
 */
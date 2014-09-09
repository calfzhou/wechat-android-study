package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class LyricView extends SurfaceView
  implements SurfaceHolder.Callback
{
  private e hFL = null;
  private a hFM = null;
  private Bitmap hFN = null;
  private Bitmap hFO = null;
  private c hFP = null;
  private d hFQ = null;
  private String hFR;
  private cm jzh = null;
  private Object lock = new byte[0];

  public LyricView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public LyricView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public LyricView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void aCV()
  {
    if (this.hFL == null)
    {
      z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on stop draw:render is null, quit");
      return;
    }
    synchronized (this.lock)
    {
      if (this.hFL != null)
        this.hFL.evv = false;
      this.lock.notify();
    }
    try
    {
      this.hFL.join();
      this.hFL = null;
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getLocalizedMessage();
        z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "render finish error [%s]", arrayOfObject);
      }
    }
  }

  private void init()
  {
    getHolder().addCallback(this);
    this.jzh = new cm(Looper.getMainLooper());
    this.hFO = BitmapFactory.decodeResource(getResources(), h.mark);
  }

  public final void a(a parama)
  {
    this.hFM = parama;
  }

  public final a aCQ()
  {
    return this.hFM;
  }

  public final long aCR()
  {
    if (this.hFP != null)
      return this.hFP.hFS;
    return 86400000L;
  }

  public final void aCS()
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    if (this.hFP == null);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on stop auto play, autoPlayJob is null ? %B", arrayOfObject);
      setKeepScreenOn(false);
      if ((this.hFP != null) && (this.jzh != null))
      {
        this.jzh.removeCallbacks(this.hFP);
        this.hFP = null;
        aCV();
      }
      return;
      bool = false;
    }
  }

  public final void aCT()
  {
    aCU();
    if ((this.hFL == null) || (!this.hFL.evv))
    {
      z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on start auto refresh ok");
      this.hFQ = new d(this, (byte)0);
      this.jzh.postDelayed(this.hFQ, 300L);
      return;
    }
    z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on start auto refresh fail");
  }

  public final void aCU()
  {
    z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on stop auto refresh bg");
    if ((this.hFQ != null) && (this.jzh != null))
    {
      this.jzh.removeCallbacks(this.hFQ);
      this.hFQ = null;
    }
  }

  public final void h(long paramLong1, long paramLong2)
  {
    boolean bool1 = true;
    aCS();
    if ((this.hFM != null) && ((this.hFL == null) || (!this.hFL.evv)))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(paramLong1);
      arrayOfObject2[bool1] = Long.valueOf(paramLong2);
      z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on start auto play[%d, %d] ok", arrayOfObject2);
      setKeepScreenOn(bool1);
      this.hFP = new c(this, paramLong1 + 80L, paramLong2);
      this.jzh.postDelayed(this.hFP, 80L);
      return;
    }
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Long.valueOf(paramLong1);
    arrayOfObject1[bool1] = Long.valueOf(paramLong2);
    boolean bool2;
    if (this.hFM == null)
    {
      bool2 = bool1;
      arrayOfObject1[2] = Boolean.valueOf(bool2);
      if (this.hFL != null)
        break label180;
    }
    while (true)
    {
      arrayOfObject1[3] = Boolean.valueOf(bool1);
      z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on start auto play[%d, %d] fail, lyricMgr is null[%B], render is null[%B]", arrayOfObject1);
      return;
      bool2 = false;
      break;
      label180: bool1 = false;
    }
  }

  public final void i(long paramLong1, long paramLong2)
  {
    int i = 1;
    if (this.hFM == null)
      z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "lyricMgr is null, do not start lyric render thread, return true");
    while (i != 0)
    {
      z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "filter update event");
      return;
      if ((0L < paramLong2) && (!this.hFM.aCN()))
      {
        Object[] arrayOfObject2 = new Object[i];
        arrayOfObject2[0] = Long.valueOf(paramLong2);
        z.d("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "song length %d, add tail", arrayOfObject2);
        this.hFM.cB(paramLong2);
      }
      if ((this.hFL == null) || (!this.hFL.evv))
      {
        Object[] arrayOfObject1 = new Object[i];
        arrayOfObject1[0] = Long.valueOf(paramLong1);
        z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "start draw, time %d, return true", arrayOfObject1);
        this.hFL = new e(this, paramLong1);
        this.hFL.start();
      }
      else
      {
        i = 0;
      }
    }
    synchronized (this.lock)
    {
      if (this.hFL != null)
        this.hFL.hGg = paramLong1;
      this.lock.notify();
      return;
    }
  }

  @TargetApi(14)
  public final void release()
  {
    if (Build.VERSION.SDK_INT >= 14)
      getHolder().getSurface().release();
  }

  public final void stop()
  {
    aCU();
    aCS();
    aCV();
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on surface changed");
    aCT();
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    if (this.hFL == null);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on surface created: render is null ? %B", arrayOfObject);
      return;
      bool = false;
    }
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "on surface destroyed");
    stop();
  }

  public final void vL(String paramString)
  {
    this.hFR = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.LyricView
 * JD-Core Version:    0.6.2
 */
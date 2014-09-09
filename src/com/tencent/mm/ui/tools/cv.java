package com.tencent.mm.ui.tools;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.mm.a.d;
import com.tencent.mm.sdk.platformtools.bp;
import java.util.HashMap;
import java.util.LinkedList;

public final class cv
{
  private bp dqZ = new bp(1, "chatting-image-gallery-preload-loader");
  protected d eXu = new d(4, new cw(this));
  private LinkedList eXw = new LinkedList();
  private boolean eXz = false;
  private int es = 0;
  protected HashMap jRR = new HashMap();

  private void Lt()
  {
    if (this.eXz);
    while (true)
    {
      return;
      if (this.eXw.size() != 0)
      {
        if (this.es == 0);
        for (int i = 1; i != 0; i = 0)
        {
          String str = (String)this.eXw.removeLast();
          this.eXz = true;
          cy localcy = new cy(this, str);
          this.dqZ.c(localcy);
          return;
        }
      }
    }
  }

  public static cv bam()
  {
    return cz.jRT;
  }

  public static int s(Bitmap paramBitmap)
  {
    int i;
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
      i = 0;
    while (true)
    {
      return i;
      if (Build.VERSION.SDK_INT >= 12);
      for (i = paramBitmap.getByteCount(); i < 0; i = paramBitmap.getRowBytes() * paramBitmap.getHeight())
        throw new IllegalStateException("Negative size: " + paramBitmap);
    }
  }

  public final void cancel()
  {
    this.eXw.clear();
  }

  public final boolean dl(long paramLong)
  {
    return this.jRR.containsValue(Long.valueOf(paramLong));
  }

  public final void i(long paramLong, String paramString)
  {
    if (this.eXw.contains(paramString));
    while (this.eXu.T(paramString))
      return;
    this.jRR.put(paramString, Long.valueOf(paramLong));
    this.eXw.add(paramString);
    if (this.eXw.size() > 4)
      this.eXw.removeFirst();
    Lt();
  }

  public final void xU()
  {
    d locald = this.eXu;
    new cx(this);
    locald.hk();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.cv
 * JD-Core Version:    0.6.2
 */
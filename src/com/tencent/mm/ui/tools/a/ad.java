package com.tencent.mm.ui.tools.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.cm;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class ad
{
  private boolean jWs = true;
  private int jWt;
  private Drawable jWu;
  private boolean jWv = false;
  private final ac jXs;
  private int jXt;
  private boolean jXu;
  private Drawable jXv;

  ad(int paramInt)
  {
    this.jXs = new ac(null, paramInt);
  }

  ad(l paraml)
  {
    this.jXs = new ac(paraml);
  }

  public final void a(ImageView paramImageView, g paramg)
  {
    if (paramImageView == null)
      throw new IllegalArgumentException("Target must not be null.");
    if (!this.jXs.bbA())
    {
      u.bbu().ah(paramImageView);
      z.a(paramImageView, this.jXt, this.jXv);
      return;
    }
    if (this.jXu)
    {
      if (this.jXs.bby())
        throw new IllegalStateException("Fit cannot be used with resized");
      int i = paramImageView.getMeasuredWidth();
      int j = paramImageView.getMeasuredHeight();
      if ((j == 0) && (i == 0))
      {
        z.a(paramImageView, this.jXt, this.jXv);
        u localu2 = u.bbu();
        m localm = new m(this, paramImageView, Boolean.valueOf(this.jWv), paramg);
        localu2.jXb.put(paramImageView, localm);
        return;
      }
      this.jXs.bm(i, j);
    }
    ab localab = this.jXs.bbC();
    StringBuilder localStringBuilder;
    if (localab.uri != null)
    {
      String str3 = localab.uri.toString();
      localStringBuilder = new StringBuilder(50 + str3.length());
      localStringBuilder.append(str3);
      label205: localStringBuilder.append('\n');
      if (localab.jXo != 0.0F)
      {
        localStringBuilder.append("rotation:").append(localab.jXo);
        if (localab.jXr)
          localStringBuilder.append('@').append(localab.jXp).append('x').append(localab.jXq);
        localStringBuilder.append('\n');
      }
      if (localab.fkq != 0)
      {
        localStringBuilder.append("resize:").append(localab.fkq).append('x').append(localab.eSi);
        localStringBuilder.append('\n');
      }
      if (!localab.jXm)
        break label481;
      localStringBuilder.append("centerCrop\n");
    }
    String str1;
    while (true)
    {
      str1 = localStringBuilder.toString();
      Bitmap localBitmap = u.bbu().jWB.gK(str1);
      if ((localBitmap == null) || (this.jWv))
        break label499;
      u.bbu().ah(paramImageView);
      z.a(paramImageView, u.bbu().context, localBitmap, s.jWT, this.jWs, u.bbu().jXd);
      if (paramg == null)
        break;
      paramg.baj();
      return;
      if (localab.jXl != null)
      {
        String str2 = localab.jXl.getKey();
        localStringBuilder = new StringBuilder(50 + str2.length());
        localStringBuilder.append(str2);
        break label205;
      }
      localStringBuilder = new StringBuilder(50);
      localStringBuilder.append(localab.resourceId);
      break label205;
      label481: if (localab.jXn)
        localStringBuilder.append("centerInside\n");
    }
    label499: z.a(paramImageView, this.jXt, this.jXv);
    r localr = new r(paramImageView, this.jXs.bbC(), this.jWs, this.jWv, this.jWt, this.jWu, str1, paramg);
    u localu1 = u.bbu();
    Object localObject = localr.jWr.get();
    if (localObject != null)
    {
      localu1.ah(localObject);
      localu1.jXa.put(localObject, localr);
    }
    n localn = localu1.jWA;
    localn.gQj.sendMessage(localn.gQj.obtainMessage(1, localr));
  }

  public final ad bbD()
  {
    this.jXu = true;
    return this;
  }

  final ad bbE()
  {
    this.jXu = false;
    return this;
  }

  public final ad bbF()
  {
    this.jXs.bbB();
    return this;
  }

  public final ad bbG()
  {
    this.jWv = true;
    return this;
  }

  public final ad bn(int paramInt1, int paramInt2)
  {
    this.jXs.bm(paramInt1, paramInt2);
    return this;
  }

  public final void d(ImageView paramImageView)
  {
    a(paramImageView, null);
  }

  public final ad rv(int paramInt)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("Error image resource invalid.");
    if (this.jWu != null)
      throw new IllegalStateException("Error image already set.");
    this.jWt = paramInt;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.ad
 * JD-Core Version:    0.6.2
 */
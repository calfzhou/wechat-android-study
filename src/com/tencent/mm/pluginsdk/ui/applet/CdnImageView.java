package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.mm.a.c;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.d;

public class CdnImageView extends ImageView
{
  private int eSi;
  private int fkq;
  private cm gQj = new p(this);
  private String hAT;
  private String url = null;

  public CdnImageView(Context paramContext)
  {
    this(paramContext, null);
  }

  public CdnImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CdnImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void a(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2)
  {
    this.url = paramString1;
    this.fkq = paramInt1;
    this.eSi = paramInt2;
    this.hAT = paramString2;
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      setVisibility(8);
      return;
    }
    if (paramString1.startsWith("http"))
    {
      ap.yf();
      Bitmap localBitmap2 = d.gK(paramString1);
      if (localBitmap2 != null)
      {
        if ((this.fkq > 0) && (this.eSi > 0))
          localBitmap2 = i.a(localBitmap2, this.fkq, this.eSi, true, false);
        setImageBitmap(localBitmap2);
        return;
      }
      if (paramInt3 > 0)
        setImageResource(paramInt3);
      new q(paramString1, this.gQj).start();
      return;
    }
    if (!c.ac(paramString1))
    {
      setVisibility(8);
      return;
    }
    if ((this.fkq <= 0) || (this.eSi <= 0));
    for (Bitmap localBitmap1 = i.wU(paramString1); localBitmap1 == null; localBitmap1 = i.a(paramString1, this.fkq, this.eSi, true))
    {
      setVisibility(8);
      return;
    }
    setImageBitmap(localBitmap1);
  }

  private void q(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1, paramInt2, -1, null);
  }

  public final void bf(String paramString1, String paramString2)
  {
    a(paramString1, 0, 0, 0, paramString2);
  }

  public final void n(String paramString, int paramInt1, int paramInt2)
  {
    q(paramString, paramInt1, paramInt2);
  }

  public final void setUrl(String paramString)
  {
    q(paramString, 0, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.CdnImageView
 * JD-Core Version:    0.6.2
 */
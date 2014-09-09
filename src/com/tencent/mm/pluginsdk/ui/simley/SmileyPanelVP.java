package com.tencent.mm.pluginsdk.ui.simley;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.an;
import android.util.AttributeSet;
import com.tencent.mm.compatible.g.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.CustomViewPager;

public class SmileyPanelVP extends CustomViewPager
{
  private final String TAG = "!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0JhvJRVPC70E=";
  private i hIA;
  private s hJI;
  private boolean hJJ = n.W(getContext());
  private int hJK = 0;

  public SmileyPanelVP(Context paramContext)
  {
    super(paramContext);
    cp();
  }

  public SmileyPanelVP(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    cp();
  }

  private void cp()
  {
    if (Integer.parseInt(Build.VERSION.SDK) >= 9)
      setOverScrollMode(2);
  }

  public final void a(an paraman)
  {
    super.a(paraman);
  }

  public final void a(i parami)
  {
    this.hIA = parami;
  }

  public final void a(r paramr, int paramInt)
  {
    if (paramInt >= 2);
    for (boolean bool = true; ; bool = false)
    {
      paramr.dX(bool);
      paramr.KE();
      super.a(paramr);
      paramr.dX(false);
      return;
    }
  }

  public final void a(s params)
  {
    this.hJI = params;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    arrayOfObject[3] = Integer.valueOf(paramInt4);
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0JhvJRVPC70E=", "w: %d, h: %d, oldw: %d, oldh: %d", arrayOfObject);
    boolean bool = n.W(getContext());
    if ((this.hIA != null) && (((paramInt1 > 0) && (paramInt3 != paramInt1)) || ((paramInt2 > 0) && (paramInt4 != paramInt2) && (paramInt2 > 0) && (paramInt2 != this.hJK))))
    {
      this.hIA.mZ(paramInt2);
      this.hIA.na(paramInt1);
      if ((this.hJI != null) && ((!this.hIA.aEs()) || (this.hIA.aEt()) || (this.hJJ != bool)))
      {
        z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0JhvJRVPC70E=", "need deal cache size.");
        this.hIA.dU(false);
        this.hJI.nj(paramInt2);
      }
    }
    this.hJJ = bool;
    if (paramInt2 > 0)
      this.hJK = paramInt2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.SmileyPanelVP
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ad;

public class DynamicEmojiView extends FrameLayout
  implements p, al
{
  private String cHL;
  private final String dip = "lock";
  private ViewGroup hxB;
  private EmojiView hxC;
  private ProgressBar hxD;
  private boolean hxE;
  private volatile int hxF = k.hxK;
  private final int hxG = 500;

  public DynamicEmojiView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public DynamicEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  private boolean azP()
  {
    return (this.hxE) && (azQ());
  }

  private boolean azQ()
  {
    return (this.hxB != null) && (this.hxC != null) && (this.hxD != null);
  }

  private void init()
  {
    g.axR().a(this);
    this.hxB = ((ViewGroup)inflate(getContext(), com.tencent.mm.k.beg, null));
    this.hxC = ((EmojiView)this.hxB.findViewById(com.tencent.mm.i.axK));
    this.hxC.azY();
    this.hxC.a(this);
    this.hxD = ((ProgressBar)this.hxB.findViewById(com.tencent.mm.i.aAy));
    addView(this.hxB, -1, -1);
  }

  private boolean isRunning()
  {
    return this.hxF == k.hxN;
  }

  private void mr(int paramInt)
  {
    switch (j.hxJ[(paramInt - 1)])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      this.hxF = paramInt;
      return;
      this.hxD.setVisibility(0);
      this.hxC.setVisibility(8);
      z.v("!44@/B4Tb64lLpJX2xqu8Tj3tMPXN192Mvf/m3t4fxOElok=", "switch emoji view -> none");
      continue;
      z.v("!44@/B4Tb64lLpJX2xqu8Tj3tMPXN192Mvf/m3t4fxOElok=", "switch emoji view -> decoding");
      this.hxD.setVisibility(0);
      this.hxC.setVisibility(8);
      continue;
      z.v("!44@/B4Tb64lLpJX2xqu8Tj3tMPXN192Mvf/m3t4fxOElok=", "switch emoji view -> downloading");
      this.hxD.setVisibility(0);
      this.hxC.setVisibility(8);
      continue;
      z.v("!44@/B4Tb64lLpJX2xqu8Tj3tMPXN192Mvf/m3t4fxOElok=", "switch emoji view -> running");
      this.hxD.setVisibility(8);
      this.hxC.setVisibility(0);
    }
  }

  public final void a(String paramString, ao paramao)
  {
    if ((this.hxC != null) && (!isRunning()) && (paramString != null) && (paramString.equals(this.hxC.aAd())) && (this.hxC.aAc().aJi()))
      this.hxC.refresh();
  }

  public final void df(boolean paramBoolean)
  {
    this.hxE = true;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(true);
    z.d("!44@/B4Tb64lLpJX2xqu8Tj3tMPXN192Mvf/m3t4fxOElok=", "use State UI: %B", arrayOfObject);
    azQ();
    this.hxC.a(this);
  }

  public final boolean e(ad paramad)
  {
    if ((paramad == null) || (!azP()));
    do
    {
      return true;
      z.d("!44@/B4Tb64lLpJX2xqu8Tj3tMPXN192Mvf/m3t4fxOElok=", "call back decoding ");
    }
    while (!ms(k.hxM));
    return false;
  }

  public final void f(ad paramad)
  {
    if ((paramad == null) || (!azP()) || (isRunning()))
      return;
    z.d("!44@/B4Tb64lLpJX2xqu8Tj3tMPXN192Mvf/m3t4fxOElok=", "call back running ");
    ms(k.hxN);
  }

  public final void g(ad paramad)
  {
    int i = 1;
    if ((!azQ()) || (paramad == null))
      return;
    if (azP())
    {
      if (paramad != null)
        this.cHL = paramad.vu();
      if ((this.hxC != null) && (this.hxC.aAd() != null) && (paramad != null))
        break label83;
    }
    while (true)
    {
      if (i != 0)
      {
        z.d("!44@/B4Tb64lLpJX2xqu8Tj3tMPXN192Mvf/m3t4fxOElok=", "reset dynamic emoji view");
        ms(k.hxK);
      }
      this.hxC.a(paramad, false);
      return;
      label83: if (this.hxC.aAd().equals(paramad.vu()))
        i = 0;
    }
  }

  public final boolean ms(int paramInt)
  {
    try
    {
      if (!azP())
        return false;
      if ((paramInt == k.hxM) && (this.hxC.aAc() != null) && (this.hxC.aAc().aJi()))
      {
        ms(k.hxN);
        return false;
      }
    }
    finally
    {
    }
    if (this.hxF == paramInt)
      return false;
    if (!am.isMainThread())
      post(new i(this, paramInt));
    while (true)
    {
      return true;
      mr(paramInt);
    }
  }

  public final void recycle()
  {
    if (this.hxC != null)
      this.hxC.aAb();
    g.axR().b(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.DynamicEmojiView
 * JD-Core Version:    0.6.2
 */
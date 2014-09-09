package com.tencent.mm.pluginsdk.ui.simley;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.bb;
import com.tencent.mm.pluginsdk.ui.chat.au;
import com.tencent.mm.pluginsdk.ui.h;
import com.tencent.mm.sdk.platformtools.z;

public class VPSmileyPanel extends ChatFooterPanel
  implements q
{
  private final String TAG = "!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=";
  private i hIA;
  private n hJN;
  private boolean hJO = false;

  public VPSmileyPanel(Context paramContext)
  {
    super(paramContext, null);
    init();
  }

  public VPSmileyPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  private void init()
  {
    this.hIA = new i();
    this.hJN = new n(getContext(), this.hIA, this);
  }

  public final void Xo()
  {
    this.hJO = true;
  }

  public final void a(au paramau)
  {
    super.a(paramau);
    this.hJN.d((bb)paramau);
  }

  public final bb aDy()
  {
    return (bb)this.hxz;
  }

  public final h aEL()
  {
    return this.hxy;
  }

  public final void aEP()
  {
    this.hIA.dU(true);
  }

  public final void azM()
  {
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "vpsmiley ----- reflesh");
    try
    {
      if (this.hIA != null)
      {
        if (this.hJN == null)
          return;
        if (System.currentTimeMillis() <= this.hIA.aDK())
        {
          z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "already refresh so pass reflesh");
          return;
        }
        this.hJN.aEK();
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void azN()
  {
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "vpsmiley ----- hideCustomBtn");
    this.hIA.aEg();
    this.hJN.aEJ();
  }

  public final void azO()
  {
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "vpsmiley ----- hideSendButton");
    this.hJN.dV(false);
    this.hIA.dP(true);
  }

  public final void de(boolean paramBoolean)
  {
    this.hJN.dW(paramBoolean);
  }

  public final void destroy()
  {
    z.i("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "clear");
    if (this.hJN != null)
    {
      z.i("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "ui clear");
      this.hJN.aEy();
      this.hJN.destroy();
      this.hJN = null;
    }
    if (this.hIA != null)
    {
      z.i("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "stg clear");
      this.hIA.aEi();
      this.hIA.destroy();
      this.hIA = null;
    }
  }

  public final void nl(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "vpsmiley ----- setPortHeightPx: %d", arrayOfObject);
    this.hIA.ne(paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.hJO)
    {
      setVisibility(8);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public final void onPause()
  {
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "onPause");
    this.hIA.dS(false);
    this.hIA.aDO();
    this.hIA.aEq();
  }

  public final void onResume()
  {
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "onResume");
    this.hIA.dS(true);
    this.hIA.aDP();
    this.hJN.aEw();
    this.hJN.aED();
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void reset()
  {
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "vpsmiley ----- reset");
    if (this.hIA.aDY())
      this.hJN.aEI();
  }

  public final void s(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean1);
    arrayOfObject[1] = Boolean.valueOf(false);
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0cJ7ih3RNt+M=", "vpsmiley ----- hideQQSmiley: %B, hideEmojiSmiley: %B", arrayOfObject);
    this.hIA.dN(paramBoolean1);
    this.hIA.dO(false);
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.hJO = false;
      this.hJN.d(this);
      return;
    }
    this.hIA.aEq();
  }

  public final void vW(String paramString)
  {
    this.hIA.vW(paramString);
  }

  public final void vZ(String paramString)
  {
    this.hIA.vX(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.VPSmileyPanel
 * JD-Core Version:    0.6.2
 */
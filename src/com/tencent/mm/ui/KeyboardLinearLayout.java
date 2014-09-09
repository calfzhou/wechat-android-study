package com.tencent.mm.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;

public class KeyboardLinearLayout extends OnLayoutChangedLinearLayout
{
  public String TAG = "!44@/B4Tb64lLpJirlrWfoDniPYsnRdgh0oTmbySfFnZ03Y=";
  private boolean eZm = false;
  private boolean gDl;
  private ak iJj;
  private int uj;

  public KeyboardLinearLayout(Context paramContext)
  {
    super(paramContext);
    reset();
  }

  public KeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    reset();
  }

  private void reset()
  {
    this.eZm = false;
    this.uj = 0;
    this.gDl = false;
    this.TAG += getId();
  }

  public final void a(ak paramak)
  {
    this.iJj = paramak;
  }

  protected void kW(int paramInt)
  {
    if (this.iJj != null)
      this.iJj.kW(paramInt);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.eZm)
    {
      this.eZm = true;
      this.uj = paramInt4;
      String str = this.TAG;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.uj);
      z.i(str, "init height:%d", arrayOfObject);
      if (this.iJj != null)
        this.iJj.kW(-1);
      if ((this.eZm) && (!this.gDl) && (this.uj > paramInt4))
      {
        this.gDl = true;
        kW(-3);
        z.w(this.TAG, "show keyboard!! mHeight: " + this.uj + " b: " + paramInt4);
      }
      if ((this.eZm) && (this.gDl) && (this.uj - paramInt4 <= 100))
      {
        this.gDl = false;
        kW(-2);
        z.w(this.TAG, "hide keyboard!! mHeight: " + this.uj + " b: " + paramInt4);
      }
      return;
    }
    if (this.uj < paramInt4);
    for (int i = paramInt4; ; i = this.uj)
    {
      this.uj = i;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.KeyboardLinearLayout
 * JD-Core Version:    0.6.2
 */
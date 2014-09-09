package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public class cn extends PopupWindow
{
  private View.OnTouchListener jaJ;
  private Context mContext = null;

  public cn(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    super.setBackgroundDrawable(null);
  }

  public cn(View paramView)
  {
    super(paramView);
    super.setBackgroundDrawable(null);
  }

  public cn(View paramView, int paramInt1, int paramInt2)
  {
    super(paramView, paramInt1, paramInt2);
    super.setBackgroundDrawable(null);
  }

  public cn(View paramView, int paramInt1, int paramInt2, byte paramByte)
  {
    super(paramView, paramInt1, paramInt2, true);
    super.setBackgroundDrawable(null);
  }

  public void dismiss()
  {
    try
    {
      super.dismiss();
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLKmnl4Jnfl+pqhp+Z26Rpq", "dismiss exception, e = " + localException.getMessage());
    }
  }

  public Drawable getBackground()
  {
    View localView = getContentView();
    if (localView == null);
    while (!(localView instanceof co))
      return null;
    return localView.getBackground();
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    int i = -2;
    View localView = getContentView();
    if (localView == null)
    {
      if (paramDrawable == null)
        return;
      if (this.mContext != null);
      for (Context localContext2 = this.mContext; ; localContext2 = ak.getContext())
      {
        co localco2 = new co(this, localContext2);
        localco2.setBackgroundDrawable(paramDrawable);
        super.setContentView(localco2);
        return;
      }
    }
    Context localContext1 = localView.getContext();
    if ((localView instanceof co))
    {
      localView.setBackgroundDrawable(paramDrawable);
      return;
    }
    ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
    if ((localLayoutParams != null) && (localLayoutParams.height == i));
    while (true)
    {
      co localco1 = new co(this, localContext1);
      FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(-1, i);
      localco1.setBackgroundDrawable(paramDrawable);
      localco1.addView(localView, localLayoutParams1);
      super.setContentView(localco1);
      return;
      i = -1;
    }
  }

  public void setContentView(View paramView)
  {
    int i = -2;
    View localView = getContentView();
    if (localView == null)
      super.setContentView(paramView);
    while (!(localView instanceof co))
    {
      super.setContentView(paramView);
      return;
    }
    co localco = (co)localView;
    localco.removeAllViews();
    if (paramView == null)
    {
      super.setContentView(localco);
      return;
    }
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if ((localLayoutParams != null) && (localLayoutParams.height == i));
    while (true)
    {
      localco.addView(paramView, new FrameLayout.LayoutParams(-1, i));
      super.setContentView(localco);
      return;
      i = -1;
    }
  }

  public void setTouchInterceptor(View.OnTouchListener paramOnTouchListener)
  {
    this.jaJ = paramOnTouchListener;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.cn
 * JD-Core Version:    0.6.2
 */
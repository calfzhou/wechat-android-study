package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class i
{
  private View aL;
  private FrameLayout cFQ;
  private WindowManager cFR;
  private WindowManager.LayoutParams cFS;
  private ViewGroup.LayoutParams cFT;
  private ImageView cKf;

  public i(Context paramContext, View paramView)
  {
    if ((this.cFQ != null) && (this.cFR != null))
      return;
    paramView.findViewById(com.tencent.mm.i.aFq).setVisibility(8);
    this.cKf = ((ImageView)paramView.findViewById(com.tencent.mm.i.button));
    ((ImageView)paramView.findViewById(com.tencent.mm.i.apA)).setOnClickListener(new j(this));
    this.cFS = new WindowManager.LayoutParams();
    this.cFS.height = -2;
    this.cFS.width = -2;
    this.cFR = ((WindowManager)paramContext.getSystemService("window"));
    this.cFS.x = 0;
    this.cFS.y = 0;
    this.cFS.flags = 40;
    this.cFS.type = 2002;
    this.aL = paramView;
    this.cFS.gravity = 51;
    this.cFS.format = 1;
    this.cFQ = new FrameLayout(paramContext);
    this.cFQ.setPadding(4, 4, 4, 4);
    this.cFT = new ViewGroup.LayoutParams(-2, -2);
    this.cFQ.addView(this.aL, this.cFT);
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    this.cFQ.setOnTouchListener(new k(this, localDisplayMetrics));
  }

  public final void hP()
  {
    try
    {
      if (this.cFR != null)
      {
        if (this.cFQ != null)
          this.cFR.removeView(this.cFQ);
        this.cFR = null;
      }
      if (this.cFQ != null)
      {
        this.cFQ.removeAllViews();
        this.cFQ = null;
      }
      this.aL = null;
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void show()
  {
    this.cFR.addView(this.cFQ, this.cFS);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.i
 * JD-Core Version:    0.6.2
 */
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
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.at.d;
import com.tencent.mm.sdk.platformtools.cm;

public final class t
{
  private View aL;
  private FrameLayout cFQ;
  private WindowManager cFR;
  private WindowManager.LayoutParams cFS;
  private ViewGroup.LayoutParams cFT;
  private ImageView cKf;
  private ProgressBar cKh;
  private Context context;
  private TextView fqc;
  private boolean iWc = false;
  com.tencent.mm.at.i iWd = new u(this);
  com.tencent.mm.at.h iWe;
  private int iWf = 0;
  private cm iWg = new x(this);

  public t(Context paramContext, View paramView)
  {
    if ((this.cFQ != null) && (this.cFR != null))
      return;
    d.aNZ().a(this.iWd);
    this.fqc = ((TextView)paramView.findViewById(com.tencent.mm.i.time));
    this.cKf = ((ImageView)paramView.findViewById(com.tencent.mm.i.button));
    ((ImageView)paramView.findViewById(com.tencent.mm.i.apA)).setOnClickListener(new v(this));
    this.cKh = ((ProgressBar)paramView.findViewById(com.tencent.mm.i.aFq));
    this.cKh.setVisibility(8);
    this.context = paramContext;
    this.cFS = new WindowManager.LayoutParams();
    this.cFS.height = -2;
    this.cFS.width = -2;
    this.cFR = ((WindowManager)paramContext.getSystemService("window"));
    this.cFS.x = 0;
    this.cFS.y = 0;
    this.cFS.flags = 40;
    this.cFS.type = 2002;
    this.aL = paramView;
    this.fqc.setVisibility(8);
    this.cFS.gravity = 51;
    this.cFS.format = 1;
    this.cFQ = new FrameLayout(paramContext);
    this.cFQ.setPadding(4, 4, 4, 4);
    this.cFT = new ViewGroup.LayoutParams(-2, -2);
    this.cFQ.addView(this.aL, this.cFT);
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    this.cFQ.setOnTouchListener(new w(this, localDisplayMetrics));
  }

  private void aRm()
  {
    this.fqc.setText(this.iWf);
    this.iWg.sendEmptyMessageDelayed(0, 1000L);
  }

  private void cn(Context paramContext)
  {
    this.cKf.setVisibility(0);
    this.cKh.setVisibility(4);
    boolean bool1 = this.iWc;
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    this.iWc = bool2;
    this.cKf.setBackgroundDrawable(paramContext.getResources().getDrawable(com.tencent.mm.h.ack));
    this.fqc.setVisibility(8);
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
 * Qualified Name:     com.tencent.mm.ui.applet.t
 * JD-Core Version:    0.6.2
 */
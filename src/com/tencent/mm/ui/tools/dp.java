package com.tencent.mm.ui.tools;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.compatible.g.g;
import com.tencent.mm.i;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.VideoView;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public final class dp
{
  public View gAm;
  public int iy;
  public bt jRb;
  boolean jSI;
  public RelativeLayout jSN;
  public ImageView jSO;
  public VideoView jSP;
  public MMPinProgressBtn jSQ;
  public LinearLayout jSR;
  public TextView jST;
  public TextView jSU;
  public ImageView jSV;
  public ProgressBar jSW;
  public ProgressBar jSX;
  public LinearLayout jSY;
  public TextView jSZ;
  public ImageView jTa;
  public MultiTouchImageView jTb;

  @TargetApi(11)
  public dp(bt parambt, View paramView)
  {
    this.gAm = paramView;
    this.jRb = parambt;
    this.jTb = ((MultiTouchImageView)paramView.findViewById(i.axK));
    this.jSX = ((ProgressBar)paramView.findViewById(i.bUB));
    if ((g.cp(11)) && (paramView.getLayerType() != 2))
      paramView.setLayerType(2, null);
  }

  public static void v(View paramView, int paramInt)
  {
    if (paramView != null)
      paramView.setVisibility(paramInt);
  }

  public final dp baB()
  {
    if (this.jSR == null)
    {
      this.jSR = ((LinearLayout)((ViewStub)this.gAm.findViewById(i.axU)).inflate());
      this.jSW = ((ProgressBar)this.jSR.findViewById(i.aqr));
      this.jST = ((TextView)this.jSR.findViewById(i.aqs));
      this.jSU = ((TextView)this.jSR.findViewById(i.aqq));
      this.jSV = ((ImageView)this.jSR.findViewById(i.aqt));
    }
    return this;
  }

  public final dp baC()
  {
    if (this.jSY == null)
    {
      this.jSY = ((LinearLayout)((ViewStub)this.gAm.findViewById(i.axS)).inflate());
      this.jTa = ((ImageView)this.jSY.findViewById(i.bOC));
      this.jSZ = ((TextView)this.jSY.findViewById(i.aqd));
    }
    return this;
  }

  public final dp baD()
  {
    if (this.jSN == null)
    {
      this.jSN = ((RelativeLayout)((ViewStub)this.gAm.findViewById(i.aVj)).inflate());
      this.jSO = ((ImageView)this.jSN.findViewById(i.aUU));
      this.jSP = ((VideoView)this.jSN.findViewById(i.aUZ));
      this.jSQ = ((MMPinProgressBtn)this.jSN.findViewById(i.aUS));
      this.jSP.setOnErrorListener(new dq(this));
      this.jSP.setOnCompletionListener(new dr(this));
    }
    return this;
  }

  public final void gg(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      v(baD().jSP, 0);
      v(baD().jSO, 8);
      return;
    }
    v(baD().jSP, 8);
    v(baD().jSO, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dp
 * JD-Core Version:    0.6.2
 */
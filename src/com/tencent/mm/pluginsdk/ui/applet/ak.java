package com.tencent.mm.pluginsdk.ui.applet;

import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;

public final class ak
{
  private int FP;
  private int background = -1;
  private final View.OnTouchListener hBM = new al(this);
  private ap hBR;
  private af hBe;
  private ao hBk;
  private int row;

  public final void a(af paramaf, int paramInt)
  {
    this.hBe = paramaf;
    this.row = paramInt;
  }

  public final void a(ao paramao)
  {
    this.hBk = paramao;
  }

  public final void a(ap paramap)
  {
    this.hBR = paramap;
  }

  public final void aAU()
  {
    this.FP = 4;
  }

  public final void onBindView(View paramView)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView;
    if (this.hBe != null)
    {
      localViewGroup.setOnTouchListener(this.hBM);
      for (int i = 0; i < this.FP; i++)
      {
        View localView = localViewGroup.getChildAt(i);
        int j = i + this.row * this.FP;
        this.hBe.getView(j, localView, localViewGroup);
        if (this.hBk != null)
          localView.setOnClickListener(new am(this, localViewGroup, j));
        if (this.hBR != null)
          localView.setOnLongClickListener(new an(this, localViewGroup, j));
      }
    }
    if (this.background >= 0)
      paramView.setBackgroundResource(this.background);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.ak
 * JD-Core Version:    0.6.2
 */
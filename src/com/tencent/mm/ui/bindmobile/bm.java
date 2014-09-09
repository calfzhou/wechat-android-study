package com.tencent.mm.ui.bindmobile;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.cc;

final class bm extends cb
{
  private String dXd;
  private int[] dtC;
  private bn jkN;

  public bm(Context paramContext, cc paramcc)
  {
    super(paramContext, new com.tencent.mm.modelfriend.i());
    super.a(paramcc);
    this.context = paramContext;
  }

  public final void DW()
  {
    setCursor(az.wZ().gm(this.dXd));
    this.dtC = new int[getCount()];
    if ((this.jkN != null) && (this.dXd != null))
      this.jkN.pd(getCursor().getCount());
    notifyDataSetChanged();
  }

  protected final void DX()
  {
    DW();
  }

  public final void a(bn parambn)
  {
    this.jkN = parambn;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.tencent.mm.modelfriend.i locali = (com.tencent.mm.modelfriend.i)getItem(paramInt);
    bo localbo1;
    if (paramView == null)
    {
      localbo1 = new bo();
      paramView = View.inflate(this.context, k.bjO, null);
      localbo1.dtJ = ((TextView)paramView.findViewById(com.tencent.mm.i.aEH));
      localbo1.dtK = ((TextView)paramView.findViewById(com.tencent.mm.i.aEA));
      localbo1.iOk = ((TextView)paramView.findViewById(com.tencent.mm.i.aEB));
      localbo1.iOl = ((TextView)paramView.findViewById(com.tencent.mm.i.aED));
      paramView.setTag(localbo1);
    }
    for (bo localbo2 = localbo1; ; localbo2 = (bo)paramView.getTag())
    {
      localbo2.dtJ.setText(locali.vw());
      switch (this.dtC[paramInt])
      {
      case 1:
      default:
        return paramView;
      case 2:
      case 3:
      case 0:
      }
    }
    localbo2.iOk.setVisibility(8);
    localbo2.dtK.setVisibility(0);
    localbo2.dtK.setText(n.bLD);
    localbo2.dtK.setTextColor(this.context.getResources().getColor(f.NS));
    return paramView;
    localbo2.iOk.setVisibility(8);
    localbo2.iOl.setVisibility(8);
    localbo2.dtK.setVisibility(0);
    localbo2.dtK.setText(n.bLC);
    localbo2.dtK.setTextColor(this.context.getResources().getColor(f.NR));
    return paramView;
    localbo2.dtK.setVisibility(8);
    if ((locali.getStatus() != 0) && (!bg.qW().oT().yo(locali.getUsername())))
    {
      localbo2.dtK.setVisibility(8);
      localbo2.iOk.setVisibility(0);
      localbo2.iOl.setVisibility(8);
      return paramView;
    }
    if (locali.getStatus() == 0)
    {
      localbo2.dtK.setVisibility(8);
      localbo2.iOk.setVisibility(8);
      localbo2.iOl.setVisibility(0);
      return paramView;
    }
    localbo2.iOk.setVisibility(8);
    localbo2.iOl.setVisibility(8);
    localbo2.dtK.setVisibility(0);
    localbo2.dtK.setText(n.bLB);
    localbo2.dtK.setTextColor(this.context.getResources().getColor(f.NR));
    return paramView;
  }

  public final void jI(String paramString)
  {
    this.dXd = ch.iV(paramString.trim());
    closeCursor();
    DW();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bm
 * JD-Core Version:    0.6.2
 */
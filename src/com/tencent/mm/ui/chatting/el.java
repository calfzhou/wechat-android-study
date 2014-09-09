package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.v;
import com.tencent.mm.am.a;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.storage.ar;

final class el extends cm
{
  private hd joF;

  public el()
  {
    super(11);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcW);
      paramView.setTag(new ow(this.fjl).e(paramView, false));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    ow localow = (ow)paramck;
    ow.a(localow, paramar, false, paramInt, paramhd, h.Ti);
    if (aUS())
    {
      q localq = v.ij(paramar.kp());
      if ((localq == null) || (localq.getStatus() != 199) || (!cR(paramar.kk())))
        break label85;
      if (localow.jms != null)
        localow.jms.setVisibility(0);
    }
    label85: 
    while (localow.jms == null)
      return;
    localow.jms.setVisibility(8);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    if (bg.qW().isSDCardAvailable())
    {
      int i = ((ms)paramView.getTag()).position;
      q localq = m.AL().hY(paramar.kp());
      if ((localq != null) && ((localq.getStatus() == 199) || (localq.getStatus() == 199)))
      {
        paramContextMenu.add(i, 106, 0, paramView.getContext().getString(n.bzG));
        paramContextMenu.add(i, 107, 0, paramView.getContext().getString(n.cag));
        if (a.to("favorite"))
          paramContextMenu.add(i, 116, 0, paramView.getContext().getString(n.bUO));
        if ((!paramar.aJv()) && (paramar.aJE()) && (aUR()) && ((localq.getStatus() == 199) || (localq.getStatus() == 199) || (paramar.kD() == 1)) && (cR(paramar.kk())) && (Cd(paramar.kt())))
          paramContextMenu.add(i, 123, 0, paramView.getContext().getString(n.bzE));
        if ((com.tencent.mm.q.r.uI()) && (!this.joF.aVS()))
          paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
      }
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzA));
    }
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.el
 * JD-Core Version:    0.6.2
 */
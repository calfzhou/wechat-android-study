package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;

final class dx extends cm
{
  private hd joF;

  public dx()
  {
    super(3);
  }

  public static void a(ck paramck, int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt2 > 0)
      if (paramInt1 >= paramInt2)
        i = 100;
    mr localmr;
    while (true)
    {
      localmr = (mr)paramck;
      if ((i < 100) || (localmr.juT.getVisibility() == 0))
        break;
      return;
      i = paramInt1 * 100 / paramInt2;
      continue;
      i = 0;
    }
    localmr.juT.setText(i + "%");
    if (aUS())
      localmr.fIh.setVisibility(8);
    while (true)
    {
      localmr.juT.setVisibility(0);
      localmr.juV.setVisibility(0);
      return;
      localmr.fIh.setVisibility(0);
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcV);
      paramView.setTag(new mr(this.fjl).e(paramView, false));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    mr localmr = (mr)paramck;
    l locall1 = ap.yg().h(paramar);
    if (locall1 != null);
    for (boolean bool = m.b(locall1); ; bool = true)
    {
      com.tencent.mm.y.n localn = ap.yg();
      ImageView localImageView1 = localmr.jlS;
      String str = paramar.kp();
      float f = com.tencent.mm.aq.a.getDensity(paramhd.agh());
      int i = paramar.kA();
      int j = paramar.kB();
      int k = h.Ti;
      ImageView localImageView2 = localmr.juU;
      int m = h.Tj;
      View localView1;
      int n;
      label176: int i5;
      int i6;
      int i1;
      label262: int i2;
      label298: int i3;
      label321: int i4;
      if (bool)
      {
        localView1 = null;
        if ((!localn.a(localImageView1, str, f, i, j, true, k, localImageView2, m, 0, true, localView1)) && (!this.hMJ))
          localmr.jlS.setImageDrawable(com.tencent.mm.aq.a.n(paramhd.agh(), h.Xv));
        if (locall1 == null)
          break label605;
        if ((!bool) && (paramar.getStatus() != 5))
          break label562;
        n = 1;
        TextView localTextView1 = localmr.juT;
        StringBuilder localStringBuilder = new StringBuilder();
        if (locall1 == null)
          break label581;
        i5 = locall1.sp();
        i6 = locall1.getOffset();
        if (locall1.xR())
        {
          l locall2 = ap.yg().dT(locall1.xP());
          i5 = locall2.sp();
          i6 = locall2.getOffset();
        }
        if (i5 <= 0)
          break label581;
        if (i6 < i5)
          break label568;
        i1 = 100;
        localTextView1.setText(i1 + "%");
        ProgressBar localProgressBar = localmr.fIh;
        if (n == 0)
          break label587;
        i2 = 8;
        localProgressBar.setVisibility(i2);
        TextView localTextView2 = localmr.juT;
        if (n == 0)
          break label593;
        i3 = 8;
        localTextView2.setVisibility(i3);
        View localView2 = localmr.juV;
        if (n == 0)
          break label599;
        i4 = 8;
        label344: localView2.setVisibility(i4);
        label351: localmr.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, paramar.kt(), 0, (byte)0));
        localmr.joC.setOnClickListener(paramhd.joh.jqc);
        localmr.joC.setOnLongClickListener(paramhd.joh.jqe);
        localmr.jlS.setContentDescription(paramhd.getString(com.tencent.mm.n.bzj));
        if (aUS())
        {
          localmr.fIh.setVisibility(8);
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Long.valueOf(paramar.kk());
          arrayOfObject[1] = Integer.valueOf(paramar.getStatus());
          z.d("MicroMsg.ContactInfoUI", "[oneliang]%s,%s", arrayOfObject);
          if (aUS())
          {
            if ((paramar.getStatus() != 2) || (!cR(paramar.kk())))
              break label638;
            if (localmr.jms != null)
              localmr.jms.setVisibility(0);
          }
        }
      }
      while (true)
      {
        a(paramInt, localmr, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
        return;
        localView1 = localmr.juV;
        break;
        label562: n = 0;
        break label176;
        label568: i1 = i6 * 100 / i5;
        break label262;
        label581: i1 = 0;
        break label262;
        label587: i2 = 0;
        break label298;
        label593: i3 = 0;
        break label321;
        label599: i4 = 0;
        break label344;
        label605: localmr.juV.setVisibility(8);
        localmr.fIh.setVisibility(8);
        localmr.juT.setVisibility(8);
        break label351;
        label638: if (localmr.jms != null)
          localmr.jms.setVisibility(8);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    if (bg.qW().isSDCardAvailable())
    {
      int i = ((ms)paramView.getTag()).position;
      boolean bool = paramar.kk() < 0L;
      l locall = null;
      if (bool)
        locall = ap.yg().T(paramar.kk());
      if (((locall == null) || (locall.xM() <= 0L)) && (paramar.kl() > 0L))
        locall = ap.yg().S(paramar.kl());
      if ((locall.xR()) && (locall.sp() == 0))
        ap.yg().dT(locall.xP());
      paramContextMenu.add(i, 110, 0, paramView.getContext().getString(com.tencent.mm.n.cag));
      if (paramar.getStatus() == 5)
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(com.tencent.mm.n.bAb));
      if ((r.uG()) && (!this.joF.aVS()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(com.tencent.mm.n.bzv));
      if (com.tencent.mm.am.a.to("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(com.tencent.mm.n.bUO));
      if ((!paramar.aJv()) && (paramar.aJA()) && ((paramar.getStatus() == 2) || (paramar.kD() == 1)) && (aUR()) && (cR(paramar.kk())) && (Cd(paramar.kt())))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(com.tencent.mm.n.bzE));
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(com.tencent.mm.n.bzy));
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
 * Qualified Name:     com.tencent.mm.ui.chatting.dx
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.BitmapFactory;
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
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;

final class dw extends cl
{
  private hd joF;

  public dw()
  {
    super(1);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcC);
      paramView.setTag(new mr(this.fjl).e(paramView, true));
    }
    return paramView;
  }

  protected final String a(hd paramhd, ar paramar)
  {
    return super.a(paramhd, paramar);
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    mr localmr = (mr)paramck;
    boolean bool1 = ap.yg().a(localmr.jlS, paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), paramar.kA(), paramar.kB(), true, h.Tg, localmr.juU, h.Th, 1, true, null);
    localmr.juV.setVisibility(0);
    localmr.fIh.setVisibility(8);
    if ((!bool1) && (!this.hMJ))
      localmr.jlS.setImageBitmap(BitmapFactory.decodeResource(paramhd.getResources(), h.Xv));
    boolean bool2 = paramhd.iWI;
    String str = null;
    if (bool2)
      str = paramar.kt();
    localmr.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, paramString, str));
    localmr.joC.setOnClickListener(paramhd.joh.jqc);
    localmr.joC.setOnLongClickListener(paramhd.joh.jqe);
    if ((paramar.getContent() == null) || (paramar.getContent().length() == 0))
    {
      localmr.jlV.setVisibility(8);
      return;
    }
    localmr.jlV.setVisibility(8);
  }

  public final void a(ck paramck, ar paramar, boolean paramBoolean)
  {
    if (true != paramBoolean)
      return;
    mr localmr = (mr)paramck;
    ap.yg().a(localmr.jlS, paramar.kp(), com.tencent.mm.aq.a.getDensity(this.joF.agh()), paramar.kA(), paramar.kB(), true, h.Tg, localmr.juU, h.Th, 1, true, null);
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
        ap.yg().S(paramar.kl());
      paramContextMenu.add(i, 110, 0, paramView.getContext().getString(com.tencent.mm.n.cag));
      if ((r.uG()) && (!this.joF.aVS()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(com.tencent.mm.n.bzv));
      if (com.tencent.mm.am.a.to("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(com.tencent.mm.n.bUO));
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

  protected final boolean a(hd paramhd)
  {
    return paramhd.iWI;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dw
 * JD-Core Version:    0.6.2
 */
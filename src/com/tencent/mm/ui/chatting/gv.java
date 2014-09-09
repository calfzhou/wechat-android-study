package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.e.m;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.cb;

public final class gv extends cb
{
  private String cEh;
  private String dnT;
  private String enV;
  private boolean iWI;
  private gw jrq;

  public gv(Context paramContext, ar paramar, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext, paramar);
    this.cEh = paramString1;
    this.dnT = paramString2;
    this.iWI = paramBoolean;
  }

  private String M(ar paramar)
  {
    if (paramar.jK() == 1)
      return this.dnT;
    return this.cEh;
  }

  private CharSequence N(ar paramar)
  {
    if (paramar.kn() == 9223372036854775807L)
      return "";
    return m.b(this.context, paramar.kn(), true);
  }

  public final void DW()
  {
    setCursor(bg.qW().oV().bu(this.cEh, this.enV));
    if ((this.jrq != null) && (!ap.jb(this.enV)))
      this.jrq.qi(getCount());
    super.notifyDataSetChanged();
  }

  protected final void DX()
  {
    closeCursor();
    DW();
  }

  public final void a(gw paramgw)
  {
    this.jrq = paramgw;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    gx localgx;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, k.bmf, null);
      localgx = new gx((byte)0);
      localgx.egy = ((ImageView)paramView.findViewById(i.ahd));
      localgx.ekE = ((TextView)paramView.findViewById(i.aGn));
      localgx.ekF = ((TextView)paramView.findViewById(i.aTY));
      localgx.jrr = ((TextView)paramView.findViewById(i.aFi));
      paramView.setTag(localgx);
    }
    ar localar;
    while (true)
    {
      localar = (ar)getItem(paramInt);
      if (localar != null)
      {
        if ((!this.iWI) || (localar.jK() != 0))
          break;
        String str1 = localar.getContent();
        String str2 = bw.em(str1);
        if (!ap.jb(str2))
        {
          c.a(localgx.egy, str2);
          TextView localTextView4 = localgx.ekE;
          localTextView4.setText(com.tencent.mm.ar.b.e(this.context, y.dh(str2), (int)localgx.ekE.getTextSize()));
        }
        localgx.ekF.setText(N(localar));
        String str3 = bw.en(str1);
        TextView localTextView3 = localgx.jrr;
        localTextView3.setText(com.tencent.mm.ar.b.c(this.context, str3, (int)localgx.jrr.getTextSize()));
      }
      return paramView;
      localgx = (gx)paramView.getTag();
    }
    c.a(localgx.egy, M(localar));
    TextView localTextView1 = localgx.ekE;
    localTextView1.setText(com.tencent.mm.ar.b.e(this.context, y.dh(M(localar)), (int)localgx.ekE.getTextSize()));
    localgx.ekF.setText(N(localar));
    TextView localTextView2 = localgx.jrr;
    localTextView2.setText(com.tencent.mm.ar.b.c(this.context, localar.getContent(), (int)localgx.jrr.getTextSize()));
    return paramView;
  }

  public final void jI(String paramString)
  {
    this.enV = paramString;
    if (!ap.jb(this.enV))
    {
      closeCursor();
      DW();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gv
 * JD-Core Version:    0.6.2
 */
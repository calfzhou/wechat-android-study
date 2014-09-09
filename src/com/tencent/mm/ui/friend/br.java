package com.tencent.mm.ui.friend;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ax;
import com.tencent.mm.modelfriend.ay;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.n;
import com.tencent.mm.n.c;
import com.tencent.mm.n.p;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cb;

final class br extends cb
  implements p
{
  private final MMActivity cHh;
  private String dXd;
  private int[] dtC;
  private final int iX;
  private final a jIY;
  private final be jIZ;
  private bu jJa;
  boolean jJb = false;

  public br(MMActivity paramMMActivity, int paramInt)
  {
    super(paramMMActivity, new ax());
    this.cHh = paramMMActivity;
    this.iX = paramInt;
    this.jJb = paramMMActivity.getIntent().getBooleanExtra("qqgroup_sendmessage", false);
    this.jIY = new a(paramMMActivity, new bs(this));
    this.jIZ = new be(paramMMActivity, new bt(this));
  }

  public final void DW()
  {
    if (ch.jb(this.dXd))
      setCursor(az.xe().dN(this.iX));
    while (true)
    {
      this.dtC = new int[getCount()];
      if ((this.jJa != null) && (this.dXd != null))
        this.jJa.pd(getCursor().getCount());
      notifyDataSetChanged();
      return;
      setCursor(az.xe().i(this.iX, this.dXd));
    }
  }

  protected final void DX()
  {
    DW();
  }

  public final void a(bu parambu)
  {
    this.jJa = parambu;
  }

  public final void eX(String paramString)
  {
    notifyDataSetChanged();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ax localax = (ax)getItem(paramInt);
    bv localbv2;
    if (paramView == null)
    {
      bv localbv1 = new bv();
      paramView = View.inflate(this.cHh, com.tencent.mm.k.bkF, null);
      localbv1.dXf = ((ImageView)paramView.findViewById(i.aoz));
      localbv1.dtJ = ((TextView)paramView.findViewById(i.aIO));
      localbv1.dtK = ((TextView)paramView.findViewById(i.aIJ));
      localbv1.iOk = ((TextView)paramView.findViewById(i.aIK));
      localbv1.iOl = ((TextView)paramView.findViewById(i.aIM));
      paramView.setTag(localbv1);
      localbv2 = localbv1;
      TextView localTextView = localbv2.dtJ;
      localTextView.setText(com.tencent.mm.ar.b.e(this.cHh, localax.getDisplayName(), (int)localbv2.dtJ.getTextSize()));
      switch (this.dtC[paramInt])
      {
      case 1:
      default:
        label196: if (this.jJb)
        {
          localbv2.iOk.setVisibility(8);
          localbv2.iOl.setVisibility(8);
          localbv2.dtK.setVisibility(8);
        }
        if (com.tencent.mm.a.k.ai(localax.wP()) == 0)
          break;
      case 2:
      case 3:
      case 0:
      }
    }
    for (Bitmap localBitmap = c.A(localax.wP()); ; localBitmap = null)
    {
      if (localBitmap == null)
      {
        localbv2.dXf.setImageDrawable(com.tencent.mm.aq.a.n(this.cHh, h.WL));
        return paramView;
        localbv2 = (bv)paramView.getTag();
        break;
        localbv2.iOk.setVisibility(8);
        localbv2.iOl.setVisibility(8);
        localbv2.dtK.setVisibility(0);
        localbv2.dtK.setText(n.bLD);
        localbv2.dtK.setTextColor(this.cHh.getResources().getColor(f.NS));
        break label196;
        localbv2.iOk.setVisibility(8);
        localbv2.iOl.setVisibility(8);
        localbv2.dtK.setVisibility(0);
        localbv2.dtK.setText(n.bLC);
        localbv2.dtK.setTextColor(this.cHh.getResources().getColor(f.NR));
        break label196;
        if ((localax.wQ() != 0) && (!bg.qW().oT().yo(localax.getUsername())))
        {
          localbv2.dtK.setVisibility(8);
          localbv2.iOk.setVisibility(0);
          localbv2.iOl.setVisibility(8);
          break label196;
        }
        if (localax.wQ() == 0)
        {
          localbv2.dtK.setVisibility(8);
          localbv2.iOk.setVisibility(8);
          localbv2.iOl.setVisibility(0);
          break label196;
        }
        localbv2.iOk.setVisibility(8);
        localbv2.iOl.setVisibility(8);
        localbv2.dtK.setVisibility(0);
        localbv2.dtK.setText(n.bLB);
        localbv2.dtK.setTextColor(this.cHh.getResources().getColor(f.NR));
        break label196;
      }
      localbv2.dXf.setImageBitmap(localBitmap);
      return paramView;
    }
  }

  public final void jI(String paramString)
  {
    this.dXd = ch.iV(paramString.trim());
    closeCursor();
    DW();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.br
 * JD-Core Version:    0.6.2
 */
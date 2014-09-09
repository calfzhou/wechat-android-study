package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.f;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.p;
import com.tencent.mm.n;
import com.tencent.mm.n.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.cc;

@Deprecated
final class ac extends cb
{
  private String dXd;
  private int[] dtC;
  private ad iOj;

  public ac(Context paramContext, cc paramcc)
  {
    super(paramContext, new com.tencent.mm.modelfriend.o());
    super.a(paramcc);
  }

  public final void DW()
  {
    setCursor(az.xa().gq(this.dXd));
    this.dtC = new int[getCount()];
    if ((this.iOj != null) && (this.dXd != null))
      this.iOj.pd(getCursor().getCount());
    super.notifyDataSetChanged();
  }

  protected final void DX()
  {
    DW();
  }

  public final void a(ad paramad)
  {
    this.iOj = paramad;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.tencent.mm.modelfriend.o localo = (com.tencent.mm.modelfriend.o)getItem(paramInt);
    ae localae2;
    if (paramView == null)
    {
      ae localae1 = new ae();
      paramView = View.inflate(this.context, k.beJ, null);
      localae1.dXf = ((ImageView)paramView.findViewById(i.aoz));
      localae1.dtJ = ((TextView)paramView.findViewById(i.aIO));
      localae1.dtK = ((TextView)paramView.findViewById(i.aIJ));
      localae1.iOk = ((TextView)paramView.findViewById(i.aIK));
      localae1.iOl = ((TextView)paramView.findViewById(i.aIM));
      localae1.fpY = ((ImageView)paramView.findViewById(i.aIP));
      paramView.setTag(localae1);
      localae2 = localae1;
      TextView localTextView = localae2.dtJ;
      localTextView.setText(com.tencent.mm.ar.b.e(this.context, localo.vS(), (int)localae2.dtJ.getTextSize()));
      localae2.iOl.setVisibility(8);
      localae2.fpY.setVisibility(0);
      switch (this.dtC[paramInt])
      {
      case 1:
      default:
      case 2:
      case 0:
      }
    }
    Bitmap localBitmap;
    while (true)
    {
      localBitmap = c.eH(localo.vR());
      if (localBitmap != null)
        break label484;
      localae2.dXf.setImageDrawable(a.n(this.context, h.WL));
      return paramView;
      localae2 = (ae)paramView.getTag();
      break;
      localae2.iOk.setVisibility(8);
      localae2.dtK.setVisibility(0);
      localae2.dtK.setText(n.bLD);
      localae2.dtK.setTextColor(this.context.getResources().getColor(f.NS));
      continue;
      if ((localo.getStatus() != 102) && (!bg.qW().oT().yo(localo.getUsername())))
      {
        localae2.dtK.setVisibility(8);
        localae2.iOk.setVisibility(0);
      }
      else if (localo.getStatus() == 102)
      {
        localae2.dtK.setVisibility(8);
        localae2.iOk.setVisibility(8);
        localae2.fpY.setVisibility(8);
      }
      else
      {
        localae2.dtK.setVisibility(0);
        localae2.dtK.setText(n.bLB);
        localae2.dtK.setTextColor(this.context.getResources().getColor(f.NR));
        localae2.iOk.setVisibility(8);
      }
    }
    label484: localae2.dXf.setImageBitmap(localBitmap);
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
 * Qualified Name:     com.tencent.mm.ui.account.ac
 * JD-Core Version:    0.6.2
 */
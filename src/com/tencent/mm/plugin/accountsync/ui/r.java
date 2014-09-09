package com.tencent.mm.plugin.accountsync.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.ar.b;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.modelfriend.ah;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.o;
import com.tencent.mm.modelfriend.p;
import com.tencent.mm.n.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.cc;

public final class r extends cb
{
  private String dXd;
  private boolean[] dXe;
  private int[] dtC;

  public r(Context paramContext, cc paramcc)
  {
    super(paramContext, new o());
    super.a(paramcc);
  }

  public final long[] DV()
  {
    int i = 0;
    boolean[] arrayOfBoolean = this.dXe;
    int j = arrayOfBoolean.length;
    int k = 0;
    int m = 0;
    while (k < j)
    {
      if (arrayOfBoolean[k] != 0)
        m++;
      k++;
    }
    long[] arrayOfLong = new long[m];
    int n = 0;
    int i2;
    if (n < getCount())
    {
      if (this.dXe[n] == 0)
        break label107;
      o localo = (o)getItem(n);
      i2 = i + 1;
      arrayOfLong[i] = localo.vR();
    }
    label107: for (int i1 = i2; ; i1 = i)
    {
      n++;
      i = i1;
      break;
      return arrayOfLong;
    }
  }

  public final void DW()
  {
    setCursor(az.xa().gr(this.dXd));
    this.dtC = new int[getCount()];
    this.dXe = new boolean[getCount()];
    super.notifyDataSetChanged();
  }

  protected final void DX()
  {
    DW();
  }

  public final void eV(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.dXe.length))
      return;
    boolean[] arrayOfBoolean = this.dXe;
    if (this.dXe[paramInt] == 0);
    for (int i = 1; ; i = 0)
    {
      arrayOfBoolean[paramInt] = i;
      super.notifyDataSetChanged();
      return;
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    o localo = (o)getItem(paramInt);
    s locals2;
    Bitmap localBitmap;
    if (paramView == null)
    {
      s locals1 = new s();
      paramView = View.inflate(this.context, k.beK, null);
      locals1.dXf = ((ImageView)paramView.findViewById(i.aoz));
      locals1.dtJ = ((TextView)paramView.findViewById(i.aIO));
      locals1.dXg = ((TextView)paramView.findViewById(i.ayL));
      locals1.dXh = ((CheckBox)paramView.findViewById(i.ayP));
      paramView.setTag(locals1);
      locals2 = locals1;
      TextView localTextView = locals2.dtJ;
      localTextView.setText(b.e(this.context, localo.vS(), (int)locals2.dtJ.getTextSize()));
      localBitmap = c.eH(localo.vR());
      if (localBitmap != null)
        break label244;
      locals2.dXf.setImageDrawable(a.n(this.context, h.WL));
    }
    while (true)
    {
      locals2.dXh.setChecked(this.dXe[paramInt]);
      if (!az.xd().gy(Long.toString(localo.vR())))
        break label257;
      locals2.dXg.setVisibility(0);
      return paramView;
      locals2 = (s)paramView.getTag();
      break;
      label244: locals2.dXf.setImageBitmap(localBitmap);
    }
    label257: locals2.dXg.setVisibility(8);
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
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.r
 * JD-Core Version:    0.6.2
 */
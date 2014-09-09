package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cj;
import com.tencent.mm.ui.base.ck;
import com.tencent.mm.ui.base.cl;
import com.tencent.mm.ui.base.cm;

public final class eo extends gw
{
  private boolean gFl = true;
  private LayoutInflater gJ;
  private cl jTL;
  private cm jTM;
  private cg jTN;
  private cj jTP;
  private ck jTQ;
  private ep jTU;

  public eo(Context paramContext)
  {
    super(paramContext);
    this.gJ = LayoutInflater.from(paramContext);
    this.jTN = new cg();
  }

  public final void a(cj paramcj)
  {
    this.jTP = paramcj;
  }

  public final void a(ck paramck)
  {
    this.jTQ = paramck;
  }

  public final void a(cl paramcl)
  {
    this.jTL = paramcl;
  }

  protected final BaseAdapter aQp()
  {
    if (this.jTU == null)
      this.jTU = new ep(this, (byte)0);
    return this.jTU;
  }

  public final void b(cm paramcm)
  {
    this.jTM = paramcm;
  }

  public final boolean ck()
  {
    if (this.jTL != null)
      this.jTL.a(this.jTN);
    if ((this.jTN.aSk() != null) && (this.jTN.aSk().length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      this.gFl = bool;
      return super.ck();
    }
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((this.gFl) && (paramInt == 0))
      return;
    if (this.gFl)
      paramInt--;
    if (this.jTM != null)
      this.jTM.d(this.jTN.getItem(paramInt), paramInt);
    dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.eo
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.cb;
import java.util.ArrayList;
import java.util.List;

final class gk extends cb
{
  private List jUP;
  private boolean[] jUQ;

  private gk(ShareImageUI paramShareImageUI, Context paramContext, List paramList)
  {
    super(paramContext, new com.tencent.mm.storage.i());
    this.jUP = paramList;
    this.jUQ = new boolean[paramList.size()];
    int i = 0;
    int j = this.jUQ.length;
    while (i < j)
    {
      this.jUQ[i] = true;
      i++;
    }
  }

  public final void DW()
  {
    setCursor(bg.qW().oT().aK(this.jUP));
    notifyDataSetChanged();
  }

  protected final void DX()
  {
    DW();
  }

  public final ArrayList baS()
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int j = this.jUP.size();
    while (i < j)
    {
      if (this.jUQ[i] != 0)
        localArrayList.add(this.jUP.get(i));
      i++;
    }
    return localArrayList;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    gl localgl1;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, k.bdB, null);
      gl localgl2 = new gl(this);
      localgl2.egz = ((TextView)paramView.findViewById(com.tencent.mm.i.aoA));
      localgl2.eoy = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.aoy));
      localgl2.egA = ((TextView)paramView.findViewById(com.tencent.mm.i.aoD));
      localgl2.egC = ((CheckBox)paramView.findViewById(com.tencent.mm.i.aoE));
      localgl2.jAE = ((TextView)paramView.findViewById(com.tencent.mm.i.aow));
      paramView.setTag(localgl2);
      localgl1 = localgl2;
    }
    while (true)
    {
      com.tencent.mm.storage.i locali = (com.tencent.mm.storage.i)getItem(paramInt);
      localgl1.egz.setVisibility(8);
      localgl1.egC.setChecked(this.jUQ[paramInt]);
      localgl1.egC.setVisibility(0);
      c.a((ImageView)localgl1.eoy.getContentView(), locali.getUsername());
      localgl1.jAE.setVisibility(8);
      try
      {
        TextView localTextView = localgl1.egA;
        Context localContext = this.context;
        locali.getUsername();
        String str = y.dh(locali.getUsername());
        if (("".length() > 0) && (!"".equals(str)))
        {
          StringBuilder localStringBuilder = new StringBuilder(32);
          localStringBuilder.append(str);
          localStringBuilder.append("(");
          localStringBuilder.append("");
          localStringBuilder.append(")");
          str = localStringBuilder.toString();
        }
        localTextView.setText(com.tencent.mm.ar.b.e(localContext, str, (int)localgl1.egA.getTextSize()));
        return paramView;
        localgl1 = (gl)paramView.getTag();
      }
      catch (Exception localException)
      {
        localgl1.egA.setText("");
      }
    }
    return paramView;
  }

  public final void rk(int paramInt)
  {
    boolean[] arrayOfBoolean;
    if ((paramInt >= 0) && (paramInt < this.jUQ.length))
    {
      arrayOfBoolean = this.jUQ;
      if (this.jUQ[paramInt] != 0)
        break label38;
    }
    label38: for (int i = 1; ; i = 0)
    {
      arrayOfBoolean[paramInt] = i;
      notifyDataSetChanged();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gk
 * JD-Core Version:    0.6.2
 */
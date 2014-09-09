package com.tencent.mm.ui.tools;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cj;
import com.tencent.mm.ui.base.ck;

final class ep extends BaseAdapter
{
  private ep(eo parameo)
  {
  }

  public final int getCount()
  {
    if (eo.a(this.jTV))
      return 1 + eo.b(this.jTV).size();
    return eo.b(this.jTV).size();
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    int i = 1;
    if ((eo.a(this.jTV)) && (paramInt == 0))
      i = 0;
    return i;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((eo.a(this.jTV)) && (paramInt == 0))
    {
      eq localeq4;
      if (paramView == null)
      {
        paramView = eo.c(this.jTV).inflate(k.bjH, paramViewGroup, false);
        localeq4 = new eq(this, (byte)0);
        localeq4.fpj = ((TextView)paramView.findViewById(i.title));
        localeq4.fpi = ((ImageView)paramView.findViewById(i.icon));
        paramView.setTag(localeq4);
      }
      for (eq localeq3 = localeq4; ; localeq3 = (eq)paramView.getTag())
      {
        localeq3.fpj.setText(eo.f(this.jTV));
        return paramView;
      }
    }
    if (eo.a(this.jTV))
      paramInt--;
    eq localeq1;
    MenuItem localMenuItem;
    if (paramView == null)
    {
      paramView = eo.c(this.jTV).inflate(k.bjG, paramViewGroup, false);
      eq localeq2 = new eq(this, (byte)0);
      localeq2.fpj = ((TextView)paramView.findViewById(i.title));
      localeq2.fpi = ((ImageView)paramView.findViewById(i.icon));
      localeq2.hza = paramView.findViewById(i.aMC);
      paramView.setTag(localeq2);
      localeq1 = localeq2;
      localMenuItem = eo.b(this.jTV).getItem(paramInt);
      localeq1.fpj.setText(localMenuItem.getTitle());
      if (localMenuItem.getIcon() == null)
        break label342;
      localeq1.fpi.setVisibility(0);
      localeq1.fpi.setImageDrawable(localMenuItem.getIcon());
    }
    while (true)
    {
      if (eo.e(this.jTV) != null)
        eo.e(this.jTV).a(localeq1.fpj, localMenuItem);
      if (paramInt != -1 + eo.b(this.jTV).size())
        break label396;
      localeq1.hza.setBackgroundResource(h.abv);
      return paramView;
      localeq1 = (eq)paramView.getTag();
      break;
      label342: if (eo.d(this.jTV) != null)
      {
        localeq1.fpi.setVisibility(0);
        eo.d(this.jTV).a(localeq1.fpi, localMenuItem);
      }
      else
      {
        localeq1.fpi.setVisibility(8);
      }
    }
    label396: localeq1.hza.setBackgroundResource(h.abu);
    return paramView;
  }

  public final int getViewTypeCount()
  {
    if (eo.a(this.jTV))
      return 2;
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ep
 * JD-Core Version:    0.6.2
 */
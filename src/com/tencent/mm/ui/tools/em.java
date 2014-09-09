package com.tencent.mm.ui.tools;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cj;
import com.tencent.mm.ui.base.ck;

final class em extends BaseAdapter
{
  private em(ei paramei)
  {
  }

  public final int getCount()
  {
    return ei.a(this.jTS).size();
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    en localen1;
    MenuItem localMenuItem;
    if (paramView == null)
    {
      paramView = ei.b(this.jTS).inflate(k.biy, paramViewGroup, false);
      en localen2 = new en(this, (byte)0);
      localen2.fpj = ((TextView)paramView.findViewById(i.title));
      localen2.fpi = ((ImageView)paramView.findViewById(i.icon));
      paramView.setTag(localen2);
      localen1 = localen2;
      localMenuItem = ei.a(this.jTS).getItem(paramInt);
      localen1.fpj.setText(localMenuItem.getTitle());
      Drawable localDrawable = ei.a(this.jTS).getItem(paramInt).getIcon();
      if (localDrawable == null)
        break label184;
      localen1.fpi.setVisibility(0);
      localen1.fpi.setImageDrawable(localDrawable);
    }
    while (true)
    {
      if (ei.d(this.jTS) != null)
        ei.d(this.jTS).a(localen1.fpj, localMenuItem);
      return paramView;
      localen1 = (en)paramView.getTag();
      break;
      label184: if (ei.c(this.jTS) != null)
      {
        localen1.fpi.setVisibility(0);
        ei.c(this.jTS).a(localen1.fpi, localMenuItem);
      }
      else
      {
        localen1.fpi.setVisibility(8);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.em
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.account;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.cn;

public final class ee
{
  public static cn a(Context paramContext, View paramView, String[] paramArrayOfString, AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    View localView1 = View.inflate(paramContext, k.bkz, null);
    HorizontalListView localHorizontalListView = (HorizontalListView)localView1.findViewById(i.aSh);
    a locala = new a(paramContext, paramArrayOfString);
    localHorizontalListView.setAdapter(locala);
    localHorizontalListView.setOnItemClickListener(paramOnItemClickListener);
    localHorizontalListView.setBackgroundResource(h.aaK);
    cn localcn = new cn(localView1);
    localcn.setHeight(com.tencent.mm.aq.a.fromDPToPix(paramContext, 120));
    int i = 0;
    int j = 0;
    while (i < locala.getCount())
    {
      View localView2 = locala.getView(i, null, localHorizontalListView);
      localView2.measure(0, 0);
      j += localView2.getMeasuredWidth();
      i++;
    }
    localcn.setWidth(j + com.tencent.mm.aq.a.fromDPToPix(paramContext, 20));
    localcn.showAsDropDown(paramView, (paramView.getWidth() - (j + com.tencent.mm.aq.a.fromDPToPix(paramContext, 20))) / 2, 0);
    return localcn;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ee
 * JD-Core Version:    0.6.2
 */
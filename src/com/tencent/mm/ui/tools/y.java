package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.z.b;
import java.util.ArrayList;
import java.util.List;

public final class y extends BaseAdapter
{
  private Context context;
  private String dWU;
  private List gfe;
  private List jPe = new ArrayList();
  private int[] jPf;

  public y(Context paramContext, List paramList)
  {
    this.context = paramContext;
    this.gfe = paramList;
    aZK();
    aZL();
  }

  private void aZK()
  {
    int i = 0;
    int j = this.gfe.size();
    while (i < j)
    {
      this.jPe.add(this.gfe.get(i));
      i++;
    }
  }

  private void aZL()
  {
    this.jPf = new int[this.gfe.size()];
    int i = this.gfe.size();
    for (int j = 0; j < i; j++)
      this.jPf[j] = ((x)this.gfe.get(j)).aZI();
  }

  private static String qO(int paramInt)
  {
    if (b.yt())
      return Integer.toString(paramInt) + "劃";
    return String.valueOf((char)paramInt);
  }

  public final int[] aZM()
  {
    return this.jPf;
  }

  public final int getCount()
  {
    return this.gfe.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.gfe.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    x localx = (x)getItem(paramInt);
    View localView;
    z localz1;
    label104: int i;
    if (paramView == null)
      if (!b.yt())
      {
        localView = View.inflate(this.context, k.bdT, null);
        z localz2 = new z();
        localz2.egz = ((TextView)localView.findViewById(i.aoA));
        localz2.egA = ((TextView)localView.findViewById(i.aoD));
        localz2.jxv = ((TextView)localView.findViewById(i.aoH));
        localView.setTag(localz2);
        paramView = localView;
        localz1 = localz2;
        if (paramInt <= 0)
          break label204;
        i = this.jPf[(paramInt - 1)];
        label118: if (paramInt != 0)
          break label210;
        localz1.egz.setVisibility(0);
        localz1.egz.setText(qO(this.jPf[paramInt]));
      }
    while (true)
    {
      localz1.egA.setText(localx.getCountryName());
      localz1.jxv.setText(localx.getCountryCode());
      return paramView;
      localView = View.inflate(this.context, k.bdU, null);
      break;
      localz1 = (z)paramView.getTag();
      break label104;
      label204: i = -1;
      break label118;
      label210: if ((paramInt > 0) && (this.jPf[paramInt] != i))
      {
        localz1.egz.setVisibility(0);
        localz1.egz.setText(qO(this.jPf[paramInt]));
      }
      else
      {
        localz1.egz.setVisibility(8);
      }
    }
  }

  public final void jI(String paramString)
  {
    if (paramString != null)
    {
      this.dWU = paramString.trim();
      this.gfe.clear();
      int i = this.jPe.size();
      for (int j = 0; j < i; j++)
        if ((((x)this.jPe.get(j)).getCountryName().toUpperCase().contains(this.dWU.toUpperCase())) || (((x)this.jPe.get(j)).aZJ().toUpperCase().contains(this.dWU.toUpperCase())) || (((x)this.jPe.get(j)).getCountryCode().contains(this.dWU)))
          this.gfe.add(this.jPe.get(j));
      aZL();
      super.notifyDataSetChanged();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.y
 * JD-Core Version:    0.6.2
 */
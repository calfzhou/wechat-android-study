package com.tencent.mm.ui.account;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import java.util.ArrayList;
import java.util.List;

final class hf extends ArrayAdapter
{
  private final LayoutInflater fpT;
  private final ArrayList iRz;

  private String hm(int paramInt)
  {
    return (String)this.iRz.get(paramInt);
  }

  public final int getCount()
  {
    return this.iRz.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    if (((Integer)RegByMobileWaitingSMSUI.h(this.iRx).get(paramInt % RegByMobileWaitingSMSUI.h(this.iRx).size())).intValue() % 4 == 0)
      return 1;
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = getItemViewType(paramInt);
    View localView;
    hg localhg2;
    label117: int j;
    if (paramView == null)
    {
      hg localhg1 = new hg(this.iRx, (byte)0);
      switch (i)
      {
      default:
        throw new IllegalArgumentException("UNIMPLEMENT TYPE");
      case 0:
        localView = this.fpT.inflate(k.baK, null);
        localhg1.hzE = ((TextView)localView.findViewById(i.alp));
        localhg1.dtI = ((ImageView)localView.findViewById(i.ale));
        localView.setTag(localhg1);
        paramView = localView;
        localhg2 = localhg1;
        j = ((Integer)RegByMobileWaitingSMSUI.h(this.iRx).get(paramInt % RegByMobileWaitingSMSUI.h(this.iRx).size())).intValue();
        switch (i)
        {
        default:
        case 0:
        case 1:
        }
        break;
      case 1:
      }
    }
    while (true)
    {
      localhg2.hzE.setText(hm(paramInt));
      return paramView;
      localView = this.fpT.inflate(k.baL, null);
      break;
      localhg2 = (hg)paramView.getTag();
      break label117;
      localhg2.dtI.setImageDrawable((Drawable)RegByMobileWaitingSMSUI.i(this.iRx).get(j % RegByMobileWaitingSMSUI.i(this.iRx).size()));
      continue;
      localhg2.dtI.setImageDrawable(RegByMobileWaitingSMSUI.j(this.iRx));
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }

  public final void vd(String paramString)
  {
    this.iRz.add(paramString);
    notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hf
 * JD-Core Version:    0.6.2
 */
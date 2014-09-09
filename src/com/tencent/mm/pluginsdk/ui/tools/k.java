package com.tencent.mm.pluginsdk.ui.tools;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

final class k extends BaseAdapter
{
  private List eyV = new ArrayList();
  private int hKv = p.hKN;

  public k(AppChooserUI paramAppChooserUI)
  {
    AppChooserUI.a(paramAppChooserUI, paramAppChooserUI.getPackageManager());
  }

  public final int aER()
  {
    return this.hKv;
  }

  public final int getCount()
  {
    if (this.eyV == null)
      return 0;
    return this.eyV.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    l locall2;
    m localm1;
    boolean bool;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.hKu.aPI()).inflate(com.tencent.mm.k.baQ, null);
      l locall1 = new l(this.hKu, paramView);
      paramView.setTag(locall1);
      locall2 = locall1;
      localm1 = nn(paramInt);
      if (localm1.hKD == null)
        new n(this.hKu).execute(new m[] { localm1 });
      locall2.hKw.setImageDrawable(localm1.hKD);
      locall2.hKx.setText(localm1.hKC);
      if ((localm1 == null) || ((localm1.hKE) && (!localm1.hKF) && ((!localm1.hKE) || (!localm1.eZh) || (AppChooserUI.d(this.hKu) < AppChooserUI.e(this.hKu)))) || (localm1.hKG))
        break label393;
      locall2.hKz.setVisibility(8);
      locall2.hKA.setVisibility(0);
      RadioButton localRadioButton = locall2.hKA;
      m localm2 = AppChooserUI.c(this.hKu);
      if (!(localm2 instanceof m))
        break label387;
      m localm3 = (m)localm2;
      if (((localm3.hKB == null) || (localm1.hKB == null) || (!localm3.hKB.activityInfo.packageName.equals(localm1.hKB.activityInfo.packageName))) && ((!localm3.hKE) || (!localm1.hKE)))
        break label387;
      bool = true;
      label293: localRadioButton.setChecked(bool);
      label300: if (!localm1.hKE)
        break label588;
      if (AppChooserUI.i(this.hKu) != 4)
        break label570;
      locall2.hKy.setText(com.tencent.mm.n.bVQ);
      label330: locall2.hKy.setVisibility(0);
    }
    while (true)
    {
      if ((AppChooserUI.c(this.hKu) != null) && (AppChooserUI.c(this.hKu).equals(localm1)))
        locall2.hKA.setChecked(true);
      return paramView;
      locall2 = (l)paramView.getTag();
      break;
      label387: bool = false;
      break label293;
      label393: locall2.hKz.setVisibility(0);
      locall2.hKA.setVisibility(8);
      locall2.hKz.setOnClickListener(AppChooserUI.k(this.hKu));
      if (this.hKv == p.hKN)
      {
        if (localm1.hKG)
          locall2.hKz.setText(com.tencent.mm.n.btM);
        while (true)
        {
          locall2.hKz.setEnabled(true);
          break;
          locall2.hKz.setText(com.tencent.mm.n.bsU);
        }
      }
      if (this.hKv == p.hKO)
      {
        locall2.hKz.setText(com.tencent.mm.n.bsZ);
        locall2.hKz.setEnabled(false);
        break label300;
      }
      if (this.hKv != p.hKP)
        break label300;
      if (localm1.hKG)
        locall2.hKz.setText(com.tencent.mm.n.buq);
      while (true)
      {
        locall2.hKz.setEnabled(true);
        break;
        locall2.hKz.setText(com.tencent.mm.n.bup);
      }
      label570: locall2.hKy.setText(AppChooserUI.l(this.hKu));
      break label330;
      label588: locall2.hKy.setVisibility(8);
    }
  }

  public final m nn(int paramInt)
  {
    if (this.eyV == null)
      return null;
    return (m)this.eyV.get(paramInt);
  }

  public final void no(int paramInt)
  {
    this.hKv = paramInt;
  }

  public final void x(List paramList)
  {
    this.eyV = paramList;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.k
 * JD-Core Version:    0.6.2
 */
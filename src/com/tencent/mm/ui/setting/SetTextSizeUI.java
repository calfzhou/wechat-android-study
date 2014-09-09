package com.tencent.mm.ui.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.cu;
import com.tencent.mm.ui.ek;

public class SetTextSizeUI extends MMPreference
{
  private o dXi;
  private float jLR;
  private int xA = 1;

  public static float ae(float paramFloat)
  {
    float f = 16.0F;
    if (paramFloat == 0.875F)
      f = 14.0F;
    do
    {
      do
        return f;
      while (paramFloat == 1.0F);
      if (paramFloat == 1.125F)
        return 18.0F;
      if (paramFloat == 1.25F)
        return 20.0F;
    }
    while (paramFloat != 1.375F);
    return 22.0F;
  }

  public static float af(float paramFloat)
  {
    float f = 1.0F;
    if (paramFloat == 0.875F)
      f = 0.0F;
    do
    {
      do
        return f;
      while (paramFloat == f);
      if (paramFloat == 1.125F)
        return 2.0F;
      if (paramFloat == 1.25F)
        return 3.0F;
    }
    while (paramFloat != 1.375F);
    return 4.0F;
  }

  public static float cB(Context paramContext)
  {
    float f = ek.cl(paramContext);
    if ((f != 1.0F) && (f != 0.875F) && (f != 1.125F) && (f != 1.25F) && (f != 1.375F))
      return 1.0F;
    return f;
  }

  public static int cC(Context paramContext)
  {
    float f = cB(paramContext);
    if (f == 0.875F)
      return n.ceG;
    if (f == 1.125F)
      return n.ceE;
    if (f == 1.25F)
      return n.ceH;
    if (f == 1.375F)
      return n.ceD;
    return n.ceF;
  }

  private void refresh()
  {
    this.dXi.removeAll();
    aa localaa1 = new aa(this, this, 0.875F);
    localaa1.setTitle(n.ceG);
    localaa1.setKey("setting_text_size_small");
    localaa1.setLayoutResource(k.biA);
    aa localaa2;
    label115: aa localaa3;
    label174: aa localaa4;
    label238: aa localaa5;
    if (this.jLR == 0.875F)
    {
      localaa1.setWidgetLayoutResource(k.bjx);
      this.dXi.a(localaa1);
      localaa2 = new aa(this, this, 1.0F);
      localaa2.setTitle(n.ceF);
      localaa2.setKey("setting_text_size_normal");
      localaa2.setLayoutResource(k.biA);
      if (this.jLR != 1.0F)
        break label428;
      localaa2.setWidgetLayoutResource(k.bjx);
      this.dXi.a(localaa2);
      localaa3 = new aa(this, this, 1.125F);
      localaa3.setTitle(n.ceE);
      localaa3.setKey("setting_text_size_large");
      localaa3.setLayoutResource(k.biA);
      if (this.jLR != 1.125F)
        break label438;
      localaa3.setWidgetLayoutResource(k.bjx);
      this.dXi.a(localaa3);
      localaa4 = new aa(this, this, 1.25F);
      localaa4.setTitle(n.ceH);
      localaa4.setKey("setting_text_size_super");
      localaa4.setLayoutResource(k.biA);
      if (this.jLR != 1.25F)
        break label448;
      localaa4.setWidgetLayoutResource(k.bjx);
      this.dXi.a(localaa4);
      localaa5 = new aa(this, this, 1.375F);
      localaa5.setTitle(n.ceD);
      localaa5.setKey("setting_text_size_huge");
      localaa5.setLayoutResource(k.biA);
      if (this.jLR != 1.375F)
        break label459;
      localaa5.setWidgetLayoutResource(k.bjx);
    }
    while (true)
    {
      this.dXi.a(localaa5);
      PreferenceCategory localPreferenceCategory = new PreferenceCategory(this);
      this.dXi.a(localPreferenceCategory);
      this.dXi.notifyDataSetChanged();
      ViewGroup localViewGroup = (ViewGroup)aPH();
      int i = 0;
      int j = localViewGroup.getChildCount();
      while (i < j)
      {
        View localView = localViewGroup.getChildAt(i);
        if ((localView instanceof TextView))
          com.tencent.mm.sdk.platformtools.z.d("!32@wOBHzM1+lQWBD3FuIq3VlzD06hYi74WZ", "id=" + localView.getId());
        i++;
      }
      localaa1.setWidgetLayoutResource(k.bjy);
      break;
      label428: localaa2.setWidgetLayoutResource(k.bjy);
      break label115;
      label438: localaa3.setWidgetLayoutResource(k.bjy);
      break label174;
      label448: localaa4.setWidgetLayoutResource(k.bjy);
      break label238;
      label459: localaa5.setWidgetLayoutResource(k.bjy);
    }
  }

  protected final void DP()
  {
    this.jLR = cB(this);
    this.dXi = aTL();
    oP(n.che);
    a(new y(this));
    a(0, getString(n.cfJ), new z(this), cu.iMA);
    refresh();
  }

  public final int DZ()
  {
    return -1;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    this.xA = 1;
    if (str.equals("setting_text_size_small"))
    {
      this.jLR = 0.875F;
      this.xA = 0;
    }
    while (true)
    {
      refresh();
      return false;
      if (str.equals("setting_text_size_normal"))
      {
        this.jLR = 1.0F;
        this.xA = 1;
      }
      else if (str.equals("setting_text_size_large"))
      {
        this.jLR = 1.125F;
        this.xA = 2;
      }
      else if (str.equals("setting_text_size_super"))
      {
        this.jLR = 1.25F;
        this.xA = 3;
      }
      else if (str.equals("setting_text_size_huge"))
      {
        this.jLR = 1.375F;
        this.xA = 4;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SetTextSizeUI
 * JD-Core Version:    0.6.2
 */
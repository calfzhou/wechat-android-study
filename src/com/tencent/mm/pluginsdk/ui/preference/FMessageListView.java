package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.aj.l;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;

public class FMessageListView extends LinearLayout
{
  private Context context;
  private g hGT;
  private com.tencent.mm.pluginsdk.c.a hHa = new h(this);
  private al hHb = new i(this);
  private al hHc = new j(this);
  private final LinearLayout.LayoutParams hHd = new LinearLayout.LayoutParams(-1, -2);
  private m hHe;
  private a hHf;

  public FMessageListView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public FMessageListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FMessageListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    l.AE().g(this.hHb);
    com.tencent.mm.pluginsdk.c.a.a("LBSVerifyStorageNotify", this.hHa);
    l.AH().g(this.hHc);
  }

  public final void a(g paramg)
  {
    this.hGT = paramg;
    a.a(paramg);
  }

  public final void a(n paramn)
  {
    int i = 0;
    if (paramn == null)
    {
      z.e("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "addItem fail, provider is null");
      return;
    }
    if (paramn.id <= 0L)
    {
      z.e("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "addItem fail, systemRowId invalid = " + paramn.id);
      return;
    }
    int j = getChildCount();
    for (int k = 0; k < j; k++)
    {
      View localView = getChildAt(k);
      if (((localView instanceof a)) && (localView.getTag() != null) && (localView.getTag().equals(Long.valueOf(paramn.id))))
      {
        z.w("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "addItem, item repeated, sysRowId = " + paramn.id);
        return;
      }
    }
    z.d("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "addItem, current child count = " + getChildCount());
    if (getChildCount() == 5)
    {
      z.i("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "addItem, most 3 FMessageItemView, remove earliest");
      removeViewAt(0);
    }
    if (getChildCount() == 0)
    {
      z.d("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "addItem, current child count is 0, add two child view");
      this.hHe = new m(this.context);
      addView(this.hHe);
      this.hHf = new a(this.context);
      this.hHf.vN("");
      this.hHf.mX(0);
      addView(this.hHf, this.hHd);
      com.tencent.mm.storage.i locali2 = bg.qW().oT().ys(paramn.username);
      if ((locali2 != null) && (com.tencent.mm.g.a.cv(locali2.getType())))
        break label455;
      z.d("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "addItem, reply btn visible, talker = " + paramn.username);
      this.hHe.setVisibility(0);
      this.hHf.setVisibility(0);
    }
    String str2;
    while (paramn.dsv)
    {
      Context localContext = this.context;
      int m = com.tencent.mm.n.bJQ;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramn.djA;
      str2 = localContext.getString(m, arrayOfObject);
      a locala = new a(this.context);
      locala.setTag(Long.valueOf(paramn.id));
      locala.vN(str2);
      locala.mX(8);
      if (i != 0)
        locala.setOnLongClickListener(new k(this, paramn));
      addView(locala, -2 + getChildCount(), this.hHd);
      return;
      label455: z.d("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "addItem, reply btn gone, talker = " + paramn.username);
      this.hHe.setVisibility(8);
      this.hHf.setVisibility(8);
    }
    if ((paramn.duA != null) && (paramn.duA.length() > 0));
    com.tencent.mm.storage.i locali1;
    for (String str1 = paramn.duA; ; str1 = locali1.od())
      do
      {
        str2 = str1 + ": " + paramn.djA;
        i = 1;
        break;
        str1 = paramn.username;
        locali1 = bg.qW().oT().ys(paramn.username);
      }
      while ((locali1 == null) || ((int)locali1.dhv <= 0));
  }

  public final void dM(boolean paramBoolean)
  {
    int i = getChildCount();
    z.d("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "setReplyBtnVisible, visible = " + paramBoolean + ", current child count = " + i);
    if (i <= 2)
      z.e("!44@/B4Tb64lLpISOYcLaKm7W9VXCtUsfbzmlSwz61ihIus=", "setReplyBtnVisible fail, childCount invalid = " + i);
    int k;
    do
    {
      return;
      if (this.hHe != null)
      {
        m localm = this.hHe;
        if (!paramBoolean)
          break;
        k = 0;
        localm.setVisibility(k);
      }
    }
    while (this.hHf == null);
    a locala = this.hHf;
    int j = 0;
    if (paramBoolean);
    while (true)
    {
      locala.setVisibility(j);
      return;
      k = 8;
      break;
      j = 8;
    }
  }

  public final void detach()
  {
    l.AE().h(this.hHb);
    com.tencent.mm.pluginsdk.c.a.b("LBSVerifyStorageNotify", this.hHa);
    l.AH().h(this.hHc);
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if ((localView instanceof a))
        ((a)localView).detach();
    }
    this.hHe = null;
    this.hHf = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.FMessageListView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.h;
import com.tencent.mm.ui.base.preference.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ab
{
  private final int FP;
  private Context context;
  private o dXi;
  private View fPf;
  private View gmW;
  private String hBa;
  private HashMap hBb = new HashMap();
  private boolean hBc = false;
  private boolean hBd;
  public af hBe;
  private ap hBf;
  private aj hBg;
  private View.OnClickListener hBh;
  private View.OnClickListener hBi;
  private ap hBj;
  private ao hBk;
  private ag hBl;

  public ab(Context paramContext)
  {
    boolean bool1 = this.hBc;
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    this.hBd = bool2;
    this.hBf = null;
    this.hBg = null;
    this.hBj = new ac(this);
    this.hBk = new ad(this);
    this.hBl = new ae(this);
    this.FP = 4;
    this.context = paramContext;
    this.hBe = new af(this.context);
    this.hBe.a(this.hBl);
  }

  private static String my(int paramInt)
  {
    if (paramInt >= 0)
      return "pref_contact_list_row_" + paramInt;
    String str = "unkown";
    if (paramInt == -1)
      str = "header";
    while (true)
    {
      return "pref_contact_list_row_" + str;
      if (paramInt == -2)
        str = "footer";
    }
  }

  private void vy(String paramString)
  {
    this.hBe.setUsername(paramString);
    this.hBe.dn(this.hBd);
    this.hBe.notifyChanged();
    adD();
  }

  public final void C(ArrayList paramArrayList)
  {
    if (paramArrayList == null)
      paramArrayList = new ArrayList(0);
    this.hBe.E(paramArrayList);
    vy(null);
  }

  public final void a(aj paramaj)
  {
    this.hBg = paramaj;
  }

  public final void a(ap paramap)
  {
    this.hBf = paramap;
  }

  public final void a(o paramo, String paramString)
  {
    if ((paramo == null) || (paramString == null))
      return;
    this.dXi = paramo;
    this.hBa = paramString;
    paramo.R(paramString, true);
  }

  public final void adD()
  {
    int i = 0;
    if ((this.dXi == null) || (this.hBa == null))
      return;
    Iterator localIterator = this.hBb.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.dXi.BV(str);
    }
    this.hBb.clear();
    int j = this.dXi.indexOf(this.hBa);
    if (this.fPf != null);
    for (int k = 1; ; k = 0)
    {
      if ((this.gmW != null) && ((!this.hBc) || (this.hBe.aAO())));
      for (int m = 1; ; m = 0)
      {
        if (k != 0)
        {
          ContactListCustomPreference localContactListCustomPreference1 = new ContactListCustomPreference(this.context);
          localContactListCustomPreference1.setKey(my(-1));
          localContactListCustomPreference1.setCustomView(this.fPf);
          localContactListCustomPreference1.mE(h.Uj);
          localContactListCustomPreference1.setOnClickListener(this.hBh);
          this.dXi.a(localContactListCustomPreference1, j);
          this.hBb.put(localContactListCustomPreference1.getKey(), localContactListCustomPreference1);
        }
        for (int n = j + 1; ; n = j)
        {
          if (this.hBf != null);
          int i1;
          for (ap localap = this.hBf; ; localap = this.hBj)
            for (i1 = 0; i < this.hBe.getCount(); i1++)
            {
              ContactListExpandPreference localContactListExpandPreference = new ContactListExpandPreference(this.context, 1);
              localContactListExpandPreference.setKey(my(i1));
              localContactListExpandPreference.hBQ.a(this.hBe, i1);
              localContactListExpandPreference.hBQ.aAU();
              localContactListExpandPreference.hBQ.a(this.hBk);
              localContactListExpandPreference.hBQ.a(localap);
              this.dXi.a(localContactListExpandPreference, n + i1);
              this.hBb.put(localContactListExpandPreference.getKey(), localContactListExpandPreference);
              i += 4;
            }
          if (m == 0)
            break;
          ContactListCustomPreference localContactListCustomPreference2 = new ContactListCustomPreference(this.context);
          localContactListCustomPreference2.setKey(my(-2));
          localContactListCustomPreference2.setCustomView(this.gmW);
          localContactListCustomPreference2.setOnClickListener(this.hBi);
          this.dXi.a(localContactListCustomPreference2, n + i1);
          this.hBb.put(localContactListCustomPreference2.getKey(), localContactListCustomPreference2);
          return;
        }
      }
    }
  }

  public final void dk(boolean paramBoolean)
  {
    this.hBc = false;
    boolean bool1 = this.hBc;
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    this.hBd = bool2;
  }

  public final void g(String paramString, List paramList)
  {
    if (paramList == null)
      paramList = new ArrayList(0);
    this.hBe.ay(paramList);
    vy(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.ab
 * JD-Core Version:    0.6.2
 */
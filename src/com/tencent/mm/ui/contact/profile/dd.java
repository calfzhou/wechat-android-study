package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.ax;
import com.tencent.mm.modelfriend.ay;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;
import junit.framework.Assert;

class dd extends cf
{
  public dd(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  protected void aXT()
  {
    if (!y.dP(NormalUserFooterPreference.a(this.jEw).getUsername()));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      NormalUserFooterPreference.q(this.jEw).setVisibility(8);
      NormalUserFooterPreference.r(this.jEw).setVisibility(8);
      if (!NormalUserFooterPreference.c(this.jEw))
        break;
      NormalUserFooterPreference.z(this.jEw).setOnClickListener(new de(this));
      NormalUserFooterPreference.z(this.jEw).setVisibility(0);
      NormalUserFooterPreference.s(this.jEw).setVisibility(8);
      NormalUserFooterPreference.e(this.jEw).setVisibility(8);
      NormalUserFooterPreference.f(this.jEw).setVisibility(8);
      NormalUserFooterPreference.g(this.jEw).setVisibility(8);
      NormalUserFooterPreference.o(this.jEw).setVisibility(8);
      return;
    }
    NormalUserFooterPreference.s(this.jEw).setOnClickListener(new df(this));
    if (!com.tencent.mm.g.a.cv(NormalUserFooterPreference.a(this.jEw).getType()))
    {
      NormalUserFooterPreference.s(this.jEw).setVisibility(0);
      NormalUserFooterPreference.e(this.jEw).setVisibility(8);
      NormalUserFooterPreference.f(this.jEw).setVisibility(8);
      NormalUserFooterPreference.g(this.jEw).setVisibility(8);
    }
    label419: 
    while (NormalUserFooterPreference.a(this.jEw).xI())
    {
      NormalUserFooterPreference.o(this.jEw).setVisibility(0);
      return;
      NormalUserFooterPreference.s(this.jEw).setVisibility(8);
      NormalUserFooterPreference.e(this.jEw).setVisibility(0);
      if ((!this.jEw.aXS()) && (!NormalUserFooterPreference.a(this.jEw).getUsername().equals(x.pG())) && (!y.dP(NormalUserFooterPreference.a(this.jEw).getUsername())) && (!y.dK(NormalUserFooterPreference.a(this.jEw).getUsername())))
        NormalUserFooterPreference.g(this.jEw).setVisibility(0);
      while (true)
      {
        if (!bg.qW().oT().yv(NormalUserFooterPreference.a(this.jEw).getUsername()))
          break label419;
        NormalUserFooterPreference.j(this.jEw).setVisibility(0);
        NormalUserFooterPreference.a(this.jEw, NormalUserFooterPreference.a(this.jEw).getSource());
        break;
        NormalUserFooterPreference.g(this.jEw).setVisibility(8);
      }
    }
    NormalUserFooterPreference.o(this.jEw).setVisibility(8);
  }

  protected final void aXX()
  {
    if (((int)NormalUserFooterPreference.a(this.jEw).dhv == 0) && (bg.qW().oT().G(NormalUserFooterPreference.a(this.jEw)) != -1))
      NormalUserFooterPreference.a(this.jEw, bg.qW().oT().ys(NormalUserFooterPreference.a(this.jEw).getUsername()));
    ax localax1;
    String str3;
    String str4;
    com.tencent.mm.modelfriend.i locali;
    if ((NormalUserFooterPreference.B(this.jEw)) || (NormalUserFooterPreference.k(this.jEw) == 12))
    {
      z.d("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "qqNum " + NormalUserFooterPreference.C(this.jEw) + " qqReamrk " + NormalUserFooterPreference.D(this.jEw));
      if ((NormalUserFooterPreference.C(this.jEw) != 0L) && (NormalUserFooterPreference.D(this.jEw) != null) && (!NormalUserFooterPreference.D(this.jEw).equals("")))
      {
        localax1 = az.xe().K(NormalUserFooterPreference.C(this.jEw));
        if (localax1 == null)
        {
          ax localax2 = new ax();
          localax2.aU("");
          localax2.J(NormalUserFooterPreference.C(this.jEw));
          localax2.gE(NormalUserFooterPreference.D(this.jEw));
          localax2.setUsername(NormalUserFooterPreference.a(this.jEw).getUsername());
          localax2.wX();
          az.xe().b(localax2);
        }
      }
      else
      {
        String str1 = NormalUserFooterPreference.b(this.jEw).getIntent().getStringExtra("Contact_Mobile_MD5");
        String str2 = NormalUserFooterPreference.b(this.jEw).getIntent().getStringExtra("Contact_full_Mobile_MD5");
        str3 = ap.ja(str1);
        str4 = ap.ja(str2);
        if ((!str3.equals("")) || (!str4.equals("")))
        {
          locali = az.wZ().gn(str3);
          if (locali != null)
            break label555;
          locali = az.wZ().gn(str4);
        }
      }
    }
    while (true)
    {
      if (locali != null)
        az.wZ().a(str4, locali);
      com.tencent.mm.pluginsdk.ui.applet.a locala = new com.tencent.mm.pluginsdk.ui.applet.a(this.jEw.getContext(), new dg(this));
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(Integer.valueOf(NormalUserFooterPreference.k(this.jEw)));
      locala.a(new dh(this));
      locala.f(NormalUserFooterPreference.a(this.jEw).getUsername(), localLinkedList);
      return;
      localax1.J(NormalUserFooterPreference.C(this.jEw));
      localax1.gE(NormalUserFooterPreference.D(this.jEw));
      localax1.setUsername(NormalUserFooterPreference.a(this.jEw).getUsername());
      localax1.wX();
      az.xe().a(NormalUserFooterPreference.C(this.jEw), localax1);
      break;
      if ((NormalUserFooterPreference.k(this.jEw) != 58) && (NormalUserFooterPreference.k(this.jEw) != 59) && (NormalUserFooterPreference.k(this.jEw) != 60))
        break;
      az.xh().o(NormalUserFooterPreference.a(this.jEw).getUsername(), 1);
      break;
      label555: str4 = str3;
    }
  }

  protected final void ank()
  {
    super.ank();
  }

  protected void onDetach()
  {
    super.onDetach();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dd
 * JD-Core Version:    0.6.2
 */
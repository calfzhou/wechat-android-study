package com.tencent.mm.ui.contact.profile;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.network.bm;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.pluginsdk.ui.ar;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import java.util.List;

class do extends dd
  implements m
{
  private ProgressDialog dWT;

  public do(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  private void onStart()
  {
    onStop();
    bg.qX().a(30, this);
  }

  private void onStop()
  {
    bg.qX().b(30, this);
  }

  public void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object localObject = null;
    z.d("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramx.getType() != 30);
    int k;
    do
    {
      List localList;
      do
      {
        int m;
        do
        {
          do
          {
            return;
            onStop();
            if (this.dWT != null)
            {
              this.dWT.dismiss();
              this.dWT = null;
            }
          }
          while (!ap.S(this.jEw.getContext()));
          if ((paramInt1 != 0) || (paramInt2 != 0))
            break;
          m = ((p)paramx).ayw();
          z.d("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "VerifyBaseHandler onSceneEnd, opCode = " + m);
        }
        while ((m != 1) && (m != 3));
        localList = ((p)paramx).ayv();
      }
      while ((localList != null) && (!localList.contains(NormalUserFooterPreference.a(this.jEw).getUsername())));
      NormalUserFooterPreference.u(this.jEw);
      NormalUserFooterPreference localNormalUserFooterPreference = this.jEw;
      i locali1 = bg.qW().oT().ys(NormalUserFooterPreference.a(this.jEw).getUsername());
      if ((locali1 == null) || ((int)locali1.dhv == 0))
      {
        i locali2 = NormalUserFooterPreference.a(this.jEw);
        if (bg.qW().oT().G(locali2) == -1)
          z.e("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "insert contact failed, username = " + locali2.getUsername());
      }
      while (true)
      {
        NormalUserFooterPreference.a(localNormalUserFooterPreference, (i)localObject);
        if (NormalUserFooterPreference.a(this.jEw) != null)
          y.k(NormalUserFooterPreference.a(this.jEw));
        aXZ();
        return;
        locali1 = bg.qW().oT().ys(NormalUserFooterPreference.a(this.jEw).getUsername());
        localObject = locali1;
      }
      if ((paramInt1 != 4) || (paramInt2 != -302))
        break;
      k = ((p)paramx).ayw();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(k);
      z.w("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", arrayOfObject2);
    }
    while (k != 3);
    e.a(NormalUserFooterPreference.b(this.jEw), NormalUserFooterPreference.b(this.jEw).getString(n.bDn), NormalUserFooterPreference.b(this.jEw).getString(n.buo), NormalUserFooterPreference.b(this.jEw).getString(n.bsG), NormalUserFooterPreference.b(this.jEw).getString(n.bsK), new ds(this), null);
    return;
    int i;
    switch (paramInt1)
    {
    case 3:
    default:
      i = 0;
    case 1:
    case 2:
    case 4:
    }
    while (i != 0)
    {
      return;
      if (bg.qX().tx())
      {
        ar.j(this.jEw.getContext(), bg.qX().getNetworkServerIp(), String.valueOf(paramInt2));
        i = 1;
      }
      else if (bm.ab(this.jEw.getContext()))
      {
        ar.bl(this.jEw.getContext());
        i = 1;
      }
      else
      {
        i = 0;
        continue;
        Context localContext1 = this.jEw.getContext();
        Context localContext2 = this.jEw.getContext();
        int j = n.bKk;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(2);
        arrayOfObject1[1] = Integer.valueOf(paramInt2);
        Toast.makeText(localContext1, localContext2.getString(j, arrayOfObject1), 3000).show();
        i = 1;
        continue;
        if (paramInt2 != -100)
          break label691;
        e.a(this.jEw.getContext(), j.aGQ(), com.tencent.mm.aq.a.p(this.jEw.getContext(), n.buo), new dq(this), new dr(this));
        i = 1;
      }
    }
    label691: String str;
    if ((paramInt1 == 4) && (paramInt2 == -34))
      str = NormalUserFooterPreference.b(this.jEw).getString(n.bJR);
    while (true)
    {
      Toast.makeText(NormalUserFooterPreference.b(this.jEw), str, 1).show();
      break;
      if ((paramInt1 == 4) && (paramInt2 == -94))
        str = NormalUserFooterPreference.b(this.jEw).getString(n.bJS);
      else
        str = NormalUserFooterPreference.b(this.jEw).getString(n.ceo);
    }
  }

  protected void aXT()
  {
    onDetach();
    onStart();
    super.aXT();
  }

  protected final void aXY()
  {
    onStart();
    Context localContext = this.jEw.getContext();
    this.jEw.getContext().getString(n.buo);
    this.dWT = e.a(localContext, this.jEw.getContext().getString(n.bBr), true, new dp(this));
    bg.qX().d(new p(NormalUserFooterPreference.a(this.jEw).getUsername(), NormalUserFooterPreference.p(this.jEw), NormalUserFooterPreference.k(this.jEw)));
  }

  protected void aXZ()
  {
    if (NormalUserFooterPreference.t(this.jEw) != null)
      NormalUserFooterPreference.t(this.jEw).onDetach();
    NormalUserFooterPreference.a(this.jEw, new dd(this.jEw));
    NormalUserFooterPreference.t(this.jEw).ank();
  }

  protected void onDetach()
  {
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (NormalUserFooterPreference.q(this.jEw) != null)
      NormalUserFooterPreference.q(this.jEw).setVisibility(8);
    if (NormalUserFooterPreference.r(this.jEw) != null)
      NormalUserFooterPreference.r(this.jEw).setVisibility(0);
    if (NormalUserFooterPreference.e(this.jEw) != null)
      NormalUserFooterPreference.e(this.jEw).setVisibility(8);
    if (NormalUserFooterPreference.f(this.jEw) != null)
      NormalUserFooterPreference.f(this.jEw).setVisibility(8);
    if (NormalUserFooterPreference.g(this.jEw) != null)
      NormalUserFooterPreference.g(this.jEw).setVisibility(8);
    if (NormalUserFooterPreference.s(this.jEw) != null)
      NormalUserFooterPreference.s(this.jEw).setVisibility(8);
    if (NormalUserFooterPreference.o(this.jEw) != null)
      NormalUserFooterPreference.o(this.jEw).setVisibility(8);
    onStop();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.do
 * JD-Core Version:    0.6.2
 */
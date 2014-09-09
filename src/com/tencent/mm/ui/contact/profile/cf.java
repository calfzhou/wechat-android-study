package com.tencent.mm.ui.contact.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import com.tencent.mm.ab.k;
import com.tencent.mm.g.a;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.ax;
import com.tencent.mm.modelfriend.ay;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.modelfriend.p;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.c;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.contact.ContactRemarkInfoModUI;
import com.tencent.mm.ui.contact.ModRemarkNameUI;
import com.tencent.mm.ui.tools.ei;

abstract class cf
  implements m
{
  private boolean ekQ = false;
  private ei jEx = null;

  public cf(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
  }

  private void CQ(String paramString)
  {
    if (ap.jb(paramString))
    {
      z.w("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "mod stranger remark, username is null");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(this.jEw.getContext(), ModRemarkNameUI.class);
    localIntent.putExtra("Contact_Scene", NormalUserFooterPreference.k(this.jEw));
    localIntent.putExtra("Contact_mode_name_type", 0);
    localIntent.putExtra("Contact_ModStrangerRemark", true);
    localIntent.putExtra("Contact_User", NormalUserFooterPreference.a(this.jEw).getUsername());
    localIntent.putExtra("Contact_Nick", NormalUserFooterPreference.a(this.jEw).iV());
    localIntent.putExtra("Contact_RemarkName", NormalUserFooterPreference.a(this.jEw).ja());
    ((Activity)this.jEw.getContext()).startActivity(localIntent);
  }

  public void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " " + paramx.getType());
  }

  public final void aDh()
  {
    NormalUserFooterPreference.a(this.jEw, bg.qW().oT().ys(NormalUserFooterPreference.a(this.jEw).getUsername()));
    if (!a.cv(NormalUserFooterPreference.a(this.jEw).getType()))
    {
      CQ(NormalUserFooterPreference.a(this.jEw).getUsername());
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(this.jEw.getContext(), ContactRemarkInfoModUI.class);
    localIntent.putExtra("Contact_Scene", NormalUserFooterPreference.k(this.jEw));
    localIntent.putExtra("Contact_User", NormalUserFooterPreference.a(this.jEw).getUsername());
    localIntent.putExtra("Contact_RoomNickname", NormalUserFooterPreference.b(this.jEw).getIntent().getStringExtra("Contact_RoomNickname"));
    ((Activity)this.jEw.getContext()).startActivity(localIntent);
  }

  protected abstract void aXT();

  protected final void aXU()
  {
    NormalUserFooterPreference.b(this.jEw).a(0, h.WS, new cg(this));
  }

  protected void aXV()
  {
    if (NormalUserFooterPreference.c(this.jEw))
      NormalUserFooterPreference.b(this.jEw).eC(false);
    do
    {
      do
        return;
      while (com.tencent.mm.model.x.pG().equals(NormalUserFooterPreference.a(this.jEw).getUsername()));
      if ((NormalUserFooterPreference.a(this.jEw) == null) || (!a.cv(NormalUserFooterPreference.a(this.jEw).getType())))
        break;
    }
    while (y.dK(NormalUserFooterPreference.a(this.jEw).getUsername()));
    aXU();
    return;
    y(false, false);
  }

  protected final void aXW()
  {
    String str = NormalUserFooterPreference.a(this.jEw).getUsername();
    NormalUserFooterPreference.a(this.jEw).oA();
    bg.qW().oS().a(new bi(str));
    if (y.de(str))
    {
      bg.qW().oT().yz(str);
      bg.qW().oZ().xX(str);
    }
    label566: 
    while (true)
    {
      bg.qX().d(new k(5));
      if (NormalUserFooterPreference.n(this.jEw) != 0)
        break;
      Intent localIntent = new Intent(this.jEw.getContext(), LauncherUI.class);
      localIntent.addFlags(67108864);
      ((Activity)this.jEw.getContext()).startActivity(localIntent);
      return;
      this.ekQ = false;
      Context localContext = this.jEw.getContext();
      this.jEw.getContext().getString(n.buo);
      bw.a(str, new cp(this, e.a(localContext, this.jEw.getContext().getString(n.buA), true, new co(this))));
      bg.qW().oT().a(str, NormalUserFooterPreference.a(this.jEw));
      bg.qW().oW().yC(str);
      switch (NormalUserFooterPreference.k(this.jEw))
      {
      default:
      case 12:
      case 13:
      case 10:
      case 31:
      case 58:
      case 59:
      case 60:
      }
      while (true)
      {
        if (NormalUserFooterPreference.k(this.jEw) != 9)
          break label566;
        z.i("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "add scene unkown, check the contact getsource: " + NormalUserFooterPreference.a(this.jEw).getSource());
        switch (NormalUserFooterPreference.a(this.jEw).getSource())
        {
        case 11:
        case 12:
        default:
          break;
        case 10:
        case 13:
          z.i("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "delete the system contact info added by wechat");
          f.p(this.jEw.getContext(), str);
          break;
          ax localax = az.xe().gH(str);
          if (localax != null)
          {
            localax.dJ(1);
            az.xe().a(localax.wP(), localax);
            continue;
            com.tencent.mm.modelfriend.i locali = az.wZ().gl(str);
            if ((locali != null) && (!ap.jb(locali.vH())))
            {
              locali.setStatus(1);
              az.wZ().a(locali.vu(), locali);
            }
            f.p(this.jEw.getContext(), str);
            continue;
            f.p(this.jEw.getContext(), str);
            continue;
            com.tencent.mm.modelfriend.o localo = az.xa().gs(str);
            if (localo != null)
            {
              localo.setStatus(100);
              az.xa().a(localo);
              continue;
              az.xh().o(str, 2);
            }
          }
          break;
        }
      }
    }
    NormalUserFooterPreference.b(this.jEw).setResult(-1, NormalUserFooterPreference.b(this.jEw).getIntent().putExtra("_delete_ok_", true));
    ((Activity)this.jEw.getContext()).finish();
  }

  protected void ank()
  {
    aXT();
    aXV();
    NormalUserFooterPreference.e(this.jEw).setOnClickListener(new cv(this));
    NormalUserFooterPreference.f(this.jEw).setOnClickListener(new cw(this));
    NormalUserFooterPreference.g(this.jEw).setOnClickListener(new cx(this));
    NormalUserFooterPreference.h(this.jEw).setOnClickListener(new cy(this));
    NormalUserFooterPreference.i(this.jEw).setOnClickListener(new cz(this));
    NormalUserFooterPreference.j(this.jEw).setOnClickListener(new da(this));
  }

  protected void onDetach()
  {
  }

  protected final void y(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (paramBoolean2))
      return;
    NormalUserFooterPreference.b(this.jEw).a(0, h.WS, new cr(this, paramBoolean1, paramBoolean2));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cf
 * JD-Core Version:    0.6.2
 */
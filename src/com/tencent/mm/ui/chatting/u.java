package com.tencent.mm.ui.chatting;

import android.app.ProgressDialog;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.mm.ai.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.dy;

public final class u
  implements View.OnClickListener, m, com.tencent.mm.pluginsdk.model.app.x
{
  private ProgressDialog dWT;
  private hd eHX;

  public u(hd paramhd)
  {
    this.eHX = paramhd;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if ((this.dWT != null) && (this.dWT.isShowing()))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    bg.qX().b(1030, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      e.aw(this.eHX.h(), this.eHX.getString(n.bMG));
      return;
    }
    FragmentActivity localFragmentActivity = this.eHX.h();
    hd localhd = this.eHX;
    int i = n.cmj;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(localFragmentActivity, localhd.getString(i, arrayOfObject), 0).show();
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.pluginsdk.model.app.ac paramac)
  {
    z.d("!44@/B4Tb64lLpIspjrGglFY27cir3zuhRM08q/5rhpDM1Q=", "appsettings errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((this.dWT != null) && (this.dWT.isShowing()))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    bf.Uq().b(2, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      e.aw(this.eHX.h(), this.eHX.getString(n.bMG));
    while (dy.a(this.eHX.h(), paramInt1, paramInt2, paramString, 4))
      return;
    FragmentActivity localFragmentActivity = this.eHX.h();
    hd localhd = this.eHX;
    int i = n.bMl;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(localFragmentActivity, localhd.getString(i, arrayOfObject), 0).show();
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    if (paramView.getTag() == null)
    {
      z.e("!44@/B4Tb64lLpIspjrGglFY27cir3zuhRM08q/5rhpDM1Q=", "onClick tag is null");
      return;
    }
    ms localms;
    String str2;
    label74: int j;
    label99: String str3;
    if ((paramView.getTag() instanceof ms))
    {
      localms = (ms)paramView.getTag();
      if (localms == null)
      {
        z.e("!44@/B4Tb64lLpIspjrGglFY27cir3zuhRM08q/5rhpDM1Q=", "ItemDataTag is null");
        return;
      }
      str2 = localms.juZ.appId;
      if (ch.jb(str2))
      {
        z.e("!44@/B4Tb64lLpIspjrGglFY27cir3zuhRM08q/5rhpDM1Q=", "appId is null or nil");
        if (i == 0)
          break label261;
        bf.Uq().a(2, this);
        if (!this.eHX.jom)
          break label263;
        j = 2;
        str3 = this.eHX.aUL();
        if (!com.tencent.mm.model.y.dc(str3))
          break label467;
      }
    }
    label261: label263: label467: for (String str4 = bw.em(localms.cMM.getContent()); ; str4 = str3)
    {
      b localb = localms.juZ;
      e.a(this.eHX.h(), this.eHX.getString(n.btJ), this.eHX.getString(n.btK), this.eHX.getString(n.brr), this.eHX.getString(n.bXP), new x(this, localb, str4, j), new y(this, localb, str4, j));
      return;
      if (l.F(str2, false) == null)
      {
        z.e("!44@/B4Tb64lLpIspjrGglFY27cir3zuhRM08q/5rhpDM1Q=", "get null appinfo : appid = " + str2);
        i = 0;
        break label74;
      }
      i = 1;
      break label74;
      break;
      j = 1;
      break label99;
      if (!(paramView.getTag() instanceof ou))
        break;
      ou localou = (ou)paramView.getTag();
      if (localou == null)
      {
        z.e("!44@/B4Tb64lLpIspjrGglFY27cir3zuhRM08q/5rhpDM1Q=", "TemplateItemDataTag is null");
        return;
      }
      String str1 = this.eHX.aUL();
      if ((ch.jb(str1)) || (localou == null) || (ch.jb(localou.juE)) || (localou.cMM == null))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = str1;
        if (localou == null);
        for (boolean bool = true; ; bool = false)
        {
          arrayOfObject[1] = Boolean.valueOf(bool);
          z.e("!44@/B4Tb64lLpIspjrGglFY27cir3zuhRM08q/5rhpDM1Q=", "wrong args, fromUserName = %s, tag is null ? ", arrayOfObject);
          return;
        }
      }
      String[] arrayOfString = new String[3];
      arrayOfString[0] = this.eHX.h().getString(n.cmh);
      arrayOfString[1] = this.eHX.h().getString(n.cmi);
      arrayOfString[2] = this.eHX.h().getString(n.bsK);
      e.a(this.eHX.h(), null, arrayOfString, null, true, new v(this, str1, localou));
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.u
 * JD-Core Version:    0.6.2
 */
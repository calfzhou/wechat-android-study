package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.tencent.mm.d.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.q;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import java.util.HashMap;
import java.util.Map;

public class FacebookAuthUI extends MMPreference
  implements m
{
  public static final String[] iOf = { "publish_actions", "email" };
  private o dXi;
  private final Map elA = new HashMap();
  private com.tencent.mm.ui.c.a.e iNN;
  private ProgressDialog iNO;
  private DialogInterface.OnCancelListener iNP;
  private r iNQ;
  private boolean iOg = false;
  private boolean iOh = false;

  private void aQw()
  {
    this.dXi.removeAll();
    boolean bool;
    int i;
    if (this.iOg)
    {
      bool = false;
      if (this.elA.containsKey("facebook_auth_tip"))
      {
        Preference localPreference6 = (Preference)this.elA.get("facebook_auth_tip");
        if (!bool)
          break label169;
        i = n.bGL;
        label57: localPreference6.setTitle(i);
        this.dXi.a(localPreference6);
      }
      if (this.elA.containsKey("facebook_auth_cat"))
      {
        Preference localPreference5 = (Preference)this.elA.get("facebook_auth_cat");
        this.dXi.a(localPreference5);
      }
      if (bool)
        break label177;
      if (this.elA.containsKey("facebook_auth_bind_btn"))
      {
        Preference localPreference4 = (Preference)this.elA.get("facebook_auth_bind_btn");
        this.dXi.a(localPreference4);
      }
    }
    label169: label177: 
    do
    {
      return;
      bool = com.tencent.mm.model.x.qc();
      break;
      i = n.bGF;
      break label57;
      if (this.elA.containsKey("facebook_auth_account"))
      {
        Preference localPreference3 = (Preference)this.elA.get("facebook_auth_account");
        localPreference3.setTitle(getString(n.bGH) + bg.qW().oQ().get(65826));
        this.dXi.a(localPreference3);
      }
      if (this.elA.containsKey("facebook_auth_cat2"))
      {
        Preference localPreference2 = (Preference)this.elA.get("facebook_auth_cat2");
        this.dXi.a(localPreference2);
      }
    }
    while (!this.elA.containsKey("facebook_auth_unbind_btn"));
    Preference localPreference1 = (Preference)this.elA.get("facebook_auth_unbind_btn");
    this.dXi.a(localPreference1);
  }

  protected final void DP()
  {
    this.iOg = getIntent().getBooleanExtra("is_force_unbind", false);
    this.iNN = new com.tencent.mm.ui.c.a.e("290293790992170");
    this.iNP = new s(this);
    this.dXi.addPreferencesFromResource(q.czA);
    Preference localPreference1 = this.dXi.BU("facebook_auth_tip");
    if (localPreference1 != null)
      this.elA.put("facebook_auth_tip", localPreference1);
    Preference localPreference2 = this.dXi.BU("facebook_auth_cat");
    if (localPreference2 != null)
      this.elA.put("facebook_auth_cat", localPreference2);
    Preference localPreference3 = this.dXi.BU("facebook_auth_bind_btn");
    if (localPreference3 != null)
      this.elA.put("facebook_auth_bind_btn", localPreference3);
    Preference localPreference4 = this.dXi.BU("facebook_auth_account");
    if (localPreference4 != null)
      this.elA.put("facebook_auth_account", localPreference4);
    Preference localPreference5 = this.dXi.BU("facebook_auth_cat2");
    if (localPreference5 != null)
      this.elA.put("facebook_auth_cat2", localPreference5);
    Preference localPreference6 = this.dXi.BU("facebook_auth_unbind_btn");
    if (localPreference6 != null)
      this.elA.put("facebook_auth_unbind_btn", localPreference6);
    a(new t(this));
  }

  public final int DZ()
  {
    return q.czA;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (paramx.getType() == 254)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.iNQ = new r(0, "");
        bg.qX().d(this.iNQ);
      }
    while (paramx.getType() != 183)
    {
      a locala2;
      do
      {
        return;
        if (this.iNO != null)
          this.iNO.dismiss();
        if (paramInt2 == -82)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceS, n.buo, new w(this));
          return;
        }
        if (paramInt2 == -83)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceP, n.buo, new x(this));
          return;
        }
        if (paramInt2 == -84)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceQ, n.buo, new y(this));
          return;
        }
        if (paramInt2 == -85)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceO, n.buo, new z(this));
          return;
        }
        if (paramInt2 == -86)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceU, n.buo, new aa(this));
          return;
        }
        if (paramInt2 == -106)
        {
          com.tencent.mm.platformtools.ac.s(this, paramString);
          return;
        }
        locala2 = a.ct(paramString);
      }
      while ((locala2 == null) || (locala2.cCB == 4));
      locala2.a(this, null, null);
      return;
    }
    if (this.iNO != null)
      this.iNO.dismiss();
    int i = ((r)paramx).wy();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (i == 0);
      for (int m = n.bBz; ; m = n.bBw)
      {
        Toast.makeText(this, m, 1).show();
        this.iOg = false;
        aQw();
        if (i != 1)
          break;
        bg.qW().oW().yC("facebookapp");
        bg.qW().oV().zw("facebookapp");
        this.iOh = true;
        return;
      }
    }
    if ((paramInt1 == 4) && (paramInt2 == -67))
    {
      Toast.makeText(this, n.bGI, 1).show();
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -5))
    {
      if (i == 1);
      for (int k = n.bGE; ; k = n.bGJ)
      {
        Toast.makeText(this, k, 1).show();
        return;
      }
    }
    if (paramInt2 == -106)
    {
      com.tencent.mm.platformtools.ac.s(this, paramString);
      return;
    }
    a locala1 = a.ct(paramString);
    if ((locala1 != null) && (locala1.cCB != 4))
    {
      locala1.a(this, null, null);
      return;
    }
    if (i == 0);
    for (int j = n.bBy; ; j = n.bBv)
    {
      Toast.makeText(this, j, 1).show();
      return;
    }
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKNEztPnVXezyEM445BVS+m", "onPreferenceTreeClick, key is null");
      return true;
    }
    if (str.equals("facebook_auth_bind_btn"));
    try
    {
      this.iNN.cz(this);
      label38: this.iNN = new com.tencent.mm.ui.c.a.e("290293790992170");
      this.iNN.a(this, iOf, new ab(this, (byte)0));
      return true;
      if (str.equals("facebook_auth_unbind_btn"))
      {
        com.tencent.mm.ui.base.e.a(this, n.bGK, n.buo, new u(this), new v(this));
        return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      break label38;
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.iNN.c(paramInt1, paramInt2, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dXi = aTL();
    DP();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("bind_facebook_succ", this.iOh);
      setResult(-1, localIntent);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
    bg.qX().b(183, this);
    bg.qX().b(254, this);
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(183, this);
    bg.qX().a(254, this);
    aQw();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.FacebookAuthUI
 * JD-Core Version:    0.6.2
 */
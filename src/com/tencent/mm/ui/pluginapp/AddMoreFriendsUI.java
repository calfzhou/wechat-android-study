package com.tencent.mm.ui.pluginapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.tencent.mm.am.a;
import com.tencent.mm.f.d;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.al;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.a.xb;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceInfoCategory;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.mm.ui.dy;
import com.tencent.mm.ui.setting.gc;
import java.io.IOException;

public class AddMoreFriendsUI extends MMPreference
  implements m
{
  private ProgressDialog dWT = null;
  private o dXi;
  private String eRA;
  private gc jKC = null;

  protected final void DP()
  {
    oP(com.tencent.mm.n.brC);
    this.dXi = aTL();
    a(new e(this));
  }

  public final int DZ()
  {
    return q.cyU;
  }

  public final int It()
  {
    return 1;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    int i = 1;
    z.i("!44@/B4Tb64lLpLqT/jyR3Ne60bF7Di5zYl4XVG7HMEYQIA=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (dy.a(aPI(), paramInt1, paramInt2, paramString, 7))
      return;
    if ((paramInt1 == 4) && (paramInt2 == -4))
    {
      com.tencent.mm.ui.base.e.b(aPI(), com.tencent.mm.n.bsm, com.tencent.mm.n.buo);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Toast.makeText(this, getString(com.tencent.mm.n.bLc), 0).show();
      int j = com.tencent.mm.n.bLb;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[i] = Integer.valueOf(paramInt2);
      z.w("!44@/B4Tb64lLpLqT/jyR3Ne60bF7Di5zYl4XVG7HMEYQIA=", getString(j, arrayOfObject));
      return;
    }
    xb localxb = ((al)paramx).zG();
    if (localxb.ibK > 0)
    {
      Intent localIntent1 = new Intent();
      localIntent1.setClass(aPI(), ContactSearchResultUI.class);
      try
      {
        localIntent1.putExtra("result", localxb.toByteArray());
        startActivity(localIntent1);
        return;
      }
      catch (IOException localIOException)
      {
        return;
      }
    }
    String str1 = ai.a(localxb.hVf);
    String str2 = this.eRA;
    if (ch.iW(str2));
    while (true)
    {
      Intent localIntent2 = new Intent();
      s.a(localIntent2, localxb, i);
      localIntent2.setClass(aPI(), ContactInfoUI.class);
      if (ch.ja(str1).length() <= 0)
        break;
      if ((0x8 & localxb.ifO) > 0)
        com.tencent.mm.plugin.f.c.n.fTF.q(10298, str1 + "," + i);
      startActivity(localIntent2);
      return;
      if (ch.iX(str2))
      {
        i = 2;
      }
      else
      {
        ch.iY(str2);
        i = 3;
      }
    }
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    if ("find_friends_by_qrcode".equals(paramPreference.getKey()))
    {
      Intent localIntent1 = new Intent();
      localIntent1.putExtra("BaseScanUI_select_scan_mode", 1);
      localIntent1.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
      localIntent1.setFlags(65536);
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(1);
      localn1.d(11265, arrayOfObject1);
      a.b(this, "scanner", ".ui.BaseScanUI", localIntent1);
      return true;
    }
    if ("find_friends_by_other_way".equals(paramPreference.getKey()))
    {
      startActivity(new Intent(this, AddMoreFriendsByOtherWayUI.class));
      return true;
    }
    if ("find_friends_by_web".equals(paramPreference.getKey()))
    {
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("Contact_Scene", 39);
      a.b(this, "brandservice", ".ui.SearchOrRecommendBizUI", localIntent2);
      return true;
    }
    if ("find_friends_by_radar".equals(paramPreference.getKey()))
    {
      a.l(this, "radar", ".ui.RadarSearchUI");
      return true;
    }
    if ("find_friends_create_pwdgroup".equals(paramPreference.getKey()))
    {
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(1);
      localn2.d(11140, arrayOfObject2);
      a.l(this, "pwdgroup", ".ui.FacingCreateChatRoomAllInONeUI");
      return true;
    }
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jKC = new gc(this, com.tencent.mm.model.x.pG());
    this.jKC.onCreate();
    DP();
  }

  public void onDestroy()
  {
    this.jKC.onDestroy();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
    bg.qX().b(106, this);
  }

  public void onResume()
  {
    super.onResume();
    bg.qX().a(106, this);
    AddFriendItemPreference localAddFriendItemPreference1;
    int j;
    label77: label93: String str1;
    String str3;
    String str4;
    label212: Object localObject;
    if (!a.to("brandservice"))
    {
      this.dXi.R("find_friends_by_web", true);
      localAddFriendItemPreference1 = (AddFriendItemPreference)this.dXi.BU("find_friends_by_other_way");
      if (localAddFriendItemPreference1 != null)
      {
        if (((0x1000000 & com.tencent.mm.model.x.pO()) == 16777216) || (!d.on()))
          break label343;
        j = 1;
        if (j == 0)
          break label349;
        localAddFriendItemPreference1.setTitle(getString(com.tencent.mm.n.cDj));
      }
      this.dXi.notifyDataSetChanged();
      AddFriendSearchPreference localAddFriendSearchPreference = (AddFriendSearchPreference)this.dXi.BU("find_friends_by_input");
      localAddFriendSearchPreference.sK(getString(com.tencent.mm.n.bDu));
      localAddFriendSearchPreference.p(new f(this));
      PreferenceInfoCategory localPreferenceInfoCategory = (PreferenceInfoCategory)this.dXi.BU("find_friends_info");
      str1 = com.tencent.mm.model.x.pG();
      String str2 = com.tencent.mm.model.x.pH();
      str3 = be.AV((String)bg.qW().oQ().get(6));
      if (ch.jb(str2))
        break label363;
      str4 = getString(com.tencent.mm.n.bJh, new Object[] { str2 });
      localPreferenceInfoCategory.setTitle(str4);
      localPreferenceInfoCategory.iMv = h.aGm;
      g localg = new g(this);
      localPreferenceInfoCategory.m(localg);
      localPreferenceInfoCategory.n(localg);
      localObject = bg.qW().oQ().get(262151, Boolean.valueOf(true));
      if (!(localObject instanceof Boolean))
        break label453;
    }
    label453: for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = true)
    {
      AddFriendItemPreference localAddFriendItemPreference2 = (AddFriendItemPreference)this.dXi.BU("find_friends_create_pwdgroup");
      if (bool)
      {
        localAddFriendItemPreference2.aq(getString(com.tencent.mm.n.btN), h.Xq);
        localAddFriendItemPreference2.pT(0);
        return;
        this.dXi.R("find_friends_by_web", false);
        break;
        label343: j = 0;
        break label77;
        label349: localAddFriendItemPreference1.setTitle(getString(com.tencent.mm.n.bJc));
        break label93;
        label363: if (!i.yd(str1))
        {
          str4 = getString(com.tencent.mm.n.bJh, new Object[] { str1 });
          break label212;
        }
        if (!ch.jb(str3))
        {
          int i = com.tencent.mm.n.bJi;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = be.AU(str3);
          str4 = getString(i, arrayOfObject);
          break label212;
        }
        str4 = getString(com.tencent.mm.n.bJj);
        break label212;
      }
      localAddFriendItemPreference2.pT(8);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.AddMoreFriendsUI
 * JD-Core Version:    0.6.2
 */
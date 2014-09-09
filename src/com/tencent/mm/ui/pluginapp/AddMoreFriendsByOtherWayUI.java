package com.tencent.mm.ui.pluginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.modelfriend.ac;
import com.tencent.mm.n;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.bindgooglecontact.BindGoogleContactUI;
import com.tencent.mm.ui.bindgooglecontact.GoogleFriendUI;
import com.tencent.mm.ui.bindlinkedin.ListLinkedInFriendUI;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindmobile.MobileFriendUI;
import com.tencent.mm.ui.bindqq.BindQQUI;
import com.tencent.mm.ui.bindqq.QQGroupUI;

public class AddMoreFriendsByOtherWayUI extends MMPreference
{
  private o dXi;

  protected final void DP()
  {
    oP(n.brC);
    this.dXi = aTL();
    a(new d(this));
    if (((0x1000000 & x.pO()) != 16777216) && (com.tencent.mm.f.d.on()))
    {
      this.dXi.R("find_friends_by_linkedin", false);
      return;
    }
    this.dXi.R("find_friends_by_linkedin", true);
  }

  public final int DZ()
  {
    return q.cyV;
  }

  public final int It()
  {
    return 1;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramPreference.getKey();
    z.d("!56@/B4Tb64lLpLqT/jyR3Ne6yBmakiWwoBBqMRCY8T+7R+983xljKzUqg==", "click %s", arrayOfObject);
    if ("find_friends_by_qq".equals(paramPreference.getKey()))
    {
      int i = ch.a((Integer)bg.qW().oQ().get(9));
      int j = 0;
      if (i != 0)
        j = 1;
      if (j == 0)
        MMWizardActivity.j(this, new Intent(this, BindQQUI.class));
      while (true)
      {
        return true;
        startActivity(new Intent(this, QQGroupUI.class));
      }
    }
    if ("find_friends_by_mobile".equals(paramPreference.getKey()))
    {
      if (aa.wb() != ab.dtS)
      {
        MMWizardActivity.j(this, new Intent(this, BindMContactIntroUI.class));
        return true;
      }
      startActivity(new Intent(this, MobileFriendUI.class));
      return true;
    }
    if ("find_friends_by_google_account".equals(paramPreference.getKey()))
    {
      if (!ac.wi())
      {
        Intent localIntent2 = new Intent(this, BindGoogleContactUI.class);
        localIntent2.putExtra("enter_scene", 1);
        MMWizardActivity.j(this, localIntent2);
        return true;
      }
      Intent localIntent3 = new Intent(this, GoogleFriendUI.class);
      localIntent3.putExtra("enter_scene", 1);
      startActivity(localIntent3);
      return true;
    }
    if ("find_friends_by_linkedin".equals(paramPreference.getKey()))
    {
      Intent localIntent1 = new Intent(this, ListLinkedInFriendUI.class);
      localIntent1.putExtra("KScene", 1);
      startActivity(localIntent1);
      return true;
    }
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    if ((IconPreference)this.dXi.BU("find_friends_by_google_account") != null)
      if ((0x800000 & x.pO()) != 0)
        break label64;
    label64: for (int i = 1; ; i = 0)
    {
      if ((i == 0) || (!ch.ys()))
        this.dXi.BV("find_friends_by_google_account");
      this.dXi.notifyDataSetChanged();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.AddMoreFriendsByOtherWayUI
 * JD-Core Version:    0.6.2
 */
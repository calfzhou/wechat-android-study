package com.tencent.mm.plugin.accountsync.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.friend.RecommendFriendUI;

public class InviteRecommendChoiceUI extends MMPreference
{
  private o dXi;

  protected final void DP()
  {
    oP(n.ceb);
    this.dXi = aTL();
    IconPreference localIconPreference1 = (IconPreference)this.dXi.BU("settings_invite_facebook_friends");
    this.dXi.b(localIconPreference1);
    IconPreference localIconPreference2 = (IconPreference)this.dXi.BU("settings_invite_qq_friends");
    if (x.pF() == 0)
      this.dXi.b(localIconPreference2);
    IconPreference localIconPreference3 = (IconPreference)this.dXi.BU("settings_recommend_by_mail");
    if (x.pF() == 0)
      this.dXi.b(localIconPreference3);
    IconPreference localIconPreference4 = (IconPreference)this.dXi.BU("settings_recommend_by_mb");
    if (bg.qW().oY().zX("@t.qq.com") == null)
      this.dXi.b(localIconPreference4);
    a(new t(this));
  }

  protected final boolean DY()
  {
    return false;
  }

  public final int DZ()
  {
    return q.czD;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str.equals("settings_invite_qq_friends"))
    {
      Intent localIntent1 = new Intent(this, RecommendFriendUI.class);
      localIntent1.putExtra("recommend_type", Integer.toString(0));
      startActivity(localIntent1);
    }
    do
    {
      return false;
      if (str.equals("settings_recommend_by_mail"))
      {
        Intent localIntent2 = new Intent(this, RecommendFriendUI.class);
        localIntent2.putExtra("recommend_type", Integer.toString(2));
        startActivity(localIntent2);
        return false;
      }
      if (str.equals("settings_recommend_by_mb"))
      {
        Intent localIntent3 = new Intent(this, RecommendFriendUI.class);
        localIntent3.putExtra("recommend_type", Integer.toString(1));
        startActivity(localIntent3);
        return false;
      }
      if (str.equals("settings_invite_mobile_friends"))
      {
        Intent localIntent4 = new Intent("android.intent.action.VIEW");
        int i = n.bPe;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = bg.qW().oQ().get(2);
        localIntent4.putExtra("sms_body", getString(i, arrayOfObject));
        localIntent4.setType("vnd.android-dir/mms-sms");
        if (ch.i(this, localIntent4))
        {
          startActivity(localIntent4);
          return false;
        }
        Toast.makeText(this, n.cdI, 1).show();
        return false;
      }
    }
    while (!str.equals("settings_invite_facebook_friends"));
    startActivity(new Intent(this, InviteFacebookFriendsUI.class));
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.InviteRecommendChoiceUI
 * JD-Core Version:    0.6.2
 */
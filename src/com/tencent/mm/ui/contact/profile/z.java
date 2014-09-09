package com.tencent.mm.ui.contact.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.ar.b;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference;
import com.tencent.mm.q;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.contact.FriendPreference;
import junit.framework.Assert;

public final class z
  implements a
{
  private final Context context;
  private o dXi;

  public z(Context paramContext)
  {
    this.context = paramContext;
  }

  public final boolean ID()
  {
    if (this.dXi == null);
    NormalUserFooterPreference localNormalUserFooterPreference;
    do
    {
      return true;
      FriendPreference localFriendPreference = (FriendPreference)this.dXi.BU("contact_info_friend");
      if (localFriendPreference != null)
        localFriendPreference.ID();
      NormalUserHeaderPreference localNormalUserHeaderPreference = (NormalUserHeaderPreference)this.dXi.BU("contact_info_header_normal");
      if (localNormalUserHeaderPreference != null)
        localNormalUserHeaderPreference.onDetach();
      localNormalUserFooterPreference = (NormalUserFooterPreference)this.dXi.BU("contact_info_footer_normal");
    }
    while (localNormalUserFooterPreference == null);
    localNormalUserFooterPreference.ID();
    return true;
  }

  public final boolean a(o paramo, i parami, boolean paramBoolean, int paramInt)
  {
    boolean bool1;
    boolean bool2;
    label28: boolean bool3;
    label40: KeyValuePreference localKeyValuePreference;
    if (parami != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (ap.ja(parami.getUsername()).length() <= 0)
        break label257;
      bool2 = true;
      Assert.assertTrue(bool2);
      if (paramo == null)
        break label263;
      bool3 = true;
      Assert.assertTrue(bool3);
      ID();
      this.dXi = paramo;
      paramo.removeAll();
      paramo.addPreferencesFromResource(q.czc);
      NormalUserHeaderPreference localNormalUserHeaderPreference = (NormalUserHeaderPreference)paramo.BU("contact_info_header_normal");
      if (localNormalUserHeaderPreference != null)
        localNormalUserHeaderPreference.a(parami, 0, null);
      NormalUserFooterPreference localNormalUserFooterPreference = (NormalUserFooterPreference)paramo.BU("contact_info_footer_normal");
      boolean bool4 = ((Activity)this.context).getIntent().getBooleanExtra("Contact_FMessageCard", false);
      if ((localNormalUserFooterPreference != null) && (!localNormalUserFooterPreference.a(parami, "", paramBoolean, false, true, 25, 0, bool4, false, 0L, "")))
        paramo.b(localNormalUserFooterPreference);
      localKeyValuePreference = (KeyValuePreference)paramo.BU("contact_info_signature");
      if ((parami.jo() == null) || (parami.jo().trim().equals("")))
        break label269;
      if (localKeyValuePreference != null)
      {
        localKeyValuePreference.fa(false);
        localKeyValuePreference.setTitle(this.context.getString(n.bDc));
        localKeyValuePreference.setSummary(b.e(this.context, parami.jo(), -2));
        localKeyValuePreference.fb(false);
      }
    }
    while (true)
    {
      return true;
      bool1 = false;
      break;
      label257: bool2 = false;
      break label28;
      label263: bool3 = false;
      break label40;
      label269: paramo.b(localKeyValuePreference);
    }
  }

  public final boolean ky(String paramString)
  {
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.z
 * JD-Core Version:    0.6.2
 */
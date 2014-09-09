package com.tencent.mm.ui.contact.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.v;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.c;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import java.util.List;
import junit.framework.Assert;

public final class ap
  implements com.tencent.mm.pluginsdk.b.a
{
  private Context context;
  private com.tencent.mm.ui.base.preference.o dXi;
  private i elz;
  private String etX;
  private com.tencent.mm.storage.b euc;
  private boolean fDb;
  private boolean jCQ;
  private int jDy;
  private ContactListExpandPreference jDz;
  private int jza;

  public ap(Context paramContext)
  {
    this.context = paramContext;
    this.jDz = new ContactListExpandPreference(paramContext, 0);
  }

  public final boolean ID()
  {
    if (this.jDz != null);
    NormalUserFooterPreference localNormalUserFooterPreference = (NormalUserFooterPreference)this.dXi.BU("contact_info_footer_normal");
    if (localNormalUserFooterPreference != null)
      localNormalUserFooterPreference.ID();
    return true;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.o paramo, i parami, boolean paramBoolean, int paramInt)
  {
    boolean bool1;
    boolean bool2;
    if (parami != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (com.tencent.mm.platformtools.ap.ja(parami.getUsername()).length() <= 0)
        break label361;
      bool2 = true;
      label28: Assert.assertTrue(bool2);
      if (paramo == null)
        break label367;
    }
    label361: label367: for (boolean bool3 = true; ; bool3 = false)
    {
      Assert.assertTrue(bool3);
      this.dXi = paramo;
      this.elz = parami;
      this.fDb = paramBoolean;
      this.jza = paramInt;
      this.jCQ = ((Activity)this.context).getIntent().getBooleanExtra("User_Verify", false);
      this.jDy = ((Activity)this.context).getIntent().getIntExtra("Kdel_from", -1);
      this.etX = parami.getUsername();
      this.euc = bg.qW().oZ().xT(this.etX);
      this.dXi.removeAll();
      PreferenceSmallCategory localPreferenceSmallCategory = new PreferenceSmallCategory(this.context);
      this.dXi.a(localPreferenceSmallCategory);
      this.jDz.setKey("roominfo_contact_anchor");
      this.dXi.a(this.jDz);
      PreferenceCategory localPreferenceCategory = new PreferenceCategory(this.context);
      this.dXi.a(localPreferenceCategory);
      NormalUserFooterPreference localNormalUserFooterPreference = new NormalUserFooterPreference(this.context);
      localNormalUserFooterPreference.setLayoutResource(k.bdz);
      localNormalUserFooterPreference.setKey("contact_info_footer_normal");
      if (localNormalUserFooterPreference.a(this.elz, "", this.fDb, this.jCQ, false, this.jza, this.jDy, false, false, 0L, ""))
        this.dXi.a(localNormalUserFooterPreference);
      this.jDz.a(this.dXi, this.jDz.getKey());
      List localList = v.cU(this.etX);
      this.jDz.jdMethod_do(false).dp(false);
      this.jDz.g(this.etX, localList);
      this.jDz.a(new aq(this));
      return true;
      bool1 = false;
      break;
      bool2 = false;
      break label28;
    }
  }

  public final boolean ky(String paramString)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXXdgfLU8sfBG5u/GmEk4khI=", "handleEvent " + paramString);
    i locali = bg.qW().oT().ys(paramString);
    if ((locali == null) || ((int)locali.dhv <= 0))
      return true;
    Intent localIntent = new Intent();
    localIntent.setClass(this.context, ContactInfoUI.class);
    localIntent.putExtra("Contact_User", locali.getUsername());
    this.context.startActivity(localIntent);
    return true;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ap
 * JD-Core Version:    0.6.2
 */
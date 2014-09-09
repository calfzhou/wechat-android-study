package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.modelfriend.ax;
import com.tencent.mm.modelfriend.ay;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;

public final class bb
{
  public static void a(Context paramContext, as paramas)
  {
    a(paramContext, paramas, false, false, null);
  }

  public static void a(Context paramContext, as paramas, boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    if ((paramContext == null) || (paramas == null))
      return;
    com.tencent.mm.storage.i locali = new com.tencent.mm.storage.i();
    locali.setUsername(paramas.aJQ());
    locali.aU(paramas.getDisplayName());
    locali.aV(paramas.iW());
    locali.aW(paramas.iX());
    a(paramContext, locali, paramas, paramBoolean1, paramBoolean2, paramBundle, paramas.aJX());
  }

  public static void a(Context paramContext, com.tencent.mm.storage.i parami, as paramas)
  {
    a(paramContext, parami, paramas, false, false, null, paramas.aJX());
  }

  public static void a(Context paramContext, com.tencent.mm.storage.i parami, as paramas, boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle, String paramString)
  {
    if ((parami == null) || (paramas == null));
    while ((parami.getUsername() == null) || (parami.getUsername().length() <= 0))
      return;
    Intent localIntent = new Intent(paramContext, ContactInfoUI.class);
    localIntent.putExtra("Contact_User", parami.getUsername());
    localIntent.putExtra("Contact_Alias", parami.iS());
    localIntent.putExtra("Contact_Nick", parami.oc());
    localIntent.putExtra("Contact_QuanPin", parami.iX());
    localIntent.putExtra("Contact_PyInitial", parami.iW());
    localIntent.putExtra("Contact_Sex", paramas.jj());
    localIntent.putExtra("Contact_Province", paramas.jp());
    localIntent.putExtra("Contact_City", paramas.jq());
    localIntent.putExtra("Contact_Signature", paramas.jo());
    localIntent.putExtra("Contact_Uin", paramas.aJT());
    localIntent.putExtra("Contact_Mobile_MD5", paramas.aJS());
    localIntent.putExtra("Contact_full_Mobile_MD5", paramas.aJV());
    localIntent.putExtra("Contact_QQNick", paramas.aJU());
    localIntent.putExtra("User_From_Fmessage", true);
    localIntent.putExtra("Contact_Scene", paramas.Ew());
    localIntent.putExtra("Contact_from_msgType", 40);
    if (paramBoolean1)
      localIntent.putExtra("Contact_ShowUserName", false);
    if (paramBoolean2)
      localIntent.putExtra("Contact_KSnsIFlag", 0);
    if (paramBundle != null)
      localIntent.putExtras(paramBundle);
    if (!TextUtils.isEmpty(paramString))
      localIntent.putExtra("verify_gmail", paramString);
    paramContext.startActivity(localIntent);
  }

  public static void b(Intent paramIntent, String paramString)
  {
    paramIntent.putExtra("Contact_User", paramString);
  }

  public static void c(Intent paramIntent, String paramString)
  {
    if ((paramIntent == null) || (paramString == null) || (paramString.length() == 0))
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXaBmRbjbiDBu1tUHfSZiWJU=", "setLocalQQMobile fail, intent = " + paramIntent + ", username = " + paramString);
    com.tencent.mm.modelfriend.i locali;
    do
    {
      return;
      ax localax = az.xe().gH(paramString);
      if (localax != null)
      {
        paramIntent.putExtra("Contact_Uin", localax.wP());
        paramIntent.putExtra("Contact_QQNick", localax.getDisplayName());
      }
      locali = az.wZ().gl(paramString);
    }
    while (locali == null);
    paramIntent.putExtra("Contact_Mobile_MD5", locali.vu());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bb
 * JD-Core Version:    0.6.2
 */
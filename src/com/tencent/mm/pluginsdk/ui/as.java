package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Base64;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

final class as
  implements DialogInterface.OnClickListener
{
  as(Context paramContext, String paramString1, String paramString2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Context localContext = this.dLL;
    String str1 = this.dTJ;
    String str2 = this.dpf;
    if (localContext == null)
    {
      z.w("!44@mGXR/vVzLfNQboDSwDDOvfffvGyAww6NFolKGe+wF9E=", "reportViaWap: context is null");
      return;
    }
    if (str1 == null)
      z.w("!44@mGXR/vVzLfNQboDSwDDOvfffvGyAww6NFolKGe+wF9E=", "reportViaWap: ip is null");
    if (str2 == null)
      z.w("!44@mGXR/vVzLfNQboDSwDDOvfffvGyAww6NFolKGe+wF9E=", "reportViaWap: errMsg is null");
    String str3 = (String)bg.qW().oQ().get(2);
    String str4 = "http://w.mail.qq.com/cgi-bin/mmfeedback?t=mmfeedback&f=xhtml" + "&u=" + Base64.encodeToString(str3.getBytes(), 8);
    String str5 = str4 + "&i=" + Base64.encodeToString(ch.Y(str1, "").getBytes(), 8);
    String str6 = str5 + "&e=" + Base64.encodeToString(ch.Y(str2, "").getBytes(), 8);
    String str7 = str6 + "&autologin=n";
    z.d("!44@mGXR/vVzLfNQboDSwDDOvfffvGyAww6NFolKGe+wF9E=", "upload error to " + str7);
    ch.t(localContext, str7);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.as
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.modelfriend;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.e;
import java.net.URLEncoder;
import java.util.List;
import org.apache.http.NameValuePair;

public final class ac
{
  public static boolean A(Context paramContext)
  {
    Intent localIntent1 = new Intent("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
    Intent localIntent2 = new Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT");
    return (paramContext.getPackageManager().resolveActivity(localIntent2, 0) != null) && (paramContext.getPackageManager().resolveActivity(localIntent1, 0) != null) && (Build.VERSION.SDK_INT >= 8) && (!paramContext.getSharedPreferences(ak.aHi(), 0).getBoolean("googleauth", false));
  }

  public static String n(List paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      NameValuePair localNameValuePair = (NameValuePair)paramList.get(j);
      if (!TextUtils.isEmpty(localNameValuePair.getName()))
      {
        if (j != 0)
          localStringBuilder.append("&");
        localStringBuilder.append(URLEncoder.encode(localNameValuePair.getName(), "UTF-8"));
        localStringBuilder.append("=");
        if (!TextUtils.isEmpty(localNameValuePair.getValue()))
          localStringBuilder.append(URLEncoder.encode(localNameValuePair.getValue(), "UTF-8"));
      }
    }
    return localStringBuilder.toString();
  }

  public static boolean wi()
  {
    return !TextUtils.isEmpty((String)bg.qW().oQ().get(208903));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ac
 * JD-Core Version:    0.6.2
 */
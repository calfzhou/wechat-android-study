package com.tencent.mm.sdk.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class a
{
  public static boolean a(Context paramContext, b paramb)
  {
    if (paramContext == null)
    {
      z.e("!44@/B4Tb64lLpIcVJc/YDTTqHums7mERtmpK2BGs1em8ao=", "send fail, invalid argument");
      return false;
    }
    if (ch.jb(paramb.iCY))
    {
      z.e("!44@/B4Tb64lLpIcVJc/YDTTqHums7mERtmpK2BGs1em8ao=", "send fail, invalid targetPkgName, targetPkgName = " + paramb.iCY);
      return false;
    }
    if (ch.jb(paramb.iCZ))
      paramb.iCZ = (paramb.iCY + ".wxapi.WXEntryActivity");
    z.d("!44@/B4Tb64lLpIcVJc/YDTTqHums7mERtmpK2BGs1em8ao=", "send, targetPkgName = " + paramb.iCY + ", targetClassName = " + paramb.iCZ);
    Intent localIntent = new Intent();
    localIntent.setClassName(paramb.iCY, paramb.iCZ);
    if (paramb.iDa != null)
      localIntent.putExtras(paramb.iDa);
    String str1 = paramContext.getPackageName();
    localIntent.putExtra("_mmessage_sdkVersion", 570490883);
    localIntent.putExtra("_mmessage_appPackage", str1);
    localIntent.putExtra("_mmessage_content", paramb.content);
    String str2 = paramb.content;
    StringBuffer localStringBuffer = new StringBuffer();
    if (str2 != null)
      localStringBuffer.append(str2);
    localStringBuffer.append(570490883);
    localStringBuffer.append(str1);
    localStringBuffer.append("mMcShCsTr");
    localIntent.putExtra("_mmessage_checksum", f.d(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes());
    if (paramb.flags == -1)
      localIntent.addFlags(268435456).addFlags(134217728);
    try
    {
      while (true)
      {
        paramContext.startActivity(localIntent);
        z.d("!44@/B4Tb64lLpIcVJc/YDTTqHums7mERtmpK2BGs1em8ao=", "send mm message, intent=" + localIntent);
        return true;
        localIntent.setFlags(paramb.flags);
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      z.e("!44@/B4Tb64lLpIcVJc/YDTTqHums7mERtmpK2BGs1em8ao=", "send fail, ex = %s", arrayOfObject);
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.a.a
 * JD-Core Version:    0.6.2
 */
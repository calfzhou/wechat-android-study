package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class aa extends x
{
  public final String Dz()
  {
    return "http://softroute.map.qq.com/downloadfile?cid=00008&referer=wx_client";
  }

  public final String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    if ((paramContext == null) || (paramResolveInfo == null) || (paramResolveInfo.activityInfo == null));
    CharSequence localCharSequence;
    do
    {
      return null;
      localCharSequence = paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager());
    }
    while (localCharSequence == null);
    String str = localCharSequence.toString();
    Matcher localMatcher = Pattern.compile("\\(.*推荐.*\\)", 2).matcher(str);
    if (localMatcher.find())
      return localMatcher.replaceAll("");
    return localCharSequence.toString();
  }

  public final String ayA()
  {
    return "TencentMap.apk";
  }

  public final boolean bb(Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("sosomap://type=nav"));
    List localList = paramContext.getPackageManager().queryIntentActivities(localIntent, 0);
    if ((localList != null) && (localList.size() > 0))
    {
      int i = localList.size();
      for (int j = 0; j < i; j++)
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localList.get(j);
        if ((localResolveInfo != null) && (localResolveInfo.activityInfo != null) && ("com.tencent.map".equals(localResolveInfo.activityInfo.packageName)))
          return true;
      }
    }
    return false;
  }

  public final boolean uS(String paramString)
  {
    return (paramString != null) && ("com.tencent.map".equals(paramString));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.aa
 * JD-Core Version:    0.6.2
 */
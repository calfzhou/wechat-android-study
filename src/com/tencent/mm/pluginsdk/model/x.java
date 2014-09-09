package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

public abstract class x
{
  public abstract String Dz();

  public String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    return paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager()).toString();
  }

  public abstract String ayA();

  public abstract boolean bb(Context paramContext);

  public boolean h(Context paramContext, Intent paramIntent)
  {
    return false;
  }

  public abstract boolean uS(String paramString);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.x
 * JD-Core Version:    0.6.2
 */
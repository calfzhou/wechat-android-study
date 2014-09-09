package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

abstract interface ab
{
  public abstract Intent a(Activity paramActivity);

  public abstract String a(Context paramContext, ActivityInfo paramActivityInfo);

  public abstract boolean a(Activity paramActivity, Intent paramIntent);

  public abstract void b(Activity paramActivity, Intent paramIntent);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.ab
 * JD-Core Version:    0.6.2
 */
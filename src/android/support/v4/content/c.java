package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class c
{
  private static final d df = new e();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 15)
    {
      df = new g();
      return;
    }
    if (i >= 11)
    {
      df = new f();
      return;
    }
  }

  public static Intent makeMainActivity(ComponentName paramComponentName)
  {
    return df.makeMainActivity(paramComponentName);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.content.c
 * JD-Core Version:    0.6.2
 */
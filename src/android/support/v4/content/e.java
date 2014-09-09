package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

class e
  implements d
{
  public Intent makeMainActivity(ComponentName paramComponentName)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN");
    localIntent.setComponent(paramComponentName);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    return localIntent;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.content.e
 * JD-Core Version:    0.6.2
 */
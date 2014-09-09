package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public final class at
  implements Iterable
{
  private static final av cV = new aw();
  private final ArrayList cW = new ArrayList();
  private final Context cX;

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      cV = new ax();
      return;
    }
  }

  private at(Context paramContext)
  {
    this.cX = paramContext;
  }

  private at a(ComponentName paramComponentName)
  {
    int i = this.cW.size();
    try
    {
      Intent localIntent;
      for (Object localObject = aa.a(this.cX, paramComponentName); localObject != null; localObject = localIntent)
      {
        this.cW.add(i, localObject);
        localIntent = aa.a(this.cX, ((Intent)localObject).getComponent());
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new IllegalArgumentException(localNameNotFoundException);
    }
    return this;
  }

  public static at b(Context paramContext)
  {
    return new at(paramContext);
  }

  public final at c(Activity paramActivity)
  {
    boolean bool = paramActivity instanceof au;
    Intent localIntent1 = null;
    if (bool)
      localIntent1 = ((au)paramActivity).N();
    if (localIntent1 == null);
    for (Intent localIntent2 = aa.a(paramActivity); ; localIntent2 = localIntent1)
    {
      if (localIntent2 != null)
      {
        ComponentName localComponentName = localIntent2.getComponent();
        if (localComponentName == null)
          localComponentName = localIntent2.resolveActivity(this.cX.getPackageManager());
        a(localComponentName);
        this.cW.add(localIntent2);
      }
      return this;
    }
  }

  public final Iterator iterator()
  {
    return this.cW.iterator();
  }

  public final void startActivities()
  {
    int i = 1;
    if (this.cW.isEmpty())
      throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    Intent[] arrayOfIntent = (Intent[])this.cW.toArray(new Intent[this.cW.size()]);
    arrayOfIntent[0] = new Intent(arrayOfIntent[0]).addFlags(268484608);
    Context localContext = this.cX;
    int j = Build.VERSION.SDK_INT;
    if (j >= 16)
      localContext.startActivities(arrayOfIntent, null);
    while (true)
    {
      if (i == 0)
      {
        Intent localIntent = new Intent(arrayOfIntent[(-1 + arrayOfIntent.length)]);
        localIntent.addFlags(268435456);
        this.cX.startActivity(localIntent);
      }
      return;
      if (j >= 11)
        localContext.startActivities(arrayOfIntent);
      else
        i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.at
 * JD-Core Version:    0.6.2
 */
package android.support.v7.internal.view;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

final class d
  implements MenuItem.OnMenuItemClickListener
{
  private static final Class[] iU = { MenuItem.class };
  private Object iT;
  private Method iV;

  public d(Object paramObject, String paramString)
  {
    this.iT = paramObject;
    Class localClass = paramObject.getClass();
    try
    {
      this.iV = localClass.getMethod(paramString, iU);
      return;
    }
    catch (Exception localException)
    {
      InflateException localInflateException = new InflateException("Couldn't resolve menu item onClick handler " + paramString + " in class " + localClass.getName());
      localInflateException.initCause(localException);
      throw localInflateException;
    }
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    try
    {
      if (this.iV.getReturnType() == Boolean.TYPE)
        return ((Boolean)this.iV.invoke(this.iT, new Object[] { paramMenuItem })).booleanValue();
      this.iV.invoke(this.iT, new Object[] { paramMenuItem });
      return true;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.d
 * JD-Core Version:    0.6.2
 */
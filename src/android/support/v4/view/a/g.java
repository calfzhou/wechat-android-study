package android.support.v4.view.a;

import android.os.Build.VERSION;
import java.util.List;

public final class g
{
  private static final h fN = new k();
  private final Object fO;

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      fN = new i();
      return;
    }
  }

  public g()
  {
    this.fO = fN.a(this);
  }

  public g(Object paramObject)
  {
    this.fO = paramObject;
  }

  public static a al()
  {
    return null;
  }

  public static boolean am()
  {
    return false;
  }

  public static List an()
  {
    return null;
  }

  public final Object ak()
  {
    return this.fO;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.g
 * JD-Core Version:    0.6.2
 */
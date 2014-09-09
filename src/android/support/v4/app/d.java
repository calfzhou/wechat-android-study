package android.support.v4.app;

import android.view.View;

final class d
  implements k
{
  d(Fragment paramFragment)
  {
  }

  public final View findViewById(int paramInt)
  {
    if (this.aS.aL == null)
      throw new IllegalStateException("Fragment does not have a view");
    return this.aS.aL.findViewById(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.d
 * JD-Core Version:    0.6.2
 */
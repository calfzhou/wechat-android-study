package android.support.v7.app;

import android.support.v7.internal.view.menu.o;

final class g
  implements Runnable
{
  g(f paramf)
  {
  }

  public final void run()
  {
    o localo = f.a(this.hT);
    if ((this.hT.hE.a(0, localo)) && (this.hT.hE.a(0, null, localo)))
      f.a(this.hT, localo);
    while (true)
    {
      f.b(this.hT);
      return;
      f.a(this.hT, null);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.g
 * JD-Core Version:    0.6.2
 */
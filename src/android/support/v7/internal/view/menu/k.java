package android.support.v7.internal.view.menu;

import android.os.Build.VERSION;
import android.support.v4.a.a.b;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

abstract class k extends l
{
  private HashMap kC;
  private HashMap kD;

  k(Object paramObject)
  {
    super(paramObject);
  }

  final void A(int paramInt)
  {
    if (this.kC == null);
    Iterator localIterator;
    do
    {
      return;
      while (!localIterator.hasNext())
        localIterator = this.kC.keySet().iterator();
    }
    while (paramInt != ((MenuItem)localIterator.next()).getItemId());
    localIterator.remove();
  }

  final SubMenu a(SubMenu paramSubMenu)
  {
    if (paramSubMenu != null)
    {
      if (this.kD == null)
        this.kD = new HashMap();
      Object localObject = (SubMenu)this.kD.get(paramSubMenu);
      if (localObject == null)
      {
        if (Build.VERSION.SDK_INT >= 14)
        {
          localObject = new al(paramSubMenu);
          this.kD.put(paramSubMenu, localObject);
        }
      }
      else
        return localObject;
      throw new UnsupportedOperationException();
    }
    return null;
  }

  final void bE()
  {
    if (this.kC != null)
      this.kC.clear();
    if (this.kD != null)
      this.kD.clear();
  }

  final b h(MenuItem paramMenuItem)
  {
    if (paramMenuItem != null)
    {
      if (this.kC == null)
        this.kC = new HashMap();
      Object localObject = (b)this.kC.get(paramMenuItem);
      if (localObject == null)
        if (Build.VERSION.SDK_INT < 16)
          break label67;
      for (localObject = new aa(paramMenuItem); ; localObject = new u(paramMenuItem))
      {
        this.kC.put(paramMenuItem, localObject);
        return localObject;
        label67: if (Build.VERSION.SDK_INT < 14)
          break;
      }
      throw new UnsupportedOperationException();
    }
    return null;
  }

  final void z(int paramInt)
  {
    if (this.kC == null);
    while (true)
    {
      return;
      Iterator localIterator = this.kC.keySet().iterator();
      while (localIterator.hasNext())
        if (paramInt == ((MenuItem)localIterator.next()).getGroupId())
          localIterator.remove();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.k
 * JD-Core Version:    0.6.2
 */
package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.tencent.mm.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class o
  implements a
{
  private static final int[] kW = { 1, 4, 5, 3, 2, 0 };
  private ArrayList eD;
  private final Resources kX;
  private boolean kY;
  private boolean kZ;
  private p la;
  private ArrayList lb;
  private boolean ld;
  private ArrayList le;
  private ArrayList lf;
  private boolean lg;
  private int lh = 0;
  private ContextMenu.ContextMenuInfo li;
  CharSequence lj;
  Drawable lk;
  View ll;
  private boolean lm = false;
  private boolean ln = false;
  private boolean lo = false;
  private boolean lp = false;
  private ArrayList lq = new ArrayList();
  private CopyOnWriteArrayList lr = new CopyOnWriteArrayList();
  private s ls;
  private final Context mContext;

  public o(Context paramContext)
  {
    this.mContext = paramContext;
    this.kX = paramContext.getResources();
    this.eD = new ArrayList();
    this.lb = new ArrayList();
    this.ld = i;
    this.le = new ArrayList();
    this.lf = new ArrayList();
    this.lg = i;
    if ((this.kX.getConfiguration().keyboard != i) && (this.kX.getBoolean(e.NN)));
    while (true)
    {
      this.kZ = i;
      return;
      i = 0;
    }
  }

  private static int a(ArrayList paramArrayList, int paramInt)
  {
    for (int i = -1 + paramArrayList.size(); i >= 0; i--)
      if (((s)paramArrayList.get(i)).getOrdering() <= paramInt)
        return i + 1;
    return 0;
  }

  private s a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.lq;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    s locals;
    if (localArrayList.isEmpty())
      locals = null;
    label181: 
    while (true)
    {
      return locals;
      int i = paramKeyEvent.getMetaState();
      KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
      paramKeyEvent.getKeyData(localKeyData);
      int j = localArrayList.size();
      if (j == 1)
        return (s)localArrayList.get(0);
      boolean bool = bI();
      int k = 0;
      if (k >= j)
        break;
      locals = (s)localArrayList.get(k);
      if (bool);
      for (int m = locals.getAlphabeticShortcut(); ; m = locals.getNumericShortcut())
      {
        if (((m == localKeyData.meta[0]) && ((i & 0x2) == 0)) || ((m == localKeyData.meta[2]) && ((i & 0x2) != 0)) || ((bool) && (m == 8) && (paramInt == 67)))
          break label181;
        k++;
        break;
      }
    }
    return null;
  }

  private MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i = (0xFFFF0000 & paramInt3) >> 16;
    if ((i < 0) || (i >= kW.length))
      throw new IllegalArgumentException("order does not contain a valid category.");
    int j = kW[i] << 16 | 0xFFFF & paramInt3;
    s locals = new s(this, paramInt1, paramInt2, paramInt3, j, paramCharSequence, this.lh);
    if (this.li != null)
      locals.a(this.li);
    this.eD.add(a(this.eD, j), locals);
    m(true);
    return locals;
  }

  private void a(CharSequence paramCharSequence, Drawable paramDrawable, View paramView)
  {
    if (paramView != null)
    {
      this.ll = paramView;
      this.lj = null;
      this.lk = null;
    }
    while (true)
    {
      m(false);
      return;
      if (paramCharSequence != null)
        this.lj = paramCharSequence;
      if (paramDrawable != null)
        this.lk = paramDrawable;
      this.ll = null;
    }
  }

  private void a(List paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = bI();
    int i = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67))
      return;
    int j = this.eD.size();
    int k = 0;
    label49: s locals;
    if (k < j)
    {
      locals = (s)this.eD.get(k);
      if (locals.hasSubMenu())
        ((o)locals.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      if (!bool)
        break label181;
    }
    label181: for (int m = locals.getAlphabeticShortcut(); ; m = locals.getNumericShortcut())
    {
      if (((i & 0x5) == 0) && (m != 0) && ((m == localKeyData.meta[0]) || (m == localKeyData.meta[2]) || ((bool) && (m == 8) && (paramInt == 67))) && (locals.isEnabled()))
        paramList.add(locals);
      k++;
      break label49;
      break;
    }
  }

  private void b(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= this.eD.size()));
    do
    {
      return;
      this.eD.remove(paramInt);
    }
    while (!paramBoolean);
    m(true);
  }

  protected final o E(View paramView)
  {
    a(null, null, paramView);
    return this;
  }

  protected final o a(Drawable paramDrawable)
  {
    a(null, paramDrawable, null);
    return this;
  }

  public final void a(ae paramae)
  {
    this.lr.add(new WeakReference(paramae));
    paramae.a(this.mContext, this);
    this.lg = true;
  }

  public void a(p paramp)
  {
    this.la = paramp;
  }

  boolean a(o paramo, MenuItem paramMenuItem)
  {
    return (this.la != null) && (this.la.f(paramMenuItem));
  }

  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.kX.getString(paramInt));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.kX.getString(paramInt4));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }

  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }

  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.mContext.getPackageManager();
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i;
    int j;
    label52: ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i = localList.size();
      if ((paramInt4 & 0x1) == 0)
        removeGroup(paramInt1);
      j = 0;
      if (j >= i)
        break label211;
      localResolveInfo = (ResolveInfo)localList.get(j);
      if (localResolveInfo.specificIndex >= 0)
        break label198;
    }
    label198: for (Intent localIntent1 = paramIntent; ; localIntent1 = paramArrayOfIntent[localResolveInfo.specificIndex])
    {
      Intent localIntent2 = new Intent(localIntent1);
      localIntent2.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      MenuItem localMenuItem = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(localIntent2);
      if ((paramArrayOfMenuItem != null) && (localResolveInfo.specificIndex >= 0))
        paramArrayOfMenuItem[localResolveInfo.specificIndex] = localMenuItem;
      j++;
      break label52;
      i = 0;
      break;
    }
    label211: return i;
  }

  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.kX.getString(paramInt));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.kX.getString(paramInt4));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    s locals = (s)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    ak localak = new ak(this.mContext, this, locals);
    locals.b(localak);
    return localak;
  }

  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }

  public final void b(ae paramae)
  {
    Iterator localIterator = this.lr.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      ae localae = (ae)localWeakReference.get();
      if ((localae == null) || (localae == paramae))
        this.lr.remove(localWeakReference);
    }
  }

  boolean bI()
  {
    return this.kY;
  }

  public boolean bJ()
  {
    return this.kZ;
  }

  public final void bK()
  {
    if (this.la != null)
      this.la.a(this);
  }

  public final void bL()
  {
    if (!this.lm)
    {
      this.lm = true;
      this.ln = false;
    }
  }

  public final void bM()
  {
    this.lm = false;
    if (this.ln)
    {
      this.ln = false;
      m(true);
    }
  }

  final void bN()
  {
    this.ld = true;
    m(true);
  }

  final void bO()
  {
    this.lg = true;
    m(true);
  }

  final ArrayList bP()
  {
    if (!this.ld)
      return this.lb;
    this.lb.clear();
    int i = this.eD.size();
    for (int j = 0; j < i; j++)
    {
      s locals = (s)this.eD.get(j);
      if (locals.isVisible())
        this.lb.add(locals);
    }
    this.ld = false;
    this.lg = true;
    return this.lb;
  }

  public final void bQ()
  {
    if (!this.lg)
      return;
    Iterator localIterator = this.lr.iterator();
    boolean bool = false;
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      ae localae = (ae)localWeakReference.get();
      if (localae == null)
        this.lr.remove(localWeakReference);
      else
        bool |= localae.bB();
    }
    if (bool)
    {
      this.le.clear();
      this.lf.clear();
      ArrayList localArrayList = bP();
      int i = localArrayList.size();
      int j = 0;
      if (j < i)
      {
        s locals = (s)localArrayList.get(j);
        if (locals.cd())
          this.le.add(locals);
        while (true)
        {
          j++;
          break;
          this.lf.add(locals);
        }
      }
    }
    else
    {
      this.le.clear();
      this.lf.clear();
      this.lf.addAll(bP());
    }
    this.lg = false;
  }

  final ArrayList bR()
  {
    bQ();
    return this.le;
  }

  final ArrayList bS()
  {
    bQ();
    return this.lf;
  }

  public o bT()
  {
    return this;
  }

  final boolean bU()
  {
    return this.lo;
  }

  public final s bV()
  {
    return this.ls;
  }

  public final boolean c(MenuItem paramMenuItem, int paramInt)
  {
    s locals = (s)paramMenuItem;
    boolean bool1;
    if ((locals == null) || (!locals.isEnabled()))
      bool1 = false;
    boolean bool2;
    ak localak;
    boolean bool4;
    do
    {
      do
      {
        return bool1;
        bool2 = locals.bX();
        locals.ch();
        if (!locals.ci())
          break;
        bool1 = bool2 | locals.expandActionView();
      }
      while (!bool1);
      l(true);
      return bool1;
      if (!locals.hasSubMenu())
        break label236;
      l(false);
      if (!locals.hasSubMenu())
        locals.b(new ak(this.mContext, this, locals));
      localak = (ak)locals.getSubMenu();
      boolean bool3 = this.lr.isEmpty();
      bool4 = false;
      if (!bool3)
        break;
      bool1 = bool2 | bool4;
    }
    while (bool1);
    l(true);
    return bool1;
    Iterator localIterator = this.lr.iterator();
    boolean bool5 = false;
    label156: ae localae;
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      localae = (ae)localWeakReference.get();
      if (localae == null)
        this.lr.remove(localWeakReference);
      else
        if (bool5)
          break label250;
    }
    label236: label250: for (boolean bool6 = localae.a(localak); ; bool6 = bool5)
    {
      bool5 = bool6;
      break label156;
      bool4 = bool5;
      break;
      if ((paramInt & 0x1) == 0)
        l(true);
      return bool2;
    }
  }

  public void clear()
  {
    if (this.ls != null)
      g(this.ls);
    this.eD.clear();
    m(true);
  }

  public void clearHeader()
  {
    this.lk = null;
    this.lj = null;
    this.ll = null;
    m(false);
  }

  public void close()
  {
    l(true);
  }

  protected final o e(CharSequence paramCharSequence)
  {
    a(paramCharSequence, null, null);
    return this;
  }

  public boolean f(s params)
  {
    boolean bool1 = this.lr.isEmpty();
    boolean bool2 = false;
    if (bool1)
      return bool2;
    bL();
    Iterator localIterator = this.lr.iterator();
    boolean bool3 = false;
    while (true)
      label32: if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        ae localae = (ae)localWeakReference.get();
        if (localae == null)
        {
          this.lr.remove(localWeakReference);
        }
        else
        {
          bool2 = localae.d(params);
          if (!bool2)
            break;
        }
      }
    while (true)
    {
      bM();
      if (!bool2)
        break;
      this.ls = params;
      return bool2;
      bool3 = bool2;
      break label32;
      bool2 = bool3;
    }
  }

  public MenuItem findItem(int paramInt)
  {
    int i = size();
    for (int j = 0; j < i; j++)
    {
      Object localObject = (s)this.eD.get(j);
      if (((s)localObject).getItemId() == paramInt);
      do
      {
        return localObject;
        if (!((s)localObject).hasSubMenu())
          break;
        localObject = ((s)localObject).getSubMenu().findItem(paramInt);
      }
      while (localObject != null);
    }
    return null;
  }

  public boolean g(s params)
  {
    boolean bool1 = this.lr.isEmpty();
    boolean bool2 = false;
    if (!bool1)
    {
      s locals = this.ls;
      bool2 = false;
      if (locals == params);
    }
    else
    {
      return bool2;
    }
    bL();
    Iterator localIterator = this.lr.iterator();
    boolean bool3 = false;
    while (true)
      label46: if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        ae localae = (ae)localWeakReference.get();
        if (localae == null)
        {
          this.lr.remove(localWeakReference);
        }
        else
        {
          bool2 = localae.e(params);
          if (!bool2)
            break;
        }
      }
    while (true)
    {
      bM();
      if (!bool2)
        break;
      this.ls = null;
      return bool2;
      bool3 = bool2;
      break label46;
      bool2 = bool3;
    }
  }

  public final Context getContext()
  {
    return this.mContext;
  }

  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.eD.get(paramInt);
  }

  final Resources getResources()
  {
    return this.kX;
  }

  public boolean hasVisibleItems()
  {
    int i = size();
    for (int j = 0; j < i; j++)
      if (((s)this.eD.get(j)).isVisible())
        return true;
    return false;
  }

  final void i(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getGroupId();
    int j = this.eD.size();
    int k = 0;
    if (k < j)
    {
      s locals = (s)this.eD.get(k);
      if ((locals.getGroupId() == i) && (locals.cb()) && (locals.isCheckable()))
        if (locals != paramMenuItem)
          break label85;
      label85: for (boolean bool = true; ; bool = false)
      {
        locals.o(bool);
        k++;
        break;
      }
    }
  }

  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, paramKeyEvent) != null;
  }

  final void l(boolean paramBoolean)
  {
    if (this.lp)
      return;
    this.lp = true;
    Iterator localIterator = this.lr.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      ae localae = (ae)localWeakReference.get();
      if (localae == null)
        this.lr.remove(localWeakReference);
      else
        localae.a(this, paramBoolean);
    }
    this.lp = false;
  }

  final void m(boolean paramBoolean)
  {
    if (!this.lm)
    {
      if (paramBoolean)
      {
        this.ld = true;
        this.lg = true;
      }
      if (!this.lr.isEmpty())
      {
        bL();
        Iterator localIterator = this.lr.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          ae localae = (ae)localWeakReference.get();
          if (localae == null)
            this.lr.remove(localWeakReference);
          else
            localae.j(paramBoolean);
        }
        bM();
      }
      return;
    }
    this.ln = true;
  }

  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return c(findItem(paramInt1), paramInt2);
  }

  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    s locals = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (locals != null)
      bool = c(locals, paramInt2);
    if ((paramInt2 & 0x2) != 0)
      l(true);
    return bool;
  }

  public void removeGroup(int paramInt)
  {
    int i = size();
    int j = 0;
    int k;
    if (j < i)
      if (((s)this.eD.get(j)).getGroupId() == paramInt)
        k = j;
    while (true)
      if (k >= 0)
      {
        int m = this.eD.size() - k;
        int i1;
        for (int n = 0; ; n = i1)
        {
          i1 = n + 1;
          if ((n >= m) || (((s)this.eD.get(k)).getGroupId() != paramInt))
            break;
          b(k, false);
        }
        j++;
        break;
        k = -1;
        continue;
        m(true);
      }
  }

  public void removeItem(int paramInt)
  {
    int i = size();
    int j = 0;
    if (j < i)
      if (((s)this.eD.get(j)).getItemId() != paramInt);
    for (int k = j; ; k = -1)
    {
      b(k, true);
      return;
      j++;
      break;
    }
  }

  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = this.eD.size();
    for (int j = 0; j < i; j++)
    {
      s locals = (s)this.eD.get(j);
      if (locals.getGroupId() == paramInt)
      {
        locals.n(paramBoolean2);
        locals.setCheckable(paramBoolean1);
      }
    }
  }

  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i = this.eD.size();
    for (int j = 0; j < i; j++)
    {
      s locals = (s)this.eD.get(j);
      if (locals.getGroupId() == paramInt)
        locals.setEnabled(paramBoolean);
    }
  }

  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i = this.eD.size();
    int j = 0;
    int k = 0;
    if (j < i)
    {
      s locals = (s)this.eD.get(j);
      if ((locals.getGroupId() != paramInt) || (!locals.p(paramBoolean)))
        break label76;
    }
    label76: for (int m = 1; ; m = k)
    {
      j++;
      k = m;
      break;
      if (k != 0)
        m(true);
      return;
    }
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    this.kY = paramBoolean;
    m(false);
  }

  public int size()
  {
    return this.eD.size();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.o
 * JD-Core Version:    0.6.2
 */
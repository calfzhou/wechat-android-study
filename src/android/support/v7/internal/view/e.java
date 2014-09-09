package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.n;
import android.support.v4.view.z;
import android.support.v7.internal.view.menu.s;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.tencent.mm.p;
import java.lang.reflect.Constructor;

final class e
{
  private Menu iW;
  private int iX;
  private int iY;
  private int iZ;
  private int ja;
  private boolean jb;
  private boolean jc;
  private boolean jd;
  private int je;
  private int jf;
  private CharSequence jg;
  private CharSequence jh;
  private int ji;
  private char jj;
  private char jk;
  private int jl;
  private boolean jm;
  private boolean jn;
  private boolean jo;
  private int jp;
  private int jq;
  private String jr;
  private String js;
  private String jt;
  private n ju;

  public e(c paramc, Menu paramMenu)
  {
    this.iW = paramMenu;
    bl();
  }

  private static char e(String paramString)
  {
    if (paramString == null)
      return '\000';
    return paramString.charAt(0);
  }

  private void g(MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    MenuItem localMenuItem = paramMenuItem.setChecked(this.jm).setVisible(this.jn).setEnabled(this.jo);
    if (this.jl > 0);
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      localMenuItem.setCheckable(bool2).setTitleCondensed(this.jh).setIcon(this.ji).setAlphabeticShortcut(this.jj).setNumericShortcut(this.jk);
      if (this.jp >= 0)
        z.a(paramMenuItem, this.jp);
      if (this.jt == null)
        break label162;
      if (!c.a(this.jv).isRestricted())
        break;
      throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
    }
    paramMenuItem.setOnMenuItemClickListener(new d(c.c(this.jv), this.jt));
    label162: s locals;
    if ((paramMenuItem instanceof s))
    {
      locals = (s)paramMenuItem;
      if ((locals != null) && (this.jl >= 2))
        locals.n(bool1);
      if (this.jr == null)
        break label270;
      z.a(paramMenuItem, (View)newInstance(this.jr, c.bk(), c.d(this.jv)));
    }
    while (true)
    {
      if ((this.jq > 0) && (!bool1))
        z.b(paramMenuItem, this.jq);
      if (this.ju != null)
        z.a(paramMenuItem, this.ju);
      return;
      locals = null;
      break;
      label270: bool1 = false;
    }
  }

  private Object newInstance(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = c.a(this.jv).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = c.a(this.jv).obtainStyledAttributes(paramAttributeSet, p.cxA);
    this.iX = localTypedArray.getResourceId(p.cxD, 0);
    this.iY = localTypedArray.getInt(p.cxE, 0);
    this.iZ = localTypedArray.getInt(p.cxF, 0);
    this.ja = localTypedArray.getInt(p.cxB, 0);
    this.jb = localTypedArray.getBoolean(p.cxG, true);
    this.jc = localTypedArray.getBoolean(p.cxC, true);
    localTypedArray.recycle();
  }

  public final void b(AttributeSet paramAttributeSet)
  {
    int i = 1;
    TypedArray localTypedArray = c.a(this.jv).obtainStyledAttributes(paramAttributeSet, p.cxH);
    this.je = localTypedArray.getResourceId(p.cxQ, 0);
    int j = localTypedArray.getInt(p.cxR, this.iY);
    int k = localTypedArray.getInt(p.cxU, this.iZ);
    this.jf = (j & 0xFFFF0000 | k & 0xFFFF);
    this.jg = localTypedArray.getText(p.cxV);
    this.jh = localTypedArray.getText(p.cxW);
    this.ji = localTypedArray.getResourceId(p.cxP, 0);
    this.jj = e(localTypedArray.getString(p.cxL));
    this.jk = e(localTypedArray.getString(p.cxS));
    int m;
    if (localTypedArray.hasValue(p.cxM))
      if (localTypedArray.getBoolean(p.cxM, false))
      {
        m = i;
        this.jl = m;
        label164: this.jm = localTypedArray.getBoolean(p.cxN, false);
        this.jn = localTypedArray.getBoolean(p.cxX, this.jb);
        this.jo = localTypedArray.getBoolean(p.cxO, this.jc);
        this.jp = localTypedArray.getInt(p.cxY, -1);
        this.jt = localTypedArray.getString(p.cxT);
        this.jq = localTypedArray.getResourceId(p.cxI, 0);
        this.jr = localTypedArray.getString(p.cxK);
        this.js = localTypedArray.getString(p.cxJ);
        if (this.js == null)
          break label340;
        label270: if ((i == 0) || (this.jq != 0) || (this.jr != null))
          break label345;
      }
    label340: label345: for (this.ju = ((n)newInstance(this.js, c.bj(), c.b(this.jv))); ; this.ju = null)
    {
      localTypedArray.recycle();
      this.jd = false;
      return;
      m = 0;
      break;
      this.jl = this.ja;
      break label164;
      i = 0;
      break label270;
    }
  }

  public final void bl()
  {
    this.iX = 0;
    this.iY = 0;
    this.iZ = 0;
    this.ja = 0;
    this.jb = true;
    this.jc = true;
  }

  public final void bm()
  {
    this.jd = true;
    g(this.iW.add(this.iX, this.je, this.jf, this.jg));
  }

  public final SubMenu bn()
  {
    this.jd = true;
    SubMenu localSubMenu = this.iW.addSubMenu(this.iX, this.je, this.jf, this.jg);
    g(localSubMenu.getItem());
    return localSubMenu;
  }

  public final boolean bo()
  {
    return this.jd;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.e
 * JD-Core Version:    0.6.2
 */